package PageObjects;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePage.BaseClass;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement button;

    @FindBy(xpath = "//div[@class='inventory_list']//div[@class='pricebar']//div[@class='inventory_item_price']")
    List<WebElement> price;
@FindBy(xpath="//div[@class = 'pricebar']//button[@class='btn btn_primary btn_small btn_inventory ']")
List <WebElement> see;
    public void userLogin(String name, String Password) {
        username.sendKeys(name);
        password.sendKeys(Password);
        button.click();
    }

    public void gettingpricelist() {
        double[] prices = new double[price.size()];

        // Convert and store prices as doubles
        for (int i = 0; i < price.size(); i++) {
            String p = price.get(i).getText().replace("$", "");
            prices[i] = Double.parseDouble(p);
        }

        // Sort the prices array
        Arrays.sort(prices);

        // Convert the sorted prices back to strings and add "$" symbol
        String[] formattedPrices = new String[prices.length];
        for (int i = 0; i < prices.length; i++) {
            formattedPrices[i] = "$" + String.format("%.2f", prices[i]);
        }

        // Printing the formatted prices
        for (String price : formattedPrices) {
            System.out.println(formattedPrices[5]+"we got this");
        }
        for(int z =0; z<=price.size()-1;z++) {
        	String selected= price.get(z).getText()
;        	if(selected.equalsIgnoreCase(formattedPrices[5])) {
	
        		
 see.get(z).click();      		
        	}
        	
        }
    }
}
/*package PageObjects;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePage.BaseClass;

public class LoginPage extends BaseClass {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement button;

    @FindBy(xpath = "//div[@class='inventory_list']//div[@class='pricebar']//div[@class='inventory_item_price']")
    List<WebElement> price;

    @FindBy(xpath = "//div[@class='pricebar']//button[@class='btn btn_primary btn_small btn_inventory']")
    List<WebElement> see;

    public void userLogin(String name, String Password) {
        username.sendKeys(name);
        password.sendKeys(Password);
        button.click();
    }

    public void gettingpricelist() {
        double[] prices = new double[price.size()];

        // Convert and store prices as doubles
        for (int i = 0; i < price.size(); i++) {
            String p = price.get(i).getText().replace("$", "");
            prices[i] = Double.parseDouble(p);
        }

        // Sort the prices array
        Arrays.sort(prices);

        // Convert the sorted prices back to strings and add "$" symbol
        String[] formattedPrices = new String[prices.length];
        for (int i = 0; i < prices.length; i++) {
            formattedPrices[i] = "$" + String.format("%.2f", prices[i]);
        }

        // Printing the formatted prices
        for (String price : formattedPrices) {
            System.out.println(price);
        }

        // Click on the button corresponding to the fifth price
        for (int z = 0; z < price.size(); z++) {
            String selected = price.get(z).getText().replace("$", "");
            if (selected.equalsIgnoreCase(formattedPrices[4])) {
                see.get(z).click();
            }
        }
    }
}
*/