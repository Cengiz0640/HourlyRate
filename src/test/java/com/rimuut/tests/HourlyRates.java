package com.rimuut.tests;

import com.rimuut.utilities.BrowserUtils;
import com.rimuut.utilities.Driver;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class HourlyRates {

    WebDriver driver = Driver.get();
    String URL = "https://rimuut.com/tools/hourly-rate";

    @BeforeClass
    public void testSetUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("version", "latest");
        capabilities.setCapability("tunnel", false);
        capabilities.setCapability("network", true);
        capabilities.setCapability("console", true);
        capabilities.setCapability("visual", true);

    }

    @Test

    protected void test_selenium_hourly_rate() throws InterruptedException {

        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div[@class='arrow'])[2]")).click();
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[1]")).sendKeys("50");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[2]")).sendKeys("500");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[3]")).sendKeys("150");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[4]")).sendKeys("20");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[5]")).sendKeys("20");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[6]")).sendKeys("350");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[7]")).sendKeys("1050");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[8]")).sendKeys("250");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[9]")).sendKeys("150");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[10]")).sendKeys("500");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[11]")).sendKeys("10");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[12]")).sendKeys("20");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[13]")).sendKeys("30");

        BrowserUtils.scrollToElement(driver.findElement(By.xpath("(//div[@class='arrow'])[3]")));
        driver.findElement(By.xpath("(//div[@class='arrow'])[3]")).click();
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[14]")).sendKeys("10");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[15]")).sendKeys("10");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[16]")).sendKeys("40");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[17]")).sendKeys("2");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[18]")).sendKeys("2");
        driver.findElement(By.xpath("(//p[@class='form-description']/..//input)[19]")).sendKeys("2");

        Thread.sleep(2);
        System.out.println(driver.findElement(By.xpath("//span[@id='result']")).getText());

    }
}