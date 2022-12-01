package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args)  throws InterruptedException {
        // go to google.com
        // go to facebook.com
        // go back to google.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create the WebDriver instance
        WebDriver driver = new ChromeDriver();
        //go to google.com
        driver.get("http://www.google.com");
        //go to facebook.com
        driver.navigate().to("http://www.facebook.com");
        // introduce some sleep which is wait
        // wait or pause for 2000 milli second(2 second)
        Thread.sleep(2000);
        // go back to google.com
        driver.navigate().back();
        // wait or pause for 2000 milli second(2 second)
        Thread.sleep(2000);
        // go back to facebook.com
        driver.navigate().forward();
        //wait or pause for 1000 milli second(1 second)
        Thread.sleep(1000);
        //refresh the page
        driver.navigate().refresh();
        // will quit the whole browser
        driver.quit(); // will quit the whole browser

    }
}
