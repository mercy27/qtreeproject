package logics1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import helper1.CommonHelper;
import pages1.Chapter1Pom;

public class Chapters extends CommonHelper 
{
	//CommonHelper Common=new CommonHelper();
	//WebDriver driver=chap.browser();
	/** open the chapter1 */
	public void chapter1(WebDriver driver)
	{
		Chapter1Pom Pom=new Chapter1Pom();
		driver.findElement(Pom.chapter1).click();
		System.out.println("chapter1 open");
		
	}
	/** check the radio button and click */
	public void radio(WebDriver driver)
	{
		Chapter1Pom Pom=new Chapter1Pom();
		driver.findElement(Pom.radio).click();
	}
	/** select the dropdown using selectbyvisibletext */
    public void dropdown(WebDriver driver)
    {
    	Chapter1Pom Pom=new Chapter1Pom();
    	driver.findElement(Pom.dropdown).click();
		Select sel=new Select(driver.findElement(Pom.dropdown));
		sel.selectByVisibleText("Selenium IDE");
		driver.findElement(Pom.dropdown).click();
    }
    /** check the box and click the checkbox*/
    public void check(WebDriver driver) 
    {
    	Chapter1Pom Pom=new Chapter1Pom();
    	driver.findElement(Pom.check).click();
    	if(driver.findElement(Pom.check).isDisplayed())
    	{
    		driver.findElement(Pom.check).click();
			System.out.println("click");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}else
		{
			System.out.println("not click");
		}
    	
    }
    /** check the botton and its clickable click the button */
	public void verify(WebDriver driver)
	{
		Chapter1Pom Pom=new Chapter1Pom();
		driver.findElement(Pom.verify).click();
		if(driver.findElement(Pom.verify).isEnabled())
		{
			driver.findElement(Pom.verify).click();
			System.out.println("button click");
		}else
		{
			System.out.println("button not click");
		}
	}
	/** load the text into textbox */
	public void loadtext(WebDriver driver)
	{
		Chapter1Pom Pom=new Chapter1Pom();
		driver.findElement(Pom.loadtext).click();
		System.out.println("text loded");
	}
	/** back to the home page */
	public void home(WebDriver driver)
	{
		Chapter1Pom Pom=new Chapter1Pom();
		driver.findElement(Pom.home).click();
		System.out.println("back to home page");
		System.out.println("*****chapter1 finished*****");
	}
	
	
}
