/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** 
 *
 * @author Sweta
 */
public class FacebookTest {
  private WebDriver driver;
  private String baseUrl;  
    public FacebookTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception { 
        
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception { 
        driver.close();
    } 
    @Test
  public void testFacebookTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=facebook&oq=facebook&aqs=chrome.0.69i59l2j0i131i433i512l2j0i131i433j0i131i433i512l2j0i512j0i131i433.3138j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys(FileUtil.loadData().getUsername());
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).clear();
//    driver.findElement(By.id("text-input-pass")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    driver.findElement(By.id("pass")).sendKeys(FileUtil.loadData().getPassword());
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER); 
  //try { assertEquals (driver.findElement(By.xpath(baseUrl)
  }
}
