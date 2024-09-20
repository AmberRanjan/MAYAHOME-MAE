import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent


Mobile.startExistingApplication('com.maybank2u.life.uat')
GlobalVariable.TestDataSheet_Name = 'MAE_E2E_04_STP_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//***************************************************************************************************************************
Mobile.comment("Let's Get Started")

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Register for Maybank2u']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'M2U Web']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_ExistingM2UMAEUserLogInHere'), 0)

//***************************************************************************************************************************
Mobile.comment('Login to MAE Application')

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),0)
Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("JointApplicant_UserName",GlobalVariable.RowNumber),0)
println(findTestData(GlobalVariable.TestDataSheet_Name).getValue("UserName",GlobalVariable.RowNumber))
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_YesItsMine'), 0)

Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_Password'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("JointApplicant_Password",GlobalVariable.RowNumber), 0)
println(findTestData(GlobalVariable.TestDataSheet_Name).getValue("Password",GlobalVariable.RowNumber))
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

Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/textBox_Enter your name'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("JointApplicant_Name",GlobalVariable.RowNumber), GlobalVariable.Timeout)
driver.pressKey(new KeyEvent(AndroidKey.ENTER))
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_Maybank2uPremier'), GlobalVariable.Timeout)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Next'), GlobalVariable.Timeout)
Mobile.delay(2)
Mobile.closeNotifications()
driver.activateApp('com.maybank2u.life.uat')
Mobile.delay(5)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/txt_KeyInReferralCode'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Close'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_FrameLayout2'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Property'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Skip'), GlobalVariable.Timeout)
Mobile.delay(2)
