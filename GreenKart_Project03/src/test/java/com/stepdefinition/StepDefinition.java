package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.helper.File_Reader_Manager;
import com.pom.Page_Object_Manager;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("User Launch the url")
	public void user_launch_the_url() throws IOException {

		String url = File_Reader_Manager.getInstanceCr().getUrl();
		getUrl(url);
	}

	@When("User Search Cucumber in Searchbox")
	public void user_search_cucumber_in_searchbox() {

		
		pom.getInstancePomPage01().getSearchBox().sendKeys("Cucumber");

	}

	@When("User click the add to cart button")
	public void user_click_the_add_to_cart_button() throws InterruptedException {

		Thread.sleep(2000);		
		pom.getInstancePomPage01().getAddToCart().click();
	}

	@When("User click the items icon")
	public void user_click_the_items_icon() throws InterruptedException {
		Thread.sleep(2000);

		pom.getInstancePomPage01().getItems().click();
	}

	@When("User click the Proceed to checkout button")
	public void user_click_the_proceed_to_checkout_button() {
		
		pom.getInstancePomPage01().getProceedToCheckout().click();
	}

	@Then("Next Page loaded")
	public void next_page_loaded() {

		System.err.println("Next Page");
	}

	@When("User enter a promo code")
	public void user_enter_a_promo_code() throws InterruptedException {
		Thread.sleep(3000);

		pom.getInstancePomPage02().getPromoCode().sendKeys("1111");
	}

	@When("User click a apply button")
	public void user_click_a_apply_button() throws InterruptedException {

		Thread.sleep(3000);
		pom.getInstancePomPage02().getApply().click();
	}

	@When("User click a place order")
	public void user_click_a_place_order() {

		pom.getInstancePomPage02().getPlaceOrder().click();
	}
	
	@When("User Select a Country")
	public void user_select_a_country() {
	    
		Select s = new Select(pom.getInstancePomPage03().getCountry());
		s.selectByValue("India");
	}
	@When("User click the agree button")
	public void user_click_the_agree_button() {
	
		pom.getInstancePomPage03().getAgree().click();
	}
	@When("User click the proceed button")
	public void user_click_the_proceed_button() {
	
		pom.getInstancePomPage03().getProceed().click();
	}


}
