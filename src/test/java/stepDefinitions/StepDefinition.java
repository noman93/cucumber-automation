package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.LoginPage;
import pages.SearchPage;
import setup.Setup;

public class StepDefinition extends Setup {
    LoginPage loginPage;
    SearchPage searchPage;


    @Given("User visits the portal")
    public void user_visits_the_portal() {
        driver.get("https://github.com/");

    }

    @When("User inputs create-react-app in search input")
    public void User_inputs_create_react_app_in_search_input() {
        loginPage = new LoginPage(driver);
        loginPage.doSearch();
    }

    @Then("User finds related  matching result")
    public void user_finds_related_matching_result() {
        searchPage = new SearchPage(driver);
        searchPage.assertSearchResult();

    }


    @Then("User find facebook\\/create-react-app project as the first result")
    public void user_find_facebook_create_react_app_project_as_the_first_result() {
        searchPage = new SearchPage(driver);
        searchPage.checkFirstSearchResult();


    }

    @When("Go to landing page footer and click about button")
    public void Go_to_landing_page_footer_and_click_about_button() {
        loginPage = new LoginPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        loginPage.clickAbout();
    }

    @Then("User will be taken to the GitHub About page.")
    public void user_will_be_taken_to_the_GitHub_About_page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
