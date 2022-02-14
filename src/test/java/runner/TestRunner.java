package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "stepDefinitions",
		tags = "@openshift",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty"}
		
		
		
		)

public class TestRunner {

}
