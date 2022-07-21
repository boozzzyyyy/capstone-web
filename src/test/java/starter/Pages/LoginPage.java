package starter.Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField() {
        return By.id("email");
    }
    private By passwordField() {
        return By.id("password");
    }
//    private By loginButton() {
//        return By.linkText("<span class=\"v-btn__content\">Login</span>");
//    }
    private By loginButton() {
        return By.linkText("type=\"submit\"");
    }

    @Step
    public void openPage(){
        open("open.auth.login");
    }

    @Step
    public boolean validateOnTheLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step("At login page website | Login")
    public void onTheLoginPage() {
        System.out.println("At login page website | Login");
    }

    @Step("Input valid email | Login")
    public void inputValidEmail() {
        System.out.println("Input valid email | Login");
    }

    @Step("Input valid password | Login")
    public void inputValidPassword() {
        System.out.println("Input valid password | Login");
    }

    @Step("Click button login | Login")
    public void clickButtonLogin() {
        System.out.println("Click button login | Login");
    }

    @Step("At home page website | Login")
    public void onTheHomePageForLogin() {
        System.out.println("At home page website | Login");
    }
}
