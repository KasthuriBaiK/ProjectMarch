package org.excel;

import java.io.File;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // Import WebDriver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver; // Import EdgeDriver
import org.openqa.selenium.interactions.Actions;

public class Sample3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\org.excel\\target\\Driver\\msedgedriver.exe");
				
		WebDriver driver = new EdgeDriver(); //Upcasting
		
		WebDriverManager.edgedriver().setup();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		
		//WebElement user = driver.findElement(By.id("email"));
		//user.sendKeys("Selenium");
		//Thread.sleep(2000);
		//user.clear();
		Thread.sleep(2000);
		//user.sendKeys("abc@gmail.com");
		
		//WebElement pass = driver.findElement(By.id("pass"));
		//pass.sendKeys("12345");
		
		//WebElement findElement = driver.findElement(By.linkText("Forgotten Password"));
		//findElement.click();
		
		//WebElement s1 = driver.findElement(By.partialLinkText("Forgotten"));
		//s1.click();
		
		List<WebElement> log = driver.findElements(By.tagName("a"));
		for (int i = 0; i < log.size(); i++) {
			
			WebElement text = log.get(i);
            String text2 = text.getText();
            System.out.println(text2);		
            
          //WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobiles']"));
            Actions a = new Actions(driver);
            //a.moveToElement(mobile).click().perform();
            
            WebElement user = driver.findElement(By.id("email"));
            a.sendKeys(user, "abc@gmail.com").build().perform();
      		a.doubleClick(user).build().perform();
      		a.contextClick(user).build().perform();
		}
		}
		
}
