package pageElement;


import drivers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ResultPage extends DriverManager {

       public void result(){
        String actualTital = driver.getTitle();
        assert actualTital.contains("Christmas Jumpers");
    }


}
