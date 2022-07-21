package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By headerMenuLogoHome() {
        return By.linkText("<img src=\"/_nuxt/img/logo.d84429f.png\" alt=\"\" data-v-07a6a441=\"\">");
    }

    @Step
    public void openPage(){
        open("open");
    }

    @Step
    public boolean validateOnTheHomePage(){
        return $(headerMenuLogoHome()).isDisplayed();
    }

}
