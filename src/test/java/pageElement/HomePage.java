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
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
    driver.findElement(By.name("q")).sendKeys("Boys school uniform");
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
