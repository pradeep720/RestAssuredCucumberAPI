package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Example.feature",
    glue = {"stepdefinations"},
    plugin = {"pretty", "html:target/cucumber-reports.html",
             "json:target/cucumber/cucumber.json"
             },
    monochrome = true

)
public class TestRunner {

}
