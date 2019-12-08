package stepDefs;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.DriverManager;
import org.openqa.selenium.By;
import pageElement.HomePage;
import pageElement.ResultPage;
import pageElement.SelectRandomJumper;

public class RandomSteps extends DriverManager {
    private ResultPage output = new ResultPage();
    private SelectRandomJumper choose = new SelectRandomJumper();
    private HomePage  homesearch = new HomePage();

    @Given("^I am on the search result page$")
    public void i_am_on_the_search_result_page() {
        openBrowser();
        homesearch.searchItem();
        output.result();

    }

    @When("^I Select Random Jumper$")
    public void i_Select_Random_Jumper() {
        choose.selectanyjumper();

    }

    @Then("^I should be able to see the Selected Jumper$")
    public void i_should_be_able_to_see_the_Selected_Jumper()  {






    }

}
