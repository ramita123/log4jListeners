package Page_Objectory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sortableobjectRepo {
	
	WebDriver driver;
	public sortableobjectRepo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[1]")
	private WebElement sortableclick;
	
	@FindBy(xpath="//div[@class='vertical-list-container mt-4']/div")
	private List<WebElement> sortlist;
	
	@FindBy(xpath="//nav[@class='nav nav-tabs']/a[2]")
	private WebElement gridclick;
	
	@FindBy(xpath="//div[@class='create-grid']/div")
	private List<WebElement> gridlist;
	
	
	
	
	
	public WebElement sortablecclick()
	{
		return sortableclick;
	}
	

	public List<WebElement> sortlist()
	{
		return sortlist;
	}
	
	public WebElement gridclick()
	{
		return gridclick;
	}

	
	public List<WebElement> gridlist()
	{
		return gridlist;
	}

}
