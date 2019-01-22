package pkg1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class clas11 {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException   {
	File f=new File("C:\\Users\\smrati.rai\\Desktop\\data5.xls");
	WritableWorkbook wb=Workbook.createWorkbook(f);
	WritableSheet ws=wb.createSheet("123", 0);
	System.out.println("enter the data");
	Scanner s=new Scanner(System.in);		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
			String test;
			test=s.nextLine();
			Label l=new Label(i, j, test);
				ws.addCell(l);
				
			}
		}
		
	wb.write();
	wb.close();
	
	}
				
	}
	
	
	
	
	
	
	
	