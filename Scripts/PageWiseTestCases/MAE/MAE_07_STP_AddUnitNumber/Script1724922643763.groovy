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
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_04_STP_SoftFail'
//GlobalVariable.TestCase_Name = 'MAE_E2E_04_STP_SoftFail'
//GlobalVariable.RowNumber = 1

AndroidDriver driver = MobileDriverFactory.getDriver()

//********************************************************************************************************************************
Mobile.comment('STP-Page_Add_Unit_Number')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 1 of 7']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)+' '+'('+findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitType",1)+')']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

label_UnitNumber = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/STP_UnitNumber/txt_WhatISUnitNumber'))
Mobile.verifyEqual(label_UnitNumber,'What\'s your unit number at')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)+'?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/STP_UnitNumber/editBox_UnitNumber'), GlobalVariable.Timeout)
Mobile.setText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/STP_UnitNumber/editBox_UnitNumber'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitNumber",1), GlobalVariable.Timeout)
driver.pressKey(new KeyEvent(AndroidKey.ENTER))

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_SaveNext'), GlobalVariable.Timeout)


//********************************************************************************************************************************
 Mobile.comment('STP-Page_Verify_Property_Owner')
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_PreviousPage_FrameLayout'), GlobalVariable.Timeout)
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Close'), GlobalVariable.Timeout)
 
 Mobile.takeScreenshot()
 
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Step 2 of 7']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
  
 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)+' '+'('+findTestData(GlobalVariable.TestDataSheet_Name).getValue("UnitType",1)+')']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
 
 
 
 if ((GlobalVariable.TestCase_Name == 'MAE_E2E_04_STP_SoftFail') || (GlobalVariable.TestCase_Name == 'MAE_E2E_05_STP_Pass')) {
 
		 Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Are you going to be the sole owner of '+  findTestData(GlobalVariable.TestDataSheet_Name).getValue("Property",1)+' ?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
			 
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Yes']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'No']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		 
		label_OfferMsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/STP_UnitNumber/txt_OfferMsg'))
		Mobile.verifyEqual(label_OfferMsg,'Your financing approval offer is only valid if you\'re the owner of the property.')
		
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/STP_UnitNumber/btn_Yes'), GlobalVariable.Timeout)

 } else
 {
String label_Ownermsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/txt_WhoIsOwner'))

//Mobile.verifyMatch(label_Ownermsg, 'Who\'s going to be the owner(s) of Eighty Five Avenue DNT?', true)

CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.selectValueFromEmbeddedDropdown'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/JointApplicant/dropdown_Owner'),'I am the sole owner')

Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ConfirmAndSubmit'), GlobalVariable.Timeout)

 }

 Mobile.delay(2)