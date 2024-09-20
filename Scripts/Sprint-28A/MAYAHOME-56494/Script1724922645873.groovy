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

'Verify user is on property details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/01_VerifyText - Property Name'), 
    'Property Name')

'Take screenshot for the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8679086711577206120.png')


'User tap on 3 dots'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/34_TapOn_3_dots'), 0)

'Take screenshot once the dropdown options options appear'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2311002483748438434.png')

Mobile.takeScreenshot()

'Tap on edit property'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/35_TapOn - Edit Property'), 0)

'Verify user navigated to Step 1'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/02_VerifyText - Step 1 of 2'), 
    'Step 1 of 2')

'Take screenshot once user navigated to Step 1'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4653206489038972252.png')

Mobile.takeScreenshot()

'Verify text for the property question'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/03_VerifyText - What do you want to call this property'), 
    'What do you want to call this property?')

'Scroll to text state'
Mobile.scrollToText('State')

'Verify once the screen is scrolled'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/14_VerifyText - CityTown'), 'City/Town')

'Take screenshot once the screen is scrolled'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot656447936997390825.png')

Mobile.takeScreenshot()

'Tap on continue'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/19_TapOnContinue'), 0)

'Verify once user is navigated to step 2'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/20_VerifyText - Step 2 of 2'), 
    'Step 2 of 2')

'Take screenshot once user navigated to step 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6838269840039389518.png')

Mobile.takeScreenshot()

'Tap on continue Continue button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/31_TapOnContinue'), 0)

'Take screenshot once user tap on continue button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6979515746855096337.png')

Mobile.takeScreenshot()

'Verify screen once user navigates to Loan detail screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/32_VerifyText - NewLoan1'), 'NewLoan1')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/33_VerifyText- Estimated Property Value'), 
    'Estimated Property Value')

'Take screenshot once user navigates to Loan detail screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3339256759452377873.png')

Mobile.takeScreenshot()

