package pkg1;

import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class main_class {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		read_file rf=new read_file();
		write_class wc=new write_class();
		rf.readfile(4, 3, "C:\\Users\\smrati.rai\\Desktop\\data10.xls");
		wc.writeclass(3, 2, "C:\\Users\\smrati.rai\\Desktop\\data13.xls");
	}

}
