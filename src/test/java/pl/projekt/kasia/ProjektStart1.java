package pl.projekt.kasia;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ProjektStart1 {
    static FirefoxDriver driver;

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.gecko.driver", "C:\\WORK\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void mainTest(){
        driver.get("http://newtours.demoaut.com");

        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("Kasia");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("kasia123");
        driver.findElement(By.name("login")).click();

    }

    @AfterClass
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}