import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_05_STP_Pass'

AndroidDriver driver = MobileDriverFactory.getDriver()


//*********************************************************************************************************************************
Mobile.comment('18-Page_Address Confirmation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Malaysia']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : '75000']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_PropertyNameUnit'))

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 
        1)) + ')')
} else {
	Mobile.verifyEqual(label_PropertyNameUnit, (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1) ))
}


if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 1 of 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
} else if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 3 of 7']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 
//        1)) + ')']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please check and confirm your current address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('State')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'My mailing address is the same as above']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)
Mobile.delay(2)
//*********************************************************************************************************************************
Mobile.comment('19-Page_Employment Details')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/editBox_Employer'),0,FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKey(new KeyEvent(AndroidKey.DEL))

Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/editBox_Employer'),findTestData(GlobalVariable.TestDataSheet_Name).getValue('Employer', 1),0)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/editBox_Employer'),GlobalVariable.Timeout)

//driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_Years'),GlobalVariable.Timeout)

Mobile.delay(2)

MobileBuiltInKeywords.scrollToText('4 years')

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('EmplomentYears', 1)]), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'),GlobalVariable.Timeout)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_Months'),GlobalVariable.Timeout)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('EmplomentMonths', 1)]), 
    30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'),GlobalVariable.Timeout)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_SourceOfIncome'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('SourceOfIncome_Country', 1))

//CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_OccupationSector'), findTestData(
       // GlobalVariable.TestDataSheet_Name).getValue('OccupationSector', 1))

//CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_OccupationSector'),'Auto Parts Business')

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_OccupationSector'),'Art & Antique Dealer')

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 
                1) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 1)) + ')']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1))]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}


if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 2 of 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
} else if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 4 of 7']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}


Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please review and update your employment details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name of employer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation sector']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'How long have you worked here?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Source of income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)
Mobile.delay(2)

//*********************************************************************************************************************************
Mobile.comment('20-Page_Office Address')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Malaysia']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : '68000']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_PropertyNameUnit'))

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 
        1)) + ')')
} else {
	Mobile.verifyEqual(label_PropertyNameUnit, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1))
}

if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 3 of 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
} else if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 5 of 7']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eighty Five Avenue DNT (Type A)']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Lake - Unit 1, Lake - Unit 2, Pune, Wp Kuala Lumpur, 50000']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please review and update your office address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address Line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address Line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address Line 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('State')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)


Mobile.delay(2)
//*********************************************************************************************************************************

if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
	
	Mobile.takeScreenshot()
	
		Mobile.comment('21-Terms and Conditions')
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Terms & Conditions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Yes, I expressly agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'No, I do not agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Yes, I expressly agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		//link AccountTax and AttachedLink
		Mobile.delay(2)
		Mobile.comment('Self certification2')
		width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 0)
		print width
		height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 0)
		print height
		 x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 'x', 0) as Integer
		 print x
		 y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 'y', 0) as Integer
		 print y
		
		 Mobile.tapAtPosition((width),((height/2)+y))
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'FATCA / CRS self-certification']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		
		Mobile.delay(2)
		Mobile.comment('Self certification1')
		Mobile.tapAtPosition((width-3*x),((height/3.5)+y))
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'FATCA / CRS self-certification']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		Mobile.delay(2)
		Mobile.comment('Declaraion')
		width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_Declaration'), 0)
		print width
		height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_Declaration'), 0)
		print height
		 x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_Declaration'), 'x', 0) as Integer
		 print x
		 y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_Declaration'), 'y', 0) as Integer
		 print y
		 
		 Mobile.tapAtPosition((width-8*x),((height/2)+y))
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Declaration']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		Mobile.delay(2)
		Mobile.comment('Privacy Statement')
		 width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 0)
		 print width
		 height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 0)
		 print height
		  x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 'x', 0) as Integer
		  print x
		  y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 'y', 0) as Integer
		  print y
		  
		  Mobile.tapAtPosition((width-2*x),((height/3.5)+y))
		  Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Privacy Statement']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		  Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		  Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		
		Mobile.comment('Product Disclosure Sheet')
		  width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_ProductDisclosureSheet'), 0)
		  print width
		  height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_ProductDisclosureSheet'), 0)
		  print height
		   x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_ProductDisclosureSheet'), 'x', 0) as Integer
		   print x
		   y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_ProductDisclosureSheet'), 'y', 0) as Integer
		   print y
		   
		   Mobile.tapAtPosition((width-4*x),((height/2)+y))
		   Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Product Disclosure Sheet']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		   Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		   Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)		  
		  
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_AgreeConfirm'),GlobalVariable.Timeout)
		
}
Mobile.delay(2)
Mobile.takeScreenshot()
