package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankHomework {
/*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Khadzhar");
        driver.findElement(By.name("customer.lastName")).sendKeys("Zakhaddinova");
        driver.findElement(By.id("customer.address.street")).sendKeys("4716 LarkHaven");
        driver.findElement(By.id("customer.address.city")).sendKeys("Charlotte");
        driver.findElement(By.id("customer.address.state")).sendKeys("NC");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("28215");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("937-377-2048");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("Kzakh098");
        driver.findElement(By.id("customer.password")).sendKeys("Pass12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Pass12345");
        Thread.sleep(4000);
        driver.findElement(By.className("button")).click();
        //driver.close();


    }
}


