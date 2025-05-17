package Utility_Library;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Excel_Reader.ExcelDataReader;

public class TestAll
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		System.out.println(ExcelDataReader.getTestCasesNames());
		System.out.println(ExcelDataReader.getKeywords("RegisterTestCase"));
		System.out.println(ExcelDataReader.getTestData("RegisterTestCase", 5));
		System.out.println(ExcelDataReader.getLocators("RegisterTestCase", 7));
		
	}

}
