package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.org.apache.xpath.internal.operations.Number;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Locate the file
		FileInputStream File =new FileInputStream(new File(System.getProperty("user.dir")+"\\input.xlsx"));
       
		//To initialize workbook opening file
		XSSFWorkbook workbook = new XSSFWorkbook(File); 	
		
		//To initialize Sheet 1
		XSSFSheet Sheet = workbook.getSheetAt(0);
		
		//To read data string
		String fname = Sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(fname);
		System.out.println("pass");
		
		File.close();
		
	
		//class obj = new class(parameters);
	}

}
