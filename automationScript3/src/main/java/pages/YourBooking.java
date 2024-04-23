package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourBooking 
{
    static WebElement element = null;
    
    public static WebElement contactName(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement contactNumber(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement contactEmail(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement driverTitle(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]"));
        return element;
    }

    public static WebElement driverName(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement driverNumber(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]"));
        return element;
    }

    public static WebElement continueButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]"));
        return element;
    }

    public static WebElement specialRequest(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[9]/div[1]/div[1]/div[3]/div[1]/textarea[1]"));
        return element;
    }

    public static WebElement rentalRequirement(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[11]/div[1]/div[1]"));
        return element;
    }

    public static WebElement checkAllRequirements(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]"));
        return element;
    }

    public static WebElement saveRequirements(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]"));
        return element;
    }

    public static WebElement continuePayment(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[14]/div[1]/div[1]/div[1]"));
        return element;
    }

    public static WebElement continueConfirmation(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]"));
        return element;
    }
}
