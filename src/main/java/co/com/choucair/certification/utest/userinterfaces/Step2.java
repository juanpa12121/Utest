package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step2 {
    public static final Target TXT_CITY = Target.the("List city").located(By.id("city"));
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.id("zip"));
    public static final Target LST_COUNTRY = Target.the("Country list").located(By.cssSelector("span[aria-label='Select a country']"));
    public static final Target BTN_NEXT_DEVICES = Target.the("Button next").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
