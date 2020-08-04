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

WebUI.click(findTestObject('Page_Requestor/imgbtn_OPUFinder'))
WebUI.delay(1)

//WebUI.setText(findTestObject('Page_Requestor/txt_selectkeyword'), 'ICT')
WebUI.click(findTestObject('Page_Requestor/cmb_SearchBy'))
WebUI.delay(1)

//WebUI.click(findTestObject('Page_Requestor/li_Company ID'))



if ((mp['Search'] == 'PD&T IRSO - TSS Study') || (mp['Search'] == 'IRSO - Plant Change PROJECT') || (mp['Search'] == 'IRSO - FOR ADMIN USE: PROJECT'))

{
	WebUI.click(findTestObject('Page_Aurum/Req/cmb_CompanyID'))
	
}
else
{
	
	WebUI.click(findTestObject('Page_Requestor/cmb_CompanyID'))
}
WebUI.delay(1)

WebUI.setText(findTestObject('Page_Requestor/txt_selectkeyword'), mp['OPU'])

WebUI.delay(1)

//WebUI.setText(findTestObject('Page_Requestor/txt_selectkeyword'), 'PETRONAS ICT Sdn Bhd')

WebUI.click(findTestObject('Page_Requestor/btn_OPUSearch'))
WebUI.delay(1)

//WebUI.click(findTestObject('Page_Requestor/td_0704'))
WebUI.click(findTestObject('Page_Aurum/tbl_OPUCompanyID'))
WebUI.delay(1)

WebUI.click(findTestObject('Page_Requestor/btn_OK'))


def NumberofChargeCode = mp['NumberofChargeCode'].toInteger()



String[] ChargeCodeArray = [mp['ChargeCode1'], mp['ChargeCode2'], mp['ChargeCode3']]
String[] CCPercentArray = [mp['Percentage1'], mp['Percentage2'], mp['Percentage3']]



for (def index : (0..NumberofChargeCode-1)) {
	WebUI.setText(findTestObject('Page_Requestor/txt_ChargeCode'), ChargeCodeArray[index])
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('Page_Aurum/Req/txtChargeCodePercent'), CCPercentArray[index])
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Page_Aurum/Req/btn_Add'))
	WebUI.delay(1)
	
	}
