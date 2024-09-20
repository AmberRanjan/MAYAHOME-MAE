import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_05_STP_Pass'

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
/*

List elements = driver.findElementsByClassName('android.widget.TextView')
String productlist2=productList
println('The size of elements is ::' + elements.size())

int i=0
for (WebElement ele : elements) {
	String actual_DropDown_Value = ele.getText()	
	
	if(!(productlist2.contains(actual_DropDown_Value)))
	{
		println("Incorrect result "+actual_DropDown_Value)
	}
	i++;
}
*/

//*********************************************************************************************************************************
Mobile.comment('13-Page_Personal Details')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_PropertyNameUnit'))

Mobile.takeScreenshot()

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
    Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 
            GlobalVariable.RowNumber)) + ')')
} else {

	Mobile.verifyEqual(label_PropertyNameUnit, (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) ))
}

String label_SharePersonalDetails = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_SharePersonalDetails'))

Mobile.verifyMatch(label_SharePersonalDetails, 'Please share with us your personal details', true)
Mobile.delay(2)
String label_Step4 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_Step4'))

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyMatch(label_Step4, 'Step 4 of 6', true)
} else {
	Mobile.verifyMatch(label_Step4, 'Step 5 of 8', true)
}

String label_Title = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_Title'))

Mobile.verifyMatch(label_Title, 'Title', true)

String label_ResidentStatus = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_ResidentStatus'))

Mobile.verifyMatch(label_ResidentStatus, 'Resident Status', true)
Mobile.delay(2)
String label_Education = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_Education'))

Mobile.verifyMatch(label_Education, 'Education', true)

String label_MaritalStatus = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_MaritalStatus'))

Mobile.verifyMatch(label_MaritalStatus, 'Marital status', true)

String label_Religion = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_Religion'))

Mobile.verifyMatch(label_Religion, 'Religion', true)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Title'), findTestData(
       GlobalVariable.TestDataSheet_Name).getValue('Customer_Title', GlobalVariable.RowNumber))

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_ResidentStatus'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_ResidentStatus', GlobalVariable.RowNumber))
Mobile.delay(2)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Education'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_Education', GlobalVariable.RowNumber))

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_MaritalStatus'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_MaritalStatus', GlobalVariable.RowNumber))

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Religion'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_Religion', GlobalVariable.RowNumber))

MobileBuiltInKeywords.scrollToText('Occupation')
Mobile.delay(2)
String label_EmploymentBusinessType = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_EmploymentBusinessType'))

Mobile.verifyMatch(label_EmploymentBusinessType, 'Employment business type', true)

String label_EmploymentStatus = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_EmploymentStatus'))

Mobile.verifyMatch(label_EmploymentStatus, 'Employment status', true)

String label_Occupation = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/label_Occupation'))

Mobile.verifyMatch(label_Occupation, 'Occupation', true)
Mobile.delay(2)
CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_EmploymentStatus'), 
    findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentStatus', GlobalVariable.RowNumber))

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_EmploymentBusinessType'), 
    findTestData(GlobalVariable.TestDataSheet_Name).getValue('Customer_EmploymentBusinessType', GlobalVariable.RowNumber))

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDown_Occupation'), findTestData(
        GlobalVariable.TestDataSheet_Name).getValue('Customer_Occupation', GlobalVariable.RowNumber))
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)
Mobile.delay(2)
//*********************************************************************************************************************************
Mobile.comment('14-Page_Income and commitments')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

String label_EnterDetailsOfMonthlyIncome = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_EnterDetailsOfMonthlyIncome'))

Mobile.verifyMatch(label_EnterDetailsOfMonthlyIncome, 'Enter details of your monthly income and financial commitments, if any', true)

Mobile.takeScreenshot()

String label_FirstTmePurchasing = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_FirstTmePurchasing'))

Mobile.verifyEqual(label_FirstTmePurchasing, 'Is this your first time purchasing or owning a home?')

String label_MonthlyGrossIncome = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_MonthlyGrossIncome'))

Mobile.verifyMatch(label_MonthlyGrossIncome, 'Monthly Gross Income', true)

//String label_NonBankCommitments = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_NonBankCommitments'))
//Mobile.verifyMatch(label_NonBankCommitments,'Non-bank commitments', true)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Refers to financing that customer are currently servicing instalment or progressive interest/profit']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Enter your monthly non-bank commitments']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//label_PropertyNameUnit = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_PropertyNameUnit'))

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
    Mobile.verifyEqual(label_PropertyNameUnit, (((findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) + ' ') + '(') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('UnitType', 
            GlobalVariable.RowNumber)) + ')')
} else {

	Mobile.verifyEqual(label_PropertyNameUnit, (findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber) ))
}

String label_Step5 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/label_Step5'))
print(label_Step5)
if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyMatch(label_Step5, 'Step 5 of 6', true)
} else {
	Mobile.verifyMatch(label_Step5, 'Step 6 of 8', true)
}

String rad_FirstTimeHome_No = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_No'))

Mobile.verifyMatch(rad_FirstTimeHome_No, 'No', true)

String rad_FirstTimeHome_Yes = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_Yes'))

Mobile.verifyMatch(rad_FirstTimeHome_Yes, 'Yes', true)

Mobile.doubleTap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/txt_MonthlyGrossIncome'), GlobalVariable.Timeout)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.enterMobileKeypadValue'(findTestData(GlobalVariable.TestDataSheet_Name).getValue('MonthlyGrossIncome', GlobalVariable.RowNumber))

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/IncomeAndCommitment/rad_FirstTimeHome_Yes'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_KeypadContinue'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)

Mobile.delay(5)

//*********************************************************************************************************************************
Mobile.comment('15-Page_PF Input screen')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/EditText_StaffID'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

String label_SalesRepresentativeAssistance = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/label_SalesRepresentativeAssistance'))

Mobile.verifyEqual(label_SalesRepresentativeAssistance, 'Do you have a Maybank sales representative assisting you with the application?')

String label_StaffIDNumber = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/label_StaffIDNumber'))

Mobile.verifyMatch(label_StaffIDNumber, 'If yes, enter their staff ID number', true)

String label_Step6 = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/label_Step6'))

if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
Mobile.verifyMatch(label_Step6, 'Step 6 of 6', true)
} else {
	Mobile.verifyMatch(label_Step6, 'Step 7 of 8', true)
}


String rad_MobileSalesRepresentative_Yes = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/rad_MobileSalesRepresentative_Yes'))

Mobile.verifyMatch(rad_MobileSalesRepresentative_Yes, 'Yes', true)

String rad_MobileSalesRepresentative_No = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/rad_MobileSalesRepresentative_No'))

Mobile.verifyMatch(rad_MobileSalesRepresentative_No, 'No', true)

//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/rad_MobileSalesRepresentative_No'), GlobalVariable.Timeout)
//Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/rad_MobileSalesRepresentative_Yes'), GlobalVariable.Timeout)
Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PFInput/EditText_StaffID'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('StaffID', GlobalVariable.RowNumber), 0)

driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Confirm'), GlobalVariable.Timeout)

Mobile.delay(3)

//*********************************************************************************************************************************
Mobile.comment('15-Staff confirmation')


if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_06_BAU_Pass_NonListed') {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 6 of 6']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	} else {
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 7 of 8']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Check eligibility']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Please check and confirm the details of your sales representative']), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Staff name']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification',[('variable') :findTestData(GlobalVariable.TestDataSheet_Name).getValue("StaffName",GlobalVariable.RowNumber)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Staff ID number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue('StaffID', 
                GlobalVariable.RowNumber)]),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Edit']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Confirm'), GlobalVariable.Timeout)

