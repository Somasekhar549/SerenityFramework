package steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.Actor;

import pages.InternetHerokuPages;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class InternetHerokuSteps extends UIInteractions {

    InternetHerokuPages internetHerokuPages;

    Actor report = Actor.named("User");

    @Step
    public void userVerifiesTheTitleOfTheHomePage() {
        String pageTitle = internetHerokuPages.homePageTitle.waitUntilVisible().getText();
        report.attemptsTo(Ensure.that(pageTitle).isEqualTo("Welcome to the-internet"));

        Serenity.reportThat("The keyword should appear in the sidebar heading",
                () -> assertThat(pageTitle).isEqualTo("Welcome to the-internet")
        );

        Serenity.recordReportData().withTitle("User Verified the title").andContents("User verified the title");
    }
}
