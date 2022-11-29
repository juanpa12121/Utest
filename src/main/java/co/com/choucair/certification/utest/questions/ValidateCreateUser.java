package co.com.choucair.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.utest.userinterfaces.LastPage.LBL_SUCCESSFULL_MESSAGE;
import static co.com.choucair.certification.utest.utils.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class ValidateCreateUser implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WaitUntil.the(LBL_SUCCESSFULL_MESSAGE, isVisible()).forNoMoreThan(15).seconds();
        return EXPECTED_REGISTER_MESSAGE.equals(Text.of(LBL_SUCCESSFULL_MESSAGE).viewedBy(actor).asString());
    }

    public static ValidateCreateUser validateUserCreation(){
        return new ValidateCreateUser()
;    }
}
