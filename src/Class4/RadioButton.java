package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        //set the path to the driver to link it with our class
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // on mac you dont need exe on windows use exe
        // create a Webdriver instance
        WebDriver driver = new ChromeDriver();
        // use the get() function  to open up the required website
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //get the radio button Male
        WebElement maleRadioBth = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        // check if the radio button is displayed
        boolean displayStatus = maleRadioBth.isDisplayed();
        //print the display status
       System.out.println("The radio button is Displayed: "+ displayStatus);
       // check weather the radio button is Enabled
        boolean enableStatus= maleRadioBth.isEnabled();
        System.out.println("The radio button is Enabled: "+enableStatus);
        // check whether the radio button male is selected
        boolean selectStatus= maleRadioBth.isSelected();
        System.out.println("The radio button is selected: "+selectStatus);
        //check if the radio button is not selected then click on it
        if(!selectStatus){
            //perform a click operation on the radio button
            maleRadioBth.click();
        }
        selectStatus= maleRadioBth.isSelected();
        System.out.println("The radio button is selected : "+selectStatus);
}
}