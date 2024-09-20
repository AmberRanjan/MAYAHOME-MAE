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


//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_03_BAU_HardFail'
//GlobalVariable.TestCase_Name = 'MAE_E2E_03_BAU_HardFail_JA'
//GlobalVariable.RowNumber = 1

AndroidDriver driver = MobileDriverFactory.getDriver()

//***************************************************************************************************************************
Mobile.takeScreenshot()

Mobile.comment('Navigate to Application')


Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_APPLICATION'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/label_PendingInvitation'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'PROPERTY']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Pending Invitation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Tap to view your joint application invitation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)



MobileBuiltInKeywords.scrollToText(findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber))
Mobile.delay(2)
MobileBuiltInKeywords.scrollToText(findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyFinancingAmount', GlobalVariable.RowNumber))

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyFinancingAmount', GlobalVariable.RowNumber)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)
//***************************************************************************************************************************
Mobile.takeScreenshot()
Mobile.comment('Application Validation')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home financing']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Name', GlobalVariable.RowNumber))+' invited you to be a joint applicant for '+ (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber))]),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View offer conditions.']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Additional financing of up to 10% for other mortgage related expenses.']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Effective profit rate']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Monthly instalment']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2)
//Financing Ammount Start
FinancingAmount_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_FinancingAmount_ResultPage'), GlobalVariable.Timeout)
PropertPrice_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_PropertyPrice_ResultPage'), GlobalVariable.Timeout)

String[] PropertPrice_ResultPage = PropertPrice_ResultPage.split(' ')

Mobile.verifyMatch(PropertPrice_ResultPage[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyPrice', GlobalVariable.RowNumber), true)

PropertPrice_ResultPage_Final = (PropertPrice_ResultPage[1]).replace(',', '')

println(PropertPrice_ResultPage_Final)

CalulatedDownpayment_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_Downpayment_ResultPage1'),GlobalVariable.Timeout)

String[] CalulatedDownpayment_ResultPage = CalulatedDownpayment_ResultPage.split(' ')

CalulatedDownpayment_ResultPage_Final = (CalulatedDownpayment_ResultPage[1]).replace(',', '')

println(CalulatedDownpayment_ResultPage_Final)

float CalculatedFinancingAmount = Float.parseFloat(PropertPrice_ResultPage_Final) - Float.parseFloat(CalulatedDownpayment_ResultPage_Final)

println(CalculatedFinancingAmount)

String[] FinancingAmount_ResultPage = FinancingAmount_ResultPage.split(' ')

FinancingAmount_ResultPage_Final = (FinancingAmount_ResultPage[1]).replace(',', '')

Mobile.verifyEqual(FinancingAmount_ResultPage_Final, CalculatedFinancingAmount) //Financing Ammount End

MobileBuiltInKeywords.scrollToText('Accept Invitation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property details']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber))]),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Accept Invitation']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Decline Invitation']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Accept Invitation']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
//***************************************************************************************************************************
Mobile.takeScreenshot() 
Mobile.comment('Application Confirmation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Before we proceed, kindly allow us to check your credit score and history']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

String label_Agreement = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/label_Agreement'))
Mobile.verifyEqual(label_Agreement,'I agree that my personal and business data may be processed by Maybank or Maybank\'s selected credit reporting agency in accordance with the Credit Reporting Agencies (CRA) Act 2020 and Central Bank of Malaysia Act 2009.')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Agree & Confirm']),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Agree & Confirm']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
//***************************************************************************************************************************

Mobile.takeScreenshot()
Mobile.comment('Add Personal Details')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please share with us your personal details']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 1 of 5']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Title']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Title'), findTestData(
	GlobalVariable.TestDataSheet_Name).getValue('Customer_Title', GlobalVariable.RowNumber))

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Resident Status']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_ResidentStatus'), findTestData(
	GlobalVariable.TestDataSheet_Name).getValue('Customer_ResidentStatus', GlobalVariable.RowNumber))
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Education']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Education'), findTestData(
	GlobalVariable.TestDataSheet_Name).getValue('Customer_Education', GlobalVariable.RowNumber))

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Marital Status']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_MaritalStatus'), findTestData(
	GlobalVariable.TestDataSheet_Name).getValue('Customer_MaritalStatus', GlobalVariable.RowNumber))

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Religion']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Religion'), findTestData(
	GlobalVariable.TestDataSheet_Name).getValue('Customer_Religion', GlobalVariable.RowNumber))
Mobile.delay(2)

MobileBuiltInKeywords.scrollToText('Employment business type')
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment status']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_EmploymentStatus1'),
	findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentStatus', GlobalVariable.RowNumber))

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment business type']),30, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_EmploymentBusinessType'),
	findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentBusinessType', GlobalVariable.RowNumber))



Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)

//***************************************************************************************************************************
Mobile.takeScreenshot()
Mobile.comment('Add Address Details')
 
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please check and confirm your current address']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 2 of 5']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Malaysia']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('State')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'My mailing address is the same as above']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)
Mobile.delay(2)
//***************************************************************************************************************************

 Mobile.comment('Add Employment Details')
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.takeScreenshot()
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),30, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please review and update your employment details']),30, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 3 of 5']),30,FailureHandling.CONTINUE_ON_FAILURE)
//*******************
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name of employer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/editBox_Employer'),0,FailureHandling.CONTINUE_ON_FAILURE)
driver.pressKey(new KeyEvent(AndroidKey.ENTER))
Mobile.delay(2)
//Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/editBox_Employer'),findTestData(GlobalVariable.TestDataSheet_Name).getValue('Employer', GlobalVariable.RowNumber),0)
//*******************
Mobile.delay(2)
 
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation Sector']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_KeypadContinue'),GlobalVariable.Timeout)


Mobile.delay(5)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_OccupationSector_JA'), 'Auto Parts Business')

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_Occupation'), 'Accountants')

Mobile.delay(2)
//*******************
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'How long have you worked here?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_Years'),GlobalVariable.Timeout)
MobileBuiltInKeywords.scrollToText('4 years')
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('EmplomentYears', GlobalVariable.RowNumber)]),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'),GlobalVariable.Timeout)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_Months'),GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('EmplomentMonths', GlobalVariable.RowNumber)]),
	30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'),GlobalVariable.Timeout)
Mobile.delay(2)
//*******************
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Source of income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_SourceOfIncome'), findTestData(
		GlobalVariable.TestDataSheet_Name).getValue('SourceOfIncome_Country', GlobalVariable.RowNumber))
//*******************
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)
Mobile.delay(2)

//***************************************************************************************************************************
 
Mobile.comment('Add Office address')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 4 of 5']),30,FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please review and update your office address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address line 3']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('State')
Mobile.delay(2)
Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'),GlobalVariable.Timeout)
Mobile.delay(2)
//***************************************************************************************************************************

Mobile.comment('Page Income and commitments ')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Joint application']),30, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 5 of 5']),30,FailureHandling.CONTINUE_ON_FAILURE)

String label_EnterDetailsOfMonthlyIncome = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_EnterDetailsOfMonthlyIncome'))

Mobile.verifyMatch(label_EnterDetailsOfMonthlyIncome, 'Enter details of your monthly income and financial commitments, if any', true)
Mobile.delay(2)
Mobile.takeScreenshot()

String label_FirstTmePurchasing = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_FirstTmePurchasing'))

Mobile.verifyEqual(label_FirstTmePurchasing, 'Is this your first time purchasing or owning a home?')

//String label_MonthlyGrossIncome = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_MonthlyGrossIncome'))

//Mobile.verifyMatch(label_MonthlyGrossIncome, 'Monthly Gross Income', true)

String label_NonBankCommitments = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_NonBankCommitments'))
Mobile.verifyMatch(label_NonBankCommitments,'Non-bank commitments', true)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Refers to financing that customer are currently servicing instalment or progressive interest/profit']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

String rad_FirstTimeHome_No = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_No'))

Mobile.verifyMatch(rad_FirstTimeHome_No, 'No', true)
Mobile.delay(2)
String rad_FirstTimeHome_Yes = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_Yes'))

Mobile.verifyMatch(rad_FirstTimeHome_Yes, 'Yes', true)

Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/txt_MonthlyGrossIncome'), GlobalVariable.Timeout)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.enterMobileKeypadValue'(findTestData(GlobalVariable.TestDataSheet_Name).getValue('MonthlyGrossIncome', GlobalVariable.RowNumber))

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_Yes'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_KeypadContinue'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)

Mobile.delay(5)

//***************************************************************************************************************************

Mobile.comment('Additional Information ')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Additional information required']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Are you purchasing more than one property at this moment?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Do you have any other pending applications for this property with other banks?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Declaration']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'I am/We are aware that margin of finance for third residential property is up to 70% of Open Market Value or Sale & Purchase Price - whichever is lower']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'I/We hereby acknowledge that the processing of my/our mortage loan/financing is based partly on this Declaration. I/We further confirm that this Declaration is true and accurate as regards to the purpose intended.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/chkMoreProperties_No'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/chkPendingApplications_No'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Agree & Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Agree & Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)

//***************************************************************************************************************************
 
 Mobile.comment('Terms and conditions ')

 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Terms & Conditions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Yes, I expressly agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'No, I do not agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Yes, I expressly agree to be contacted']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.delay(2)
 //link AccountTax and AttachedLink
 
 Mobile.comment('Self certification2')
 width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 0)
 print width
 height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 0)
 print height
  x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 'x', 0) as Integer
  print x
  y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_AccountTax_AttachedLink'), 'y', 0) as Integer
  print y
 
  Mobile.tapAtPosition((width-x),((height/2)+y+10))
  
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'FATCA / CRS self-certification']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)

 Mobile.delay(2)
 Mobile.comment('Self certification1')
 Mobile.tapAtPosition((width-5*x),((height/3.5)+y+10))
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'FATCA / CRS self-certification']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
 
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

 Mobile.comment('Privacy Statement')
  width = Mobile.getElementWidth(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 0)
  print width
  height = Mobile.getElementHeight(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 0)
  print height
   x = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 'x', 0) as Integer
   print x
   y = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/TermsAndConditions/lnk_PrivacyStatement'), 'y', 0) as Integer
   print y
   
   Mobile.tapAtPosition((width-3*x),((height/3.5)+y+10))
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
	
	Mobile.tapAtPosition((width-5*x),((height/2)+y+10))
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Product Disclosure Sheet']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_LinearLayout'), GlobalVariable.Timeout)
	Mobile.delay(2)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_AgreeConfirm'),GlobalVariable.Timeout)
 Mobile.delay(2)
Mobile.takeScreenshot()

