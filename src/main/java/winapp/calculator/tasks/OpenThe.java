package winapp.calculator.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static winapp.calculator.userinterfaces.CalculatorPage.*;

public class OpenThe implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FIRSTNUMBER),
                Click.on(OPERATOR),
                Click.on(SECONDNUMBER),
                Click.on(EQUAL)
        );
    }

    public static OpenThe calculator() {
        return Tasks.instrumented(OpenThe.class);
    }
}
