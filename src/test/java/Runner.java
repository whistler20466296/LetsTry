

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)



@CucumberOptions(features = "/Users/SA20466287/eclipse-workspace/cucumbers/src/main/java/FEATURES/test.feature", glue = {



 "bindlogin" })



public class Runner extends AbstractTestNGCucumberTests {



}
