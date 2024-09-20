import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_03_BAU_HardFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
Mobile.comment('6-Page_Find Your Dream Home')

			Mobile.delay(5)			
			String btn_Next = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Next'))			
			Mobile.verifyMatch(btn_Next, 'Next', true)	
					
			Mobile.takeScreenshot()		
			
			String btn_Skip = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Skip'))			
			Mobile.verifyMatch(btn_Skip, 'Skip', true)	
					
			String label_BrowsePropertyOnline = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FindYourDreamHome/label_BrowsePropertyOnline'))			
			Mobile.verifyMatch(label_BrowsePropertyOnline, 'Browse property online from anywhere and enjoy a seamless property shopping experience.', true)		
				
			String label_FindYourDreamHome = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/FindYourDreamHome/label_FindYourDreamHome'))			
			Mobile.verifyMatch(label_FindYourDreamHome, 'Find your dream home', true)			
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Skip'), GlobalVariable.Timeout)
			Mobile.delay(2)
//*********************************************************************************************************************************
Mobile.comment('7-Page_Select Property')
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)	
					
			String label_APPLICATION = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_APPLICATION'))			
			Mobile.verifyMatch(label_APPLICATION, 'APPLICATION', true)
			
			Mobile.takeScreenshot()			
			String label_ApplyMortgage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_ApplyMortgage'))			
			Mobile.verifyMatch(label_ApplyMortgage, 'Apply Mortgage', true)
			
			String label_BOOKMARK = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_BOOKMARK'))
			
			Mobile.verifyMatch(label_BOOKMARK, 'BOOKMARK', true)
			
			String label_BrowseProperties = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_BrowseProperties'))
			
			Mobile.verifyMatch(label_BrowseProperties, 'Browse Properties', true)
			
			String label_DISCOVER = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_DISCOVER'))
			
			Mobile.verifyMatch(label_DISCOVER, 'DISCOVER', true)
			
			String label_FinancingCalculator = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_FinancingCalculator'))
			
			Mobile.verifyMatch(label_FinancingCalculator, 'Financing Calculator', true)
			
			String label_ScanProperty = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_ScanProperty'))
			
			Mobile.verifyMatch(label_ScanProperty, 'Scan Property', true)
			
			//Need to take confirmation from Dev sometime they disable Home services
			//String label_HomeServices = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_HomeServices'))
			//Mobile.verifyMatch(label_HomeServices,'Home Services', true)
			String label_Homeu = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_Homeu'))
			
			Mobile.verifyMatch(label_Homeu, 'Home²u', true)
			
			//String label_NoPropertyMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_NoPropertyMsg'))
			//Mobile.verifyMatch(label_NoPropertyMsg,'Oops! There\'s nothing to show at this moment. Please try again later', true)
			String label_Viewall = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_Viewall'))
			
			Mobile.verifyMatch(label_Viewall, 'View all', true)
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Browse Properties']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Featured']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			MobileBuiltInKeywords.scrollToText('View more')
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View more']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			MobileBuiltInKeywords.scrollToText('View all')

		    Mobile.delay(2)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/filter_SearchProperties'), GlobalVariable.Timeout)
		
		    Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/filter_SetTextSearchProperties'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 
		            GlobalVariable.RowNumber), GlobalVariable.Timeout)
		
		    driver.pressKey(new KeyEvent(AndroidKey.ENTER))
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/lst_Property'), GlobalVariable.Timeout)
		
		    Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/txt_SearchedProperty'), GlobalVariable.Timeout)
		
		    Mobile.delay(5)
	

//*********************************************************************************************************************************
 Mobile.comment('8-Page_Check Eligibility')

		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
		
		    Mobile.takeScreenshot()
		
		    String btn_CheckEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/btn_CheckEligibility'))
		
		    Mobile.verifyMatch(btn_CheckEligibility, 'Check eligibility', true)
		
		    String btn_MakeInquiry = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/btn_MakeInquiry'))
		
		    Mobile.verifyMatch(btn_MakeInquiry, 'Make an Inquiry', true)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/btn_MakeInquiry'), GlobalVariable.Timeout)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Connect with a sales representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'How can we help you?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
		
		    Mobile.delay(3)
			
//**************************************************************************************************************************************************		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ThreeDots'), GlobalVariable.Timeout)
		
		    Mobile.delay(3)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Download Brochure']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			//Error on Download Broc click
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Download Brochure']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downloading file...']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.delay(3)
			//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'The brochure has been downloaded successfully.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ThreeDots'), GlobalVariable.Timeout)
			
			Mobile.delay(3)
			
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Share Property Link']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Share Property Link']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Sharing text']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			Mobile.tapAtPosition(400, 1000)
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
				
		    //Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
		
		    String label_PropertyName = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/label_PropertyName'))
		
		    Mobile.verifyMatch(label_PropertyName, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber), true)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/btn_CheckEligibility'), GlobalVariable.Timeout)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CheckEligibility/btn_CheckEligibility'), GlobalVariable.Timeout)
			
//*********************************************************************************************************************************
 Mobile.comment('9-Page_Credit Report Consent')

		    Mobile.delay(2)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
		
		    Mobile.takeScreenshot()
		
		    String label_Agreement = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CreditReportConsent/label_Agreement'))
		
		    Mobile.verifyEqual(label_Agreement, 'I agree that my personal and business data may be processed by Maybank or Maybank\'s selected credit reporting agency in accordance with the Credit Reporting Agencies (CRA) Act 2020 and Central Bank of Malaysia Act 2009.')
		
		    String label_AllowCheckCreditScoreHistory = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CreditReportConsent/label_AllowCheckCreditScoreHistory'))
		
		    Mobile.verifyMatch(label_AllowCheckCreditScoreHistory, 'Before we proceed, kindly allow us to check your credit score and history', true)
		
		    String label_CheckEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CreditReportConsent/label_CheckEligibility'))
		
		    Mobile.verifyMatch(label_CheckEligibility, 'Check eligibility', true)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/CreditReportConsent/btn_AgreeConfirm'), GlobalVariable.Timeout)

//*********************************************************************************************************************************
Mobile.comment('10-Page_Unit Type')

		    Mobile.delay(2)
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
		
		    Mobile.takeScreenshot()
		
		    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
		
		    findTestObject('Object Repository/MAE/PropertyCheckEligibility/UnitType/label_PropertyName')
		
		    findTestObject('Object Repository/MAE/PropertyCheckEligibility/UnitType/label_SelectUnitType')
		
		    findTestObject('Object Repository/MAE/PropertyCheckEligibility/UnitType/label_StepNo1')
		
		    String UnitType = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/UnitType/txt_UnitType_Type A'), GlobalVariable.Timeout)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/UnitType/txt_UnitType_Type A'), 0)
		
		    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SelectContinue'), GlobalVariable.Timeout)

//*********************************************************************************************************************************
Mobile.comment('11-Page_Property Price and Downpayment')

			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
			
			Mobile.takeScreenshot()
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
			
			String label_Downpayment = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_Downpayment'))
			
			Mobile.verifyMatch(label_Downpayment, 'Downpayment', true)
			
			String label_FillDetails = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_FillDetails'))
			
			Mobile.verifyMatch(label_FillDetails, 'Fill in the details below', true)
			
			String label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_PropertyNameUnit'))
			
			Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) + ' ') + '(') + UnitType) + ')')
			
			String label_PropertyPrice = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_PropertyPrice'))
			
			Mobile.verifyMatch(label_PropertyPrice, 'Property price', true)
			
			String label_Step2 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_Step2'))
			
			Mobile.verifyMatch(label_Step2, 'Step 2 of 6', true)
			
			String label_YourFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/label_YourFinancingAmount'))
			
			Mobile.verifyMatch(label_YourFinancingAmount, 'Your Financing Amount', true)
			
			String rad_Amount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/rad_Amount'))
			
			Mobile.verifyMatch(rad_Amount, 'Amount', true)
			
			String rad_Percentage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/rad_Percentage'))
			
			Mobile.verifyMatch(rad_Percentage, 'Percentage', true)
			
			Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/textBox_PropertyPrice'), GlobalVariable.Timeout)
			
			CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.enterMobileKeypadValue'(findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyPrice', GlobalVariable.RowNumber))
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/rad_Percentage'), GlobalVariable.Timeout)
			
			Mobile.delay(3)
			
			Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PriceAndDownpayment/textBox_Downpayment'), GlobalVariable.Timeout)
			
			Mobile.delay(2)
			
			CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.enterMobileKeypadValue'(findTestData(GlobalVariable.TestDataSheet_Name).getValue('DownpaymentPercentage', GlobalVariable.RowNumber))
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_KeypadContinue'), GlobalVariable.Timeout)
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Continue'), GlobalVariable.Timeout)

//*********************************************************************************************************************************
Mobile.comment('12-Period Tenure Screen')

			Mobile.comment('Buffer Financing Amount')
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
			
			Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
			
			Mobile.takeScreenshot()
			
			String label_FinancingPeriod = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_FinancingPeriod'))
			
			Mobile.verifyEqual(label_FinancingPeriod, 'How long would you like your financing period to be?')
			
			String label_MaxTenure = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_MaxTenure'))
			
			Mobile.verifyMatch(label_MaxTenure, '35 years', true)
			
			String label_MinTenure = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_MinTenure'))
			
			Mobile.verifyMatch(label_MinTenure, '5 years', true)
			
			label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_PropertyNameUnit'))
			
			Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) + ' ') + '(') + UnitType) + ')')
			
			// Select tenure
			
			CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.setSliderValue_ForYear'(35)
			
			String label_SelectedTenure = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_SelectedTenure'))
			
			Mobile.verifyMatch(label_SelectedTenure, '35 years', true)
			
			
			String label_Step3 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_Step3'))
			
			Mobile.verifyMatch(label_Step3, 'Step 3 of 6', true)
			
			label_YourFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/label_YourFinancingAmount'))
			
			Mobile.verifyMatch(label_YourFinancingAmount, 'Your Financing Amount', true)
			
			String FinancingAmount
			
			FinancingAmount = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PeriodTenure/txt_FinancingAmount_AfterCalculation'), GlobalVariable.Timeout)
			
			Mobile.delay(2)
			
			Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Continue'), GlobalVariable.Timeout)
			
			Mobile.delay(2)