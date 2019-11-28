package pageElement;

import drivers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends DriverManager {

public void searchItem () {

    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("Boys school uniform");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
