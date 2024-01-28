package TestRunnerJan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFileDemo/SLabsDemo.feature",glue = "StepDef")
public class SLabRunner 
{
	
}
