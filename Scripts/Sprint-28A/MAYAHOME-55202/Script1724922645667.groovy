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

'Verify text for Home2U'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/01_VerifyText - Homeu'), 'Home²u')

'Take screenshot for the Home2U'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()

'Tap on My properties'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/02_TapOn - MyProperties'), 0)

'Verify once user navigated to My Properties screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/07_VerifyText- Property Listing'),
	'Property Listing')

'Take screenshot for My properties'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()

'Tap on Add Property'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/03_TapOn_AddProperty'), 0)

'Verify Text once user navigated inside Add property'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/04_VerifyText- Please select the loan for the property youd like to add to your dashboard'),
	'Please select the loan for the property you’d like to add to your dashboard.')

'Take screenshot for the Add property screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4368185928210919095.png')
Mobile.takeScreenshot()

Mobile.swipe(0, 400, 0, 0)

'Take screenshot once user scrolls down the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4368185928210919095.png')
Mobile.takeScreenshot()

'Tap on islamic account tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/05_TapOnIslamicTile- 4640 1694 3643'), 0)

'Take screenshot once the islamic tile is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot510475452436125170.png')
Mobile.takeScreenshot()

'Tap on continue to add account to the property list'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/06_TapOnContinue'), 0)

'Take screenshot upon taping continue button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8795400139789354120.png')
Mobile.takeScreenshot()

'Verify once user navigated to My Properties screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/07_VerifyText- Property Listing'),
	'Property Listing')

'Take screenshot for My properties'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()

Mobile.swipe(0, 400, 0, 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.scrollToText('464016943643')


'Tap on Add Property'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/03_TapOn_AddProperty'), 0)

'Verify Text once user navigated inside Add property'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/04_VerifyText- Please select the loan for the property youd like to add to your dashboard'),
	'Please select the loan for the property you’d like to add to your dashboard.')

'Take screenshot for the Add property screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4368185928210919095.png')
Mobile.takeScreenshot()

Mobile.swipe(0, 400, 0, 0)

'Take screenshot once user scrolls down the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4368185928210919095.png')
Mobile.takeScreenshot()

'Tap on islamic account tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/05_TapOnIslamicTile- 4640 1694 3643'), 0)

'Verify text stating the property a;ready added'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/08_VerifyText- You have already added this property to your property dashboard'),
	'You have already added this property to your property dashboard.')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4368185928210919095.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/09_TapOnBackButton'), 0)

Mobile.scrollToText('Property Listing')

'Verify once user navigated to My Properties screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/07_VerifyText- Property Listing'),
	'Property Listing')

'Take screenshot for My properties'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()
