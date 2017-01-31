package step_defs;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={
				"pretty",
				"html:target/cucumber",
				"json:results/cucumber.json",
				"junit:results/cucumber.xml"
		},
		glue = "step_defs",
		features = "src/test/resources",
		tags={"@hotel_test"}
		)
public class RunTest {

}
