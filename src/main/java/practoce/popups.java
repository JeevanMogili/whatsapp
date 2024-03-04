package practoce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popups {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        Thread.sleep(30000 );

        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(60));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    try {
    js.executeScript("arguments[0].click();", myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='search']"))));
    }catch(Exception e) {
    	js.executeScript("arguments[0].click();", myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='search']"))));	
    }
    
    driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")).sendKeys("Kkg");
        //myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']"))).click();
Thread.sleep(1000);   
try{
    driver.findElement(By.xpath("//span[@data-icon='default-user']")).click();
    }
   catch(Exception e) {
	   driver.findElement(By.xpath("//span[@data-icon='default-user']")).click();
   }
int i =1;
while(i>0) {
	driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("hi");
	driver.findElement(By.xpath("//span[@data-icon='send']")).click();
	
}
    }
}
