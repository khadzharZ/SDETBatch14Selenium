package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
       // go to google.com
        //maximize your window
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //create instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // go to google.com
        driver.get("https://google.com");
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.quit();
    }
}

