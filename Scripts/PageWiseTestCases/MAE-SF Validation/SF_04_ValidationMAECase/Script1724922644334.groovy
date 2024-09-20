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

Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//***************************************************************************************************************************
 Mobile.comment('3.Cases Validation - CM Home Finanacing')
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'CM Home Financing-i']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 STPId = Mobile.getText(findTestObject('Object Repository/SF/CaseDetails/txt_STP_ID'), 0)
 
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'CM Home Financing-i']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
//***************************************************************************************************************************
 Mobile.comment('Application Details - Main Screen')
 Mobile.verifyElementExist(findTestObject('Object Repository/SF/MortgageDashboard/btn_PreviousPage'),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Application Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eligibility']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 
 //***************************************************************************************************************************
  Mobile.comment('Application Details - Sub Screen - Personal Details')
  
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Personal Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Personal Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ID Type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'New IC']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Alternate ID Type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'N/A']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Religion']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_Religion', 1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Salutation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Salutation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment Status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment Status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Education']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Spouses\'s Gross Income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Phone Number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Email Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ID Number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Alternate ID Number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Customer Group']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Gender']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Business Type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Marital Status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 //***************************************************************************************************************************
  Mobile.comment('Application Details - Sub Screen - Home and Mailing Address')
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home and Mailing Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home and Mailing Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Mailing Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 //***************************************************************************************************************************
  Mobile.comment('Application Details - Sub Screen - Employment Details')
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation Sector']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name of Employer']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Duration of Service']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Office Country']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Office Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Office Contact Number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 //***************************************************************************************************************************
  Mobile.comment('Application Details - Sub Screen - Property Details')
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property Name/Address']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property Price']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unit Type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 //***************************************************************************************************************************
  Mobile.comment('Application Details - Sub Screen - Finanacing Details')
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Finanacing Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Finanacing Details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Income and commintemnt']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Additional Information']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eligibility Results']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 