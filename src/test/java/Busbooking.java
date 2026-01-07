import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Busbooking {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public static void windowhandle(int ind) {
        Set<String> windows = driver.getWindowHandles();
        List<String> tabs = new ArrayList<String>(windows);
        driver.switchTo().window(tabs.get(ind));

    }

    public static void main(String[] args) throws InterruptedException, AWTException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bus.ixigo.com/");

        Actions actions = new Actions(driver);
        actions.doubleClick().perform();

        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");

        WebElement apsrtcicon = driver.findElement(By.xpath("//h3[text()='APSRTC']"));
        apsrtcicon.click();

        windowhandle(1);

        WebElement from = driver.findElement(By.xpath("//input[@placeholder='Leaving From']"));
        from.click();

        String s = "Chennai";
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            from.sendKeys(String.valueOf(c));
            Thread.sleep(200);
        }
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        WebElement to = driver.findElement(By.xpath("//input[@placeholder='Going To']"));
        to.click();
        to.sendKeys("Tirupati");

        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement datepicker = driver.findElement(By.xpath("(//a[@class='btn date text-neutral-800 bg-neutral-0 light text neutral md rounded-md inactive button'])[3]"));
        datepicker.click();

        driver.findElement(By.xpath("//span[text()='Search']")).click();

        WebElement selectac = driver.findElement(By.xpath("//span[text()='AC']"));
        selectac.click();

        js.executeScript("window.scrollTo(0,300)");

        Thread.sleep(2000);
        WebElement slide = driver.findElement(By.xpath("//div[@role='slider']"));
        actions.dragAndDropBy(slide, 100, 0).perform();

        js.executeScript("arguments[0].scrollIntoView()",slide);

        WebElement selectbus = driver.findElement(By.xpath("(//button[contains(text(),'Select Seats')])[1]"));
        selectbus.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='seat sleeper']/child::span[contains(text(),'₹')]")).click();

        Thread.sleep(3000);
//        driver.quit();
    }
}
