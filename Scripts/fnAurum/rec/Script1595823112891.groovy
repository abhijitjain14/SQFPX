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


WebUI.setText(findTestObject('Page_Pay/txt_ProductName'), 'Story book')

WebUI.setText(findTestObject('Page_Pay/txt_ProductPrice'), '20')

WebUI.click(findTestObject('Page_Pay/btn_Plus'))

WebUI.click(findTestObject('Page_Pay/span_4000'))

WebUI.setText(findTestObject('Page_Pay/txt_Name'), 'Skill Quotient')

WebUI.setText(findTestObject('Page_Pay/txt_Email'), 'abhijit@skillquotient.net')

WebUI.setText(findTestObject('Page_Pay/txt_Phone'), '0102687610')

WebUI.setText(findTestObject('Page_Pay/txt_AdditionalInformation'), 'automation testing activity')

//WebUI.click(findTestObject('Page_Pay/BSNBank'))
WebUI.click(findTestObject('Page_Pay/Maybank'))

WebUI.click(findTestObject('Page_Pay/btn_Pay'))

WebUI.click(findTestObject('Page_senangPay/ver_Status'))

WebUI.click(findTestObject('Page_senangPay/p_TRX Ref'))

WebUI.click(findTestObject('Page_senangPay/ver_Product'))

WebUI.click(findTestObject('Page_senangPay/ver_Price'))

