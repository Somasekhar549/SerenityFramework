package stepdefs;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.steps.UIInteractions;
import steps.InternetHerokuSteps;

public class InternetHerokuStepDefs extends UIInteractions {

    InternetHerokuSteps internetHerokuSteps;

    @Given("User verifies the title of the home page")
    public void userVerifiesTheTitleOfTheHomePage(){
        internetHerokuSteps.userVerifiesTheTitleOfTheHomePage();
    }
}
