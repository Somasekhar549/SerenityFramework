package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import steps.BookStoreAPISteps;

public class BookStoreAPIStepDefs {

    BookStoreAPISteps bookStoreAPISteps;

    @Given("User calls the Get Books API")
    public void userCallsTheGetBooksAPI() {
//        bookStoreAPISteps.userCallsTheGetBooksAPI();
    }

    @When("User verifies the books")
    public void userVerifiesTheBooks() {
//        bookStoreAPISteps.userVerifiesTheBooks();
    }
}
