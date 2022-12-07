package action;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import object.objectClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class actionClass{
	public static WebDriver driver;
	objectClass set = PageFactory.initElements(driver,objectClass.class);
	
	//case1
	
	public void initial_signup () throws InterruptedException {
		set.Signup.click();
		Thread.sleep(2000);
	}
	public void signup_name_credentials(String string) {
		set.userName.sendKeys(string);
	}
	public void signup__pass_credentials(String ps) throws InterruptedException {
		set.passName.sendKeys(ps);
		Thread.sleep(2000);
	}
	public void signup_button_clicking() throws InterruptedException {
		set.signup_button.click();
		Thread.sleep(2000);
	}
	public void alertOk_for_signup() {
		//set.ok_for_signup();
		driver.switchTo().alert().accept();
	}
	
	//case2
	
	public void loginin_action() throws InterruptedException {
		set.login_click.click();
		Thread.sleep(2000);
	}
	public void username_registered(String string) {
		set.name_enter.sendKeys(string);
	}
	public void password_registered(String string) throws InterruptedException {
		set.pass_enter.sendKeys(string);
		Thread.sleep(2000);
	}
	public void login_with_registered_credentials() throws InterruptedException {
		set.login_button_click.click();
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			String negative_case = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println(negative_case);//Wrong password.
			if (negative_case != negative_case) {
				System.out.println("Negative case..Please enter valid log in credentials");
			}else {
				System.out.println("positive case");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void alertOk_for_login()  {
		//action done in previous method
	}
	
	//case3
	
	public void headerContact_click() throws InterruptedException {
		set.contacts_click.click();
		Thread.sleep(2000);
	}
	public void emaildetails_for_contact(String string) {
		set.email_for_contact.sendKeys(string);
	}
	public void namedetails_for_contact(String string) {
		set.name_for_contact.sendKeys(string);
	}
	public void messageContent_for_contact(String string) throws InterruptedException {
		set.context_content.sendKeys(string);
		Thread.sleep(2000);
	}
	public void clickButton_for_send() {
		set.send_message_by_click.click();
	}
	public void alertOk_for_contacting() {
		driver.switchTo().alert().accept();
	}
	
	//case4
	public void aboutUs_click() throws InterruptedException {
		set.aboutUs_about_ui.click();
		Thread.sleep(2000);
	}
	public void click_screen_to_watch_video() throws InterruptedException {
		set.aboutUs_video.click();
		Thread.sleep(9000);
	}
	public void close_button_for_finishing() {
		set.close_video.click();
	}
	
	//case5
	
	public void titleCheck() throws InterruptedException {
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.printf("Title : ",title);
	}
	public void returning_data() throws InterruptedException{
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("Uniform Resource Locater : "+url);
	}
	public void back_to_home() throws InterruptedException {
		set.back_to_home.click();
		Thread.sleep(2000);
	}
	public void validating() throws InterruptedException {
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("Validating Title...........");
	
		String actual = title;
		try {
			Assert.assertEquals(actual,"STORE");
			System.out.println("Page Title is : "+actual);
			System.out.println("Successful while Validating...");
		}catch(Exception e) {
			System.out.println(e.getMessage()+ "Validation Failed......");
		}
		
		/*if(title==actual) {
			System.out.println("Successful while Validating...");
		}else {
			System.out.println("Validation Failed...");
		}*/
	}
	
	//case6
	
	public void phone_category() throws InterruptedException {
		set.phone_inspect.click();
		Thread.sleep(2000);
	}
	public void inspect_for_desiredPhone() throws InterruptedException {
		set.desired_phone.click();
		Thread.sleep(2000);
	}
	public void back_to_phoneCategory_Page() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
	}
	public void again_inspect_for_desiredPhone() throws InterruptedException {
		set.desired_phone_after_inspect.click();
		Thread.sleep(2000);
	}
	public void Navigates_back_to_HomeCategories() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	//case7
	
	public void phone_category_forCart() throws InterruptedException {
		set.clicks_on_phone_for_cart.click();
		Thread.sleep(2000);
	}
	public void clickOn_desiredPhone() throws InterruptedException {
		set.clicks_on_desiredphone_for_cart.click();
		Thread.sleep(2000);
	}
	public void clickOn_desiredPhone_for_cart() throws InterruptedException {
		set.adding_to_cart_desiredAbove.click();
		Thread.sleep(2000);
	}
	public void alertOk_for_Phone_cartAdding() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void back_to_home_from_cartSection() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(2000);
	}
	
	//case8
	
	public void laptop_category_forCart() throws InterruptedException {
		set.clicks_on_laptops_for_cart.click();
		Thread.sleep(2000);
	}
	public void clickOn_desiredLaptop() throws InterruptedException {
		set.clicks_on_desiredLaptop_for_cart.click();
		Thread.sleep(2000);
	}
	public void clickOn_desiredLaptop_for_cart() throws InterruptedException {
		set.adding_to_cart_desiredLaptop.click();
		Thread.sleep(2000);
	}
	public void alertOk_for_laptop_cartAdding() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void back_to_home_from_laptop_cartSection() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(2000);
	}
	
	//case9
	
	public void moniter_category_forCart() throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.clicks_on_Moniter_for_cart.click();
		Thread.sleep(2000);
	}
	public void clickOn_desiredMoniter() throws InterruptedException {
		//set.clicks_on_desiredMoniter_for_cart.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		set.clicks_on_desiredMoniter_for_cart.click();
	}
	public void clickOn_desiredMoniter_for_cart() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		set.adding_to_cart_desiredMoniter.click();
		Thread.sleep(3000);
	}
	public void alertOk_for_moniter_cartAdding() throws InterruptedException {
		Thread.sleep(2000);
		try {
			driver.switchTo().alert().accept();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(2000);
	}
	public void back_to_home_from_moniter_cartSection() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(2000);
	}
	
	//case10
	
	public void clicks_on_Cart_button_for_checkout() throws InterruptedException {
		Thread.sleep(2000);//high load Time
		set.finalCart_button.click();
		Thread.sleep(2000);
	}
	public void Click_on_Place_Order_button() throws InterruptedException {
		Thread.sleep(2000);//high load Time
		set.Place_Order_button.click();
		Thread.sleep(2000);
	}
	public void Name_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.name_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void country_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.country_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void city_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.city_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void card_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.creditCard_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void month_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.month_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void year_detail_for_chechout(String string) throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.year_detail_for_chechout.sendKeys(string);
		Thread.sleep(1000);
	}
	public void purchase_button() throws InterruptedException {
		Thread.sleep(4000);//high load Time
		set.purchase.click();
		Thread.sleep(1000);
	}
	public void confirmation_alert_from_webelement() throws InterruptedException {
		set.alertOk_for_successfully_purchased.click();
	}
	
	//case11
	
	public void click_loginn() throws InterruptedException {
		set.log_inn.click();
		Thread.sleep(2000);
	}
	public void enter_loginn_name(String string) throws InterruptedException {
		set.log_inn_name.sendKeys(string);
		Thread.sleep(2000);
	}
	public void enter_loginn_pass(String string) throws InterruptedException {
		set.log_inn_pass.sendKeys(string);
		Thread.sleep(2000);
	}
	public void click_loginnn() throws InterruptedException {
		set.log_inn_button.click();
		Thread.sleep(2000);
	}
	public void click_logout() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		set.log_out.click();
	}
	public void successful_logout() throws InterruptedException {
		//set.successful_log_out.click();
		driver.navigate().back();
		
//		TakesScreenshot scrShot =((TakesScreenshot)driver);
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//		Screenshot screenshot = new AShot().takeScreenshot(driver);
//		java.io.File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		Screenshot screenshot = new AShot().takeScreenshot(driver);
//		java.io.File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	}

}