package pages;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class TestBase {
	
	public WebDriver driver = new ChromeDriver();
	
	public void navigate_to_site(String site_url){
		driver.get(site_url);
	}
	
	public void enterTextInTextField(By elementLocator, String value){
		driver.findElement(elementLocator).sendKeys(value); 
	}
	
	public void click_element(By elementLocator){
		driver.findElement(elementLocator).click();
	}
	
	public void submit_button(By elementLocator){
		driver.findElement(elementLocator).submit();
		
	}
	
	public boolean iselementdisplayed(By elementLocator){
		return driver.findElement(elementLocator).isDisplayed();
	}
	
	public String getelementText(By elementLocator){
		return driver.findElement(elementLocator).getText();
	}
	
	public void selectADropdown(By elementLocator, String option){
		Select select = new Select(driver.findElement(elementLocator));
		//select.deselectAll();
		select.selectByVisibleText(option);
	}
	

}
