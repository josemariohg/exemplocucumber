package exemplocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:funcionalidades", tags = "@ApoliceTeste", glue = "exemplocucumber", monochrome = true, dryRun = false)
public class ApoliceTeste {
	
}