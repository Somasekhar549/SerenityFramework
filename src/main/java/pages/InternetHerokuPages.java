package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InternetHerokuPages extends PageObject {

    @FindBy(xpath = "//h1[@class='heading']")
    public WebElementFacade homePageTitle;
}
