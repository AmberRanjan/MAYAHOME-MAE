import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_04_STP_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
 Mobile.comment('25-Final Eligibility Check')
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
 
 Mobile.takeScreenshot()
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eligibility checking']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 

String EligibilityMessage = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/label_EligibilityMessage_JA'))
Mobile.verifyMatch(EligibilityMessage, 'You are eligible! We have informed your main applicant.', true)
		 		 
Mobile.takeScreenshot()
			 		 
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)		 
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing acceptance']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Legal documentation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing disbursement']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Active']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)	  

Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
				 
FinancingAmount__FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinancingAmount_FinalConfirmationPage'))
println(FinancingAmount__FinalEligibility)

String[] FinancingAmount__FinalEligibility = FinancingAmount__FinalEligibility.split(' ')
FinancingAmount__FinalEligibility1 = (FinancingAmount__FinalEligibility[1]).replace(',', '')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'You can get additional financing of up to 10% for other mortgage and related expenses']),GlobalVariable.Timeout,  FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Effective profit rate']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('Property price')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
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
				 
				 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View or manage documents for this application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

				 MobileBuiltInKeywords.scrollToText('Financing period')
				 
				String FinancingPeriod_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_FinancingPeriod_FinalConfirmationPage'))
				Mobile.verifyMatch(FinancingPeriod_FinalEligibility, findTestData(GlobalVariable.TestDataSheet_Name).getValue("FinancingPeriod",1), true)
			
				MobileBuiltInKeywords.scrollToText('Property price')
				
				 PropertyPrice_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_PropertyPrice_FinalConfirmationPage'))
				String[] PropertyPrice_FinalEligibility = PropertyPrice_FinalEligibility.split(' ')
				Mobile.verifyMatch(PropertyPrice_FinalEligibility[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1), true)
				
				
				 Downpayment_FinalEligibility = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/txt_Downpayment_FinalConfirmationPage'))
				
				String[] Downpayment_FinalEligibility = Downpayment_FinalEligibility.split(' ')
				Downpayment_FinalEligibility1 = (Downpayment_FinalEligibility[1]).replace(',', '')
				PropertyPrice = (findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1)).replace(',', '')
				
				float CalculatedFinancingAmount = Float.parseFloat(PropertyPrice) - Float.parseFloat(Downpayment_FinalEligibility1)

				Mobile.verifyEqual(CalculatedFinancingAmount, FinancingAmount__FinalEligibility1)	

				//*********************
MobileBuiltInKeywords.scrollToText('Sales Representative')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Sales Representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

String ContactSalesRepresentativeMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ViewApplication/label_ContactSalesRepresentativeMsg'))
Mobile.verifyEqual(ContactSalesRepresentativeMsg, 'We’re connecting you to a Maybank sales representative. They will be in contact with you with in an hour’s time.')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your main applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Name",1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.delay(2)

