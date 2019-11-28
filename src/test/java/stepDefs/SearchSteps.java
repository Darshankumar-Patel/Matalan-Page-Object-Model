package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageElement.HomePage;
import pageElement.ResultPage;

public class SearchSteps {

    private HomePage homesearch = new HomePage();
    private DriverManager openpage = new DriverManager();
    private ResultPage output = new ResultPage();


    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        openpage.openBrowser();

    }

    @When("^I search for a \"([^\"]*)\"$")
    public void i_search_for_a(String arg1) {
     homesearch.searchItem();

   }

    @Then("^I should be able to see Boys school uniform page$")
    public void i_should_be_able_to_see_Boys_school_uniform_page() {
    output.result();
    openpage.closeBrowser();

    }
}
