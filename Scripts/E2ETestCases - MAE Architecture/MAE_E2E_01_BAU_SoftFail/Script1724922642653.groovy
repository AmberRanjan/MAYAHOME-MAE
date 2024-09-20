import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'
GlobalVariable.TestCase_Name = 'MAE_E2E_01_BAU_SoftFail'
GlobalVariable.RowNumber = 1

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_02_LoginApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_03_NavigatePropertyDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_04_AddPropertyDetails_Listed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_05_AddPersonalDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_06_Eligibility_Result'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_07_ApplyFinancing_EligibilityConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_08_ApplyFinancing_UpdateDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_09_FinancingApplication_Confirmation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_10_FinancingApplication_Result'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_11_ViewApplication'), [:], FailureHandling.STOP_ON_FAILURE)