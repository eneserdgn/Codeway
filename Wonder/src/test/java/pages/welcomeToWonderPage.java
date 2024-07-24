package pages;

import models.welcomeToWonderModel;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ElementHelper;

public class welcomeToWonderPage {
    ElementHelper elementHelper;

    public welcomeToWonderPage(RemoteWebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    public void checkWelcomeToWonderPage() {
        elementHelper.findElement(welcomeToWonderModel.title_Text);
    }
}
