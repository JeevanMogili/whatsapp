package BasePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;
	public BaseClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void Exceptionalwait(WebElement element) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(15));
		mywait.until(ExpectedConditions.visibilityOf(element));
	
	}	}
