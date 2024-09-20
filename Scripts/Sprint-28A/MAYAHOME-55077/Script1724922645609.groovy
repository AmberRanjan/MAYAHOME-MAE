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

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/01_VerifyText - Homeu'), 'Home²u')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6367622580253158957.png')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/02_TapOn - MyProperties'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/03_VerifyText - My Properties'), 
    'My Properties')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot438180269352333924.png')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/04_VerifyText- Welcome to your Property Dashboard'), 
    'Welcome to your Property Dashboard')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/05_VerifyText- Please add your properties to get started.You can add properties that are financed with other banks, or are fully paid off'), 
    'Please add your properties to get started.\n\nYou can add properties that are financed with other banks, or are fully paid off.')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55077/06_TapOnBackButton'), 0)

