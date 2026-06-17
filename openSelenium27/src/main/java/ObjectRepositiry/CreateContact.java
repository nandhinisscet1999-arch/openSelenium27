package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class CreateContact {
	
	WebDriver driver = null;
	public CreateContact(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='account_name']/..//img[@src='themes/softed/images/select.gif']")
	private WebElement org;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement  lastBtn;
	
	@FindBy(xpath="//input[@name='support_start_date']")
	private WebElement startBtn;
	
	@FindBy(xpath="//input[@name='support_end_date']")
	private WebElement endBtn;
	
	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//span[@id='dtlview_Last Name']")
	private WebElement lastname;
	
	public WebElement getStartBtn() {
		return startBtn;
	}

	public WebElement getEndBtn() {
		return endBtn;
	}

	
	public WebElement getLastBtn() {
		return lastBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getOrg() {
		return org;
	}

	public void ContactToApp(String lastname)
	{
		lastBtn.sendKeys(lastname);
		//saveBtn.click();
	}

	public void ContactToApp(String lastname,String actualDate, String AfterdataRequires)
	{
		
		lastBtn.sendKeys(lastname);
		startBtn.clear();
		startBtn.sendKeys(actualDate);
		endBtn.clear();
		endBtn.sendKeys(AfterdataRequires);
	}
	
	public void clickOnOrganizationLookupImg()
	{
		org.click();
	}

}
