package pageElement;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import drivers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ResultPage extends DriverManager {

    public void result(){
        String actualTital = driver.getTitle();
        assert actualTital.contains("Boys School Uniform Shop");
    }

}
