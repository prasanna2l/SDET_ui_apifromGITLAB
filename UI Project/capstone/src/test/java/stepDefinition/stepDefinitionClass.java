package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import action.actionClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionClass {
	
	actionClass act = new actionClass();
	
	@Given("User Launch the Browser")
	public void user_launch_the_browser() {
		System.out.println("Launching through hooks");
	}
	
	@When("User Enter the URL of DemoBlaze WebSite {string}")
	public void user_enter_the_url_of_demo_blaze_web_site(String url) {
		hooks.driver.get(url);
	}
	
	//case1

	@When("User Clicks on sign up")
	public void user_clicks_on_sign_up() throws InterruptedException {
		act.initial_signup();
	}

	@When("User Should enter user name {string}")
	public void user_should_enter_user_name(String string) {
		act.signup_name_credentials(string);
	   
	}

	@When("User Should enter password {string}")
	public void user_should_enter_password(String string) throws InterruptedException {
		act.signup__pass_credentials(string);
	}

	@Then("User Should Click on the sign up button")
	public void user_should_click_on_the_sign_up_button() throws InterruptedException {
		act.signup_button_clicking();
	}

	@Then("User need to click on ok button")
	public void user_need_to_click_on_ok_button() {
		act.alertOk_for_signup();
	}
	
	//case2

	@When("User Clicks on Log in")
	public void user_clicks_on_log_in() throws InterruptedException {
		act.loginin_action();
	}

	@When("User Should enter user name for log in {string}")
	public void user_should_enter_user_name_for_log_in(String string) {
		act.username_registered(string);
	}

	@When("User Should enter password for log in {string}")
	public void user_should_enter_password_for_log_in(String string) throws InterruptedException {
		act.password_registered(string);
	}

	@Then("User Should Click on the Log in button")
	public void user_should_click_on_the_log_in_button() throws InterruptedException {
		act.login_with_registered_credentials();
	}

	@Then("User is Successfully logged in")
	public void user_is_successfully_logged_in() {
		act.alertOk_for_login();
	}
	
	//case3
	
	@When("User Clicks on contact")
	public void user_clicks_on_contact() throws InterruptedException {
		act.headerContact_click();
	}

	@When("User need to give contact email {string}")
	public void user_need_to_give_contact_email(String string) {
		act.emaildetails_for_contact(string);
	}

	@When("User need to give contact name {string}")
	public void user_need_to_give_contact_name(String string) {
		act.namedetails_for_contact(string);
	}

	@When("User need to give message {string}")
	public void user_need_to_give_message(String string) throws InterruptedException {
		act.messageContent_for_contact(string);
	}

	@Then("User Should Click on send message button")
	public void user_should_click_on_send_message_button() {
		act.clickButton_for_send();
	}

	@Then("User need to click on ok button for successful sending")
	public void user_need_to_click_on_ok_button_for_successful_sending() {
		act.alertOk_for_contacting();
	}
	
	//case4

	@When("User Clicks on About us")
	public void user_clicks_on_about_us() throws InterruptedException {
		act.aboutUs_click();
	}
	
	@When("User Clicks on screen to play or watch video about demo ui")
	public void user_clicks_on_screen_to_play_or_watch_video_about_demo_ui() throws InterruptedException {
		act.click_screen_to_watch_video();
	}
	
	@Then("User Should Click on close button for finishing about us")
	public void user_should_click_on_close_button_for_finishing_about_us() {
		act.close_button_for_finishing();
	}
	
	//case5
	@When("User validating the Page Title")
	public void user_validating_the_page_title() throws InterruptedException {
		act.titleCheck();
	}
	
	@When("Return back of page title and current Uniform Resource Locater")
	public void return_back_of_page_title_and_current_url() throws InterruptedException {
		act.returning_data();
	}
	
	@When("User Clicks on Home")
	public void user_clicks_on_home() throws InterruptedException {
		act.back_to_home();
	}
	
	@Then("User validating the Page Title again")
	public void user_validating_the_page_title_again() throws InterruptedException {
		act.validating();
	}
	
	//case6

	@When("User clicks on phones for inspect")
	public void user_clicks_on_phones_for_inspect() throws InterruptedException {
		act.phone_category();
	}

	@When("User Clicks on desired phone Samsung galaxy")
	public void user_clicks_on_desired_phone_samsung_galaxy() throws InterruptedException {
		act.inspect_for_desiredPhone();
	}

	@When("User Navigates back for inspecting other phones")
	public void user_navigates_back_for_inspecting_other_phones() throws InterruptedException {
		act.back_to_phoneCategory_Page();
	}

	@When("User Clicks on desired phone Nokia lumia")
	public void user_clicks_on_desired_phone_nokia_lumia() throws InterruptedException {
		act.again_inspect_for_desiredPhone();
	}

	@When("User Navigates back To Home page")
	public void user_navigates_back_to_home_page() throws InterruptedException {
		act.Navigates_back_to_HomeCategories();    
	}
	
	//case7
	
	@When("User clicks on phones")
	public void user_clicks_on_phones() throws InterruptedException {
		act.phone_category_forCart();
	}

	@When("User Clicks on Nexus")
	public void user_clicks_on_nexus() throws InterruptedException {
		act.clickOn_desiredPhone();
	}
	
	@When("User Clicks on Nexus to Add to Cart")
	public void user_clicks_on_nexus_to_add_to_cart() throws InterruptedException {
		act.clickOn_desiredPhone_for_cart();
	}

	@Then("User need to click on ok button for adding phone")
	public void user_need_to_click_on_ok_button_for_adding_phone() throws InterruptedException {
		act.alertOk_for_Phone_cartAdding();
	}

	@Then("User Navigates back To Home page from current page")
	public void user_navigates_back_to_home_page_from_current_page() throws InterruptedException {
		act.back_to_home_from_cartSection();
	}
	
	//case8

	@When("User clicks on Laptops")
	public void user_clicks_on_laptops() throws InterruptedException {
	   act.laptop_category_forCart();
	}
	
	@When("User Clicks on MacBook Pro")
	public void user_clicks_on_mac_book_pro() throws InterruptedException {
		act.clickOn_desiredLaptop();
	}
	
	@When("User Clicks on MacBook Pro to Add to Cart")
	public void user_clicks_on_mac_book_pro_to_add_to_cart() throws InterruptedException {
		act.clickOn_desiredLaptop_for_cart();
	}

	@Then("User need to click on ok button for adding laptop")
	public void user_need_to_click_on_ok_button_for_adding_laptop() throws InterruptedException {
		act.alertOk_for_laptop_cartAdding();
	}
	
	@Then("User Navigates back To Home page from laptop page")
	public void user_navigates_back_to_home_page_from_laptop_page() throws InterruptedException {
		act.back_to_home_from_laptop_cartSection();
	}
	
	//case9

	@When("User clicks on Moniter")
	public void user_clicks_on_moniter() throws InterruptedException {
	   act.moniter_category_forCart();
	}
	
	@When("User Clicks on Apple monitor")
	public void user_clicks_on_apple_monitor() throws InterruptedException {
		act.clickOn_desiredMoniter();
	}

	@When("User Clicks on Apple monitor to Add to Cart")
	public void user_clicks_on_apple_monitor_to_add_to_cart() throws InterruptedException {
		act.clickOn_desiredMoniter_for_cart();
	}

	@Then("User need to click on ok button for adding moniter")
	public void user_need_to_click_on_ok_button_for_adding_moniter() throws InterruptedException {
		act.alertOk_for_moniter_cartAdding();
	}

	@Then("User Navigates back To Home page from moniter page")
	public void user_navigates_back_to_home_page_from_moniter_page() throws InterruptedException {
		act.back_to_home_from_moniter_cartSection();
	}
	
	//case10

	@When("User clicks on Cart button")
	public void user_clicks_on_cart_button() throws InterruptedException{
	    act.clicks_on_Cart_button_for_checkout();
	}
	
	@When("User need to Click on Place Order button")
	public void user_need_to_click_on_place_order_button()throws InterruptedException {
	    act.Click_on_Place_Order_button();
	}
	
	@When("User Should enter Name {string}")
	public void user_should_enter_name(String string) throws InterruptedException{
	   act.Name_detail_for_chechout(string);
	}
	
	@When("User Should enter Country {string}")
	public void user_should_enter_country(String string)throws InterruptedException {
		act.country_detail_for_chechout(string);
	}
	
	@When("User Should enter City {string}")
	public void user_should_enter_city(String string)throws InterruptedException {
		act.city_detail_for_chechout(string);
	}
	
	@When("User Should enter Credit card {string}")
	public void user_should_enter_credit_card(String string) throws InterruptedException{
		act.card_detail_for_chechout(string);
	}
	
	@When("User Should enter Month {string}")
	public void user_should_enter_month(String string)throws InterruptedException {
		act.month_detail_for_chechout(string);
	}
	
	@When("User Should enter Year {string}")
	public void user_should_enter_year(String string)throws InterruptedException {
		act.year_detail_for_chechout(string);
	}
	
	@When("User need to Click on Purchase button")
	public void user_need_to_click_on_purchase_button()throws InterruptedException {
		act.confirmation_alert_from_webelement();
	}
	
	@Then("User successfully purchased and need to click on ok button")
	public void user_successfully_purchased_and_need_to_click_on_ok_button()throws InterruptedException {
		act.purchase_button();
	}
	
	//case11
	
	@When("User Clicks on Log inn")
	public void user_clicks_on_log_inn() throws InterruptedException {
	    act.click_loginn();
	}
	
	@Then("User Should enter user name for log inn {string}")
	public void user_should_enter_user_name_for_log_inn(String string) throws InterruptedException{
		act.enter_loginn_name(string);
	}
	
	@Then("User Should enter password for log inn {string}")
	public void user_should_enter_password_for_log_inn(String string) throws InterruptedException {
		act.enter_loginn_pass(string);
	}
	
	@When("User clicks on Log inn buttonn")
	public void user_clicks_on_log_inn_buttonn() throws InterruptedException{
		act.click_loginnn();
	}
	@Then("User clicks on Log out button")
	public void user_clicks_on_log_out_button() throws InterruptedException{
		act.click_logout();
	}
	
	@Then("User is successfully logged out")
	public void user_is_successfully_logged_out() throws InterruptedException{
		act.successful_logout();
	}
}