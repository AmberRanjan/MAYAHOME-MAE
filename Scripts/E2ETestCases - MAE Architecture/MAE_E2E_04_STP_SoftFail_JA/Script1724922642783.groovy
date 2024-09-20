import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

GlobalVariable.TestDataSheet_Name = 'MAE_E2E_04_STP_SoftFail'
GlobalVariable.TestCase_Name = 'MAE_E2E_04_STP_SoftFail_JA'
GlobalVariable.RowNumber = 1

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_02_LoginApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_03_NavigatePropertyDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_04_AddPropertyDetails_Listed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_05_AddPersonalDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_06_Eligibility_Result'), [:], FailureHandling.STOP_ON_FAILURE)

//Joint Applicant Start 
 
WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_06A_EligibilityResult_Add_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_02_LoginApplication_NavigateDashboard_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_06B_EligibilityResult_Accept_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_09_FinancingApplication_Confirmation_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_10_FinancingApplication_Result_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_11_ViewApplication_JA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_02_LoginApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_03_NavigatePropertyDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Skip'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/SearchProperty/label_APPLICATION'), GlobalVariable.Timeout)

MobileBuiltInKeywords.scrollToText(findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber))
MobileBuiltInKeywords.scrollToText(findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyFinancingAmount', GlobalVariable.RowNumber))


Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ApplyNow'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ProceedwithApplication'), GlobalVariable.Timeout)

//Joint Applicant End

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_07_ApplyFinancing_EligibilityConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_07_STP_AddUnitNumber'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_08_ApplyFinancing_UpdateDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_08_STP_Select_FinancingTypeAndPlan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_09_FinancingApplication_Confirmation'), [:], FailureHandling.STOP_ON_FAILURE)
 
WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_10_FinancingApplication_Result'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_11_ViewApplication'), [:], FailureHandling.STOP_ON_FAILURE)



