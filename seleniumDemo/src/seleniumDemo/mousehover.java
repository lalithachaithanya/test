package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1TOQfO']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(login).perform();
		
		Thread.sleep(1000);
		
		WebElement loginclick = driver.findElement(By.xpath("(//a[@class='yx2hEq'])[2]"));
		loginclick.click();
		
//		WebElement rightclick = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[2]"));
//		
//		ac.contextClick(rightclick);
		
		

		Thread.sleep(2000);
		driver.quit();
	}

}
