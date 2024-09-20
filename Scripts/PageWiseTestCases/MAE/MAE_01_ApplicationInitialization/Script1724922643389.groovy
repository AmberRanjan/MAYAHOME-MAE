import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable as GlobalVariable

Mobile.comment('Launch MAE Application')
//CustomKeywords.'com.maybank.baseUtil.ApplicationInitializer.startMAEApplication'()

Mobile.startExistingApplication("com.maybank2u.life.uat")

//***************************************************************************************************************************
Mobile.delay(5)
Mobile.comment('Navigate to Login Page')

Mobile.takeScreenshot()

while (Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Next'), GlobalVariable.Timeout, FailureHandling.OPTIONAL)) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
    Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Next'), GlobalVariable.Timeout)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Previous'), GlobalVariable.Timeout)
}

String label_CustomiseQuickActions = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationLogin/label_Dashboard_CustomiseQuickActions'))
Mobile.verifyMatch(label_CustomiseQuickActions,'Customise your Quick Actions', true)
Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_GotIt'), GlobalVariable.Timeout)

String label_TermsConditions = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationInitialization/label_Terms Conditions'))
Mobile.verifyMatch(label_TermsConditions,'Terms & Conditions', true)
String label_TermsConditions_Text = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/ApplicationInitialization/label_TermsConditions_Text'))

Mobile.verifyMatch(label_TermsConditions_Text,'By your continued usage of this app, you agree to its Terms & Conditions which will legally bind you. If you do not agree with these Terms & Conditions please do not continue using this app.', true)
Mobile.delay(4)

width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/ApplicationInitialization/label_TermsConditions_Text'), 0)
height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/ApplicationInitialization/label_TermsConditions_Text'), 0)
 x = Mobile.getAttribute(findTestObject('Object Repository/MAE/ApplicationInitialization/label_TermsConditions_Text'), 'x', 0) as Integer
 y = Mobile.getAttribute(findTestObject('Object Repository/MAE/ApplicationInitialization/label_TermsConditions_Text'), 'y', 0) as Integer

Mobile.tapAtPosition((width*(0.58))+x,(height*(0.58))+y-70,FailureHandling.STOP_ON_FAILURE)
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_GotIt'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Agree'), GlobalVariable.Timeout)
Mobile.delay(2)