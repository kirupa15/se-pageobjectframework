package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.BaseClass;
import utils.waitHelper;

public class selectProductPage extends BaseClass{
	waitHelper waithelper;
	
	public selectProductPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			waithelper =new waitHelper(driver);
		}
		
	@FindBy(xpath ="//*[@class='plp-products__row']/div[1]")
	private WebElement selectProductxpath;

	public WebElement getSelectProductxpath() {
		return selectProductxpath;
	}
	
	public void selectproduct() {
	waithelper.waitForelement(driver,selectProductxpath);
	click(selectProductxpath);
	
	}

}
