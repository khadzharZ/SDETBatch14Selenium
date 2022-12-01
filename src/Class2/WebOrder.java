package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // on mac you dont need exe on windows use exe
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        // go to smart bear .com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // maximize the window
        driver.manage().window().maximize();
        // enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter the password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click log in
        driver.findElement(By.className("button")).click();

        //Make sure that the title is correct  i.e
        // get the title of the page
        String title= driver.getTitle();
       // System.out.println(title);
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The title is correct: "+ title);
        }else{
            System.out.println("The title is incorrect: "+title);
        }
    }
}
