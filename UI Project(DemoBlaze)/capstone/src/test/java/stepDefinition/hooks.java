package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import action.actionClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends actionClass{
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\sdet_module 3\\102_chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}

/*package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import action.actionClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends actionClass{
	@Before
	@Parameters("browser")
	public void setUp(String browser) throws Exception {
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.Firefox.driver","");
			driver.manage().window().maximize();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\sdet_module 3\\102_chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","D:\\sdet_module 4\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else{
			//if no browser passes
			throw new Exception("Incorrect Browser");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void tearDown() {
		driver.close();
	}
}*/