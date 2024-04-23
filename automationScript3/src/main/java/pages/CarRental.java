package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarRental 
{
    static WebElement element = null;
    
    public static WebElement productCarRental(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[contains(text(),'Car Rental')]"));
        return element;
    }

    public static WebElement withoutDriver(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//h4[contains(text(),'Without Driver')]"));
        return element;
    }

    public static WebElement withDriver(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//h4[contains(text(),'With Driver')]"));
        return element;
    }

    public static WebElement rentalLocation(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//input[@placeholder='Enter city or region']"));
        return element;
    }

    public static WebElement selectLocation(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div.css-1dbjc4n.r-aoullt.r-6koalj.r-1wtj0ep.r-dg7iqi.r-bnwqim.r-13qz1uu.r-tqpus0:nth-child(5) div.css-1dbjc4n.r-1ifxtd0.r-1jgb5lz.r-1a83bov.r-17yavnb:nth-child(2) div.css-1dbjc4n.r-bnwqim:nth-child(1) div.css-1dbjc4n.r-1wzrnnt.r-6yljno.r-bnwqim.r-pezta:nth-child(2) div.css-1dbjc4n.r-kdyh1x.r-d045u9.r-xyw6el div.css-1dbjc4n.r-11c0sde.r-bztko3.r-bnwqim.r-417010:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-12w9sp div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jt293m div.css-1dbjc4n div.css-1dbjc4n.r-13awgt0.r-bnwqim div.css-1dbjc4n.r-1wh2hl7.r-e65k4z.r-1q9bdsx.r-1e081e0.r-tvv088:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1h0z5md div.css-1dbjc4n.r-13awgt0.r-1ufr4wv:nth-child(1) div.css-1dbjc4n div.css-1dbjc4n:nth-child(1) div.css-1dbjc4n:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-1wh2hl7.r-e65k4z.r-b4qz5r.r-1dqxon3.r-u8s1d.r-1rt2jqs div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh:nth-child(2) > div.css-1dbjc4n"));
        return element;
    }

    public static WebElement pickUpDate(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement selectPickUpDate(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-14lw9ot r-1wh2hl7 r-e65k4z r-b4qz5r r-1d2f490 r-1udh08x r-u8s1d'] div[class='css-1dbjc4n r-18u37iz'] div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(3) div:nth-child(24) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(2) div:nth-child(1)"));
        return element;
    }

    public static WebElement pickUpTime(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement selectPickUpTimeHour(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(13) > div:nth-child(1)"));
        return element;
    }

    public static WebElement selectPickUpTimeMinute(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)"));
        return element;
    }

    public static WebElement pickUpTimeDone(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[contains(text(),'Done')]"));
        return element;
    }

    public static WebElement dropOffDate(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement selectDropOffDate(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div.css-1dbjc4n.r-aoullt.r-6koalj.r-1wtj0ep.r-dg7iqi.r-bnwqim.r-13qz1uu.r-tqpus0:nth-child(5) div.css-1dbjc4n.r-1ifxtd0.r-1jgb5lz.r-1a83bov.r-17yavnb:nth-child(2) div.css-1dbjc4n.r-bnwqim:nth-child(1) div.css-1dbjc4n.r-1wzrnnt.r-6yljno.r-bnwqim.r-pezta:nth-child(2) div.css-1dbjc4n.r-kdyh1x.r-d045u9.r-xyw6el div.css-1dbjc4n.r-11c0sde.r-bztko3.r-bnwqim.r-417010:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-12w9sp div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jt293m div.css-1dbjc4n div.css-1dbjc4n.r-13awgt0.r-bnwqim div.css-1dbjc4n.r-1wh2hl7.r-e65k4z.r-1q9bdsx.r-1e081e0.r-tvv088:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1h0z5md div.css-1dbjc4n.r-13awgt0:nth-child(7) div.css-1dbjc4n div.css-1dbjc4n:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-1wh2hl7.r-e65k4z.r-b4qz5r.r-1udh08x.r-u8s1d.r-zchlnj div.css-1dbjc4n.r-edyy15 div.css-1dbjc4n div.css-1dbjc4n.r-150rngu.r-18u37iz.r-16y2uox.r-1wbh5a2.r-lltvgl.r-buy8e9.r-mfh4gg.r-2eszeu.r-1sncvnh div.css-1dbjc4n.r-18u37iz div.css-1dbjc4n.r-cpa5s6:nth-child(1) div.css-1dbjc4n.r-18u37iz div.css-1dbjc4n:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-6413gk.r-14hr28s.r-c0cves:nth-child(3) div.css-1dbjc4n:nth-child(25) div.css-1dbjc4n.r-1awozwy.r-kdyh1x.r-1loqt21.r-1777fci.r-1otgn73.r-1i6wzkk.r-lrvibr div.css-1dbjc4n.r-13qz1uu div.css-1dbjc4n.r-18u37iz.r-1472mwg.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-eqz5dr.r-16y2uox.r-1472mwg.r-1777fci.r-1wyvozj.r-u8s1d.r-70iriu.r-136ojw6:nth-child(2) > div.css-901oao.r-cwxd7f.r-t1w4ow.r-1b43r93.r-majxgm.r-rjixqe.r-q4m81j"));
        return element;
    }

    public static WebElement dropOffTime(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement selectDropOffTimeHour(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div.css-1dbjc4n.r-aoullt.r-6koalj.r-1wtj0ep.r-dg7iqi.r-bnwqim.r-13qz1uu.r-tqpus0:nth-child(5) div.css-1dbjc4n.r-1ifxtd0.r-1jgb5lz.r-1a83bov.r-17yavnb:nth-child(2) div.css-1dbjc4n.r-bnwqim:nth-child(1) div.css-1dbjc4n.r-1wzrnnt.r-6yljno.r-bnwqim.r-pezta:nth-child(2) div.css-1dbjc4n.r-kdyh1x.r-d045u9.r-xyw6el div.css-1dbjc4n.r-11c0sde.r-bztko3.r-bnwqim.r-417010:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-12w9sp div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jt293m div.css-1dbjc4n div.css-1dbjc4n.r-13awgt0.r-bnwqim div.css-1dbjc4n.r-1wh2hl7.r-e65k4z.r-1q9bdsx.r-1e081e0.r-tvv088:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1h0z5md div.css-1dbjc4n.r-13awgt0:nth-child(9) div.css-1dbjc4n div.css-1dbjc4n:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-1wh2hl7.r-e65k4z.r-b4qz5r.r-1dqxon3.r-u8s1d.r-zchlnj.r-y46g1k div.css-1dbjc4n.r-y46g1k div.css-1dbjc4n.r-18u37iz.r-xyw6el div.css-1dbjc4n.r-13awgt0:nth-child(1) div.css-1dbjc4n.r-1l31rp8.r-kdyh1x.r-rs99b7.r-key0ze.r-1udh08x div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh div.css-1dbjc4n div.css-1dbjc4n.r-1loqt21.r-1777fci.r-tuq35u.r-1otgn73.r-1i6wzkk.r-lrvibr:nth-child(9) > div.css-901oao.r-cwxd7f.r-t1w4ow.r-1b43r93.r-majxgm.r-rjixqe.r-q4m81j"));
        return element;
    }

    public static WebElement selectDropOffTimeMinute(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("div.css-1dbjc4n.r-aoullt.r-6koalj.r-1wtj0ep.r-dg7iqi.r-bnwqim.r-13qz1uu.r-tqpus0:nth-child(5) div.css-1dbjc4n.r-1ifxtd0.r-1jgb5lz.r-1a83bov.r-17yavnb:nth-child(2) div.css-1dbjc4n.r-bnwqim:nth-child(1) div.css-1dbjc4n.r-1wzrnnt.r-6yljno.r-bnwqim.r-pezta:nth-child(2) div.css-1dbjc4n.r-kdyh1x.r-d045u9.r-xyw6el div.css-1dbjc4n.r-11c0sde.r-bztko3.r-bnwqim.r-417010:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-12w9sp div.css-1dbjc4n.r-16y2uox.r-1wbh5a2.r-1jt293m div.css-1dbjc4n div.css-1dbjc4n.r-13awgt0.r-bnwqim div.css-1dbjc4n.r-1wh2hl7.r-e65k4z.r-1q9bdsx.r-1e081e0.r-tvv088:nth-child(2) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-1h0z5md div.css-1dbjc4n.r-13awgt0:nth-child(9) div.css-1dbjc4n div.css-1dbjc4n:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-1wh2hl7.r-e65k4z.r-b4qz5r.r-1dqxon3.r-u8s1d.r-zchlnj.r-y46g1k div.css-1dbjc4n.r-y46g1k div.css-1dbjc4n.r-18u37iz.r-xyw6el div.css-1dbjc4n.r-13awgt0:nth-child(3) div.css-1dbjc4n.r-1l31rp8.r-kdyh1x.r-rs99b7.r-key0ze.r-1udh08x div.css-1dbjc4n.r-150rngu.r-eqz5dr.r-16y2uox.r-1wbh5a2.r-11yh6sk.r-1rnoaur.r-1sncvnh div.css-1dbjc4n div.css-1dbjc4n.r-1loqt21.r-1777fci.r-tuq35u.r-1otgn73.r-1i6wzkk.r-lrvibr:nth-child(1) > div.css-901oao.r-cwxd7f.r-t1w4ow.r-1b43r93.r-majxgm.r-rjixqe.r-q4m81j"));
        return element;
    }

    public static WebElement dropOffTimeDone(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[contains(text(),'Done')]"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]"));
        return element;
    }
}
