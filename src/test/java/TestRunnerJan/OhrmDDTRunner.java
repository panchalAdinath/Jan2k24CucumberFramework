package TestRunnerJan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFileDemo/Ohrm.feature",glue = "StepDef",publish = true)
public class OhrmDDTRunner {
	
	
}
