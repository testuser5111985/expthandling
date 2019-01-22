package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selclass1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr172835");
		driver.findElement(By.name("password")).sendKeys("gaqerAm");
		driver.findElement(By.name("btnLogin")).click();
		String actual="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
		String expected=driver.getCurrentUrl();
		System.out.println(actual);
		System.out.println(expected);
	
		if(actual.contentEquals(expected)) {
			
			System.out.println("Test case pass");
		}
	
		else {
			System.out.println("Test case fail");
		}
		driver.close();
	}

}
