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
def mp = [('TestCaseID') : TestCaseID, ('Search') : Search, ('BudgetedUnbug') : BudgetedUnbug, ('ExpectedStartDate') : ExpectedStartDate
    , ('ExpectedEndDate') : ExpectedEndDate, ('SRTitle') : SRTitle, ('Descriptiontext') : Descriptiontext, ('Country') : Country
    , ('Region') : Region, ('ApproverName') : ApproverName, ('ExpectedStartMonth') : ExpectedStartMonth, ('ExpectedEndMonth') : ExpectedEndMonth
    , ('Status1') : Status1, ('Status2') : Status2, ('Status3') : Status3]

GlobalVariable.TestCaseID = TestCaseID
GlobalVariable.TCStatus  = "PASSED"

if (Run == 'Yes') {
    'Logging into myExpert application'
    WebUI.callTestCase(findTestCase('fnCommon/fn01_Login'), [:], FailureHandling.STOP_ON_FAILURE)

    'Search and add to card'
    WebUI.callTestCase(findTestCase('fnRequestor/fn02_SearchAddtoCart'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Selecte UnBudget'
    WebUI.callTestCase(findTestCase('fnRequestor/fn03_SelectionofBudgetunBudget'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Item Details'
    WebUI.callTestCase(findTestCase('fnRequestor/fn04_ItemDetails'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Billing Details'
    WebUI.callTestCase(findTestCase('fnRequestor/fn05_BillingDetails'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Approver Details'
    WebUI.callTestCase(findTestCase('fnRequestor/fn06_ApproverDetails'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Agree and Submit'
    WebUI.callTestCase(findTestCase('fnRequestor/fn07_AgreeSaveSubmit'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Request List Search'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Verify Status- Pending Approval'
    WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status1']], FailureHandling.CONTINUE_ON_FAILURE)

    'Hold for Discussion'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Request List Search'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Verify Status'
    WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status2']], FailureHandling.CONTINUE_ON_FAILURE)

	'Modify item details'
	WebUI.callTestCase(findTestCase('null'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)
	
	'Request List Search'
	WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

	'Verify Status- Pending Approval'
	WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status1']], FailureHandling.CONTINUE_ON_FAILURE)

	'Approve'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Request List Search'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Verify Status'
    WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status3']], FailureHandling.CONTINUE_ON_FAILURE)

    'Logout'
     WebUI.callTestCase(findTestCase('fnCommon/fn_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

    'write Result to Excel'
    CustomKeywords.'com.excel.WriteExcel.WriteResulttoExcel'('myExpert', GlobalVariable.TCStatus, GlobalVariable.TestCaseID,3)
}

