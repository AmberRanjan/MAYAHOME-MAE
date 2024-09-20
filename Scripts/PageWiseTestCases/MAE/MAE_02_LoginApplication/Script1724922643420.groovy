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


Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//***************************************************************************************************************************
Mobile.comment('Pre Login Verify Dashboard Labels')

String label_Dashboard_Accounts = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Accounts'))
Mobile.verifyMatch(label_Dashboard_Accounts,'Accounts', true)

Mobile.takeScreenshot()

String label_Dashboard_Apply = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Apply'))
Mobile.verifyMatch(label_Dashboard_Apply,'Apply', true)
String label_Dashboard_Customise = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Customise'))
Mobile.verifyMatch(label_Dashboard_Customise,'Customise', true)

String label_Dashboard_CustomiseQuickActions = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_CustomiseQuickActions'))
Mobile.verifyEqual(label_Dashboard_CustomiseQuickActions,'Quick Actions')
//String label_Dashboard_eMADANI = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_eMADANI'))
//Mobile.verifyMatch(label_Dashboard_eMADANI,'eMADANI', true)
String label_Dashboard_Expenses = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Expenses'))
Mobile.verifyMatch(label_Dashboard_Expenses,'Expenses', true)
String label_Dashboard_Home = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Home'))
Mobile.verifyMatch(label_Dashboard_Home,'Home', true)
String label_Dashboard_MoviesLeisure = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_MoviesLeisure'))
Mobile.verifyMatch(label_Dashboard_MoviesLeisure,'Movies & Leisure', true)
String label_Dashboard_PayBills = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_PayBills'))
Mobile.verifyMatch(label_Dashboard_PayBills,'Pay Bills', true)
String label_Dashboard_Scan = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Scan'))
Mobile.verifyMatch(label_Dashboard_Scan,'Scan', true)
String label_Dashboard_Secure2u = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Secure2u'))
Mobile.verifyMatch(label_Dashboard_Secure2u,'Secure2u', true)
//String label_Dashboard_SecureConvenientImproved = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_SecureConvenientImproved'))
//Mobile.verifyMatch(label_Dashboard_SecureConvenientImproved,'Secure. Convenient. Improved.', true)
String label_Dashboard_SplitBill = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_SplitBill'))
Mobile.verifyMatch(label_Dashboard_SplitBill,'Split Bill', true)
//String label_Dashboard_Tabung = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Tabung'))
//Mobile.verifyMatch(label_Dashboard_Tabung,'Tabung', true)
String label_Dashboard_Transfer = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Transfer'))
Mobile.verifyMatch(label_Dashboard_Transfer,'Transfer', true)
String label_Dashboard_TravelInsurance = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_TravelInsurance'))
Mobile.verifyMatch(label_Dashboard_TravelInsurance,'Travel Insurance', true)
String label_Dashboard_WelcomeyourNewBankingExperience= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_WelcomeyourNewBankingExperience'))
Mobile.verifyMatch(label_Dashboard_WelcomeyourNewBankingExperience,'Welcome to your new banking experience.', true)

//***************************************************************************************************************************
Mobile.comment("Let's Get Started")

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PreviousPage'), GlobalVariable.Timeout)
String label_LetsGetStarted= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_LetsGetStarted'))
Mobile.verifyMatch(label_LetsGetStarted,"Let's Get Started!", true)

Mobile.takeScreenshot()

String label_LogInAppFullest= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_LogInAppFullest'))
Mobile.verifyMatch(label_LogInAppFullest,'Log in to enjoy the app to its fullest.', true)

String label_NoAccountApply= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_NoAccountApply'))
Mobile.verifyEqual(label_NoAccountApply,'No account? Apply for an account now')
String label_RegisterForMaybank2u= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_RegisterForMaybank2u'))
Mobile.verifyMatch(label_RegisterForMaybank2u,'Register for Maybank2u', true)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Register for Maybank2u']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'M2U Web']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_ExistingM2UMAEUserLogInHere'), 0)
Mobile.delay(2)

//***************************************************************************************************************************
Mobile.comment('Login to MAE Application')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PreviousPage'), GlobalVariable.Timeout)
String label_ForgotLoginDetails= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_ForgotLoginDetails'))
Mobile.verifyMatch(label_ForgotLoginDetails,'Forgot Login Details', true)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Forgot Login Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Reset details using']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Card number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'PIN']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

String label_LogintoMaybank2u= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_LogintoMaybank2u'))
Mobile.verifyMatch(label_LogintoMaybank2u,'Login to Maybank2u', true)

Mobile.takeScreenshot()

String label_PleaseEnterYourUsername= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_PleaseEnterYourUsername'))
Mobile.verifyMatch(label_PleaseEnterYourUsername,'Please enter your username', true)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),0)
Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_UserName'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("UserName",GlobalVariable.RowNumber),0)
println(findTestData(GlobalVariable.TestDataSheet_Name).getValue("UserName",GlobalVariable.RowNumber))
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PreviousPage'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
String label_H2Testing= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_H2Testing'))
Mobile.verifyMatch(label_H2Testing,'H2Testing', true)
String label_IsThisYourSecurityPhrase= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_IsThisYourSecurityPhrase'))
Mobile.verifyMatch(label_IsThisYourSecurityPhrase,'Is this your security phrase?', false)
String label_NotMine= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_NotMine'))
Mobile.verifyMatch(label_NotMine,'Not Mine', true)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_YesItsMine'), 0)

Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
String label_H2Testing_PasswordPage= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_H2Testing'))
Mobile.verifyMatch(label_H2Testing_PasswordPage,'H2Testing', true)

Mobile.takeScreenshot()

String label_EnterYourPassword= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_EnterYourPassword'))
Mobile.verifyMatch(label_EnterYourPassword,'Enter your password', true)
String label_ForgotPassword= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_ForgotPassword'))
Mobile.verifyMatch(label_ForgotPassword,'Forgot Password', true)

Mobile.setText(findTestObject('Object Repository/MAE/ApplicationLogin/textBox_Password'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("Password",GlobalVariable.RowNumber), 0)
println(findTestData(GlobalVariable.TestDataSheet_Name).getValue("Password",GlobalVariable.RowNumber))
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

String label_6digitPIN = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_6digitPIN'))
Mobile.verifyMatch(label_6digitPIN,'6-digit PIN', true)

String label_CreatePIN= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_CreatePIN'))
Mobile.verifyMatch(label_CreatePIN,'Create your PIN for the app', true)
String label_PINInfo= CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_PINInfo'))
Mobile.verifyMatch(label_PINInfo,'The 6-digit PIN will be used each time you access your account or as backup to your biometric login.', true)

//***************************************************************************************************************************
Mobile.comment('Enter PIN and OTP')

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_YourPINNoIs'), 0)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)
Mobile.delay(2)
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_Close'), GlobalVariable.Timeout)
String label_6digitPIN_Confirmation = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_6digitPIN'))
Mobile.verifyMatch(label_6digitPIN_Confirmation,'6-digit PIN', true)

Mobile.takeScreenshot()

String label_Confirm6DigitPIN = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Confirm6DigitPIN'))
Mobile.verifyMatch(label_Confirm6DigitPIN,'Confirm your 6-digit PIN', true)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_YourPINNoIs'), 0)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_SetUpLater'), GlobalVariable.Timeout)
String label_EnableBiometricID = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_EnableBiometricID'))
Mobile.verifyMatch(label_EnableBiometricID,'Enable biometric ID for instant access', true)
String label_EnableNow = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_EnableNow'))
Mobile.verifyMatch(label_EnableNow,'Enable Now', true)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_SetUpLater'), 0)

String label_UseDifferentNumber = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_UseDifferentNumber'))
Mobile.verifyMatch(label_UseDifferentNumber,'Use a Different Number', true)
String label_VerifyNumber = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_VerifyNumber'))
Mobile.verifyMatch(label_VerifyNumber,'Verify Number', true)

if (findTestData(GlobalVariable.TestDataSheet_Name).getValue("UserName",GlobalVariable.RowNumber) =='h2umae5') {
String label_YourMobileNumberInOurRecords = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_YourMobileNumberInOurRecords'))
Mobile.verifyEqual(label_YourMobileNumberInOurRecords,'Your mobile number in our records is 60 19 271 ****. Would you like to set up MAE by Maybank2u with this number?')
}

if (findTestData(GlobalVariable.TestDataSheet_Name).getValue("UserName",GlobalVariable.RowNumber) =='MAEUser17') {
	String label_YourMobileNumberInOurRecords = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_YourMobileNumberInOurRecords'))
	Mobile.verifyEqual(label_YourMobileNumberInOurRecords,'Your mobile number in our records is 60 13 434 ****. Would you like to set up MAE by Maybank2u with this number?')
}

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_YesProceed'), 0)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Enter OTP sent to 60 19 271 ****']),
	//30, FailureHandling.CONTINUE_ON_FAILURE)

String label_OneTimePassword = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_OneTimePassword'))
Mobile.verifyMatch(label_OneTimePassword,'One Time Password', true)
String label_ResendOTP = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_ResendOTP'))
Mobile.verifyMatch(label_ResendOTP,'Resend OTP in', true)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/txt_Your OTP no. is'), 0)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_KeypadContinue'), 0)
Mobile.delay(2)
//***************************************************************************************************************************

