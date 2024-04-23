package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethod 
{
    static WebElement element = null;
    
    public static WebElement mandiriVA(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[contains(text(),'Mandiri Virtual Account')]"));
        return element;
    }

    public static WebElement pay(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]"));
        return element;
    }
}
