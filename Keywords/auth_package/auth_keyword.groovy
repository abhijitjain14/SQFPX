package auth_package
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

/* import java.awt.Robotimport java.awt.Toolkit
 import java.awt.datatransfer.StringSelectionimport java.awt.event.KeyEvent
 import java.awt.MouseInfoimport java.awt.Point
 import java.awt.PointerInfoimport java.awt.event.InputEvent
 import java.awt.datatransfer.Clipboard;
 import java.awt.datatransfer.DataFlavor;
 public class auth_keyword 
 {
 @Keyword
 def loginAuthenticate(String username, String password)
 {		Robot robot = new Robot();
 robot.setAutoDelay(350);
 StringSelection ss = new StringSelection(username);
 Toolkit toolkit = Toolkit.getDefaultToolkit()
 Clipboard clipboard = toolkit.getSystemClipboard().setContents(ss, null);
 robot.delay(2000);	
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);	
 robot.keyRelease(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_TAB);
 robot.keyRelease(KeyEvent.VK_TAB);
 ss = new StringSelection(password);
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
 robot.keyPress(KeyEvent.VK_CONTROL);		
 robot.keyPress(KeyEvent.VK_V);		
 robot.keyRelease(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_CONTROL);		
 robot.keyPress(KeyEvent.VK_TAB);		
 robot.keyRelease(KeyEvent.VK_TAB);
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);	
 }
 } */
