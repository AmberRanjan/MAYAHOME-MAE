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

WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_WithoutValidations'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Filter/Filter_Location/android.view.ViewGroup-Filter_Icon'),GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Varify_Location'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Varify_All States'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/Location_dropdown'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Selangor']), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/Select_States1'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Verify_Done'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/State_Done'), GlobalVariable.Timeout)
Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_All Areas'), 'All Areas')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllArea_Dropdown'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllArea_Dropdown'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_Search'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Balakong']), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bandar Kinrara Puchong']), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Select Areas1'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Select Areas2'), GlobalVariable.Timeout)
Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_Area Confirm'), 'Confirm')
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Area_Confirm'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Apply and Clear/Apply filter'), GlobalVariable.Timeout)
Mobile.takeScreenshot()










