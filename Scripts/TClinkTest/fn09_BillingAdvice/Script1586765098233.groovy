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

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_BROWSE'))
//WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/h2_Error'))

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_ADMIN'))
WebUI.callTestCase(findTestCase('null'), [('Status') : 'Solution', ('objname') : 'Page_LinkTest/Page_BillingOthers/div_Solution'], FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/div_Solution'))
WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/imgPetLogo'))

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_BILLING ADVICE'))
WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_PDC Management'))
//WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/h2_Access Denied'))
WebUI.callTestCase(findTestCase('null'), [('Status') : 'Access Denied!', ('objname') : 'Page_LinkTest/Page_BillingOthers/h2_Access Denied'], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))


//WebUI.click(findTestObject('Object Repository/Page_LinkTest/Page_BillingOthers/Page_PDC Listing/img'))
WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_BILLING ADVICE'))
WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_Billing Advice (1)'))
WebUI.callTestCase(findTestCase('null'), [('Status') : 'Billing Advice', ('objname') : 'Page_LinkTest/Page_BillingOthers/h2_Billing Advice'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))

//WebUI.click(findTestObject('Object Repository/Page_LinkTest/Page_BillingOthers/Page_Index/img'))

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_RTS'))
WebUI.switchToWindowTitle('RTS Login')
WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/Page_RTSLogin/btnClickToRTSLogin'))
WebUI.delay(1)

WebUI.callTestCase(findTestCase('null'), [('Status') : 'Cost Overrun Legend:', ('objname') : 'Page_LinkTest/Page_BillingOthers/Page_RTSLogin/b_Cost Overrun Legend'], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.closeWindowIndex(1)


//WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/Page_RTSLogin/b_Cost Overrun Legend'))

WebUI.delay(1)
WebUI.switchToWindowIndex(0)
//WebUI.switchToWindowTitle('PETRONAS | MyExperts')

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_DBE'))

//WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/Page_Access Denied/h2_AccessDeniedHR'))
WebUI.callTestCase(findTestCase('null'), [('Status') : 'Access Denied, please contact your respective HR focal for access.', ('objname') : 'Page_LinkTest/Page_BillingOthers/Page_Access Denied/h2_AccessDeniedHR'], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))

//WebUI.click(findTestObject('Object Repository/Page_LinkTest/Page_BillingOthers/Page_Access Denied/img_1'))

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/a_MSC MANAGEMENT'))

WebUI.click(findTestObject('Page_LinkTest/Page_BillingOthers/div_DASHBOARD'))

WebUI.click(findTestObject('Object Repository/Page_LinkTest/Page_BillingOthers/Page_MSC Dashboard/img'))

WebUI.click(findTestObject('Page_LinkTest/imgPetronasLogo'))

