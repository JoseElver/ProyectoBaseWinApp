package winapp.calculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/calculator.feature",
        glue = {"winapp.calculator.stepdefinitions","winapp.calculator.utils"},
        snippets = SnippetType.CAMELCASE
)
public class CalculatorRunner {
}
