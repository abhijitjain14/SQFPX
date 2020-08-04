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



WebUI.openBrowser('')
//WebUI.navigateToUrl('https://adfs.petronas.com/adfs/oauth2/authorize/?client_id=c59995af-00f7-4fe0-b155-d7fe84ac90fc&redirect_uri=https%3A%2F%2Fmyexperts-test.petronas.com%2F&resource=c59995af-00f7-4fe0-b155-d7fe84ac90fc&response_mode=form_post&response_type=code%20id_token&scope=openid&state=OpenIdConnect.AuthenticationProperties%3DHcWLCbOWC8VwAPBaa75hah8vbPylrGe1wjdK4XEVmxE6NBqfixyX8GY8jTIAyBJM2uRYae1sFgkyVbP3_Yx5TCC5FjdL7kG4qyrG9c5CwskCohlvzkJRgGwcKhgmH-InKZtAlJSqlv23fbbbhNjLtoqpJpgvdv_p0Vqo62qqSiXa8X00hktIPSxD5geejpfu61nSbtyUOvzltolfy60bX-ZmTI0&nonce=637169974084552984.NzMzMTViZGUtYWIwMC00NGE4LWI5MjgtZjk2ZTk3OWYwZDc4NzllZTk3MzQtZDFkMS00OTUxLWIyODktNmE0MDU1NzE4MDU1&x-client-SKU=ID_NET451&x-client-ver=5.2.1.0')
WebUI.maximizeWindow()

Thread.sleep(1000);
//WebUI.navigateToUrl('https://myexperts-test.petronas.com/')

WebUI.navigateToUrl(GlobalVariable.SiteURL)

Thread.sleep(1000);

//WebUI.navigateToUrl('http://pww.skill-staging.petronas.com.my/pages/auth/login')

WebUI.setText(findTestObject('Page_Login/txt_userId'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_Login/txt_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Login/btn_LOGIN'))
