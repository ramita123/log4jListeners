package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.base;
import Base.commonMethods;
import Page_Objectory.homepageObject;
import Page_Objectory.selectable;
import Page_Objectory.sortableobjectRepo;

@Listeners(listeners_Log4j.listeners.class)
public class testcaeseValidations extends base{
	
	private Logger log=LogManager.getLogger(testcaeseValidations.class.getName());
	
	@BeforeClass
	public void setup()
	{
		driverintinlization();
	}
	
	@Test(priority=0)
	public void verifysortableClick()
	{
		
		homepageObject home= new homepageObject(driver);
		commonMethods common= new commonMethods(driver);
		common.executorforScroll("window.scrollBy(0,400)");
		home.interactionsclick().click();
		
		
		sortableobjectRepo obj= new sortableobjectRepo(driver);
		obj.sortablecclick().click();
		log.debug("i am clicking on sortable");
		
		ArrayList<String> list=new ArrayList<String>();
		
		List<WebElement> sortedList=obj.sortlist();
		System.out.println(sortedList);
		for(int i=0;i<sortedList.size();i++)
		{
			String text=sortedList.get(i).getText();
			list.add(text);
		}
		System.out.println(list);
		log.info("sorted list in ascending order" + list);
		  Collections.reverse(list);
		  log.info("sorted list in descending order"+list);
		  System.out.println(list);
		  
		  
		  obj.gridclick().click();
		 
		  ArrayList<String> gridlist=new ArrayList<String>();
			
			List<WebElement> gridElements= obj.gridlist();
			System.out.println(gridElements);
			for(int i=0;i<gridElements.size();i++)
			{
				String text=gridElements.get(i).getText();
				gridlist.add(text);
			}
			System.out.println(gridlist);
			log.info("sorted list in ascending order" + gridlist);
			  Collections.reverse(gridlist);
			  log.info("sorted list in descending order"+gridlist);
			  System.out.println(gridlist);
		
	}
	
	@Test(priority=1)
	
	public void verifysortabletab()
	{
		commonMethods common= new commonMethods(driver);
		common.executorforScroll("window.scrollBy(0,400)");
		selectable obj= new selectable(driver);
		obj.selectableclick().click();
		List<WebElement> elements=obj.list();
		for(int i=0;i<elements.size();i++)
		{
			elements.get(i).click();;
			
		}
		
		obj.gridClick().click();
		List<WebElement> Gridelements=obj.gridList();
		for(int i=0;i<Gridelements.size();i++)
		{
			Gridelements.get(i).click();;
			
		}
		
	}
	
	
	
	
	
	

}
