import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()
//**************************************************************************************************************************

Mobile.comment('2.Mortgage Page Validation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Mortgage']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Hi ooooo,']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/SF/MortgageDashboard/menu_Hamburger'),GlobalVariable.Timeout,)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/MortgageDashboard/btn_NotificationIcon'),GlobalVariable.Timeout,)

Mobile.verifyElementExist(findTestObject('Object Repository/SF/MortgageDashboard/txt_NoOfCases'),GlobalVariable.Timeout,)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You currently have ']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'awaiting your action.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Pending signing of Letter of Offer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Pending data entry / LO generation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Pending assistance']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Pending KYC']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Other action required']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Draft Application:']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Accept']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Quick Actions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Cases']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Chat']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//MobileBuiltInKeywords.scrollToText('Start New Application')
//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Start New Application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Accept']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************
Mobile.comment('3.Search for MAE Case')
Mobile.tap(findTestObject('Object Repository/SF/CaseDetails/txt_Cases'), GlobalVariable.Timeout)

Mobile.comment('Your Cases Page Validation')
//String label_YourCases= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/SF/CaseDetails/txt_YourCases'))
//Mobile.verifyMatch(label_YourCases,'Your Cases', true)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'All']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home2u']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'On-The-Go']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Partner']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/SF/CaseDetails/editBox_Search'), GlobalVariable.Timeout)
Mobile.setText(findTestObject('Object Repository/SF/CaseDetails/editBox_Search'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("Name",1), GlobalVariable.Timeout)
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/SF/CaseDetails/item_searched'), GlobalVariable.Timeout)

//***************************************************************************************************************************
Mobile.comment('3.Cases Validation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'MAYA']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Name_Caps",1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Object Repository/SF/MortgageDashboard/btn_PreviousPage'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertySF', 1)) + '.') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType',
	1))]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/btn_ChatIcon'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/btn_HomeFinancing_Expand'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/btn_StartIcon'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/btn_ThreeDotIcon'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/img_CaseDetailsApplicationDetailsHome'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/label_HomeFinancing'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/SF/CaseDetails/btn_HomeFinancing_Expand'), GlobalVariable.Timeout)


Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unsatisfactory Eligibility Check']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unsatisfactory Eligibility Check']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please perform further checking and assist your customer with the manual processing.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unsatisfactory Eligibility Check']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)


 
 
