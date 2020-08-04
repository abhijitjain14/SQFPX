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

'Map Parameters'
def mp = [('TestCaseID') : TestCaseID, ('ProductName') : ProductName, ('ProductPrice') : ProductPrice, ('Name') : Name, ('Email') : Email
    , ('MobileNumber') : MobileNumber, ('InternetBankingFPX') : InternetBankingFPX, ('VerifyStatus') : VerifyStatus, ('VerifyPrice') : VerifyPrice
  ]

GlobalVariable.TestCaseID = TestCaseID
GlobalVariable.TCStatus = 'PASSED'

if (Run == 'Yes') {
    'Open Browser and navigate'
    WebUI.callTestCase(findTestCase('fnCommon/fn01_OpenBrowser_Navigate'), [:], FailureHandling.STOP_ON_FAILURE)

	'Enter product Details'
    WebUI.callTestCase(findTestCase('fnPay/fn02_ProductDetail'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

	'Enter contact information'
    WebUI.callTestCase(findTestCase('fnPay/fn03_ContactInformation'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

	'Select bank and make payment'
    WebUI.callTestCase(findTestCase('fnPay/fn04_MakePayment'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

	'Verify status and product details'
    WebUI.callTestCase(findTestCase('fnPay/fn05_VerifyStatus'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)
}


