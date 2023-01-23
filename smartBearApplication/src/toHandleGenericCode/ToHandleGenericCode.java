package toHandleGenericCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 
public class ToHandleGenericCode {
	/**
	 * this method is used to call PropertyFile
	 * @param key
	 * @return
	 */
	public static String fromPropertyFile(String key) {
		FileInputStream fis=null;
		Properties properties=null;
		try {
			fis=new FileInputStream(new File("./propertyfile/configuration.properties"));
			properties=new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}
	
	/**
	 * this method call String ExcelFile
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 */
	public static String forExcelString(String sheetName,int rowNo,int cellNo ) {
		FileInputStream fis=null;
		Workbook workbook=null;
		try {
			fis=new FileInputStream("./propertyfile/testdata.xlsx");
			workbook= WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EncryptedDocumentException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
		/**
		 * this method is call Number for ExcelFile
		 * @param sheetName
		 * @param rowNo
		 * @param cellNo
		 * @return
		 */
		public static double forExcelnum(String sheetName,int rowNo,int cellNo ) {
			FileInputStream fis=null;
			Workbook workbook=null;
			try {
				fis=new FileInputStream("./propertyfile/testdata.xlsx");
				workbook= WorkbookFactory.create(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(EncryptedDocumentException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
		}
		/**
		 * this method is used to call Boolean from ExcelFile
		 * @param sheetName
		 * @param rowNo
		 * @param cellNo
		 * @return
		 */
		
		 
			public static boolean forExcelBoolean(String sheetName,int rowNo,int cellNo ) {
				FileInputStream fis=null;
				Workbook workbook=null;
				try {
					fis=new FileInputStream("./propertyfile/testdata.xlsx");
					workbook= WorkbookFactory.create(fis);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch(EncryptedDocumentException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
				return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	}
			/**
			 * this method is fetch LocalDateTime 
			 * @param sheetName
			 * @param rowNo
			 * @param cellNo
			 * @return
			 */
			public static LocalDateTime forExcelDateTime(String sheetName,int rowNo,int cellNo ) {
				FileInputStream fis=null;
				Workbook workbook=null;
				try {
					fis=new FileInputStream("./propertyfile/testdata.xlsx");
					workbook= WorkbookFactory.create(fis);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch(EncryptedDocumentException e) {
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
				return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue();
}
}