package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_JOIN_TODAY = Target.the("Register button").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
