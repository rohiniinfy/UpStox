package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\chiku\\July09.xlsx");
		
		String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
	}
}
