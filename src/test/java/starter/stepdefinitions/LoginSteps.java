package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.HomePage;
import starter.Pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage login;

    @Steps
    HomePage home;

    @Given("At login page website | Login")
    public void onTheLoginPage() {
        login.onTheLoginPage();
        login.openPage();
        login.validateOnTheLoginPage();
    }

    @When("Input valid email | Login")
    public void inputValidEmail() {
        login.inputValidEmail();
        login.inputEmail("salsabillanugraha10@gmail.com");
    }

    @And("Input valid password | Login")
    public void inputValidPassword() {
        login.inputValidPassword();
        login.inputPassword("salsacantik");
    }

    @And("Click button login | Login")
    public void clickButtonLogin() {
        login.clickButtonLogin();
        login.clickLoginButton();
    }

    @Then("At home page website | Login")
    public void onTheHomePageForLogin() {
        login.onTheHomePageForLogin();
        home.validateOnTheHomePage();
    }
}
