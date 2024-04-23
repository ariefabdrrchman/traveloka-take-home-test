package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarSelection 
{
    static WebElement element = null;
    
    public static WebElement sortCar(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]"));
        return element;
    }

    public static WebElement sortByHighestPrice(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[contains(text(),'Highest price')]"));
        return element;
    }

    public static WebElement image(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/img[1]"));
        return element;
    }

    public static WebElement continueSelectCar(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]"));
        return element;
    }
}
