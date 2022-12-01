package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) throws InterruptedException {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();
        //find the text
        WebElement welcomeText= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text= welcomeText.getText();
        System.out.println("the text is :"+text);
    }}