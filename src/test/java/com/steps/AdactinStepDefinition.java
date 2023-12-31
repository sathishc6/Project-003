package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.adactin.helpher.FileReaderManager;
import com.adactinbase.AdactinBaseClass;
import com.adactinbase.Login;
import com.runner.AdactinRunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefinition extends AdactinBaseClass  {
	
	public static Login l;
	public static WebDriver driver = AdactinRunnerClass.driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@Given("user should launch the url")
	public void user_should_launch_the_url() throws IOException {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		link(url);
		Wait(20);
		max();
	}

	@When("user should enter valid email in email field")
	public void user_should_enter_valid_email_in_email_field() throws IOException {
		String username = FileReaderManager.getInstance().getInstanceCR().getUserName();
		l = new Login(driver);
		find(l.getUserName(), username);
	}

	@When("user should enter valid vaild password in password field")
	public void user_should_enter_valid_vaild_password_in_password_field() throws IOException {
		String pass = FileReaderManager.getInstance().getInstanceCR().getPassword();
		elementSend("xpath", "//*[@type='password']", pass);
		
	}

	@Then("user should click the login button and proceed to next page")
	public void user_should_click_the_login_button_and_proceed_to_next_page() {
		
		mouse("click", "//*[@name='login']");
		
	}

	@When("user should select the location")
	public void user_should_select_the_location() {

		select("index", "//*[@name='location']", 7, null, null);
	}

	@When("user should select the hotel")
	public void user_should_select_the_hotel() {

		select("value", "//*[@name='hotels']", 0, "Hotel Sunshine", null);
	}

	@When("user should select the room type")
	public void user_should_select_the_room_type() {

		select("value", "//*[@name='room_type']", 0, "Standard", null);
	}

	@When("user should select the number of rooms")
	public void user_should_select_the_number_of_rooms() {

		select("text", "//*[@name='room_nos']", 0, null, "1 - One");
	}

	@When("user should select the check in date")
	public void user_should_select_the_check_in_date() throws AWTException {
WebElement mouse1 = driver.findElement(By.xpath("//*[@type='text'][@class='date_pick']"));
		
		Actions mouse = new Actions(driver);
		Robot bot = new Robot();
		
		mouse.click(mouse1).build().perform();
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
	
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}

	@When("user should select the check out date")
	public void user_should_select_the_check_out_date() throws AWTException, InterruptedException {
		
		Robot bot = new Robot();
		
		WebElement dd5 = driver.findElement(By.xpath("//*[@type='text'][@class='date_pick']"));
		dd5.sendKeys("05/09/2023");
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(500);
		
		bot.keyPress(KeyEvent.VK_1);
		bot.keyRelease(KeyEvent.VK_1);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_1);
		bot.keyRelease(KeyEvent.VK_1);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_SLASH);
		bot.keyRelease(KeyEvent.VK_SLASH);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_0);
		bot.keyRelease(KeyEvent.VK_0);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_9);
		bot.keyRelease(KeyEvent.VK_9);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_SLASH);
		bot.keyRelease(KeyEvent.VK_SLASH);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_2);
		bot.keyRelease(KeyEvent.VK_2);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_0);
		bot.keyRelease(KeyEvent.VK_0);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_2);
		bot.keyRelease(KeyEvent.VK_2);
			Thread.sleep(200);
		bot.keyPress(KeyEvent.VK_3);
		bot.keyRelease(KeyEvent.VK_3);
	}

	@When("user should select the adults per room")
	public void user_should_select_the_adults_per_room() {
		

		select("index", "//*[@name='adult_room']", 2, null, null);
		
	}

	@When("user should select the childrens per room")
	public void user_should_select_the_childrens_per_room() {
		
	}

	@Then("user should click the search button and proceed to next page")
	public void user_should_click_the_search_button_and_proceed_to_next_page() {
		
		mouse("click", "//*[@type='submit']");
	}

	@When("user should select the radio button and make sure its clicked")
	public void user_should_select_the_radio_button_and_make_sure_its_clicked() {
		
		mouse("click", "//*[@name='radiobutton_0']");
	}

	@Then("user should the continue button")
	public void user_should_the_continue_button() throws AWTException {
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@When("user should enter first name in the first name field")
	public void user_should_enter_first_name_in_the_first_name_field() {
		
		js.executeScript("window.scrollBy(0,2000);");
		elementSend("xpath", "//*[@class='reg_input']", "Elon");
	}

	@When("user should enter last name in the last name field")
	public void user_should_enter_last_name_in_the_last_name_field() {
		
		
		elementSend("xpath", "//*[@name='last_name']", "musk");
	}

	@When("user should enter the billing address")
	public void user_should_enter_the_billing_address() {
		
		elementSend("xpath", "//*[@name='address']", "Elon Musk.Boca Chica,Texas.");
	}

	@When("user should enter the credit card number")
	public void user_should_enter_the_credit_card_number() throws IOException {
		String CardNumber = FileReaderManager.getInstance().getInstanceCR().getCardNumber();
		elementSend("xpath", "//*[@class='reg_input'][@name='cc_num']", CardNumber );
	}

	@When("user should enter the credit card type")
	public void user_should_enter_the_credit_card_type() {
		
		select("text", "//*[@name='cc_type'][@class='select_combobox']", 0, null, "American Express");
	}

	@When("user should enter the expiry date")
	public void user_should_enter_the_expiry_date() {
		
		select("index", "//*[@name='cc_exp_month']", 9, null, null);
		
		select("index", "//*[@name='cc_exp_year']", 12, null, null);
	}

	@When("user should enter the CVV number")
	public void user_should_enter_the_CVV_number() throws AWTException, IOException {
		
		String cvv = FileReaderManager.getInstance().getInstanceCR().getcvv();
		elementSend("xpath", "//*[@name='cc_cvv']", cvv);
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		
		
	}

	@Then("user should click the book now button and proceed to next page")
	public void user_should_click_the_book_now_button_and_proceed_to_next_page() throws AWTException {
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Given("user should click logout button")
	public void user_should_click_logout_button() throws InterruptedException {
		
		scroll("//*[@type='button'][3]");
		
		mouse("click", "//*[@type='button'][3]");
	}
	
}