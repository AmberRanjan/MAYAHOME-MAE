import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys
WebUI.callTestCase(findTestCase('PageWiseTestCases/MAE/MAE_01_ApplicationInitialization'), [:], FailureHandling.STOP_ON_FAILURE)
//Mobile.startExistingApplication('com.maybank2u.life.uat')
WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_WithoutValidations'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Search properties'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/BookMark/Search properties'), GlobalVariable.Timeout)
Mobile.delay(3)

Mobile.setText(findTestObject('MAE/Validation//BookMark/Search location'), 'Ampang', GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result1'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result1'), GlobalVariable.Timeout)

Mobile.scrollToText('Ayu Mulia Nam')
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result2'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result2'), GlobalVariable.Timeout)

Mobile.scrollToText('Selari Residence Satu')
Mobile.delay(3)
Mobile.scrollToText('Apartment')
Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result3'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result3'), GlobalVariable.Timeout)


Mobile.scrollToText('Mann Residence')
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result4'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result4'), GlobalVariable.Timeout)


Mobile.scrollToText('Viola Residence dont use this prop pls')
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result5'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result5'), GlobalVariable.Timeout)


Mobile.scrollToText('Scenario B1')
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/Bookmark Result6'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('MAE/Validation/BookMark/Bookmark Result6'), GlobalVariable.Timeout)


Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/BackTap_HomePage'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/BookMark/BackTap_HomePage'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/BookMark/BOOKMARK_Tap'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/BookMark/BOOKMARK_Tap'), GlobalVariable.Timeout)
