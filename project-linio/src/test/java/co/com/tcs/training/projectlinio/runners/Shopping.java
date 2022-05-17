package co.com.tcs.training.projectlinio.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\shopping.feature",
        glue = "co.com.tcs.training.projectlinio.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@scenario1"

)

public class Shopping {
}
