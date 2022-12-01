package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        // go to facebook.com
        // enter username
        //enter password
        //click log in

        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        // use the get()  go to facebook.com
        driver.get("https://www.facebook.com/");
        // maximize the window
        driver.manage().window().maximize();
        // enter the username in the TEXTBOX
        // locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("khadzharZakh");
        // enter the password in the text box
        driver.findElement(By.name("pass")).sendKeys("Girl123");
        // click the log in button
        driver.findElement(By.name("login")).click();
        // click on forgot password using linkText locator
        //driver.findElement(By.linkText("Forgot password?")).click();

        // click on forgot password using Partial linkText locator
        driver.findElement(By.partialLinkText("Forgot")).click();

       // driver.quit();
    }
}
