package pageElement;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.RandomNumber;

import java.util.List;
import java.util.Random;

import static org.jsoup.helper.Validate.fail;

public class SelectRandomJumper extends DriverManager {

    public void selectanyjumper() {

    List<WebElement> matalanproducts = driver.findElements(By.cssSelector("div[class=\"search-results__inner row\"]"));
    int jumpercount = matalanproducts.size();
    if (jumpercount == 0){
    fail ("I have no suggestion for you");
    }
    int randomjumper = new RandomNumber().generateRandomNumber(jumpercount);
    WebElement selectjumper = matalanproducts.get(randomjumper);
    String jumperselected = selectjumper.getText();
    selectjumper.click();
    }

}
