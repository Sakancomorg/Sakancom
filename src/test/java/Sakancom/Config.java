package Sakancom;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="test_cases/samaa",
		plugin= {"summary" ,"html:target/cucumber/wikipedia.html"},
		monochrome=true ,
		snippets =SnippetType.CAMELCASE,
		glue={"Sakancom"}
		)
public class Config {

}