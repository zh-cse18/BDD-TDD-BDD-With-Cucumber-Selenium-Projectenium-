package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				 glue= {"StepDefinations"},
				 monochrome=true,
				 plugin={"pretty","html:target/HtmlReports/cucumber.html",
				 "pretty","json:target/JsonReport/cucumber.json",
				 "pretty","junit:target/XMLReport/cucumber.xml"})
public class TestRunner {
	

}
