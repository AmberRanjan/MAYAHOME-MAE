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
Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_Min Price'), 'Min Price')
Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_Any'), 'Any')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_MinPriceDropdown'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_MinPriceDropdown'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 200,000']), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice_select'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice_Done'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_Max Price'), GlobalVariable.Timeout)
Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_MaxPrice_Any'), 'Any')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_MaxPrice_dropdown'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/MaxPriceDropdown'), GlobalVariable.Timeout)
Mobile.scrollToText('RM 500,000')
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values', [('Max Price') : 'RM 500,000']), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/MaxPrice_ValueSelect'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Done'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/Verify SizeRange_Max Range'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/Verify_SizeRange_MaxRange_Any'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange_DropDown'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange_DropDown'), GlobalVariable.Timeout)
Mobile.scrollToText('1200 sqft.')
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values', [('Size Range Max Range') : '1200 sqft.']), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/Max Size Value Select'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange Done'), GlobalVariable.Timeout)
Mobile.scrollToText('Preferred Developer')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_Preferred Developer'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_All Developers'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred developer_DropDown'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred developer_DropDown'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_Select Developer'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_Developer_Search'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/All Developers dropdown Values', [('All Developers') : 'a']), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Select Preferred Developer'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred Devaloper_Confirm'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred Devaloper_Confirm'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Apply and Clear/Verify_Apply Filters'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)
Mobile.tap(findTestObject('MAE/Validation/Filter/Apply and Clear/Apply filter'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.delay(2)






