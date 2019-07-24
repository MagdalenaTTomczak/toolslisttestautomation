package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    LoginPage loginPage;
    ToolsPage toolsPage;
    WebDriver driver;

    @Before
    public void setUp() {
        //Get the driver for the browser (e.g. ChromeDriver)
        driver = Driver.getDriver();
        // Navigate to the URL of our webpage
        driver.get(Driver.getUrl());

        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);

    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Given("I am logged out")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("the tool list is displayed")
    public void the_tool_list_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user selects the tool")
    public void the_user_selects_the_tool() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the tool detail page is displayed")
    public void the_tool_detail_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user search for a term {string}")
    public void the_user_search_for_a_term(String SearchTerm) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("list of tools related to that term is returned")
    public void list_of_tools_related_to_that_term_is_returned() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user selects the delete option")
    public void the_user_selects_the_delete_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the tool is deleted")
    public void the_tool_is_deleted() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
