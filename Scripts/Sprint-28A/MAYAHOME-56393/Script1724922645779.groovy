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

'Tap on Find Contractors'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/01_TapOn - Find Contractors'), 0)

'Verify user is navigated to Home Service screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot for the Home Service screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

'Verify Text "What service are you looking for?"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/03_VerifyText - What service are you looking for'), 
    'What service are you looking for?')

'Verify text "Interior Design"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/04_VerifyText - Interior Design'), 
    'Interior Design')

'Verify text "Designers thatll make your dream home a reality"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/05_VerifyText- Designers thatll make your dream home a reality'), 
    'Designers that\'ll make your dream home a reality')

'Verify text "Moving Services"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/06_VerifyText - Moving Services'), 
    'Moving Services')

'Verify text "Professional movers for your convenience"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/07_VerifyText- Professional movers for your convenience'), 
    'Professional movers for your convenience')

'Verify text "Renovation"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/08_VerifyText - Renovation'), 'Renovation')

'Verify text "The right contractors at the right price"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/09_VerifyText - The right contractors at the right price'), 
    'The right contractors at the right price')

//-----------------------------------------------------------Interior Design------------------------------------------------------------------------------
'Tap on Interior Design tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/10_VerifyText - Interior Design'), 0)

'Verify text "Comming soon"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot for the comming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/12_TapOnClose'), 0)

'Verify user is navigated back to the Home Services screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to the Home Services screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

'Tap on Interior Design tile again'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/10_VerifyText - Interior Design'), 0)

'Verify the pop-up text stating coming soon'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot of the coming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on Okay'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/13_TapOnOkay'), 0)

'Verify user is navigated back to Home Services screen upon tapping Okay'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to Home Service screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

//-----------------------------------------------------------Moving Services------------------------------------------------------------------------------
'Tap on Moving Services tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/14_TapOn - Moving Services'), 0)

'Verify text "Comming soon"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot for the comming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/12_TapOnClose'), 0)

'Verify user is navigated back to the Home Services screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to the Home Services screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

'Tap on Home Services tile again'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/14_TapOn - Moving Services'), 0)

'Verify the pop-up text stating coming soon'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot of the coming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on Okay'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/13_TapOnOkay'), 0)

'Verify user is navigated back to Home Services screen upon tapping Okay'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to Home Service screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

//-----------------------------------------------------------Renovation------------------------------------------------------------------------------
'Tap on Renovation tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/15_TapOn- Renovation'), 0)

'Verify text "Comming soon"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot for the comming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/12_TapOnClose'), 0)

'Verify user is navigated back to the Home Services screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to the Home Services screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

'Tap on Renovation tile again'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/15_TapOn- Renovation'), 0)

'Verify the pop-up text stating coming soon'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/11_VerifyText - Coming Soon'), 
    'Coming Soon')

'Take screenshot of the coming soon pop up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1289817533411287036.png')

Mobile.takeScreenshot()

'Tap on Okay'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/13_TapOnOkay'), 0)

'Verify user is navigated back to Home Services screen upon tapping Okay'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/02_VerifyText - Home Services'), 
    'Home Services')

'Take screenshot once user is navigated back to Home Service screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3301040353527943432.png')

Mobile.takeScreenshot()

'Tap on the back button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56393/16_TapOnBackIcon'), 0)