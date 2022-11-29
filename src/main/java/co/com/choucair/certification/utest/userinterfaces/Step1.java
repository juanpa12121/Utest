package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step1 {
    public static final Target TXT_FIRST_NAME = Target.the("First name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Email").located(By.id("email"));
    public static final Target LST_MONTH = Target.the("Birth Month").located(By.name("birthMonth"));
    public static final Target LST_DAY = Target.the("Birth day").located(By.name("birthDay"));
    public static final Target LST_YEAR = Target.the("Birth year").located(By.name("birthYear"));
    public static final Target LST_LANGUAGES = Target.the("languages spoken").located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target BTN_NEXT = Target.the("Button next location").located(By.xpath("//a[@class='btn btn-blue']"));
}
