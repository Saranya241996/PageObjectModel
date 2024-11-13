package Runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "FeatureFiles/OpenGoogle.feature", // Path to your feature files
	    glue = {"StepDefinitions"},              // Package name where step definitions are located
	    plugin = {"pretty", "html:target/cucumber-reports"}, // To generate reports
	    monochrome = true,                        // Display the console output in a readable way
	    tags = "@tag"                             // To run specific tagged scenarios
)
public class RunnerCkass {

	// It should combine the feature files and the step definition
	// Runner define.
	// Using J-unit
}
