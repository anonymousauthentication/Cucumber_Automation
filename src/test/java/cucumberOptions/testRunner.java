package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/login.feature", glue = "src/test/java/stepDefinition/stepDefinition.java")
public class testRunner {

}
