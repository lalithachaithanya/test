package seleniumDemo;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class windowhandleClass {

	public static WebDriver driver;
	
	public static void windowhandleusingforIndex(int ind) {
		Set<String> windows = driver.getWindowHandles();
		List<String> tabss = new ArrayList<String>(windows);
		driver.switchTo().window(tabss.get(ind));
		
	}
	
	public static void  windowhandleusingforeach() {
		Set<String> windows = driver.getWindowHandles();
		for (String str : windows) {
			driver.switchTo().window(str);
			
		}
	}
		
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://en.wikipedia.org/wiki/Tata_Group");
//	WebElement element = driver.findElement(By.xpath("(//img[@class='mw-file-element'])[7]"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView();", element);
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("iwatch", Keys.ENTER);
		
		WebElement firstproduct = driver.findElement(By.xpath("//img[@class='_53J4C-']"));
		firstproduct.click();
		
		System.out.println(driver.getWindowHandles());

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> tabs = new ArrayList<String>(windowHandles);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);

		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 3500);");

		WebElement atcclick = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		atcclick.click();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
		WebElement secproduct = driver.findElement(By.xpath("(//img[@class='_53J4C-'])[2]"));
		secproduct.click();
		Thread.sleep(1000);

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> tabs2 = new ArrayList<String>(windowHandles2);

		driver.switchTo().window(tabs2.get(2));

		js.executeScript("window.scrollBy(0, 3500);");

		WebElement atcclick2 = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));

		atcclick2.click();

		Thread.sleep(1000);

		driver.switchTo().window(tabs2.get(0));

		Thread.sleep(1000);

		for (String st : tabs2) {

			driver.switchTo().window(st);
		}
			
			windowhandleusingforIndex(0);
			
			Thread.sleep(1000);
			
			windowhandleusingforeach();
			
			Thread.sleep(1000);
			
			

	}

	}


