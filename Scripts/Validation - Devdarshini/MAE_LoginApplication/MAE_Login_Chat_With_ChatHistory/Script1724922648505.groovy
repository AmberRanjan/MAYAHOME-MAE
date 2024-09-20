import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)


AndroidDriver driver = MobileDriverFactory.getDriver()
//***************************************************************************************************************************
 Mobile.comment("Let's Get Started")
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), GlobalVariable.Timeout)
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Register for Maybank2u']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'M2U Web']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_ExistingM2UMAEUserLogInHere'), GlobalVariable.Timeout)
 
 //***************************************************************************************************************************
 Mobile.comment('Login to MAE Application')
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),GlobalVariable.Timeout)


 Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),'mayahome123',GlobalVariable.Timeout)

 driver.pressKey(new KeyEvent(AndroidKey.ENTER))
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_YesItsMine'), GlobalVariable.Timeout)
 

 Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_Password'), 'Pass@1111',GlobalVariable.Timeout )


 driver.pressKey(new KeyEvent(AndroidKey.ENTER))
 //***************************************************************************************************************************
 Mobile.comment('Enter PIN and OTP')
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_YourPINNoIs'), 0)
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_YourPINNoIs'), 0)
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_SetUpLater'), 0)
 
 Mobile.takeScreenshot()
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_YesProceed'), 0)
 
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_Your OTP no. is'), 0)
 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)
 
 //***************************************************************************************************************************
 Mobile.comment('Navigate to Property')


 Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/textBox_Enter your name'),'Tester',30)

 driver.pressKey(new KeyEvent(AndroidKey.ENTER))
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_Maybank2uPremier'), GlobalVariable.Timeout)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Next'), GlobalVariable.Timeout)
 
 Mobile.closeNotifications()
 driver.activateApp('com.maybank2u.life.uat')
 Mobile.delay(5)
 
 Mobile.takeScreenshot()
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/txt_KeyInReferralCode'), GlobalVariable.Timeout)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Close'), GlobalVariable.Timeout)
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_FrameLayout2'), GlobalVariable.Timeout)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Property'), GlobalVariable.Timeout)
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Skip'), GlobalVariable.Timeout)
 //***************************************************************************************************************************
 