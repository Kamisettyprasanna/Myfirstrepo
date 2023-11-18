package Readingdataformats;

import java.io.File;
import java.io.IOException;

import javax.xml.crypto.Data;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingdatafilefromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File file=new File("./test data/ddata.xlsx.xlsx");
		Workbook  workbook= WorkbookFactory.create(file);
		Sheet sheet	=  workbook.getSheet("sheet1");
		  Row row=sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data =cell.toString();
		  System.out.println(data);
       
          
       
		

	}

}
