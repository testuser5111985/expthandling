package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class testsign {
	
//static WebDriver driver;
	
public static String signup(int c,int r) throws BiffException, IOException {
		String data = " ";
		//StringBuffer sb = new StringBuffer();
		//List l = new ArrayList<>();
		File f=new File("C:\\Users\\smrati.rai\\Desktop\\data1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		r=sh.getRows();
		c=sh.getColumns();
		for(int i=0;i<r;i++) 
		{
			
			for(int j=0;j<c;j++) {
				
				Cell c1=sh.getCell(j, i);
				data=c1.getContents();
				//sb = sb.append("-"+data);
				//l.add(data);
			}
		
		
		}
		//System.out.println("llllll::::" +l);
		System.out.println("Data::" +data);
		return data;
			      
	
}
		
public void signfb() throws BiffException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\smrati.rai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com");			        	     
WebElement firstname;
firstname=driver.findElement(By.name("firstname"));
WebElement lastnam;
lastnam=driver.findElement(By.name("lastname"));
StringBuffer fn=testsign.signup(0,1);

System.out.println("fnnnn: " +fn);


String[] abc = fn.toString().split("-");

String fName = "";
String lName = "";
for(int i=0; i<abc.length; i++) {
	fName = abc[1];
	lName = abc[2];

}

firstname.sendKeys(fName);
firstname.sendKeys(lName);
}
	
public static void main(String[] args) throws Exception, IOException {
testsign ts=new testsign();
//ts.signup(3, 4);
ts.signfb();
		
	//lastname,email,reemail,pwd,day,date,mnth,gender,submit
	}

}
