package winapp.calculator.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BeforeHook {

    @Before
    public void prepareStage() {
        WinAppDriver.open();
        OnStage.setTheStage(new OnlineCast());
    }
}
