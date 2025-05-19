package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\pradeep.s\\eclipse-workspace\\cucumber\\src\\test\\resources\\features\\Example.feature",
    glue = {"stepdefinations"},
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true

)
public class TestRunner {

}
