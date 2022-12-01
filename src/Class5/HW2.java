package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    /*1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title*/
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //goto syntax project /checkbox demo
        driver.get("https://www.ebay.com/");
        //maximize
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(dropDown);
        select.selectByIndex(11);
        Thread.sleep(2000);
        WebElement dropDown2= driver.findElement(By.xpath("//input[@id='gh-btn']"));
        dropDown2.click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);



    }
}
