package StepDefination;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:reports/test-report"},tags= "@login",monochrome = true)

public class cucumberRunner {

}
