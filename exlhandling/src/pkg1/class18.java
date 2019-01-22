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

public class class18 {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f= new File("C:\\Users\\smrati.rai\\Desktop\\data3.xls");
		WritableWorkbook wb= Workbook.createWorkbook(f);
		WritableSheet ws=wb.createSheet("testfile", 0);
		System.out.println("enter data");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				String d=s.nextLine();
				
				Label l= new Label(i,j,d);
				ws.addCell(l);
				
				
			}
					wb.write();
					wb.close();
				
				
		}
		
		
		
		
		
		
}

}

