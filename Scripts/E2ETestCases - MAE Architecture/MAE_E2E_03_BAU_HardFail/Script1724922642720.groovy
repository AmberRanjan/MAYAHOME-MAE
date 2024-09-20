import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

GlobalVariable.TestDataSheet_Name = 'MAE_E2E_03_BAU_HardFail'
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