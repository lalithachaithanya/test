package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions ac=new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement drop = driver.findElement(By.id("trash"));
		
		ac.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
