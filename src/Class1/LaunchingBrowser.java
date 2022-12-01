package Class1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingBrowser {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // on mac you dont need exe on windows use exe
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
       // use the get() function  to open up the required website
        driver.get("https://www.google.com/");
        // get the URL of the website
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
        driver.close();
    }
}

