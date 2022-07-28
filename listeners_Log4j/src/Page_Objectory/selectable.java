package Page_Objectory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectable {
	
	WebDriver driver;
	public selectable(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='element-list collapse show']/ul/li[2]")
	private WebElement selectableclick;
	
	@FindBy(xpath="//ul[@id='verticalListContainer']/li")
	private List<WebElement> list;
	
	@FindBy(xpath="//nav[@class='nav nav-tabs']/a[2]")
	private WebElement gridClick;
	
	@FindBy(xpath="//div[@class='grid-container mt-4']/div/li")
	private List<WebElement> gridList;
	
	
	
	
	
	public WebElement selectableclick()
	{
		return selectableclick;
	}
	
	public List<WebElement> list()
	{
		return list;
	}
	

	public WebElement gridClick()
	{
		return gridClick;
	}
	
	public List<WebElement> gridList()
	{
		return gridList;
	}

}
