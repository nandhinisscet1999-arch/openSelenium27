package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
WebDriver driver = null;
	
	public homePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement productbtn;
	
	@FindBy(name="search")
	private WebElement ele1;
	
	@FindBy(name="products")
	private WebElement prod;
	
	@FindBy(name="search")
	private WebElement ele2;
	
		
}
