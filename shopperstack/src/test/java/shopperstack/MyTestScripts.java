package shopperstack;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

import Excel_Reader.ExcelDataReader;
import Utility_Library.KeyWordsUtility;

public class MyTestScripts {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		KeyWordsUtility keywords_Utility = new KeyWordsUtility();
		
		ArrayList<String> alltestCaseNames = ExcelDataReader.getTestCasesNames();
			
		for(String testCasename : alltestCaseNames)
		{
			
			ArrayList<String> allKeyWords = ExcelDataReader.getKeywords(testCasename);
			
			int cellNumber=1;
			for(String keyword : allKeyWords)
			{
				switch (keyword) {
				case "launchBrowser":
					keywords_Utility.launchBrowser();
					break;
				case "enterUrl":
					keywords_Utility.enterUrl(ExcelDataReader.getTestData(testCasename, cellNumber));
					break;
				case "Click":
					keywords_Utility.click(ExcelDataReader.getLocators(testCasename, cellNumber));
					break;
				case "enterData":
					keywords_Utility.enterData(ExcelDataReader.getLocators(testCasename, cellNumber), ExcelDataReader.getTestData(testCasename, cellNumber));
					break;
				case "verifyByMessage":
					keywords_Utility.verify(ExcelDataReader.getLocators(testCasename, cellNumber), testCasename);
					keywords_Utility.closeBrowser();
					break;
				default:
					break;
				}
				cellNumber++;
			}
			
		}
		

	}

	
	
}
