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
def mp = [('TestCaseID') : TestCaseID, ('SrNoGenerated') : SrNoGenerated,
	('ExecutiveSummary') : ExecutiveSummary,('DirectValueCreation') : DirectValueCreation,
	('IndirectValueCreation') : IndirectValueCreation,('DirectValueCreationJustification') : DirectValueCreationJustification
	,('IndirectValueJustification') : IndirectValueJustification ]


GlobalVariable.TestCaseID = TestCaseID

GlobalVariable.TCStatus = 'PASSED'

if (Run == 'Yes') {
    'Logging into myExpert application'
    WebUI.callTestCase(findTestCase('fnCommon/fn01_Login'), [:], FailureHandling.STOP_ON_FAILURE)

    GlobalVariable.GSrNo = SrNoGenerated

    'Request List Search'
    WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

    'Submit'
    WebUI.callTestCase(findTestCase('null'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

    'Hold'
    WebUI.callTestCase(findTestCase('null'), [('mp') : [:]], FailureHandling.STOP_ON_FAILURE)

    'Submit'
    WebUI.callTestCase(findTestCase('null'), [('mp') :mp], FailureHandling.STOP_ON_FAILURE)

    'Approval'
    WebUI.callTestCase(findTestCase('null'), [('mp') : [:]], FailureHandling.STOP_ON_FAILURE)

	'Hold 2'
	WebUI.callTestCase(findTestCase('null'), [('mp') : [:]], FailureHandling.STOP_ON_FAILURE)

	
	'Submit'
	WebUI.callTestCase(findTestCase('null'), [('mp') : mp], FailureHandling.STOP_ON_FAILURE)

	'Approval'
	WebUI.callTestCase(findTestCase('null'), [('mp') : [:]], FailureHandling.STOP_ON_FAILURE)

    'Approval 2'
    WebUI.callTestCase(findTestCase('null'), [('mp') : [:]], FailureHandling.STOP_ON_FAILURE)
}


