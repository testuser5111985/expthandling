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

public class write_class {

public void writeclass(int r,int c,String path) throws IOException, RowsExceededException, WriteException {
	
	File f=new File(path);
	WritableWorkbook wb=Workbook.createWorkbook(f);
	WritableSheet ws=wb.createSheet("newsheet", 0);
	System.out.println("enter the text");
	Scanner s=new Scanner(System.in);
	//r=s.nextInt();
	//c=s.nextInt();
	for(int i=0;i<=3;i++) {
		for(int j=0;j<3;j++) {
		String test=s.nextLine();	
		Label l=new Label(j,i,test);
		ws.addCell(l);	
		}
	}
	
	
	wb.write();
	wb.close();	


}

}
