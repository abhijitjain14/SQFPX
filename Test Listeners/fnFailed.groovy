import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.annotation.BeforeTestSuite


class fnFailed {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
		
	
		 @AfterTestCase
	   // @AfterTestSuite
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
//	println testCaseContext.getTestCaseId()
	//	println testCaseContext.getTestCaseStatus()
		
		
		
	/*	Boolean bObjExist =  WebUI.verifyElementPresent(findTestObject('Page_Requestor/img_caret_down'), 3, FailureHandling.OPTIONAL)
		if (bObjExist == true) {
		
			'Logout'
			WebUI.callTestCase(findTestCase('fnCommon/fn_Logout'), [:], FailureHandling.OPTIONAL)
		
		
			WebUI.delay(1)
			CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('myExpert', 'Incomplete Execution - Failed', GlobalVariable.TestCaseID,3)
			
			} */
		println (testCaseContext.getTestCaseStatus())
	
		
  //    WebUI.callTestCase(findTestCase('fnCommon/fn_ExceptionalHandling'), [:], FailureHandling.STOP_ON_FAILURE)
		
	/*	switch (testSuiteContext.getTestSuiteName()) {
			
			case 'Orange':
			// do something specific for Orange
			break
		case 'Apple':
			// do something specific for Apple
			break
	
			} */
	
			
		
		
		
	if (testCaseContext.getTestCaseStatus() == 'ERROR')
		{
			
			CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'(GlobalVariable.ExcelSheetName, 'Incomplete Execution - Failed', GlobalVariable.TestCaseID,3)
			
		}
	
else
{
	
			CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'(GlobalVariable.ExcelSheetName, testCaseContext.getTestCaseStatus(), GlobalVariable.TestCaseID,3)
}	

	  'Logout'
	  WebUI.callTestCase(findTestCase('fnCommon/fn_Logout'), [:], FailureHandling.OPTIONAL) 
  
 
		
		} 
		
}