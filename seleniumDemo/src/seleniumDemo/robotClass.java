package seleniumDemo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(1000);
		
		Robot robot=new Robot();
		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
		
		for(int i=0;i<5;i++) {
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);	
			
		}
		
		Actions actions=new Actions(driver);
		
		
		WebElement drag = driver.findElement(By.id("angular"));
		
		WebElement drop = driver.findElement(By.id("droparea"));
		
		actions.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.id("mongo"));
		actions.dragAndDrop(drag1, drop).perform();
		
		WebElement drag2 = driver.findElement(By.id("node"));
		actions.dragAndDrop(drag2, drop).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
//		
//		WebElement uploadfiles = driver.findElement(By.id("pickfiles"));
//		
//		uploadfiles.click();
//		
//		robot.keyPress(KeyEvent.VK_D);
//		robot.keyPress(KeyEvent.VK_O);
//		robot.keyPress(KeyEvent.VK_W);
//		
//		Thread.sleep(1000);
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
