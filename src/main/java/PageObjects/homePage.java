package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePage.BaseClass;

public class homePage<Exceptionalwait> extends BaseClass{
	
	public homePage(WebDriver driver){
			super(driver); 
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement breadcrum;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement about;
	
	public void homePages() {
		// Assuming driver and element are already initialized
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", breadcrum);


		//about.click();
		js.executeScript("arguments[0].click();", about);
			}
    public String getHomePageURL() {
        return driver.getCurrentUrl();
        
    }
    public String backtoDemo() {
    	
    	driver.navigate().back();
    	String title =driver.getTitle();
    	return title;
    }
}
