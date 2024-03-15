package org.excel;

import java.io.File;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver; // Import WebDriver
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver; // Import EdgeDriver

public class Sample2 {
	
	public static void main(String[] args) throws Throwable {
		
		System.getProperty("about:blank");
		
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		String S = "https:/facebook.com";
		
		driver.navigate().to(S);
		
		//driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
		
		//driver.navigate().back();
		
		//Thread.sleep(5000);
		
		//driver.navigate().forward();
		
		//Thread.sleep(2000);
		
		//driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		String CurrentUrl = driver.getCurrentUrl();
		
		System.out.println(CurrentUrl);
		
		if(S.equals(CurrentUrl)) {
			
			System.err.println("given url is matching");
			
		}
		
		else
			System.out.println("Not matching");
		}
	
}
