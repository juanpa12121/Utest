package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {
    public static final Target LBL_SUCCESSFULL_MESSAGE = Target.the("Last successfull register message").located(By.xpath("//body//ui-view//h1[1]"));
}
