package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.welcomeToWonderPage;
import utils.DriverFactory;

public class welcomeToWonderSteps {

    welcomeToWonderPage welcomeToWonderPage = new welcomeToWonderPage(DriverFactory.getDriver());

    @Then("I should see the Welcome To Wonder Page")
    public void ıShouldSeeTheWelcomeToWonderPage() {
        welcomeToWonderPage.checkWelcomeToWonderPage();
    }
}
