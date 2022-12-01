package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //goto chercher.tech
        driver.get("https://chercher.tech/practice/frames");
        //maximize
        driver.manage().window().maximize();
        // Task 1 : Select baby cat from the dropdown
        driver.switchTo().frame(1);
        //find the text animals and print on screen
        WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String text= animalText.getText();
        System.out.println(text);


        //check the check box
        //switch focus to the main page
        driver.switchTo().defaultContent();
        //switch to the frame containing the subframe which has check box
        driver.switchTo().frame("frame1");
        WebElement inputTxt =driver.findElement(By.xpath("//input"));
       // inputTxt.sendKeys("abracadabra");
        //finding the frame through xpath and switching using by webelement method
        WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        //find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement animal= driver.findElement(By.xpath("//select[@id='animals']"));
        Select choose =new Select(animal);
        choose.selectByValue("babycat");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement inputDone= driver.findElement(By.xpath("//input"));
        inputDone.sendKeys("Done");
}}
