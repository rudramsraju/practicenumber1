package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class datadrivensample1 {

	public static void main(String[] args) throws IOException {
	 

		FileInputStream file =new FileInputStream("C:\\Users\\rajum\\Desktop\\New folder\\data1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("data1");// providing sheet name
		// XSSFSheet sheet =workbook.getSheetAt(0);// providing sheet index
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		
		for (int i=0;i<rowcount;i++) {
			XSSFRow currentrow=sheet.getRow(i);// focus on curent row
			
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();// read the valuve from cell
				System.out.println(value);
			}
					
		
		}
	
	
	
	
	}

}
