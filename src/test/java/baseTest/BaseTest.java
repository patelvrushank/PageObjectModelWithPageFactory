package baseTest;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.DbManager;
import utilities.ExcelReader;



public class BaseTest {
public WebDriver driver;
	
	//public  Properties RO = new Properties();
	public  Logger log = Logger.getLogger(BaseTest.class.getName());
	public static  ExcelReader excel = new ExcelReader(".//src//test//resources//excel//testdata.xlsx");
	 
	public  FileInputStream fis;
	
	
	
	
	
	@BeforeMethod
	public void setUp() throws SQLException, InterruptedException, MalformedURLException  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.ANY);
		cap.setBrowserName("chrome");
		ChromeOptions option =new ChromeOptions();
		option.merge(cap);
		
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("Select * from Student"));
		if(driver==null) {
	//PropertyConfigurator.configure(System.getProperty("user.dir")+"//src//test//resources//log4j.properties");
	 
	 
	//driver = WebDriverManager.chromedriver().create();
			
			Map<String, Object> prefs = new HashMap<String,Object>();
			prefs.put("profile.default_content_setting_values.notification", false);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			
	
	driver = new ChromeDriver(options);
			// driver = new RemoteWebDriver(new java.net.URL("http://localhost:4444/wd/hub"),cap);
	// driver.get("http://www.google.com");
	 driver.get("https://www.carwale.com/");
	 log.info("Navigating to the website");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   
	  
	
	
	}
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
		driver=null;
		log.info("Quiting the browser");
		//ExtentListeners.test.log(Status.INFO,"Quiting the browser");
	}

}
