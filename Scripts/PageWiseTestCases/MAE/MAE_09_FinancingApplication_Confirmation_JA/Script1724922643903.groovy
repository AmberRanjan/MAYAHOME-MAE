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

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
Mobile.comment('Confirmation')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.comment('Property/Personal Details')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please check and confirm the details below before you submit your application.']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

MobileBuiltInKeywords.scrollToText('Property name')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property name']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unit type']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

MobileBuiltInKeywords.scrollToText('Property financing amount')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property financing amount']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************
MobileBuiltInKeywords.scrollToText('Title')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Personal details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Title']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Resident status']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment status']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment business type']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Gross monthly income']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Marital status']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Religion']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Is this your first time purchasing or owning a home?']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Edit']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************
Mobile.takeScreenshot()

Mobile.comment('Contact Details')
MobileBuiltInKeywords.scrollToText('Home address line 1')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home address line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
MobileBuiltInKeywords.scrollToText('Same as mailing address?')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Same as mailing address?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************
Mobile.takeScreenshot()

Mobile.comment('Employment Details')
MobileBuiltInKeywords.scrollToText('Name of employer')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name of employer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
MobileBuiltInKeywords.scrollToText('Occupation sector')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation sector']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Duration of service']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
MobileBuiltInKeywords.scrollToText('Source of income')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Source of income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************
Mobile.takeScreenshot()

Mobile.comment('Office address')
MobileBuiltInKeywords.scrollToText('Contact number')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Office address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address line 1']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Address line 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'City']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Postcode']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'State']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Contact number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//***************************************************************************************************************************

MobileBuiltInKeywords.scrollToText('Property name')
Mobile.takeScreenshot()
String PropertyName_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_PropertyName_ConfirmationScreen_JA'))
println(PropertyName_ConfirmationScreen_1)
Mobile.verifyMatch(PropertyName_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1), true)

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
String UnitType_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_UnitType_ConfirmationScreen_JA'))

Mobile.verifyMatch(UnitType_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitType",1), false)
}

PropertyPrice_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_PropertyPrice_ConfirmationScreen_JA'))

String[] PropertyPrice_ConfirmationScreen_Final1 = PropertyPrice_ConfirmationScreen_1.split(' ')

Mobile.verifyMatch(PropertyPrice_ConfirmationScreen_Final1[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1), true)

//Financing Ammount Start
PropertyPrice_ConfirmationPage_1 = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_PropertyPrice_ConfirmationScreen_JA'), 
    GlobalVariable.Timeout)

String[] PropertyPrice_ConfirmationPage_1 = PropertyPrice_ConfirmationPage_1.split(' ')

Mobile.verifyMatch(PropertyPrice_ConfirmationPage_1[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("PropertyPrice",1), true)

PropertyPrice_ConfirmationPage_Final1 = (PropertyPrice_ConfirmationPage_1[1]).replace(',', '')

println(PropertyPrice_ConfirmationPage_Final1)


CalulatedDownpayment_ConfirmationPage_1 = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_Downpayment_ConfirmationScreen'),
	0)


String[] CalulatedDownpayment_ConfirmationPage_1 = CalulatedDownpayment_ConfirmationPage_1.split(' ')

CalulatedDownpayment_ConfirmationPage_Final1 = (CalulatedDownpayment_ConfirmationPage_1[1]).replace(',', '')

println(CalulatedDownpayment_ConfirmationPage_Final1)

float CalculatedFinancingAmount_ConfirmationPage_Final1 = Float.parseFloat(PropertyPrice_ConfirmationPage_Final1) - Float.parseFloat(
    CalulatedDownpayment_ConfirmationPage_Final1)

println(CalculatedFinancingAmount_ConfirmationPage_Final1)
MobileBuiltInKeywords.scrollToText('Property financing amount')
FinancingAmount_ConfirmationPage_1 = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_FinancingAmount_ConfirmationScreen_JA'), 
    GlobalVariable.Timeout)

String[] FinancingAmount_ConfirmationPage_Final1 = FinancingAmount_ConfirmationPage_1.split(' ')

FinancingAmount_ConfirmationPage_1 = (FinancingAmount_ConfirmationPage_Final1[1]).replace(',', '')

Mobile.verifyEqual(FinancingAmount_ConfirmationPage_1, CalculatedFinancingAmount_ConfirmationPage_Final1)

//Financing Ammount End

//String FinancingPeriod_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue’(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_FinancingPeriod_ApplyFinancingScreen'))
//Mobile.verifyMatch(FinancingPeriod_ConfirmationScreen, PropertyPrice, true)

MobileBuiltInKeywords.scrollToText('Title')

String Title_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_Title_ConfirmationScreen_JA'))

Mobile.verifyMatch(Title_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_Title",1), true)

Mobile.delay(2)

String ResidentStatus_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_ResidentStatus_ConfirmationScreen_JA'))

Mobile.verifyMatch(ResidentStatus_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_ResidentStatus",1), true)

//String Education_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
 //       'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_Education_ConfirmationScreen',[('value'):findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_Education",1)]))

//Mobile.verifyMatch(Education_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_Education",1), false)

String EmploymentStatus_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_EmploymentStatus_ConfirmationScreen_JA'))

Mobile.verifyMatch(EmploymentStatus_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_EmploymentStatus",1), true)

String EmplomentBusinessType_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(
    findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_EmplomentBusinessType_ConfirmationScreen_JA'))

Mobile.verifyMatch(EmplomentBusinessType_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_EmploymentBusinessType",1), true)

Mobile.delay(2)
//**********************************
//String Occupation_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
  //      'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_Occupation_ConfirmationScreen'))
//print(Occupation_ConfirmationScreen_1)

//Mobile.verifyMatch(Occupation_ConfirmationScreen_1[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("OccupationSector",1), true)
//**************************
GrossMonthlyIncome_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_GrossMonthlyIncome_ConfirmationScreen_JA'))

String[] GrossMonthlyIncome_ConfirmationScreen_1 = GrossMonthlyIncome_ConfirmationScreen_1.split(' ')

Mobile.verifyMatch(GrossMonthlyIncome_ConfirmationScreen_1[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue("MonthlyGrossIncome",1), true)

String MaritalStatus_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_MaritalStatus_ConfirmationScreen_JA'))

Mobile.verifyMatch(MaritalStatus_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_MaritalStatus",1), true)

String Religion_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_Religion_ConfirmationScreen'))

Mobile.verifyMatch(Religion_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("Customer_Religion",1), true)

String FirstTimeHome_ConfirmationScreen_1 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject(
        'Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/txt_FirstTimeHome_ConfirmationScreen'))

Mobile.verifyMatch(FirstTimeHome_ConfirmationScreen_1, findTestData(GlobalVariable.TestDataSheet_Name).getValue("FirstTimeHome",1), true)

MobileBuiltInKeywords.scrollToText('Source of income')

String EmploymentDetails_SourceOfIncome_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/EmploymentDetails/txt_EmploymentDetails_SourceOfIncome'))

Mobile.verifyMatch(EmploymentDetails_SourceOfIncome_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue("SourceOfIncome_Country",1), true)

//******************************************
String EmploymentDetails_OccupationSector_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/EmploymentDetails/txt_EmploymentDetails_OccupationSector_JA'))

//Before Change Occupation
Mobile.verifyMatch(EmploymentDetails_OccupationSector_ConfirmationScreen, 'Auto Parts Business', true)

//After change Occupation
//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/ConfirmationScreen/btn_Edit_EmploymentDetails_Confirmation'), 0)

//Mobile.delay(3)
//CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/EmploymentDetails/dropDown_OccupationSector'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('OccupationSector', 1))

//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Confirm'), 0)
//Mobile.delay(2)

//MobileBuiltInKeywords.scrollToText('Occupation sector')

//String EmploymentDetails_OccupationSector_ConfirmationScreen_after = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/EmploymentDetails/txt_EmploymentDetails_OccupationSector_JA'))
//Mobile.verifyMatch(EmploymentDetails_OccupationSector_ConfirmationScreen_after, findTestData(GlobalVariable.TestDataSheet_Name).getValue("OccupationSector",1), true)

//******************************************

//String EmploymentDetails_Employer_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/EmploymentDetails/txt_EmploymentDetails_Employer'))
//Mobile.verifyMatch(EmploymentDetails_Employer_ConfirmationScreen, Employer, true)

String EmploymentDetails_DurationOfService_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/EmploymentDetails/txt_EmploymentDetails_DurationOfService_JA'))

DurationOfService = ((findTestData(GlobalVariable.TestDataSheet_Name).getValue("EmplomentYears",1) + ' ') + findTestData(GlobalVariable.TestDataSheet_Name).getValue("EmplomentMonths",1))

println(DurationOfService)

Mobile.verifyMatch(EmploymentDetails_DurationOfService_ConfirmationScreen, DurationOfService, true)

MobileBuiltInKeywords.scrollToText('Contact Number')
String OfficeAddress_PostCode_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/PersonalDetails/txt_OfficeAddress_PostCode_JA'))
Mobile.verifyMatch(OfficeAddress_PostCode_ConfirmationScreen, '50000', true)
String OfficeAddress_Country_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Confirmation/PersonalDetails/txt_OfficeAddress_Country_JA'))
Mobile.verifyMatch(OfficeAddress_Country_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue("SourceOfIncome_Country",1), true)

MobileBuiltInKeywords.scrollToText('Agree & Confirm')
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_AgreeConfirm'), 0)
Mobile.delay(2)
