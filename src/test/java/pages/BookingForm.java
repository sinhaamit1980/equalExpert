package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingForm extends TestBase {
	
	int intialRowCount = 0;
	int currentRowCount = 0;
	
	public void fillTheBookingForm(String firstName, String surName, String price, String depositStatus, String chkInDate, String chkOutDate){
		enterTextInTextField(By.id("firstname"), firstName);
		enterTextInTextField(By.id("lastname"), surName);
		enterTextInTextField(By.id("totalprice"), price);
		selectADropdown(By.id("depositpaid"), depositStatus);
		enterTextInTextField(By.id("checkin"), chkInDate);
		enterTextInTextField(By.id("checkout"), chkOutDate);
	}
	
	public void submitTheBookingForm(){
		//submit_button(By.linkText("Save"));
		click_element(By.cssSelector("div[id='form'] input[type='button']"));
	}
	
	public WebElement findARowBasedOnFirstName(String firstName) throws Exception{
		getCurrentRowCount();
		waitForBookingRow();
		WebElement element = null;
		List<WebElement> groupList = driver.findElements(By.cssSelector("div[id='bookings'] div[class='row']"));
		for(int i=0; i< groupList.size(); i++){
			if (groupList.get(i).getText().startsWith(firstName)){
				element = groupList.get(i);
				break;
			}
		}
		
		return element;
		
	}
	
	public int getInitialRowCount(){
		List<WebElement> groupList = driver.findElements(By.cssSelector("div[id='bookings'] div[class='row']"));
		intialRowCount = groupList.size();
		return intialRowCount;
	}
	
	public int getCurrentRowCount(){
		List<WebElement> groupList = driver.findElements(By.cssSelector("div[id='bookings'] div[class='row']"));
		currentRowCount = groupList.size();
		return currentRowCount;
	}
	
	public void waitForBookingRow() throws InterruptedException{
		int initialCount = intialRowCount;
		int currentCount = currentRowCount;
		for(int i=1; i<10;i++){
			if((initialCount+1) == currentCount){
				break;
			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			
		}
	}
	
	public String getIDAttributeOfBookingRow(String firstName) throws Exception{
		WebElement element = findARowBasedOnFirstName(firstName);
		String idAttr = element.getAttribute("id");
		return idAttr;
	}
	
	public void deleteARow(String firstName) throws Exception{
		String rowId = getIDAttributeOfBookingRow(firstName);
		String deleteCSSSelector = "div[id='" + rowId +"'] input[type='button']";
		click_element(By.cssSelector(deleteCSSSelector));
	}
	
	
	public boolean isRowWithGivenFirstNamePresent(String firstName) throws InterruptedException{
		getCurrentRowCount();
		waitForBookingRow();
		Boolean elementFound = false;
		List<WebElement> groupList = driver.findElements(By.cssSelector("div[id='bookings'] div[class='row']"));
		for(int i=0; i< groupList.size(); i++){
			if (groupList.get(i).getText().startsWith(firstName)){
				elementFound = true;
				break;
			}
		}
		
		return elementFound;	
	}
	

}
