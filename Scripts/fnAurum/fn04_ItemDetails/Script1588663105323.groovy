import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.click(findTestObject('Page_Requestor/cal_ExpectedStartDate'))
WebUI.delay(1)

WebUI.click(findTestObject('Page_Calendar/cal_MonthHeader'))
TestObject new_value = WebUI.modifyObjectProperty(findTestObject('Page_Calendar/calExpectedDateMonth'), 'text', 'equals', mp['ExpectedStartMonth']
, false)
WebUI.click(new_value)


TestObject new_day =  WebUI.modifyObjectProperty(findTestObject('Page_Calendar/calExpectedDateMonth'), 'text', 'equals', mp['ExpectedStartDate'], false)
WebUI.click(new_day)

//WebUI.click(findTestObject('Page_Requestor/a_17'))


WebUI.click(findTestObject('Page_Requestor/cal_ExpectedEndDate'))
WebUI.click(findTestObject('Page_Calendar/calMonthHeaderExpected'))
//TestObject new_value1 = WebUI.modifyObjectProperty(findTestObject('Page_Calendar/calExpectedEndDateMonth'), 'text', 'equals',  mp['ExpectedEndMonth'], true)
//WebUI.click(new_value1)


String dynamicId = mp['ExpectedEndMonth']
//String xpath = '(//*[@href = "#" and (text() = "' + dynamicId + '" or . = "' + dynamicId +  '")])[2]'

String xpath = '//*[@href = "#" and (text() = "' + dynamicId + '" or . = "' + dynamicId +  '")]'
TestObject to = new TestObject("objectName")
to.addProperty("xpath", ConditionType.EQUALS, xpath)
WebUI.click(to)



String dynamicIdday = mp['ExpectedEndDate']
String xpath1 = '//*[@data-value = "' + dynamicIdday + '"]'

TestObject to1 = new TestObject("objectName")
to1.addProperty("xpath", ConditionType.EQUALS, xpath1)
WebUI.click(to1)

'Project Details'

WebUI.setText(findTestObject('Page_Aurum/Req/txt_SRTitleAurum'), mp['SRTitle'])

WebUI.selectOptionByValue(findTestObject('Page_Aurum/Req/cmb_ProjectPhase'),mp['ProjectPhase'], false)

WebUI.setText(findTestObject('Page_Aurum/Req/txt_DetailServiceRequirement'),mp['DetailServiceRequirement'])

WebUI.click(findTestObject('Page_Aurum/Req/btn_Select'))

WebUI.click(findTestObject('Page_Aurum/Req/chkBriefScopeSelectAll'))

WebUI.click(findTestObject('Page_Aurum/Req/div_PROJECT DETAILS'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_Aurum/Req/btn_Select'))

WebUI.click(findTestObject('Page_Aurum/Req/chkProjectCategory'))
WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Page_Aurum/Req/cmb_CompletionType'),mp['CompletionType'], false)




