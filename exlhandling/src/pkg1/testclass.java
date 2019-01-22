package pkg1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class testclass {

	
	
	public void fread(int r,int c,String path) throws BiffException, IOException {
		
		File f=new File(path);
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		 r=sh.getRows();
		c=sh.getColumns();
		
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
				
				Cell c1=sh.getCell(i,j);
				System.out.println(c1.getContents());
			}
			
		
	}
	}
	
	public void flogas() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://flogasuk-uat.sps-ocs.co.uk/");
		WebElement login=driver.findElement(By.xpath("//*[@id='homelogin-option']"));
		login.click();
		WebElement username=driver.findElement(By.xpath("//*[@tabindex='1']"));
		username.sendKeys("super@no.mail");
		WebElement password=driver.findElement(By.xpath("//*[@tabindex='2']"));
		password.sendKeys("Password$1234");
		WebElement submit=driver.findElement(By.xpath("//*[@tabindex='3']"));
		submit.click();
				
				
	}
	public static void main(String[] args) throws BiffException, IOException  {
		
		testclass tc=new testclass();
		tc.fread(4, 4, "C:\\Users\\smrati.rai\\Desktop\\data1.xls");
		tc.flogas();
			}
		
	
	
		
		
		
		
		
	

}
