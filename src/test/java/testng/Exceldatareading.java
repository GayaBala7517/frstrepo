package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceldatareading {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\exceltestdatas\\Datas.xlsx");
	
		FileInputStream FIS = new FileInputStream(f);

		Workbook w = WorkbookFactory.create(FIS);
		
		Sheet dataSheet = w.getSheet("Demodatas");
		
		int rows = dataSheet.getPhysicalNumberofRows();
		
		int columns = dataSheet.getRow(0).getPhysicalNumberofells();
		
		DataFormatter format = new DataFormatter();
		
		for(int i=1;i<rows;i++) {
			for(int j=0; j<columns;j++) {
				
		Cell cell =	dataSheet.getRow(i).getCell(j);
		
		 format.formatCellValue(cell);
		 System.out.println(value);
				
			
			}
		}
		

	}
}