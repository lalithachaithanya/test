package PageObjectModel;

import BaseMethod.Baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import java.util.List;

public class BusResultsPagePO extends Baseclass {
    public WebDriver driver;
    public JavascriptExecutor js;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public BusResultsPagePO(WebDriver driver) {

        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//p[text()='AC'])[2]")
    WebElement filterAC;

    @FindBy(xpath = ".//p[text()='Sleeper']")
    WebElement filterSleeper;

    @FindBy(xpath = "//p[text()='Price']")
    WebElement lowestprice;

    @FindBy(xpath = "(//div[@class='BusCard_listItem__LjqrW'])[1]")
    WebElement busName;
    @FindBy(xpath = "//span[text()='Pick up point - Chennai, Tamil Nadu']")
            WebElement ScrolltoSelectPickupDropPoints;

    @FindBy(xpath = "//button[text()='Select Seats'][1]")
    WebElement selectSeat;

    @FindBy(xpath = "//img[@alt='HORIZONTAL_SLEEPER' and contains(@src,'Available')]")
    List<WebElement> HorizonalAvailableSeats;
    @FindBy(xpath = "//img[@alt='SEATER' and contains(@src,'Available')]")
    List<WebElement> SeaterAvailableSeats;


    //@FindBy(xpath = "//div[contains(@class, 'pickDropItem')]")
    @FindBy(xpath = "(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[1]/child::div/div/div")
    List<WebElement> pickupPoint;

    //@FindBy(xpath = "//div[contains(@class, 'pickDropItem')]")
    @FindBy(xpath = "(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[2]/child::div/div/div")
    List<WebElement> dropPoint;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ContinueButton;

    public void seatType() {
        System.out.println("-------------- Entering Bus page --------------");

            filterAC.click();
            filterSleeper.click();
            js.executeScript("window.scrollBy(500, 0)");

    }

    public void cheapestPrice() throws InterruptedException {
        lowestprice.click();
        Thread.sleep(500);
       //System.out.println("Travel agent Bus Name is & Coach : "+ busName.getText());
        Thread.sleep(500);
        scrollToElement(driver, ScrolltoSelectPickupDropPoints);
        selectSeat.click();
    }
    public void setSelectSete(){

        if (!HorizonalAvailableSeats.contains("HORIZONTAL_SLEEPER")) {
            HorizonalAvailableSeats.get(0).click();
            int availableSeats = HorizonalAvailableSeats.size();
            System.out.println(availableSeats +" SLEEPER SEATS AVAILABLE");
        }else {
            SeaterAvailableSeats.get(0).click();
            int availableSeats = SeaterAvailableSeats.size();
            System.out.println(availableSeats + " AVAILALE FOR SEATER ONLY, SLEEPER NOT AVAILABLE");
        }
    }

    public void BodingPoint(String pickUpLocaton) throws InterruptedException {

        Thread.sleep(1000);

        for (WebElement PICKpoint : pickupPoint) {
            if (PICKpoint.getText().contains(pickUpLocaton)) {
                PICKpoint.click();
                String pickup = PICKpoint.getText();
                System.out.println("ADDRESS :" + pickup);
                break;
            }
        }
    }
    public void DropingPoint(String dropLocation) throws InterruptedException {

        Thread.sleep(1000);

            for (WebElement DROPpoint : dropPoint) {
                if (DROPpoint.getText().contains(dropLocation)) {
                    DROPpoint.click();
                    String pickup = DROPpoint.getText();
                    System.out.println("ADDRESS :" +pickup);
                    break;
                }
            }
    }

    public void confirmButton() {
        //js.executeScript("window.scrollTo(0, 5000)");
        scrollByPixels(driver, 0,5000);
        ContinueButton.click();
        System.out.println("-------------- Exit From Bus Page --------------");
    }
}
