package excelNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelread {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getstringdate(int a, int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\inet\\Desktop\\Excel1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
		}
	public static String getIntegerDate(int a, int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\inet\\Desktop\\Excel1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int g=(int) c.getNumericCellValue();
		return String.valueOf(g);//convert integer to String
		}
	
	
	}
