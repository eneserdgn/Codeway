package pages;

import models.termsAndPrivacyPolicyModel;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class termsAndPrivacyPolicyPage {

    ElementHelper elementHelper;

    public termsAndPrivacyPolicyPage(RemoteWebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void checkTermsOfPolicyPage() {
        elementHelper.findElement(termsAndPrivacyPolicyModel.title_Text);
    }

    public void checkTitle(String expectedText) {
        String actualText = elementHelper.getAttr(termsAndPrivacyPolicyModel.title_Text, "content-desc");
        Assert.assertEquals(actualText.replaceAll("\\s+", ""), expectedText.replaceAll("\\s+", ""));
    }

    public void checkSubTitle(String expectedText) {
        String actualText = elementHelper.getAttr(termsAndPrivacyPolicyModel.subTitle_Text, "content-desc");
        Assert.assertEquals(actualText.replaceAll("\\s+", ""), expectedText.replaceAll("\\s+", ""));
    }

    public void checkTermsOfUse(String expectedText) {
        String actualText = elementHelper.getAttr(termsAndPrivacyPolicyModel.termsOfUse_Text, "content-desc");
        System.out.println(expectedText);
        System.out.println(actualText);
        Assert.assertEquals(actualText.replaceAll("\\s+", ""), expectedText.replaceAll("\\s+", ""));
    }

    public void checkPrivacyPolicy(String expectedText) {
        String actualText = elementHelper.getAttr(termsAndPrivacyPolicyModel.privacyPolicy_Text, "content-desc");
        Assert.assertEquals(actualText.replaceAll("\\s+", ""), expectedText.replaceAll("\\s+", ""));
    }

    public void checkInactiveContinueButton() {
        elementHelper.findElement(termsAndPrivacyPolicyModel.inactiveContinue_Button);
    }


    public void checkActiveContinueButton() {
        elementHelper.getText(termsAndPrivacyPolicyModel.activeContinue_Button);
    }

    public void clickTermsOfUseButton() {
        elementHelper.click(termsAndPrivacyPolicyModel.termsOfUse_Button);
    }

    public void clickPrivacyPolicyButton() {
        elementHelper.click(termsAndPrivacyPolicyModel.privacyPolicy_Button);
    }

    public void clickContinueButton() {
        elementHelper.click(termsAndPrivacyPolicyModel.activeContinue_Button);
    }

}
