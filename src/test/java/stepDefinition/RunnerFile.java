package stepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;



@CucumberOptions(features = "src/test/java/features",
glue = "stepDefinition",
plugin = {"html:reports"},
//tags = {"@Smoke"},
snippets = SnippetType.CAMELCASE
)

public class RunnerFile extends AbstractTestNGCucumberTests {
	
	

}
