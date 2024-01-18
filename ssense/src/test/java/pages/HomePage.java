package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.waitHelper;

import StepDefinitions.BaseClass;

public class HomePage extends BaseClass {
	waitHelper waithelper;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		waithelper =new waitHelper(driver);
	}
	
	@FindBy(id="men-link")
	private WebElement mensWearButtonxpath;

	public WebElement getMensWearButtonxpath() {
		return mensWearButtonxpath;
	}
	
	public void clickMenswear() throws InterruptedException {
	
		waithelper.waitForelement(driver,mensWearButtonxpath);
		click(mensWearButtonxpath);
	}
}
