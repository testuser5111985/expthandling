package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class class9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("header_tab_hotels")).click();
		
		/*driver.manage().window().maximize();
		WebElement from;
		from=driver.findElement(By.id("hp-widget__sfrom"));
		from.click();
		Actions ac= new Actions(driver);
		for(int i=1;i<6;i++) {
		ac.sendKeys(Keys.ARROW_DOWN).perform();
				
	                          }
	WebElement To=driver.findElement(By.id("hp-widget__sTo"));
	To.click();
	//System.out.println(To.gets);
	for(int j=1;j<4;j++) {
		
		ac.sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='inputM__highlight']"));
    System.out.println("Number of elements:" +elements.size());
    

    for (int i=0; i<elements.size();i++){
      System.out.println("Radio button text:" + elements.get(i).getAttribute("text"));
    }*/
	}
	}
