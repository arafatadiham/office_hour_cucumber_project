package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.ConfigurationReader;
import automationPractice.utilities.Driver;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationSteps {
    //Given User on "Login" page for "VyTrack" application
    @Given("User on {string} page for {string} application")
    public void user_on_page_for_application(String pageName, String appName) {

        appName = appName.toUpperCase();
        switch (appName) {
            case "VYTRACK":
                Driver.get().get(ConfigurationReader.get("vytrack_url"));
                break;
            default:
                Assert.fail("Application name " + appName + " not defined.");


        }

    }

    @When("User clicks on {string} button on {string} page")
    public void user_clicks_on_button_on_page(String buttonName, String pageName) {
        BasePage page = PageObjects.getPageObject(pageName);
        page.clickButton(buttonName);
    }





}
