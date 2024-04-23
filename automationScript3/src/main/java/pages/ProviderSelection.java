package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProviderSelection 
{
    static WebElement element = null;
    
    public static WebElement continueSelectProvider(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]"));
        return element;
    }
}
