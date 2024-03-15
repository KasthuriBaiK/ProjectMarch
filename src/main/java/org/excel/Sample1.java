package org.excel;

import java.io.File;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // Import WebDriver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver; // Import EdgeDriver

public class Sample1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\org.excel\\target\\Driver\\msedgedriver.exe");
				
		WebDriver driver = new EdgeDriver();
		
		WebDriverManager.edgedriver().setup();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		//WebElement locators
		 WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		 user.sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("//input[contains(@placeholder,\"Email\")]")).sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		
		 WebElement user1 = driver.findElement(By.id("email"));
		 user1.sendKeys("abc@gmail.com");
		 String attribute = user1.getAttribute("type");
		 System.out.println(attribute);
		 Thread.sleep(2000);
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("name");
		 Thread.sleep(2000);
		 WebElement login = driver.findElement(By.linkText("Log in"));
		 login.click();
		 WebElement forgot = driver.findElement(By.linkText("Forgotten"));
		 forgot.click();
		 
}
}
