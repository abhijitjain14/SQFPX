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

def fnMISC(sLink, sHeader, sObjname) 
{
	WebUI.delay(1)
	
	
	WebUI.click(findTestObject('Page_LinkTest/Page_MISC/a_MISC'))
WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}

fnMISC('Page_LinkTest/Page_MISC/a_User Access Control','System Role to Module Access', 'Page_LinkTest/Page_MISC/h2_System Role to Module Access')

fnMISC('Page_LinkTest/Page_MISC/a_Line Staff Management','Line Staff', 'Page_LinkTest/Page_MISC/h3_Line Staff')

fnMISC('Page_LinkTest/Page_MISC/a_OPU MDCEO setup','OPU MD/CEO SETTINGS', 'Page_LinkTest/Page_MISC/h2_OPU MDCEO Settings')

'access denied'
//fnMISC('Page_LinkTest/Page_MISC/a_PDC Management','OPU MD/CEO SETTINGS', 'Page_LinkTest/Page_MISC/h2_OPU MDCEO Settings')


fnMISC('Page_LinkTest/Page_MISC/a_Time Write Management','Project Charge Code & TW Reviewer Mapping', 'Page_LinkTest/Page_MISC/h2_Project Charge Code  TW Reviewer Mapping')

fnMISC('Page_LinkTest/Page_MISC/a_SAP Integration Validation','SAP Refresh Date:', 'Page_LinkTest/Page_MISC/strong_SAP Refresh Date')

'acces denied'
//Page_LinkTest/Page_MISC/a_Time Write COE Upstream


fnMISC('Page_LinkTest/Page_MISC/a_Tariff Management','Tariff Management', 'Page_LinkTest/Page_MISC/h3_Tariff Management')



