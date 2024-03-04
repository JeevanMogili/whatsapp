package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.homePage;

public class loginpage extends BaseTest {
@Test
public void interview() {
	LoginPage lp =  new LoginPage(driver);
	lp.userLogin("standard_user","secret_sauce");
	String title=driver.getTitle();
	System.out.println(title);
	homePage HP = new homePage(driver);
	HP.homePages();
	String url =HP.getHomePageURL();
	Assert.assertEquals(url, "https://saucelabs.com/");
String titles = HP.backtoDemo();
System.out.println("+++"+titles);
lp.gettingpricelist();
}

	}

