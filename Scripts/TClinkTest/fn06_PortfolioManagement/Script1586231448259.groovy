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

def fnPortfolioManage(sLink, sHeader, sObjname) {\
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Page_LinkTest/Page_PortfolioManagement/a_PORTFOLIO MANAGEMENT'))
	WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}

WebUI.delay(2)
fnPortfolioManage('Page_LinkTest/Page_PortfolioManagement/a_Technical Solutions', 'P4R TECHNICAL SOLUTIONS', 'Page_LinkTest/Page_PortfolioManagement/h3_P4R TECHNICAL SOLUTIONS')
fnPortfolioManage('Page_LinkTest/Page_PortfolioManagement/a_Projects', 'P4R Projects', 'Page_LinkTest/Page_PortfolioManagement/h2_P4R Projects')
