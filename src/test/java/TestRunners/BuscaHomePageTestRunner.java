package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/BuscaHomePage.feature",glue="StepsImplementation")
public class BuscaHomePageTestRunner {

}
