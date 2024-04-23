package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.CarRental;
import pages.CarSelection;
import pages.PaymentMethod;
import pages.ProviderSelection;
import pages.RentalPolicy;
import pages.YourBooking;

public class RentCarSteps 
{
    WebDriver driver = new ChromeDriver();
    
    @Given("traveloka landing page")
    public void traveloka_landing_page() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.traveloka.com/en-id");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("user go to car rental product")
    public void user_go_to_car_rental_product() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.productCarRental(driver).click();
        Thread.sleep(2000);
    }

    @When("select Without Driver option")
    public void select_Without_Driver_option() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.withDriver(driver).click();
        Thread.sleep(2000);

        CarRental.withoutDriver(driver).click();
        Thread.sleep(2000);
    }

    @When("enter rental location with Tangerang")
    public void enter_rental_location_with_Tangerang() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.rentalLocation(driver).sendKeys("Tangerang");
        Thread.sleep(2000);

        CarRental.selectLocation(driver).click();
        Thread.sleep(2000);
    }

    @When("select rental start date and time")
    public void select_rental_start_date_and_time() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.pickUpDate(driver).click();
        Thread.sleep(2000);

        CarRental.selectPickUpDate(driver).click();
        Thread.sleep(2000);

        CarRental.pickUpTime(driver).click();
        Thread.sleep(2000);

        CarRental.selectPickUpTimeHour(driver).click();
        Thread.sleep(2000);

        CarRental.selectPickUpTimeMinute(driver).click();
        Thread.sleep(2000);

        CarRental.pickUpTimeDone(driver).click();
        Thread.sleep(2000);
    }

    @When("select rental end date and time")
    public void select_rental_end_date_and_time() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.dropOffDate(driver).click();
        Thread.sleep(2000);

        CarRental.selectDropOffDate(driver).click();
        Thread.sleep(2000);

        CarRental.dropOffTime(driver).click();
        Thread.sleep(2000);

        CarRental.selectDropOffTimeHour(driver).click();
        Thread.sleep(2000);

        CarRental.selectDropOffTimeMinute(driver).click();
        Thread.sleep(2000);

        CarRental.pickUpTimeDone(driver).click();
        Thread.sleep(2000);
    }

    @When("click search icon button")
    public void click_search_icon_button() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarRental.searchButton(driver).click();
        Thread.sleep(2000);
    }

    @Then("page move to car selection")
    public void page_move_to_car_selection() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Car Rental Without Driver", driver.findElement(By.xpath("//h2[contains(text(),'Car Rental Without Driver')]")).getText());
        Thread.sleep(2000);
    }

    @When("user sort by highest price")
    public void user_sort_by_highest_price() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarSelection.sortCar(driver).click();
        Thread.sleep(2000);

        CarSelection.sortByHighestPrice(driver).click();
        Thread.sleep(2000);

        CarSelection.image(driver).click();
        Thread.sleep(2000);
    }

    @When("select the most expensive car")
    public void select_the_most_expensive_car() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        CarSelection.continueSelectCar(driver).click();
        Thread.sleep(2000);
    }

    @When("select rental provider")
    public void select_rental_provider() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Select Rental Provider", driver.findElement(By.xpath("//h2[contains(text(),'Select Rental Provider')]")).getText());
        Thread.sleep(2000);

        ProviderSelection.continueSelectProvider(driver).click();
        Thread.sleep(2000);
    }

    @When("choose pick up location at rental office")
    public void choose_pick_up_location_at_rental_office() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Rental Policy", driver.findElement(By.xpath("//h3[contains(text(),'Rental Policy')]")).getText());
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(2000);
        
        RentalPolicy.pickUpRental(driver).click();
        Thread.sleep(2000);

        RentalPolicy.dropdownButton(driver).click();
        Thread.sleep(2000);

        RentalPolicy.pickUpRentalAddress(driver).click();
        Thread.sleep(2000);
    }

    @When("drop off location at Soekarno Hatta airport")
    public void drop_off_location_at_Soekarno_Hatta_airport() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        RentalPolicy.dropOffOther(driver).click();
        Thread.sleep(2000);

        RentalPolicy.fillLocation(driver).sendKeys("Soekarno Hatta", Keys.TAB, Keys.ENTER);
        Thread.sleep(7000);

        js.executeScript("window.scrollBy(0,200)", "");
        Thread.sleep(2000);
    }

    @When("fill note with {string}")
    public void fill_note_with(String s) throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        RentalPolicy.note(driver).sendKeys("This note is filled by Selenium WebDriver with Java");
        Thread.sleep(2000);
    }

    @When("click continue")
    public void click_continue() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);

        RentalPolicy.continueButton(driver).click();
        Thread.sleep(60000);
    }

    @Then("page move to Your Booking")
    public void page_move_to_Your_Booking() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals("Your Booking", driver.findElement(By.xpath("//h1[contains(text(),'Your Booking')]")).getText());
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
    }

    @When("user fill contact name")
    public void user_fill_contact_name() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.contactName(driver).sendKeys("Dummy Contact");
        Thread.sleep(2000);
    }

    @When("fill contact number")
    public void fill_contact_number() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.contactNumber(driver).sendKeys("81234567890");
        Thread.sleep(2000);
    }

    @When("fill contact email")
    public void fill_contact_email() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.contactEmail(driver).sendKeys("gigopi4674@dxice.com");
        Thread.sleep(2000);
    }

    @When("select driver title")
    public void select_driver_title() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.driverTitle(driver).click();
        Thread.sleep(2000);

        YourBooking.driverTitle(driver).sendKeys(Keys.ARROW_DOWN);;
        Thread.sleep(2000);

        YourBooking.driverTitle(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @When("fill driver name")
    public void fill_driver_name() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.driverName(driver).sendKeys("Dummy Driver");
        Thread.sleep(2000);
    }

    @When("fill driver number")
    public void fill_driver_number() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.driverNumber(driver).sendKeys("80987654321");
        Thread.sleep(2000);
    }

    @When("click continue again")
    public void click_continue_again() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.continueButton(driver).click();
        Thread.sleep(2000);
    }

    @Then("user fill special request")
    public void user_fill_special_request() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.specialRequest(driver).sendKeys("This request filled using Selenium WebDriver with Java");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
    }

    @When("user check all requirements")
    public void user_check_all_requirements() throws InterruptedException 
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.rentalRequirement(driver).click();
        Thread.sleep(2000);

        YourBooking.checkAllRequirements(driver).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(2000);

        YourBooking.saveRequirements(driver).click();
        Thread.sleep(2000);
    }

    @When("continue to payment")
    public void continue_to_payment() throws InterruptedException
    {
        // Write code here that turns the phrase above into concrete actions
        YourBooking.continuePayment(driver).click();
        Thread.sleep(2000);

        YourBooking.continueConfirmation(driver).click();
        Thread.sleep(20000);
    }

    @When("select payment method")
    public void select_payment_method() throws InterruptedException
    {
        // Write code here that turns the phrase above into concrete actions
        PaymentMethod.mandiriVA(driver).click();
        Thread.sleep(2000);
    }

    @Then("user proceed to pay")
    public void user_proceed_to_pay() throws InterruptedException
    {
        // Write code here that turns the phrase above into concrete actions
        PaymentMethod.pay(driver).click();
        Thread.sleep(30000);

        driver.close();
    }
}
