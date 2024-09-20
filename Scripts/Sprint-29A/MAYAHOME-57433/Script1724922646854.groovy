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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify once user is on Property Listing screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/08_VerifyText - Property Listing'),
	'Property Listing')

'Take screenshot once user is on listing screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot174790197013281397.png')
Mobile.takeScreenshot()

'User taps on Add Property button present on the footer'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/01_TapOnAddProperty'), 0)

Mobile.delay(4)

'Verify once user navigates to the Add property screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/02_VerifyText - Add Property'),
	'Add Property')

'Take screenshot once the user is navigated to property screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4848932809111413657.png')
Mobile.takeScreenshot()

'Verify text stating "Property not listed"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/03_VerifyText - Property not listed'),
	'Property not listed?')

'Verify text stating "You can add properties that are financed with other banks or fully paid off."'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/04_VerifyText- You can add properties that are financed with other banks or fully paid off'),
	'You can add properties that are financed with other banks or fully paid off.')

'User tap on Add now hyperlink'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/05_TapOn - Add Now'), 0)

'Verify once user is navigated to Step 1 of the Manual property add flow'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/06_VerifyText - Step 1 of 2'),
	'Step 1 of 2')

'Take screenshot once user is navigated to Step 1 of the Manual property add flow'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot174790197013281397.png')
Mobile.takeScreenshot()

'Tap on back button to navigate back to Property listing screen'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57433/07_TapOnBackIcon'), 0)

'Verify once user is on Property Listing screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/08_VerifyText - Property Listing'),
	'Property Listing')

'Take screenshot once user is navigated back to property listing screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot174790197013281397.png')
Mobile.takeScreenshot()
