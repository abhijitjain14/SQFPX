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
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject


//mp['BudgetedUnbug'] = 'UnBudgeted'
WebUI.click(findTestObject('Page_Requestor/chk_MyCartTitle'))

WebUI.click(findTestObject('Page_Requestor/btn_ArrowExpand'))

if (mp['BudgetedUnbug'] == 'UnBudgeted')
{
WebUI.click(findTestObject('Page_Requestor/rad_Unbugeted'))

}
else
{

	
	WebUI.click(findTestObject('Page_Aurum/wp/rdoBudgeted'))
	
	WebUI.click(findTestObject('Page_Aurum/wp/img_searchwk'))
	
	WebUI.selectOptionByValue(findTestObject('Page_Aurum/wp/cmbWkOPU'),
		mp['WorkplanOPU'], false)
	

	
	
	WebUI.selectOptionByValue(findTestObject('Page_Aurum/wp/cmbwmyear'),
		mp['WorkplanYear'], false)
	
	WebUI.selectOptionByValue(findTestObject('Page_Aurum/wp/cmbRevision'),
		mp['Revision'], false)
	
	WebUI.click(findTestObject('Page_Aurum/wp/btn_SearchWK'))
	
	//WebUI.click(findTestObject('Page_Aurum/wp/td_Asset Integrity Assesment MLNG 1'))
	
	
	String dynamicId = mp['WorkplanTitle']
	
//	String dynamicId =  'Asset Integrity Assesment MLNG 1'
	String xpath = '//*[(text() = "' + dynamicId + '" or . = "' + dynamicId +  '")]'
	
	TestObject to = new TestObject("objectName")
	to.addProperty("xpath", ConditionType.EQUALS, xpath)
	WebUI.click(to)
	
	
	WebUI.click(findTestObject('Page_Aurum/wp/btn_OK'))
			
	
}
WebUI.delay(1)

'this code not needed to be removed later'
/*if (mp['OPU'] != '')

{
WebUI.selectOptionByValue(findTestObject('Page_Aurum/cmb_OPU'), mp['OPU'], false)
WebUI.delay(1)

}*/
