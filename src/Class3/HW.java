package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        /*Navigate to http://syntaxprojects.com
          Click on start practicing
          click on simple form demo
          enter any text on first text box
          click on show message
          quit the browser*/

        //setting up the webdriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //go to syntaxprojects.com
        driver.get("http://syntaxprojects.com");
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(1200);
        //click on start practicing
        driver.findElement(By.xpath("//a[contains(@id, 'btn_basic_example')]")).click();
        Thread.sleep(1200);
        driver.findElement(By.xpath("//a[text()='Simple Form Demo' and @class='list-group-item']")).click();
        Thread.sleep(1200);
        driver.findElement(By.id("user-message")).sendKeys("I am learning Selenium");
        Thread.sleep(1200);
        driver.findElement(By.xpath("//button[contains (@onclick, 'showInput')]")).click();
        Thread.sleep(1200);
        driver.quit();
    }
}

