package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step4 {
    public static final Target TXT_PASSWORD = Target.the("Utest password").located(By.name("password"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Utest confirm password").located(By.name("confirmPassword"));
    public static final Target CHK_STAY_INFORMED = Target.the("Stay informed checkmark").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHK_READ_ACCEPT_TERMS = Target.the("Read and accept utest terms").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHK_READ_ACCEPT_PRIVACY = Target.the("Read andd accept privacy").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target BTN_CONTINUE = Target.the("Final Register button").located(By.xpath("//a[@id='laddaBtn']"));
}
