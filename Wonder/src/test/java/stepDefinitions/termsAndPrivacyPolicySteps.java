package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.termsAndPrivacyPolicyPage;
import utils.DriverFactory;

public class termsAndPrivacyPolicySteps {


    termsAndPrivacyPolicyPage termsAndPrivacyPolicyPage = new termsAndPrivacyPolicyPage(DriverFactory.getDriver());

    @Given("I navigate to the Terms And Privacy Policy Page")
    public void ıNavigateToTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.checkTermsOfPolicyPage();
    }

    @Then("I should see Title: {string} on the Terms And Privacy Policy Page")
    public void ıShouldSeeTitleOnTheTermsAndPrivacyPolicyPage(String title) {
        termsAndPrivacyPolicyPage.checkTitle(title);
    }

    @Then("I should see Sub Title: {string} on the Terms And Privacy Policy Page")
    public void ıShouldSeeSubTitleOnTheTermsAndPrivacyPolicyPage(String subTitle) {
        termsAndPrivacyPolicyPage.checkSubTitle(subTitle);
    }

    @Then("I should see Terms Of Use: {string} on the Terms And Privacy Policy Page")
    public void ıShouldSeeTermsOfUseOnTheTermsAndPrivacyPolicyPage(String termsOfUse) {
        termsAndPrivacyPolicyPage.checkTermsOfUse(termsOfUse);
    }

    @Then("I should see Privacy Policy: {string} on the Terms And Privacy Policy Page")
    public void ıShouldSeePrivacyPolicyOnTheTermsAndPrivacyPolicyPage(String privacyPolicy) {
        termsAndPrivacyPolicyPage.checkPrivacyPolicy(privacyPolicy);
    }

    @Then("I should see inactive Continue Button on the Terms And Privacy Policy Page")
    public void ıShouldSeeInactiveContinueButtonOnTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.checkInactiveContinueButton();
    }

    @When("I click Terms Of Use Button on the Terms And Privacy Policy Page")
    public void ıClickTermsOfUseButtonOnTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.clickTermsOfUseButton();
    }


    @When("I click Privacy Policy Button on the Terms And Privacy Policy Page")
    public void ıClickPrivacyPolicyButtonOnTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.clickPrivacyPolicyButton();
    }

    @Then("I should see activated Continue Button on the Terms And Privacy Policy Page")
    public void ıShouldSeeActivatedContinueButtonOnTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.checkActiveContinueButton();
    }

    @And("I click activated Continue Button on the Terms And Privacy Policy Page")
    public void ıClickActivatedContinueButtonOnTheTermsAndPrivacyPolicyPage() {
        termsAndPrivacyPolicyPage.clickContinueButton();
    }
}
