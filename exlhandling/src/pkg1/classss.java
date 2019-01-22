package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class classss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Actions Ac=new Actions(driver);
		driver.get("https://flogasuk-uat.sps-ocs.co.uk");
		WebElement Register = driver.findElement(By.id("homeRegister"));
		Register.click();
		
		for(int i=1;i<2;i++) {
			
			Ac.sendKeys(Keys.TAB).perform();
		
		if(i==1) {
			
			Ac.sendKeys("Testing").perform();
		
			
		}
		
		
		}
		
		//Ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("testing").perform();
			}

}
