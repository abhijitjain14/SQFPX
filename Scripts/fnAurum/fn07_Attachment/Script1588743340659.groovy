import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

//WebUI.click(findTestObject('Page_Aurum/Req/file_UploadProjectScope'))

String userDir = System.getProperty('user.dir')
String filePath = userDir + '\\AutoIT\\AutomationAttachment.txt'

TestObject to = findTestObject('Page_Aurum/Req/file_UploadProjectScope')

uploadFile(to, filePath)


//uploadFile(to, 'E:\\Automation\\MyExperts\\AutoIT\\AutomationAttachment.txt')

//WebUI.uploadFile(findTestObject('Page_Aurum/Req/file_UploadProjectScope'), 'E:/Automation/MyExperts/AutoIT/AutomationAttachment.txt')
//WebUI.click(findTestObject('Page_Aurum/wp/div_Select files'))
//TestObject to
Thread.sleep(2000);

 to = findTestObject('Page_Aurum/Req/file_UploadChargeCostCenter')
//uploadFile(to, 'E:\\Automation\\MyExperts\\AutoIT\\AutomationAttachment.txt')

uploadFile(to, filePath)


def uploadFile  (TestObject to, String filePath) {
	WebUI.click(to)
	Thread.sleep(2000);
	
	StringSelection ss = new StringSelection(filePath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}