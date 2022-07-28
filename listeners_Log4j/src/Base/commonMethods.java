package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class commonMethods {
	
	public WebDriver driver;

	public commonMethods(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void executorforScroll(String value)
	{
		JavascriptExecutor obj4= (JavascriptExecutor)driver;
		obj4.executeScript(value);
	}

}
