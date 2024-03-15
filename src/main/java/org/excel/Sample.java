package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\Users\\User\\eclipse-workspace\\org.excel\\target\\Sample.xlsx");
	FileOutputStream f1 = new FileOutputStream(f);
	
	HSSFWorkbook work = new HSSFWorkbook();
	HSSFSheet sheet = work.createSheet("Students");
	HSSFRow row = sheet.createRow(0);
	HSSFCell col = row.createCell(0);
	
	col.setCellValue("Sri");
	List<String> name = new ArrayList<String>();
	name.add("Abi");
	name.add("Chan");
	name.add("Ravi");
	name.add("Kalai");
	
	for (int i=0;i<name.size(); i++) {
		
		HSSFRow row1 = sheet.createRow(i+1);
		HSSFCell col1 = row1.createCell(0);
		col1.setCellValue(name.get(i));
	work.write(f);
	work.close();
	
	
	}

}
}
