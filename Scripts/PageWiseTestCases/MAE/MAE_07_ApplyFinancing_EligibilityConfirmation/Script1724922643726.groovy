import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_05_STP_Pass'

AndroidDriver driver = MobileDriverFactory.getDriver()

//********************************************************************************************************************************
Mobile.comment('17-Page_Apply_Financing')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please make sure your details are accurate before continuing.']),
	30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Apply Financing']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Eligibility details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property name']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Unit type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property price']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Downpayment']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Property Financing amount']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Title']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Resident status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Employment business type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Occupation']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Gross monthly income']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Marital status']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Religion']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Is this your first time purchasing or owning a home?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Edit']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Edit']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Edit details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your eligibility will be reassessed when you edit your details.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Cancel']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

String PropertyName_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_PropertyName_ApplyFinancingScreen'))

Mobile.verifyMatch(PropertyName_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', 1), true)

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
String UnitType_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_UnitType_ApplyFinancingScreen'))

Mobile.verifyMatch(UnitType_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 1), false)
}

PropertyPrice_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_PropertyPrice_ApplyFinancingScreen'))

String[] PropertyPrice_ConfirmationScreen = PropertyPrice_ConfirmationScreen.split(' ')

Mobile.verifyMatch(PropertyPrice_ConfirmationScreen[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyPrice', 1), true)

//Financing Ammount Start
PropertyPrice_ConfirmationPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_PropertyPrice_ApplyFinancingScreen'), GlobalVariable.Timeout)

String[] PropertyPrice_ConfirmationPage = PropertyPrice_ConfirmationPage.split(' ')

Mobile.verifyMatch(PropertyPrice_ConfirmationPage[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyPrice', 1), true)

PropertyPrice_ConfirmationPage_Final = (PropertyPrice_ConfirmationPage[1]).replace(',', '')

println(PropertyPrice_ConfirmationPage_Final)

CalulatedDownpayment_ConfirmationPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_Downpayment_ApplyFinancingScreen'), 0)

String[] CalulatedDownpayment_ConfirmationPage = CalulatedDownpayment_ConfirmationPage.split(' ')

CalulatedDownpayment_ConfirmationPage_Final = (CalulatedDownpayment_ConfirmationPage[1]).replace(',', '')

println(CalulatedDownpayment_ConfirmationPage_Final)

float CalculatedFinancingAmount_ConfirmationPage = Float.parseFloat(PropertyPrice_ConfirmationPage_Final) - Float.parseFloat(CalulatedDownpayment_ConfirmationPage_Final)

println(CalculatedFinancingAmount_ConfirmationPage)

FinancingAmount_ConfirmationPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_FinancingAmount_ApplyFinancingScreen'), GlobalVariable.Timeout)

String[] FinancingAmount_ConfirmationPage = FinancingAmount_ConfirmationPage.split(' ')

FinancingAmount_ConfirmationPage_Final = (FinancingAmount_ConfirmationPage[1]).replace(',', '')

Mobile.verifyEqual(FinancingAmount_ConfirmationPage_Final, CalculatedFinancingAmount_ConfirmationPage)

//Financing Ammount End
//String FinancingPeriod_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue’(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_FinancingPeriod_ApplyFinancingScreen'))
//Mobile.verifyMatch(FinancingPeriod_ConfirmationScreen, PropertyPrice, true)

String Title_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_Title_ApplyFinancingScreen'))

Mobile.verifyMatch(Title_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_Title', 1), true)

Mobile.delay(2)

String ResidentStatus_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_ResidentStatus_ApplyFinancingScreen'))

Mobile.verifyMatch(ResidentStatus_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_ResidentStatus', 1), true)

String Education_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_Education_ApplyFinancingScreen'))

Mobile.verifyMatch(Education_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_Education', 1), false)

String EmploymentStatus_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_EmploymentStatus_ApplyFinancingScreen'))

Mobile.verifyMatch(EmploymentStatus_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentStatus', 1), true)

String EmplomentBusinessType_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_EmplomentBusinessType_ApplyFinancingScreen'))

Mobile.verifyMatch(EmplomentBusinessType_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentBusinessType', 1), true)

Mobile.delay(2)

String Occupation_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_Occupation_ApplyFinancingScreen'))

Mobile.verifyMatch(Occupation_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_Occupation', 1), true)

GrossMonthlyIncome_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_GrossMonthlyIncome_ApplyFinancingScreen'))

String[] GrossMonthlyIncome_ConfirmationScreen = GrossMonthlyIncome_ConfirmationScreen.split(' ')

Mobile.verifyMatch(GrossMonthlyIncome_ConfirmationScreen[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue('MonthlyGrossIncome', 1), true)

String MaritalStatus_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_MaritalStatus_ApplyFinancingScreen'))

Mobile.verifyMatch(MaritalStatus_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_MaritalStatus', 1), true)

String Religion_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_Religion_ApplyFinancingScreen'))

Mobile.verifyMatch(Religion_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_Religion', 1), true)

String FirstTimeHome_ConfirmationScreen = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/ApplyFinancing/txt_FirstTimeHome_ApplyFinancingScreen'))

Mobile.verifyMatch(FirstTimeHome_ConfirmationScreen, findTestData(GlobalVariable.TestDataSheet_Name).getValue('FirstTimeHome', 1), true)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Confirm'), 0)
Mobile.delay(2)
