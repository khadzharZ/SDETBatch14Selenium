package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaits {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // on mac you dont need exe on windows use exe
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        // use the get() function  to open up the required website
        driver.get("https://www.facebook.com/");
        //click on create new account
        WebElement createNewAccountBtn= driver.findElement(By.xpath("//a[@text()='Create New Account']"));
        createNewAccountBtn.click();
        Thread.sleep(4000);
        //Send the first name
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Khadzhar");
    }
}
