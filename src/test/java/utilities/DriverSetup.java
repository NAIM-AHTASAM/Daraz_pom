package utilities;

 

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class DriverSetup {
	
	private static String browerName = System.getProperty("WebDriver.chrome.driver", "Firefoxs"); 
			
	private static final ThreadLocal<WebDriver>LOCAL_DRIVER = new ThreadLocal<>();


	
	public static void setDrive(WebDriver driver) {
		DriverSetup.LOCAL_DRIVER.set(driver);
		
	}
	
	public static  WebDriver getDrive() {
		return LOCAL_DRIVER.get();
		
	}
	
	
	
	public WebDriver driver;
	
	@BeforeSuite
	
	public void SetDriver(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		
		
	}
	
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
	
	



 public static WebDriver getBrowser(String browserName) {
	
	
	switch (browserName.toLowerCase()) {
	case "chrome":
		return new ChromeDriver();
		
	case "firefox":
		return new FirefoxDriver();
	case "edge":
		return new EdgeDriver();		
		

	default:
		throw new RuntimeException("Brower not found using the name'" + browserName +"'!" );
	}
	
	
}
 
 
 @BeforeSuite
 public static synchronized void setBrowser() {
	 
	 WebDriver webDriver = getBrowser(browerName);
	 webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 webDriver.manage().window().maximize();
	 setDrive(webDriver);
	
}
 
 public static synchronized void quitBrowser() {
	 
	 getDrive().quit();
	 
	 
 }
 
 
 
}



