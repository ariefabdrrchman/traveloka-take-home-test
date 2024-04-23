package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RentalPolicy 
{
    static WebElement element = null;
    
    public static WebElement pickUpRental(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]"));
        return element;
    }

    public static WebElement dropdownButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        return element;
    }

    public static WebElement pickUpRentalAddress(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        return element;
    }

    public static WebElement dropOffOther(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]"));
        return element;
    }

    public static WebElement fillLocation(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement selectLocation(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]"));
        return element;
    }

    public static WebElement note(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/textarea[1]"));
        return element;
    }

    public static WebElement continueButton(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div.css-1dbjc4n.r-1ihkh82:nth-child(2) div.css-1dbjc4n.r-1kihuf0.r-169s5xo.r-1wzrnnt.r-uwe93p.r-136ojw6:nth-child(6) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1h0z5md div.css-1dbjc4n:nth-child(1) div.css-1dbjc4n.r-eqz5dr div.css-1dbjc4n:nth-child(5) div.css-1dbjc4n.r-173mn98:nth-child(4) > div.css-18t94o4.css-1dbjc4n.r-kdyh1x.r-1loqt21.r-10paoce.r-5wp0in.r-5njf8e.r-1otgn73.r-lrvibr"));
        return element;
    }
}
