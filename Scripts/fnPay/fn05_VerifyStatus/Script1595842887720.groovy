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

WebUI.verifyElementText(findTestObject('Page_senangPay/ver_Status'), mp['VerifyStatus'])
//Successful

def sSRNO = WebUI.getText(findTestObject('Page_senangPay/p_TRX Ref'))
WebUI.comment(sSRNO)
println(sSRNO)
CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('Paynet', sSRNO , mp['TestCaseID'], 4)


//WebUI.click(findTestObject('Page_senangPay/p_TRX Ref'))

WebUI.verifyElementText(findTestObject('Page_senangPay/ver_Product'), mp['ProductName'])
//WebUI.click(findTestObject('Page_senangPay/ver_Product'))

WebUI.verifyElementText(findTestObject('Page_senangPay/ver_Price'),mp['VerifyPrice'])
//
//WebUI.verifyElementAttributeValue(findTestObject('Page_senangPay/ver_Price'),'RM 40.00')


def fnVerify()
{
def sSRNO = WebUI.getText(findTestObject('Page_Requestor/get_SRNo'))

//KeywordLogger log = new KeywordLogger()

//log.logInfo(sSRNO)

//log.logPassed(sSRNO)

WebUI.comment(sSRNO)

println(sSRNO)

//CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('myExpertAurum', sSRNO , mp['TestCaseID'], 4)
}