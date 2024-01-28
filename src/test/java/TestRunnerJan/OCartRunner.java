package TestRunnerJan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFileDemo/OCart.feature",glue = "StepDef")
public class OCartRunner {

}
