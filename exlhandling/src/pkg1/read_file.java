package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class read_file {


public void readfile(int r,int c,String path) throws BiffException, IOException {
	
	File f=new File(path);
	Workbook wb=Workbook.getWorkbook(f);
	Sheet sh=wb.getSheet(0);
	r=sh.getRows();
	c=sh.getColumns();
	for(int i=0;i<r;i++) {
		
		for(int j=0;j<c;j++) {
			
			Cell c2=sh.getCell(j,i);
			
			System.out.println(c2.getContents());
			
		
	}
}

	}
	
	}