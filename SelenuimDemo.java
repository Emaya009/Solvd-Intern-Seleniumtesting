package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelenuimDemo {
    public static void main(String[] args) {
        //Automating in google chrome using chrome driver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        /* Automating in fireFox browser using Gecko driver
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://mailchimp.com/");
         */

        driver.manage().window().maximize(); // MAximize the web page

        //using xpath for signup button click
        // driver.findElement(By.xpath("//*[@id=\"593fQsZNqG6Q2tLhwfRfGn\"]/div/div/div/a")).click();

        //using cssSelector(Tag,class and attribute) for signup button click
       driver.findElement(By.cssSelector("a.ctaPrimary[href='/pricing/marketing/']")).click();

       //using link text for signup button click
       //driver.findElement(By.linkText("Sign Up")).click();

       //using xpath to navigate to Websites & Commerce tab
       driver.findElement(By.xpath("//*[@id=\"1RkqxGS13w5goqvKDNqUFa\"]/nav/a[2]")).click();

       //using cssSelector(Tag and class) to click Offer Terms link
       driver.findElement(By.cssSelector("span.tooltip__originalText")).click();

       /* Trying to close the window opened for Offer Terms link but not working
      driver.findElement(By.cssSelector("button[aria-label='Close Tooltip']")).click();
      driver.findElement(By.xpath("//*[@id=\"958:50k4dOcuSttpsiSm1D89vs\"]/button/svg/path")).click();
*/
        //using cssSelector(Tag and attribute) to find the currency tab
        WebElement currency=driver.findElement(By.cssSelector("select[aria-label='Currency']"));
        Select dropCurrency=new Select(currency);
        //selecting the currency using selectByVisibleText method
       // dropCurrency.selectByVisibleText("£ GBP");
        //selecting the currency using selectByValue method
        dropCurrency.selectByValue("CAD");

       //used to quit the whole browser session along with all the associated browser windows,tabs and popups
       driver.quit();
    }
    }
