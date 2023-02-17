package script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datadriven {
	
	
	public String read(String sht,int row,int clo) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//FileInputStream file=new FileInputStream("");
		
		
		Workbook w=WorkbookFactory.create(new FileInputStream("./xl/demo.xlsx"));
		
		String read=w.getSheet(sht).getRow(row).getCell(clo).toString();
		
		return read;	
	}
	
	public void main(String[]args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		datadriven r= new datadriven();
		r.read("Sheet1", 0, 0);
		System.out.println(r);
	}

}
