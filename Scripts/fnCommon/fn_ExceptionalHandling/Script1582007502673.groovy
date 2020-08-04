import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
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


//println (TestCaseContext.getTestCaseStatus())
//if (testCaseContext.getTestCaseStatus() == 'FAILED') {
	
//	println (testCaseContext.getTestCaseStatus())
//}
	
//bObjExist =  WebUI.verifyElementNotPresent(findTestObject('Page_Requestor/img_caret_down'), 3, FailureHandling.OPTIONAL)
bObjExist =  WebUI.verifyElementPresent(findTestObject('Page_Requestor/img_caret_down'), 3, FailureHandling.OPTIONAL)
if (bObjExist == true) {

//if (bObjExist == false) {
	'del incomplete'
//	WebUI.callTestCase(findTestCase('fnCommon/fn_DeleteIncomplete'), [:], FailureHandling.STOP_ON_FAILURE)
	
	'Logout'
	WebUI.callTestCase(findTestCase('fnCommon/fn_Logout'), [:], FailureHandling.OPTIONAL)

	WebUI.delay(1)
	
	CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('myExpert', 'Incomplete Execution - Failed', GlobalVariable.TestCaseID,3)
}