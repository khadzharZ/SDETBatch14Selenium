package SyntaxProjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {
    public static void main(String[] args) throws InterruptedException {

        String url="http://syntaxprojects.com/javascript-alert-box-demo.php";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement clickMeButton= driver.findElement(By.xpath("//button[text()='Click me!']"));
        clickMeButton.click();
        WebElement promptBoxButton=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        promptBoxButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.dismiss();
        promptBoxButton.click();
        Thread.sleep(900);
        Alert promptAlert1=driver.switchTo().alert();
        Thread.sleep(1000);
        promptAlert1.sendKeys("Janel");


    }
}
