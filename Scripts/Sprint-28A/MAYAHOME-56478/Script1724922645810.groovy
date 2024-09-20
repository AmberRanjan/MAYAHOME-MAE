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

//Mobile.startExistingApplication('com.maybank2u.life.uat')
/*
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/12_VerifyText- Quick Actions'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5153155985891939382.png')
Mobile.takeScreenshot()
*/
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/13_SwipeQuickActions'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8187476895269143446.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/14_TapOn - View All'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/15_VerifyText - Property'), 'Property')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1990845744603492744.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/16_TapOn- Property'), 0)

//----------------------------------------------Repeat Steps due to Defect 59767-----------------------------------------------
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/13_SwipeQuickActions'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8187476895269143446.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/14_TapOn - View All'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/15_VerifyText - Property'), 'Property')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1990845744603492744.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/16_TapOn- Property'), 0)

//-------------------------------------------------------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/01_VerifyText - Find your dream home'),
	'Find your dream home')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6382632693389915877.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/02_TapOnNext1'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/03_VerifyText - Check eligibility instantly'),
	'Check eligibility instantly')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4199213122032871051.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/04_TapOnNext2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/05_VerifyText - Fast home financing approval'),
	'Fast home financing approval')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8803896267005832252.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/06_TapOn_GetStaerted'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/07_VerifyText_ New Home2u feature'),
	'New Home2u feature')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/08_VerifyText - Now you can manage all your properties and tenants in one place'),
	'Now you can manage all your properties and tenants in one place.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4146051380517916809.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/09_TapOnCloseIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-56478/10_VerifyText - Homeu'), 'Home²u')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1177026620205427770.png')
Mobile.takeScreenshot()