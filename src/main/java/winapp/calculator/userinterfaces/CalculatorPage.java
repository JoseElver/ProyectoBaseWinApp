package winapp.calculator.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculatorPage {

    public static final Target FIRSTNUMBER = Target.the("First number")
            .located(By.xpath("//*[@AutomationId='num8Button']"));
    public static final Target OPERATOR = Target.the("Operator")
            .located(By.xpath("//*[@AutomationId='multiplyButton']"));
    public static final Target SECONDNUMBER = Target.the("Second number")
            .located(By.xpath("//*[@AutomationId='num6Button']"));
    public static final Target EQUAL = Target.the("Equal")
            .located(By.xpath("//*[@AutomationId='equalButton']"));
    public static final Target RESULT = Target.the("Result")
            .located(By.xpath("//*[@AutomationId='CalculatorResults']"));

}
