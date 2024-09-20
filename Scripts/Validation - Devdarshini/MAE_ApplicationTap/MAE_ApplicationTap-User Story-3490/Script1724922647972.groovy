import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_WithoutValidations'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Chat_Path/APPLICATION_Tap'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('MAE/Validation/Chat_Path/APPLICATION_Tap'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/Applicantion Tap/Applicant1/Applicant1_Group'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/BackArrow'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Dots'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Active_Status'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Applicant_Name'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Date and Day'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Status'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step1_Eligibilitychecking'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Eligiblity_MeaningText'), GlobalVariable.Timeout,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step2_Financingapplication'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step3_Financingacceptance'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step4_Legaldocumentation'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step5_Financingdisbursement'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step-1'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step-2'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step-3'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step-4'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Applicantion Tap/Applicant1_EligibityCheck/Step-5'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.scrollToText('Documents')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Apply Now']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(3)
Mobile.scrollToText('Sales Representative')
Mobile.delay(3)
Mobile.scrollToText('Sales Representative')
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Sales Representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
