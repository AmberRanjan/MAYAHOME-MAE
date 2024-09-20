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
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_03_BAU_HardFail'
//GlobalVariable.TestCase_Name = 'MAE_E2E_03_BAU_HardFail_JA'

AndroidDriver driver = MobileDriverFactory.getDriver()

if (GlobalVariable.TestCase_Name == 'MAE_E2E_03_BAU_HardFail_JA') {
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'The home financing amount is out of the eligibility range of your joint application.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	String msg_MainApplicant = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/msg_mainapplcantoutcome'))			
	Mobile.verifyMatch(msg_MainApplicant, 'We\'ve notified the main applicant of the outcome.', true)
	
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/btn_Okay'), GlobalVariable.Timeout)

	} else {
		Mobile.comment('Successfully received application')
		
		Mobile.takeScreenshot()		
	
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You have helped your main applicant qualify for a higher home financing.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View offer conditions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		FinancingAmount__FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_FinancingAmount_JA'))
	   println(FinancingAmount__FinalEligibility)
	   
	   String[] FinancingAmount__FinalEligibility = FinancingAmount__FinalEligibility.split(' ')
	   FinancingAmount__FinalEligibility1 = (FinancingAmount__FinalEligibility[1]).replace(',', '')
	   
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Additional financing of up to 10% for other mortgage related expenses.']),GlobalVariable.Timeout,  FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Effective profit rate']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	   
		MobileBuiltInKeywords.scrollToText('Recommended financing period')
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Recommended financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Monthly instalment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'The monthly instalment amount is calculated based on the property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		MobileBuiltInKeywords.scrollToText('Property price')
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	   
	   String FinancingPeriod_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_FinancingPeriod_JA'))
	   Mobile.verifyMatch(FinancingPeriod_FinalEligibility, findTestData(GlobalVariable.TestDataSheet_Name).getValue("FinancingPeriod",1), true)
	   
		PropertyPrice_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_PropertyPrice1'))
		println(PropertyPrice_FinalEligibility)
	   String[] PropertyPrice_FinalEligibility = PropertyPrice_FinalEligibility.split(' ')
	   
	   println(PropertyPrice_FinalEligibility[1])
	   println(findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1))
	   
	   Mobile.verifyMatch(PropertyPrice_FinalEligibility[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1), true)
	   
	   
		Downpayment_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_Downpayment1'))
				String[] Downpayment_FinalEligibility = Downpayment_FinalEligibility.split(' ')
				Downpayment_FinalEligibility1 = (Downpayment_FinalEligibility[1]).replace(',', '')		
				
				PropertyPrice = (findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1)).replace(',', '')
				
				float CalculatedFinancingAmount = Float.parseFloat(PropertyPrice) - Float.parseFloat(Downpayment_FinalEligibility1)

				Mobile.verifyEqual(CalculatedFinancingAmount, FinancingAmount__FinalEligibility1)
				Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'),GlobalVariable.Timeout)

				Mobile.delay(2)
}