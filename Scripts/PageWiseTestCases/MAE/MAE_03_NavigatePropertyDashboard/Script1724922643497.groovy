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


//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_05_STP_Pass'

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
Mobile.comment('2-Page_Enter Name')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

String label_WelcomeOnboard = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/label_WelcomeOnboard'))
Mobile.verifyMatch(label_WelcomeOnboard,'Welcome Onboard', true)

String label_Onboard_HowToAddress = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/label_Onboard_HowToAddress'))
Mobile.verifyEqual(label_Onboard_HowToAddress,'How would you like us to address you?')

String SocialInteractionMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/label_SocialInteractionMsg'))
Mobile.verifyMatch(SocialInteractionMsg,'This will be used for social interactions within the app, so make sure it’s recognisable.', true)

Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Onboarding/textBox_Enter your name'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("Name",GlobalVariable.RowNumber), GlobalVariable.Timeout)
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

//*********************************************************************************************************************************
Mobile.comment('3-Page_Set Primary Account')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

String label_PersonalCurrentAccount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_PersonalCurrentAccount'))
Mobile.verifyMatch(label_PersonalCurrentAccount,'Personal Current Account', true)
String btn_SetPrimaryAccount_ActivateNow = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/btn_SetPrimaryAccount_ActivateNow'))
Mobile.verifyMatch(btn_SetPrimaryAccount_ActivateNow,'Activate Now', true)
String label_SetPrimaryAccount_MAEWallet = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_SetPrimaryAccount_MAEWallet'))
Mobile.verifyMatch(label_SetPrimaryAccount_MAEWallet,'MAE Wallet', true)
String label_SetPrimaryAccount_SelectAccountAsOR = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_SetPrimaryAccount_SelectAccountAsOR'))
Mobile.verifyMatch(label_SetPrimaryAccount_SelectAccountAsOR,'Select an account for your daily transactions such as QR.', true)
String label_SetPrimaryAccount_SetPrimaryAccount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_SetPrimaryAccount_SetPrimaryAccount'))
Mobile.verifyMatch(label_SetPrimaryAccount_SetPrimaryAccount,'Set Primary Account', true)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SetPrimaryAccount/label_PersonalCurrentAccount'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Next'), GlobalVariable.Timeout)

//*********************************************************************************************************************************
Mobile.comment('4-Page_Are you a new Maybank Customer')

Mobile.closeNotifications()
Mobile.delay(2)
driver.activateApp('com.maybank2u.life.uat')
Mobile.delay(5)

Mobile.takeScreenshot()

String label_AreYouNewMaybankCustomer = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/label_AreYouNewMaybankCustomer'))
Mobile.verifyEqual(label_AreYouNewMaybankCustomer,'Are you a new Maybank customer?')
String label_StartUsingMAE = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/label_StartUsingMAE'))
Mobile.verifyMatch(label_StartUsingMAE,'Start using the MAE app now to enjoy all sorts of exciting features! Let us sort out your spending, savings, cravings and more.', true, FailureHandling.CONTINUE_ON_FAILURE)
String txt_KeyInReferralCode = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/txt_KeyInReferralCode'))
Mobile.verifyMatch(txt_KeyInReferralCode,'Key in your friend\'s referral code.', true)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AreYouMaybankCustomer/txt_KeyInReferralCode'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Close'), GlobalVariable.Timeout)

//*********************************************************************************************************************************
Mobile.comment('5-Page_MAE Dashboard')

String label_Account = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/label_Account'))
Mobile.verifyMatch(label_Account,'Account', true)

Mobile.takeScreenshot()

String label_Hello = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/label_Hello'))
Mobile.verifyMatch(label_Hello,'Hello,', true)
String label_Logout = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/label_Logout'))
Mobile.verifyMatch(label_Logout,'Logout', true)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Name",GlobalVariable.RowNumber)]),
	30, FailureHandling.CONTINUE_ON_FAILURE)

String label_ViewAllAccounts = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/label_ViewAllAccounts'))
Mobile.verifyMatch(label_ViewAllAccounts,'View All Accounts', true)

Mobile.takeScreenshot()

/*
//*********************************************************************************************************************************
Mobile.comment('Post Login Validation')
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Customise']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***********************************

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Manage Quick Actions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Simply hold and drag to rearrange the actions.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your current favourite actions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Save Changes']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View All Accounts']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View All Accounts']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_GotIt'),0)) {
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_GotIt'),0)
}
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ACCOUNTS']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Total Balance']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'CARDS']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Apply for Credit Card']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'FIXED DEPOSITS']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'LOAN/FINANCING']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'No Loan/Financing Available']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'WEALTH']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Total Investments']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View Wealth Portfolio']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Maybank2u']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//****************************************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_3dots'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Kill Switch']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Kill Switch']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Kill Switch']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Quickly deactivate your credit cards or M2U access in case of fraud']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Block Credit Card']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Temporarily deactivate your selected credit card']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Deactivate Accounts']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Temporarily deactivate your selected savings/current account(s)']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Deactivate M2U Access']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Temporarily deactivate your Maybank2u online banking access']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

//****************************************

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Link Overseas Account']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Link Overseas Account']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your Maybank2u Account']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

//****************************************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_3dots'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Notifications']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Notifications']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Notifications']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ACTIVITIES']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)

//****************************************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_3dots'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Settings']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Settings']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Settings']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_PageBack'), GlobalVariable.Timeout)

//****************************************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_3dots'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact Bank']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact Bank']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact Bank']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'For any enquiries regarding your account, please call the Customer Care Hotline at']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : '1 300 88 6688.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Call Now']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Call Now']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

 Mobile.tap(findTestObject('Object Repository/MAE/ApplicationLogin/btn_CallCancel'), GlobalVariable.Timeout)

//****************************************
 
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_3dots'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Logout']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************
String label_Dashboard_Accounts = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Accounts'))
Mobile.verifyMatch(label_Dashboard_Accounts,'Accounts', true)

Mobile.takeScreenshot()

String label_Dashboard_Apply = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Apply'))
Mobile.verifyMatch(label_Dashboard_Apply,'Apply', true)
String label_Dashboard_Customise = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_Customise'))
Mobile.verifyMatch(label_Dashboard_Customise,'Customise', true)

//***********************************

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
*/

//***********************************************************************************************************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PropertyDashboard/btn_FrameLayout2'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Property'), GlobalVariable.Timeout)
