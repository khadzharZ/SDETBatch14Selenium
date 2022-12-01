package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomework {
 /*navigate to fb.com
click on create new account
fill up all the textboxes
close the pop up
close the browser*/

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Khadzhar");
        driver.findElement(By.name("lastname")).sendKeys("Zakha");
        driver.findElement(By.name("reg_email__")).sendKeys("khadzharZ@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("khadzharZ@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("1Baby1");
        driver.findElement(By.name("birthday_month")).sendKeys("May");
        driver.findElement(By.name("birthday_day")).sendKeys("29");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(8500);
        driver.quit();
    }}

