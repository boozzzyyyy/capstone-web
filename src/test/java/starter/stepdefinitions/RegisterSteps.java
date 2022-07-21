package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.HomePage;
import starter.Pages.LoginPage;
import starter.Pages.RegisterPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterSteps {
    @Steps
    HomePage home;

    @Steps
    RegisterPage register;

    @Given("At register page website | Register")
    public void onTheRegisterPage() {
        register.onTheRegisterPage();
        register.openPage();
        register.validateOnRegisterPage();
    }

    @When("Input valid email | Register")
    public void inputValidEmail() {
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();

        register.inputValidEmail();
        register.inputEmail("salsabilla_testemail" + formatter.format(date) + "@gmail.com");
    }

    @And("Input valid username | Register")
    public void inputValidUsername() {
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();

        register.inputValidUsername();
        register.inputUsername("TestEmail" + formatter.format(date));
    }

    @And("Input valid password | Register")
    public void inputValidPassword() {
        register.inputValidPassword();
        register.inputPassword("1234567890");
    }

    @And("Input valid confirm password | Register")
    public void inputValidConfirmPassword() {
        register.inputValidConfirmPassword();
        register.inputConfirmPassword("1234567890");
    }

    @And("Click button register | Register")
    public void clickButtonRegister() {
        register.clickButtonRegister();
        register.clickRegisterButton();
    }

    @Then("At home page website | Register")
    public void onTheHomePageForRegister() {
        register.onTheHomePageForRegister();
        home.validateOnTheHomePage();
    }
}
