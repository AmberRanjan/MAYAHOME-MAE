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
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_04_STP_SoftFail'
//GlobalVariable.TestCase_Name = 'MAE_E2E_04_STP_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
 Mobile.comment('25-Final Eligibility Check')
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
 
 Mobile.takeScreenshot()
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eligibility checking']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_03_BAU_HardFail') {
	 Mobile.takeScreenshot()
	 String EligibilityMessage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/label_EligibilityMessage_HardFail'))
	 Mobile.verifyMatch(EligibilityMessage, 'Sorry, your request couldn\'t be matched. Please proceed with other options.', true)
	 }
 
 if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
	 Mobile.takeScreenshot()
	 String EligibilityMessage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/label_EligibilityMessage'))
		 Mobile.verifyMatch(EligibilityMessage, 'You\'re eligible! You may now proceed with your application.', true)
		 }
		 
		 if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') ||(GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
			 Mobile.takeScreenshot()
			 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unit no: '+findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitNumber",1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 }
			 		 
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 
		 if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
			 Mobile.takeScreenshot()
			 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'A mortgage representative will get in touch with you soon.']),GlobalVariable.Timeout,   FailureHandling.CONTINUE_ON_FAILURE)
		 }
		 
		 if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
			 Mobile.takeScreenshot()
			 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your application has been approved in principle. Your mortgage representative is preparing your Letter of Offer.']),GlobalVariable.Timeout,   FailureHandling.CONTINUE_ON_FAILURE)
		 }
			 
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing acceptance']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Legal documentation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing disbursement']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Active']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		  
		 if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
			 Mobile.takeScreenshot()
			 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 FinancingAmount__FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinancingAmount_FinalConfirmationPage'))
				println(FinancingAmount__FinalEligibility)
				
				String[] FinancingAmount__FinalEligibility = FinancingAmount__FinalEligibility.split(' ')
				FinancingAmount__FinalEligibility1 = (FinancingAmount__FinalEligibility[1]).replace(',', '')
				
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You can get additional financing of up to 10% for other mortgage and related expenses']),GlobalVariable.Timeout,  FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Effective profit rate']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				
				 MobileBuiltInKeywords.scrollToText('Financing period')
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 MobileBuiltInKeywords.scrollToText('Monthly instalment')
				 
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Monthly instalment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'The monthly instalment amount is calculated based on the property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 MobileBuiltInKeywords.scrollToText('Documents')
				 
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Documents']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Documents']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.delay(3)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Documents']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Letter of Offer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Chat Documents']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
				 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'),30)
				 Mobile.delay(2)
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View or manage documents for this application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 
				 MobileBuiltInKeywords.scrollToText('We’re connecting you to a Maybank sales representative. They will be in contact with you with in an hour’s time.')
				 
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Sales Representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
				 String ContactSalesRepresentativeMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/label_ContactSalesRepresentativeMsg'))
				 Mobile.verifyEqual(ContactSalesRepresentativeMsg, 'We’re connecting you to a Maybank sales representative. They will be in contact with you with in an hour’s time.')
				
				 MobileBuiltInKeywords.scrollToText('Financing period')
				 
				String FinancingPeriod_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinancingPeriod_FinalConfirmationPage'))
				Mobile.verifyMatch(FinancingPeriod_FinalEligibility, findTestData(GlobalVariable.TestDataSheet_Name).getValue("FinancingPeriod",1), true)
				
				MobileBuiltInKeywords.scrollToText('Property price')
				
				 PropertyPrice_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_PropertyPrice_FinalConfirmationPage'))
				String[] PropertyPrice_FinalEligibility = PropertyPrice_FinalEligibility.split(' ')
				Mobile.verifyMatch(PropertyPrice_FinalEligibility[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1), true)
				
				MobileBuiltInKeywords.scrollToText('Downpayment')
				
				 Downpayment_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_Downpayment_FinalConfirmationPage'))
				
				String[] Downpayment_FinalEligibility = Downpayment_FinalEligibility.split(' ')
				Downpayment_FinalEligibility1 = (Downpayment_FinalEligibility[1]).replace(',', '')
				PropertyPrice = (findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1)).replace(',', '')
				
				float CalculatedFinancingAmount = Float.parseFloat(PropertyPrice) - Float.parseFloat(Downpayment_FinalEligibility1)

				Mobile.verifyEqual(CalculatedFinancingAmount, FinancingAmount__FinalEligibility1)	
}

Mobile.takeScreenshot()

if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') ||(GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
				Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Selected home financing']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing product']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				
				Mobile.delay(2)
				
				label_FinancingType = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinanacingType'))
				Mobile.verifyEqual(label_FinancingType,'Islamic')
				
				label_FinancingProduct = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinancingProduct'))
				Mobile.verifyEqual(label_FinancingProduct,'Commodity Murabahah Home Financing Islamic')
				
				
}

Mobile.delay(2)

