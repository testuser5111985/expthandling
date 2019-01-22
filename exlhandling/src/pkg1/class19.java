package pkg1;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
public class class19 {
public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
File f1 =new File("C:\\Users\\smrati.rai\\Desktop\\data4.xls");
File f2=new File("C:\\Users\\smrati.rai\\Desktop\\data8.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		WritableWorkbook wl=Workbook.createWorkbook(f2);
		Sheet ws=wb.getSheet(0);
		WritableSheet ws1=wl.createSheet("smrati", 0);
		int r=ws.getRows();
		int c=ws.getColumns();
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {				
				Cell c1= ws.getCell(j, i);
				System.out.println(c1.getContents());
				Label l=new Label(j,i,c1.getContents());
				ws1.addCell(l);
						}			
		}		
		wl.write();
		wl.close();	
	}
}
