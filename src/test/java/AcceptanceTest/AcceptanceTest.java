package AcceptanceTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
		features="test_cases/AdminFeatures", 
=======
		features="test_cases/t.feature", 
>>>>>>> 7f7b7a8a035927cb4c78f067f5c90cb26b2a4afe
		plugin="html:target/cucumber/out.html",
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue ="AcceptanceTest"
		
		)
public class AcceptanceTest {

}
