package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Example.feature",
    glue = {"stepdefinations"},
    plugin = {
       "pretty", 
       "json:target/cucumber/cucumber.json",
       "html:target/cucumber/html-report"
},
    monochrome = true

)
public class TestRunner {

}
