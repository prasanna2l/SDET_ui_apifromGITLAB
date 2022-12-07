package object;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class objectClass {
	
	//case1
	
	@FindBy(id="signin2")
	public WebElement Signup; 
	
	@FindBy(id= "sign-username")
	public WebElement userName;
	
	@FindBy(id= "sign-password")
	public WebElement passName;
	
	@FindBy(xpath= "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	public WebElement signup_button;
	
	//alert handling
	public WebElement alertOk_for_signup;
	
	//case2
	
	@FindBy(id= "login2")
	public WebElement login_click;
	
	@FindBy(id= "loginusername")
	public WebElement name_enter;
	
	@FindBy(id= "loginpassword")
	public WebElement pass_enter;
	
	@FindBy(xpath= "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public WebElement login_button_click;
	
	//alert handling
	public WebElement alertOk_for_login;
	
	//case3
	
	@FindBy(linkText= "Contact")
	public WebElement contacts_click;
	
	@FindBy(id= "recipient-email")
	public WebElement email_for_contact;
	
	@FindBy(id= "recipient-name")
	public WebElement name_for_contact;
	
	@FindBy(id= "message-text")
	public WebElement context_content;
	
	@FindBy(xpath= "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
	public WebElement send_message_by_click;
	
	//alert handling
	public WebElement alertOk_for_contacting;
	
	//case4
	
	@FindBy(xpath= "//*[@id=\"navbarExample\"]/ul/li[3]/a")
	public WebElement aboutUs_about_ui;
	
	@FindBy(xpath= "//*[@id=\"example-video\"]/div[1]")
	public WebElement aboutUs_video;
	
	@FindBy(xpath= "//*[@id=\"videoModal\"]/div/div/div[3]/button")
	public WebElement close_video;
	
	//case5
	
	//pageTitle
	public WebElement titleCheck;
	
	//Return back of pageTitle,URL
	public WebElement returning_data;
	
	@FindBy(xpath= "//*[@id=\"navbarExample\"]/ul/li[1]/a")
	public WebElement back_to_home;
	
	//validating the PageTitle
	public WebElement validating;
	
	//case6
	
	@FindBy(id= "itemc")
	public WebElement phone_inspect;
	
	@FindBy(linkText= "Samsung galaxy s6")
	public WebElement desired_phone;
	
	//driver back
	public WebElement inspecting_other_phones;
	
	@FindBy(linkText= "Nokia lumia 1520")
	public WebElement desired_phone_after_inspect;
	
	//navigates back
	public WebElement phone_to_homepage;
	
	//case7
	
	@FindBy(id= "itemc")
	public WebElement clicks_on_phone_for_cart;
	
	@FindBy(xpath= "//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
	public WebElement clicks_on_desiredphone_for_cart;
	
	@FindBy(xpath= "/html/body/div[5]/div/div[2]/div[2]/div/a")
	public WebElement adding_to_cart_desiredAbove;
	
	//alert handling
	public WebElement alertOk_for_cartAdding;
	
	//driver back
	public WebElement back_to_home_from_cartSection;
	
	//case8
	
	@FindBy(xpath= "//*[@id=\"itemc\"]")
	public WebElement clicks_on_laptops_for_cart;
	
	@FindBy(xpath= "//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a")
	public WebElement clicks_on_desiredLaptop_for_cart;
	
	@FindBy(xpath= "//*[@id=\"tbodyid\"]/div[2]/div/a")
	public WebElement adding_to_cart_desiredLaptop;
	
	//alert handling
	public WebElement alertOk_for_laptop_cartAdding;
	
	//driver back
	public WebElement back_to_home_from_laptop_cartSection;
	
	//case9
	
	@FindBy(xpath= "//*[@id=\"next2\"]")
	public WebElement clicks_on_Moniter_for_cart;
	
	@FindBy(xpath= "//*[@id=\"tbodyid\"]/div[1]/div/div/h4")
	public WebElement clicks_on_desiredMoniter_for_cart;
	
	@FindBy(xpath= "//*[@id=\"tbodyid\"]/div[2]/div/a")
	public WebElement adding_to_cart_desiredMoniter;
	
	//alert handling
	public WebElement alertOk_for_moniter_cartAdding;
	
	//driver back
	public WebElement back_to_home_from_moniter_cartSection;
	
	//case10
	
	@FindBy(id= "cartur")
	public WebElement finalCart_button;
	
	@FindBy(xpath= "//*[@id=\"page-wrapper\"]/div/div[2]/button")
	public WebElement Place_Order_button;
	
	@FindBy(id= "name")
	public WebElement name_detail_for_chechout;
	
	@FindBy(id= "country")
	public WebElement country_detail_for_chechout;
	
	@FindBy(id= "city")
	public WebElement city_detail_for_chechout;
	
	@FindBy(id= "card")
	public WebElement creditCard_detail_for_chechout;

	
	@FindBy(id= "month")
	public WebElement month_detail_for_chechout;
	
	@FindBy(id= "year")
	public WebElement year_detail_for_chechout;
	
	@FindBy(xpath= "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	public WebElement purchase;
	
	//confirmation alert (webelement)
	@FindBy(xpath= "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	public WebElement alertOk_for_successfully_purchased;
	
	//case11
	
	@FindBy(id= "login2")
	public WebElement log_inn;
	
	@FindBy(id= "loginusername")
	public WebElement log_inn_name;
	
	@FindBy(id= "loginpassword")
	public WebElement log_inn_pass;
	
	@FindBy(xpath= "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public WebElement log_inn_button;
	
	@FindBy(id= "logout2")
	public WebElement log_out;
	
	//loggedOut
	public WebElement successful_log_out;

}