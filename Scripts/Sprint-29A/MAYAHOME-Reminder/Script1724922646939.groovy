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

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/01_TapOnSendRentalReminders'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/02_VerifyText - Send  Request'),
	'Send & Request')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3718364291174158278.png')
Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/03_VerifyText- PENDING'), 'PENDING')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/04_VerifyText - PAST'), 'PAST')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/05_VerifyText - FAVOURITES'),
	'FAVOURITES')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/06_TapOn- RequestMoney'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/07_VerifyText - Send  Request'),
	'Send & Request')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6936114428350759198.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/08_TapOn - Tejaswi MBB'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/09_VerifyText - Enter amount'),
	'Enter amount')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/10_TapOn- 1'), 0)

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/11_TapOn - 0'), 0)

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/12_TapOnCheck'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/13_VerifyText - Youre requestingmoney from'),
	'You\'re requesting\nmoney from')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2437597874482545503.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/14_TapOn - Optional'), 0)

Mobile.setText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/15_SetText - Optional'), 'Automation Test',
	0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4046962728568291937.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/16_TapOnSendRequest'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/17_VerifyText- Request successful'),
	'Request successful')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1837254171846270189.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-Reminder/18_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6936114428350759198.png')
Mobile.takeScreenshot()

