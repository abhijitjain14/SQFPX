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

def fnReport(sLink, sHeader, sObjname) 
{
	WebUI.delay(1)
	
//	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_REPORTS'))
	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_REPORTSInside'))
	
	WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	//WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}


def fnReport1(sLink, sHeader, sObjname)
{
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_REPORTS'))
	
	WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	//WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}

def fnReport2(sLink, sHeader, sObjname)
{
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_REPORTS7'))
	
	WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	//WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}
def fnReportDashboard(sLink, sHeader, sObjname)
{
	WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
	WebUI.delay(1)
	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_REPORTS'))
	WebUI.click(findTestObject('Page_LinkTest/Page_Reports/a_COE Dashboard'))
	WebUI.click(findTestObject(sLink))
	WebUI.delay(2)
	
	WebUI.callTestCase(findTestCase('null'), [('Status') : sHeader, ('objname') : sObjname], FailureHandling.CONTINUE_ON_FAILURE)
	//WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
	
}

fnReport1('Page_LinkTest/Page_Reports/a_Report', 'Report'  ,'Page_LinkTest/Page_Reports/h2_Report')

fnReport('Page_LinkTest/Page_Reports/a_eBA Report', 'eBA Report'  ,'Page_LinkTest/Page_Reports/h2_eBA Report')

fnReport('Page_LinkTest/Page_Reports/a_COE Report', 'COE Report'  ,'Page_LinkTest/Page_Reports/h2_COE Report')

fnReport('Page_LinkTest/Page_Reports/a_Dashboard', 'Dashboard'  ,'Page_LinkTest/Page_Reports/h2_Dashboard')

fnReport('Page_LinkTest/Page_Reports/a_Management Dashboard', 'Service Request Overview'  ,'Page_LinkTest/Page_Reports/text_Service Request Overview')

fnReport('Page_LinkTest/Page_Reports/a_IRSO Man hours Report', 'Man hour Report'  ,'Page_LinkTest/Page_Reports/h3_Man hour Report')

fnReport2('Page_LinkTest/Page_Reports/a_IRSO Cost Utilization Report', 'Man hour Cost Utilization Report'  ,'Page_LinkTest/Page_Reports/h3_Man hour Cost Utilization Report')

fnReportDashboard('Page_LinkTest/Page_Reports/a_Resource Management DashBoard', 'Resource Management DashBoard'  ,'Page_LinkTest/Page_Reports/h4_Resource Management DashBoard')

fnReportDashboard('Page_LinkTest/Page_Reports/a_Solution Management DashBoard', 'Solution Management DashBoard'  ,'Page_LinkTest/Page_Reports/h4_Solution Management DashBoard')

fnReportDashboard('Page_LinkTest/Page_Reports/a_Time Write DashBoard', 'Cost Allocated Data'  ,'Page_LinkTest/Page_Reports/div_Time Write Performance Dashboard')

WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))
