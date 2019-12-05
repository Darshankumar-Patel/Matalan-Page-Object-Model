package pageElement;

import drivers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends DriverManager {

public void searchItem () {

    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("Christmas Jumpers");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.name("q")).getText();
    // new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));

    }
}
