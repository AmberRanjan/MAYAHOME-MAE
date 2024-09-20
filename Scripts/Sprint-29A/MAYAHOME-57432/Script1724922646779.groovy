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

'Verify Home2U text once user navigates inside property'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/06_VerifyText- Homeu'), 'Home²u')

'Take screenshot once user is navigated inside property'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7184494696537549321.png')

Mobile.takeScreenshot()

'Tap on My properties tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/07_TaoOn - MyProperties'), 0)

'Delay for 4 seconds'
Mobile.delay(4)

'Verify once user navigated to Property Listing screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/08_VerifyText - Property Listing'), 
    'Property Listing')

'Scroll to Loan One tile from the list'
Mobile.scrollToText('Loan One')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/01_TapOn - Loan One'), 0)

Mobile.delay(4)

'Verify "Property Name" text '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/02_VerifyText - Property Name'), 
    'Property Name')

'Take screenshot once user navigates inside loan'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5072184399407943205.png')
Mobile.takeScreenshot()

'Verify total tenure field '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/03_VerifyText - Total Loan Tenure'), 
    'Total Loan Tenure')

'Verify total tenure'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/04_VerifyText - 1 years'), '1 years')

'Tao on back'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/05_TapOnBack'), 0)

'Scroll to tile which are fully paid off'
Mobile.scrollToText('loanless')

'Take screenshot once scrolls to loanless tile'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7184494696537549321.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/06_TapOn - loanless'), 0)

'Delay for 4 seconds'
Mobile.delay(4)

'Take screenshot once the screen is navigated inside the cleared loan'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5072184399407943205.png')
Mobile.takeScreenshot()

'Verify if the loan field is not present once the loan is fullfilled'
Mobile.verifyElementNotExist(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/07_VerifyElementNotExist - Total Loan Tenure'), 
    0)

