package SyntaxProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicChangeDem {


    public static void main(String[] args) throws InterruptedException {
        String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement getNewUser = driver.findElement(By.xpath("//button[contains(text(),'Get New User')]"));
        getNewUser.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name :')]")));
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        System.out.println(firstName.getText());
        driver.quit();
    }

}

