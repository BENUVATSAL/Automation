package ActiTime.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataTestUtility {
	
	public String StringFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("");
		Properties pobj=new Properties();
		pobj.load(fis);
	String value=pobj.getProperty(key);
	return value;
		
		
	}
	public String StringFromExcelSheet(String Sheetname,int rownum,int cellnum) throws IOException {
		FileInputStream fis=new FileInputStream ("");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheetname");
		DataFormatter format=new DataFormatter();
        String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
        return value;
	}
}
