package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	
		
		public  static WebDriver driver;
		
		public static void  driverintinlization()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramita\\eclipse-workspace\\listeners_Log4j\\chromedriver2.exe" );
		 driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		}
		
		public  void  screenhsot() 
		{
			
			TakesScreenshot screenshot=  (TakesScreenshot) driver;
			File test=screenshot.getScreenshotAs(OutputType.FILE);
			System.out.println(test);
			try {
				 Date d = new Date();
			        System.out.println(d.toString());
			        
			        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");  
			        String strDate= formatter.format(d);  
			        System.out.print(strDate);
			    
			      
				
				FileUtils.copyFile(test, new File("D:\\"+strDate+".jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}


