package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step3 {
    public static final Target LST_COMPUTER = Target.the("Computer List").located(By.xpath("//div[@name='osId']//span[@aria-label='Select OS']"));
    public static final Target LST_VERSION = Target.the("Version List").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target LST_LANGUAGE = Target.the("Language").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target LST_MOBILE_DEVICE = Target.the("Mobile device list").located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target LST_MODEL = Target.the("Model list").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target BTN_NEXT_LAST_STEP = Target.the("Button last step").located(By.xpath("//a[@aria-label='Next - final step']"));
}
