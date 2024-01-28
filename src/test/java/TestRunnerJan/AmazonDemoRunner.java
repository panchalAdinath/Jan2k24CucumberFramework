package TestRunnerJan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFileDemo/AmazonDemoRev.feature",glue = "StepDef",tags = "not @Retest")
public class AmazonDemoRunner {													//tags="@sanity or @Smoke"

}
