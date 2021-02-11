package helper1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonHelper {
	 public WebDriver driver;
	 public Properties properties;
	public void loadproperty() throws IOException {
		//System.setProperty("Webdriver.chrome.driver","chrome.exe");
		Properties prop=new Properties();
		FileReader read=new FileReader("project.properties");
		prop.load(read);
		String url=prop.get("url").toString();
		//WebDriver driver=new ChromeDriver();
		
	}
	/** this method used to launchbrowser */
	public WebDriver browser()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("browser launching");
		return driver;
	    
	}
	/** launch the url using propertyfile */
   public void launchurl( WebDriver driver,String url)
   {
	  
	   driver.get(url);
	   driver.manage().window().maximize();
	   System.out.println("url launched");
   }
   /** close the browser */
   public void browserclose(WebDriver driver)
   {
	   driver.close();
	   System.out.println("driver close");
   }

}
