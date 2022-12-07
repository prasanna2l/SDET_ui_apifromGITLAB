package runner;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class) 
@Test
@io.cucumber.testng.CucumberOptions(
//@CucumberOptions(
		features= "resource", 
		glue="stepDefinition",
		plugin={"html:target/cucumber-reports" ,
		}
		)
public class testRunner extends AbstractTestNGCucumberTests {
}