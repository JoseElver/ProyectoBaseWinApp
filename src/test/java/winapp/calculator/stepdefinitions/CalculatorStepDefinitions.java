package winapp.calculator.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import winapp.calculator.tasks.OpenThe;

import static winapp.calculator.userinterfaces.CalculatorPage.RESULT;


public class CalculatorStepDefinitions {

    @Given("^that Jose wants to enter the calculator application$")
    public void thatJoseWantsToEnterTheCalculatorApplication() {
        OnStage.theActorCalled("Jose").wasAbleTo(OpenThe.calculator());
    }

    @When("^he enters the mathematical operation$")
    public void heEntersTheMathematicalOperation() {
    }

    @Then("^he verifies the result is correct$")
    public void heVerifiesTheResultIsCorrect() {
        OnStage.theActorCalled("Jose").attemptsTo(Ensure.that(RESULT).isEnabled());
    }
}
