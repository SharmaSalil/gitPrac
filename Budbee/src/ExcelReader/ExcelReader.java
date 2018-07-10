package ExcelReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	private FileInputStream file= null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row =null;
	private XSSFCell cell = null;
	
	public ExcelReader (String path) throws IOException{
		 file = new FileInputStream (path);
		 workbook = new XSSFWorkbook(file);
		 sheet = workbook.getSheetAt(0);
		 file.close();	}

	
	
	public int getRowCount(String sheetName){
		int index = workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
			sheet = workbook.getSheetAt(index);
			int number=sheet.getLastRowNum()+1;
			return number;		}	}

	
	
	public String getCellData(String sheetName,String colName,int rowNum){
		try{
			if(rowNum <=0)
				return "";
			int index = workbook.getSheetIndex(sheetName);
			int col_Num=-1;
			if(index==-1)
				return "";
			sheet = workbook.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			if(col_Num == -1)
				return "";
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(col_Num);

			if(cell==null)
				return "";
			if(cell.getCellType()==Cell.CELL_TYPE_STRING){
				return cell.getStringCellValue();
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
				double myvalue = cell.getNumericCellValue();
				DecimalFormat df = new DecimalFormat("#");
		        df.setMaximumFractionDigits(0);
				return String.valueOf(String.valueOf(df.format(myvalue)));
			}else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e){
			e.printStackTrace();
			return "row "+rowNum+" or column "+colName +" does not exist in xls";		}}

}
