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
Mobile.delay(2)
Mobile.takeScreenshot()
Mobile.scrollToText('Rooms & Carparks')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Rooms  Carparks'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedrooms'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedrooms_Any'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Rooms and Carparks/android.view.ViewGroup-Verify_Bedrooms Add'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedroom_Less'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms_Any'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/MAE/Validation/Filter/Rooms and Carparks/android.view.ViewGroup-BathRoom Add'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms_Less'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Carparks'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Carparks_Any'), GlobalVariable.Timeout)
Mobile.delay(2)
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Validation/Filter/Rooms and Carparks/android.view.ViewGroup- Add_CarParks'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_carparks_Less'), GlobalVariable.Timeout)