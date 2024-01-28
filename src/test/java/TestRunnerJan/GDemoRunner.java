package TestRunnerJan;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFileDemo/GDemo.feature",glue = "StepDef")
public class GDemoRunner 
{
	
	 
	
}
