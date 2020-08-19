package automationPractice.step_definitions;

import automationPractice.pages.BasePage;
import automationPractice.utilities.PageObjects;
import io.cucumber.java.en.Then;

public class AssertionSteps {

    @Then("{string} should be {string} on {string} page")
    public void should_be_on_page(String object, String expected, String pageName) {

        BasePage basePage = PageObjects.getPageObject(pageName);

        basePage.validateResult(object, expected);
    }
}
