package Class12;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // maximize
        driver.manage().window().maximize();
        //  go to the website amazon
        driver.get("https://amazon.com/");
        //        scroll down
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0,-500)");

    }
}
