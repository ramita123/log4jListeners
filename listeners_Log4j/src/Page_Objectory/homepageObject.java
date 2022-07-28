package Page_Objectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.base;

public class homepageObject extends base  {
	
	WebDriver driver;
	public homepageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='category-cards']/div[5]")
	private WebElement interactionsclick;
	
	public WebElement interactionsclick()
	{
		return interactionsclick;
	}
}
