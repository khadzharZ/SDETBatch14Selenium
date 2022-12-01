package Class5;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code*/
    public static void main(String[] args) throws InterruptedException {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver= new ChromeDriver();
        //goto syntax project /checkbox demo
        driver.get("https://www.facebook.com/");
        //maximize
        driver.manage().window().maximize();
        //find the checkbox
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Hajar");
        driver.findElement(By.name("lastname")).sendKeys("Zakh");
        driver.findElement(By.name("reg_email__")).sendKeys("khadzharZ@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("khadzharZ@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("lalalala");
        driver.findElement(By.name("birthday_month")).sendKeys("May");
        driver.findElement(By.name("birthday_day")).sendKeys("29");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
}}
