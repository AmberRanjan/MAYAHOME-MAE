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

'Verify once user navigated to My Properties screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55202/07_VerifyText- Property Listing'),
	'Property Listing')

'Take screenshot for My properties'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()

'Verify Text stating Purchase Price'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/01_VerifyText - Purchase Price'),
	'Purchase Price')

def val1 = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/02_GetText - RM 250,000.00'), 0)

'Verify Text stating Profit rate'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/06_VerifyText - Profit Rate'),
	'Profit Rate')

def pr = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/07_GetText - 4.75 p.a'), 0)

'Tap on loanless tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/03_TapOnLoanTile - loanless'), 0)

Mobile.delay(4)

'Verify Text stating loanless'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/05_VerifyText - loanless'), 'loanless')

'Take screenshot once user navigates inside property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3084051744548798501.png')
Mobile.takeScreenshot()

'Verify Text stating Purchase Price'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/08_VerifyText - Purchase Price'),
	'Purchase Price')

def val2 = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/04_GetText- RM 250,000.00'), 0)

'Verify Text stating Profit rate'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/09_VerifyText - Profit Rate'),
	'Profit Rate')

def pr2 = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55326/10_GetText - 4.75 p.a'), 0)

'Verify the loan amount match'
Mobile.verifyMatch(val1, val2, true, FailureHandling.STOP_ON_FAILURE)

'Verify the profit rate comparison'
Mobile.verifyMatch(pr, pr2, true, FailureHandling.STOP_ON_FAILURE)
