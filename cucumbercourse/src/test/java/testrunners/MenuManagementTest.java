package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/linkedinlearning/cucumbercourse/features"},
		glue = {"src/test/java/stepdefinitions/MenuManagementSteps"},
		plugin = {"pretty"})
public class MenuManagementTest {
	

}
