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
    , ('Status1') : Status1, ('Status2') : Status2, ('Status3') : Status3, ('Status4') : Status4, ('TechnicalManager') : TechnicalManager, ('SearchName1') : SearchName1
    , ('Role1') : Role1, ('checkboxPosition1') : checkboxPosition1, ('SearchName2') : SearchName2, ('Role2') : Role2, ('checkboxPosition2') : checkboxPosition2
    , ('ManHours1') : ManHours1, ('ManHours2') : ManHours2, ('ManHours3') : ManHours3]

//GlobalVariable.TestCaseID = TestCaseID
//GlobalVariable.TCStatus = 'PASSED'
//if (Run == 'Yes') {
'Call TC upto approve'
WebUI.callTestCase(findTestCase('TCmyExperts/TC02_Request_Approve'), [('TestCaseID') : TestCaseID, ('Run') : Run, ('BudgetedUnbug') : BudgetedUnbug
        , ('ExpectedStartDate') : ExpectedStartDate, ('ExpectedEndDate') : ExpectedEndDate, ('SRTitle') : SRTitle, ('Descriptiontext') : Descriptiontext
        , ('Country') : Country, ('Region') : Region, ('ApproverName') : ApproverName, ('Search') : Search, ('ExpectedStartMonth') : ExpectedStartMonth
        , ('ExpectedEndMonth') : ExpectedEndMonth, ('Status1') : Status1, ('Status2') : Status2], FailureHandling.STOP_ON_FAILURE)

'Endorse'
WebUI.callTestCase(findTestCase('null'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

'Request List Search'
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify Status- Pending Acceptance'
WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status3']], FailureHandling.CONTINUE_ON_FAILURE)

'TC4 END'

'TM ACCEPT'
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'ADD role - LEAD'
WebUI.callTestCase(findTestCase('null'), [('SearchName') : SearchName1, ('Role') : Role1, ('checkboxPosition') : checkboxPosition1], 
    FailureHandling.STOP_ON_FAILURE)

'ADD role - 2'
WebUI.callTestCase(findTestCase('null'), [('SearchName') : SearchName2, ('Role') : Role2, ('checkboxPosition') : checkboxPosition2], 
    FailureHandling.STOP_ON_FAILURE)

'Man Hours'
WebUI.callTestCase(findTestCase('null'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)


'Request List Search'
WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify Status- Pending MoM Submission'
WebUI.callTestCase(findTestCase('null'), [('Status') : mp['Status4']], FailureHandling.CONTINUE_ON_FAILURE)

