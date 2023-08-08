package AcceptanceTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="test_cases/log.feature", 

		plugin="html:target/cucumber/out.html",
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue ="AcceptanceTest"
		
		)
public class AcceptanceTest {

}
