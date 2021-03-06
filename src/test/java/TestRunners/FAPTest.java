package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	features="features/FAP.feature", 
					plugin= {"json:target/cucumber-report/cucumber.json",}, 
					glue="StepsImplementation")
public class FAPTest {

}
