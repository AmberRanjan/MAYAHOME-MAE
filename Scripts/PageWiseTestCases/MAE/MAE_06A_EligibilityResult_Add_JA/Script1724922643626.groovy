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
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'
//GlobalVariable.RowNumber = 1

AndroidDriver driver = MobileDriverFactory.getDriver()

//********************************************************************************************************************************
Mobile.comment('Eligibility Check')
	Mobile.delay(4)
	MobileBuiltInKeywords.scrollToText('Add a joint applicant')
	Mobile.delay(2)
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_AddJjointApplicant'), GlobalVariable.Timeout)

//********************************************************************************************************************************
 Mobile.comment('Add Joint Account details')
 
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 1 of 2']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Add joint applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Enter your joint applicant details']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(2)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ID type']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/dropdown_IDType'),
		findTestData(GlobalVariable.TestDataSheet_Name).getValue('JointApplicant_IDType', GlobalVariable.RowNumber))
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Name']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/txt_Name'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('JointApplicant_Name', GlobalVariable.RowNumber), 0)

	
	Mobile.delay(2)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'ID number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/txt_IDNumber'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('JointApplicant_IDNumber', GlobalVariable.RowNumber), 0)
	driver.pressKey(new KeyEvent(AndroidKey.ENTER))
	
	Mobile.delay(2)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Relationship']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/dropdown_Relationship'),
		findTestData(GlobalVariable.TestDataSheet_Name).getValue('JointApplicant_Relationship', GlobalVariable.RowNumber))
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Mobile number']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/txt_Mobilenumber'), findTestData(GlobalVariable.TestDataSheet_Name).getValue('JointApplicant_MobileNumber', GlobalVariable.RowNumber), 0)
	driver.pressKey(new KeyEvent(AndroidKey.ENTER))
	
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/btn_InviteJointApplicant'), GlobalVariable.Timeout)

//********************************************************************************************************************************
Mobile.comment('Joint Account Invitation sent')

MobileBuiltInKeywords.scrollToText('Invitation Sent')

	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Invitation Sent']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	//String label_InvitationMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/txt_InvitationMsg'))
	//Mobile.verifyMatch(label_InvitationMsg,'We\'ve let your joint applicant (Peter) know about your invitation through MAE app.', true)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Home Financing/-i Application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Date & time']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.takeScreenshot()

	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/btn_Done'), GlobalVariable.Timeout)

//********************************************************************************************************************************
	MobileBuiltInKeywords.scrollToText('Sales Representative')
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Your joint applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Tina']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Remind joint applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Remind joint applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Notify Joint Applicant']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'We will notify your joint applicant on their MAE by Maybank2u app. Make sure they have the latest version installed.']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Cancel']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Cancel']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(2)