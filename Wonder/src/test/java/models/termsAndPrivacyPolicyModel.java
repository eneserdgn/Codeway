package models;

import org.openqa.selenium.By;

public class termsAndPrivacyPolicyModel {

    public static By title_Text = By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@content-desc][1]");
    public static By subTitle_Text = By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@content-desc][2]");
    public static By termsOfUse_Text = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View)[3]/*[@content-desc]");
    public static By termsOfUse_Button = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView)[2]");
    public static By privacyPolicy_Text = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View)[4]/*[@content-desc]");
    public static By privacyPolicy_Button = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView)[3]");
    public static By inactiveContinue_Button = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[@content-desc])[3]");
    public static By activeContinue_Button = By.xpath("(//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[@content-desc])");

}
