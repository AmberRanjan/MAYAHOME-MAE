import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

/*
Mobile.comment('23-Additional Information')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)+' '+'('+findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitType",1)+')']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Primary income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Primary source of wealth']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AdditionalInfromation/dropdown_PrimaryIcome'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("PrimaryIncome",1))
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/AdditionalInfromation/dropDown_SourceOfWealth'),findTestData(GlobalVariable.TestDataSheet_Name).getValue("PrimarySourceOfWealth",1))
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)
*/
//*********************************************************************************************************************************
//For BAU
if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_05_STP_Pass')) {
	
		Mobile.comment('24-Successfully received application')
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
		
		//*****
		if ((GlobalVariable.TestCase_Name == 'MAE_E2E_01_BAU_SoftFail') && (GlobalVariable.TestCase_Name == 'MAE_E2E_02_BAU_Pass') && (GlobalVariable.TestCase_Name == 'MAE_E2E_03_BAU_HardFail') && (GlobalVariable.TestCase_Name == 'MAE_E2E_06_BAU_Pass_NonListed')) {
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Great news, We have successfully received your application.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		if ((GlobalVariable.TestCase_Name == 'MAE_E2E_01_BAU_SoftFail_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_02_BAU_Pass_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_03_BAU_HardFail_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_06_BAU_Pass_NonListed_JA')) {
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Great news! Your joint applicant and you are one step closer to moving into your dream home!']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			}
		//*******	
			
		Mobile.takeScreenshot()
		
		//****
		if ((GlobalVariable.TestCase_Name == 'MAE_E2E_01_BAU_SoftFail') && (GlobalVariable.TestCase_Name == 'MAE_E2E_02_BAU_Pass') && (GlobalVariable.TestCase_Name == 'MAE_E2E_03_BAU_HardFail') && (GlobalVariable.TestCase_Name == 'MAE_E2E_06_BAU_Pass_NonListed')) {
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Our representative will contact you to assist with the rest of your mortgage application.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		}
		
		if ((GlobalVariable.TestCase_Name == 'MAE_E2E_01_BAU_SoftFail_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_02_BAU_Pass_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_03_BAU_HardFail_JA') && (GlobalVariable.TestCase_Name == 'MAE_E2E_06_BAU_Pass_NonListed_JA')) {
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your sales representative will be in touch with you to proceed with the final steps.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			}
			//********
			
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You may head over to the Application tab to track the status.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ViewApplication'),GlobalVariable.Timeout)
		Mobile.delay(2)
}

//*********************************************************************************************************************************
//For STP
if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') ||(GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')) {
	
		Mobile.comment('24-Successfully received application')
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
		
		if ((GlobalVariable.TestCase_Name == 'MAE_E2E_05_STP_Pass') && (GlobalVariable.TestCase_Name == 'MAE_E2E_04_STP_SoftFail')) {
		String GreatNewsMessage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_GreatNew_msg'))
		Mobile.verifyMatch(GreatNewsMessage, 'Great news, you’re now one step closer to owning your dream home!', true)
		}
		if (GlobalVariable.TestCase_Name == 'MAE_E2E_04_STP_SoftFail_JA') {
			String GreatNewsMessage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_GreatNew_msg_JA'))
			Mobile.verifyMatch(GreatNewsMessage, 'Great news! You and your joint applicant are now one step closer to owning your dream home!', true)
			}
			
		Mobile.takeScreenshot()
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your sales representative will be in touch with you to proceed with the final steps.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You may head over to the Application tab to track the status.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		FinancingAmount__FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_FinancingAmount'))
	   println(FinancingAmount__FinalEligibility)
	   
	   String[] FinancingAmount__FinalEligibility = FinancingAmount__FinalEligibility.split(' ')
	   FinancingAmount__FinalEligibility1 = (FinancingAmount__FinalEligibility[1]).replace(',', '')
	   
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Additional financing of up to 10% for other mortgage related expenses.']),GlobalVariable.Timeout,  FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Effective profit rate']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	   
		MobileBuiltInKeywords.scrollToText('Financing period')
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		MobileBuiltInKeywords.scrollToText('Property price')
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Monthly instalment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'The monthly instalment amount is calculated based on the property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	   
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	   
	   String FinancingPeriod_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FinancingApplication_Result/txt_FinancingPeriod'))
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
				Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ViewApplication'),GlobalVariable.Timeout)
				Mobile.delay(2)
}

Mobile.delay(2)