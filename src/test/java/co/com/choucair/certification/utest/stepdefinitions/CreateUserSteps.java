package co.com.choucair.certification.utest.stepdefinitions;
import co.com.choucair.certification.utest.questions.ValidateCreateUser;
import co.com.choucair.certification.utest.tasks.CreateUser;
import co.com.choucair.certification.utest.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static co.com.choucair.certification.utest.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CreateUserSteps {
    @Given("^I want to go to utest page$")
    public void iWantToGoToUtestPage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePageWeb(URL)));
    }

    @When("^I create an user in the utest page$")
    public void iCreateAnUserInTheUtestPage() {
        theActorInTheSpotlight().attemptsTo(CreateUser.createUser());
    }

    @Then("^I validate sucessfully user creation$")
    public void iValidateSucessfullyUserCreation() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCreateUser.validateUserCreation()));
    }

}
