package logics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages1.Chapter4pom;

public class Chapter4 extends Chapters{
	
	//CommonHelper Common=new CommonHelper();
	//Chapter4 chapter=new Chapter4();
     //Chapters chapter=new Chapters();
    /** open the chapter4 */
    public void chapter4(WebDriver driver)
    {
	Chapter4pom pom=new Chapter4pom();
	driver.findElement(pom.chapter4).click();
	System.out.println("chapter 4 open");
    }
    /** enter the text in textbox */
    public void textbox1(WebDriver driver)
    {
        Chapter4pom pom=new Chapter4pom();
	    driver.findElement(pom.textbox1).click();
	    driver.findElement(pom.textbox1).sendKeys("assignment");
         System.out.println("text entered");
    }
    /** select the dropdown */
    public void dropdown1(WebDriver driver)
    {
    	Chapter4pom pom=new Chapter4pom();
    	driver.findElement(pom.dropdown1).click();
		Select se=new Select(driver.findElement(pom.dropdown1));
		se.selectByVisibleText("Selenium RC");
		driver.findElement(pom.dropdown1).click();
	    System.out.println("dropdown selected");
    }
    /** enter the text in textbox */
    public void textbox2(WebDriver driver)
    {
    	Chapter4pom pom=new Chapter4pom();
    	driver.findElement(pom.textbox2).click();
		driver.findElement(pom.textbox2).sendKeys("abcd");
		System.out.println("in text box text entered");
    }
    /** accept the popup */
    public void bidbox(WebDriver driver)
    {
    	Chapter4pom pom=new Chapter4pom(); 
    	driver.findElement(pom.bidbox).click();
		driver.switchTo().alert().accept();
		driver.findElement(pom.bidbox).sendKeys("50");
		System.out.println("accept the popup");
    }
    /** in this method perform hover action and accept the popup */
    public void hover(WebDriver driver)
    {
    	Chapter4pom pom=new Chapter4pom();
    	Actions act=new Actions(driver);
		WebElement hover=driver.findElement(pom.hover);
		act.moveToElement(hover).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.navigate().back();
		System.out.println("*****chapter4 finished*****");
		
    }
    public static void main (String args[])
    {
	//Chapters chap=new Chapters();
	Chapter4 chapter=new Chapter4();
	WebDriver driver=chapter.browser();
	chapter.launchurl(driver,"http://book.theautomatedtester.co.uk/");
	chapter.chapter1(driver);
	chapter.radio(driver);
	chapter.dropdown(driver);
	chapter.check(driver);
	chapter.verify(driver);
	chapter.loadtext(driver);
	chapter.home(driver);
	chapter.chapter4(driver);
	chapter.textbox1(driver);
	chapter.dropdown1(driver);
	chapter.textbox2(driver);
	chapter.bidbox(driver);
	chapter.hover(driver);
	chapter.browserclose(driver);
	System.out.println("This Website Automated Successfully");
    }
}