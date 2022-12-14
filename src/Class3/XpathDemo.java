package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // on mac you dont need exe on windows use exe
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        //go to facebook
        driver.get("http://www.facebook.com");
        //enter the username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abracadabra");
        // click on forgot password
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
    }
}
