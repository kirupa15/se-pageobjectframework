package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.selectProductPage;

public class Steps extends BaseClass {

	@Given("User login into qa ssense home page {string}")
	public void user_login_into_qa_ssense_home_page(String url) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		launchApp(url);
		HomePage Homepag=new HomePage(driver);
		Homepag.clickMenswear();
	}

	@And("select any product category")
	public void select_any_product_category() {
		
		selectProductPage selectproduct = new selectProductPage(driver);
		selectproduct.selectproduct();
	    // Write code here that turns the phrase above into concrete actions;
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User add products to cart")
	public void user_add_products_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("User enters all shipping details {string} {string} {string} {string} {string} {string}")
	public void user_enters_all_shipping_details(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@And("User enter payment details {string} {string} {string} {string}")
	public void user_enter_payment_details(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user vallidate customer created with ref number")
	public void user_vallidate_customer_created_with_ref_number() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
}
