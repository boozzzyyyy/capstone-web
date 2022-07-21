package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By usernameField() {
        return By.id("username");
    }
    private By emailField() {
        return By.id("email");
    }
    private By passwordField() {
        return By.id("password");
    }
    private By confirmPasswordField() {
        return By.id("confirmpassword");
    }
    private By registerButton() {
        return By.linkText("type=\"submit\"");
    }

    @Step
    public void openPage(){
        open("open.auth.register");
    }

    @Step
    public boolean validateOnRegisterPage(){
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
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
    public void inputConfirmPassword(String confirmPassword){
        $(confirmPasswordField()).type(confirmPassword);
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step("At register page website | Register")
    public void onTheRegisterPage() {
        System.out.println("At register page website | Register");
    }

    @Step("Input valid email | Register")
    public void inputValidEmail() {
        System.out.println("Input valid email | Register");
    }

    @Step("Input valid username | Register")
    public void inputValidUsername() {
        System.out.println("Input valid username | Register");
    }

    @Step("Input valid password | Register")
    public void inputValidPassword() {
        System.out.println("Input valid password | Register");
    }

    @Step("Input valid confirm password | Register")
    public void inputValidConfirmPassword() {
        System.out.println("Input valid confirm password | Register");
    }

    @Step("Click button register | Register")
    public void clickButtonRegister() {
        System.out.println("Click button register | Register");
    }

    @Step("At home page website | Register")
    public void onTheHomePageForRegister() {
        System.out.println("At home page website | Register");
    }
}
