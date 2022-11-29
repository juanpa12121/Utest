package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterfaces.LastPage.LBL_SUCCESSFULL_MESSAGE;
import static co.com.choucair.certification.utest.userinterfaces.Step1.*;
import static co.com.choucair.certification.utest.userinterfaces.Step2.*;
import static co.com.choucair.certification.utest.userinterfaces.Step3.*;
import static co.com.choucair.certification.utest.userinterfaces.Step4.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.choucair.certification.utest.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CreateUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Waiting.theSeconds(BTN_JOIN_TODAY, 10),
                WaitUntil.the(BTN_JOIN_TODAY, isVisible()),
                Click.on(BTN_JOIN_TODAY),
                Enter.theValue("Pedrito").into(TXT_FIRST_NAME),
                Enter.theValue("Perez Jimenez").into(TXT_LAST_NAME),
                Enter.theValue("pedrito99@gmail.com").into(TXT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(LST_MONTH),
                SelectFromOptions.byVisibleText("21").from(LST_DAY),
                SelectFromOptions.byVisibleText("2000").from(LST_YEAR),
                Click.on(BTN_NEXT),
                WaitUntil.the(TXT_CITY, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Medellin").into(TXT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(TXT_CITY),
                SendKeys.of(Keys.ENTER).into(TXT_CITY),
                Enter.theValue("055413").into(TXT_POSTAL_CODE),
                Click.on(BTN_NEXT_DEVICES),
                WaitUntil.the(BTN_NEXT_LAST_STEP, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_NEXT_LAST_STEP),
                WaitUntil.the(TXT_PASSWORD, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("iSOy2F*9Z61f").into(TXT_PASSWORD),
                Enter.theValue("iSOy2F*9Z61f").into(TXT_CONFIRM_PASSWORD),
                Click.on(CHK_STAY_INFORMED),
                Click.on(CHK_READ_ACCEPT_TERMS),
                Click.on(CHK_READ_ACCEPT_PRIVACY),
                WaitUntil.the(BTN_CONTINUE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(LBL_SUCCESSFULL_MESSAGE, isVisible()).forNoMoreThan(15).seconds()
        );
    }

    public static CreateUser createUser(){
        return instrumented(CreateUser.class);
    }
}
