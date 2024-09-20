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

Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on property details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/01_VerifyText - Property Name'),
	'Property Name')

'Take screenshot for the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8679086711577206120.png')

Mobile.takeScreenshot()

'Tap on Get valuation'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56493/01_TapOn - Get Valuation'), 0)

'Verify Text stating Comming Soon'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/04_VerifyText - Coming Soon'),
	'Coming Soon')

'Verify text for the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/05_VerifyText- This feature is not available yet. We will let you know once it is ready'),
	'This feature is not available yet. We will let you know once it is ready.')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5585988229206996896.png')

Mobile.takeScreenshot()

'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/06_TapOnCloseIcon'), 0)

'Verify user is on property details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/01_VerifyText - Property Name'),
	'Property Name')

'Take screenshot for the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8679086711577206120.png')

Mobile.takeScreenshot()

'Tap on Get valuation'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56493/01_TapOn - Get Valuation'), 0)

'Verify Text stating Comming Soon'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/04_VerifyText - Coming Soon'),
	'Coming Soon')

'Verify text for the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/05_VerifyText- This feature is not available yet. We will let you know once it is ready'),
	'This feature is not available yet. We will let you know once it is ready.')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5585988229206996896.png')

Mobile.takeScreenshot()

'Tap on the Okay button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/07_TapOnOkayButton'), 0)


'Verify user is on property details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/01_VerifyText - Property Name'),
	'Property Name')

'Take screenshot for the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8679086711577206120.png')

Mobile.takeScreenshot()
