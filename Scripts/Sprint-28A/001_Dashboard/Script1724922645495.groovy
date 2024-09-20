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

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/01_Data Disclosure'), 'Data Disclosure')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5928454049482405773.png')
Mobile.takeScreenshot()
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/02_TapOnAgree'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/03_VerifyText- Your enhanced experienceis here'),
	'Your enhanced experience\nis here')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7837742849661036327.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/ApplicationInitialization/btn_Next'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/04_VerifyText - Your Maybank accounts at a glance'),
	'Your Maybank accounts at a glance')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot883107837338572320.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/05_TapNext2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/06_VerifyText - Pay  transfer on the go'),
	'Pay & transfer on the go')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4456442029173394034.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/07_TapOnNext3'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/08_VerifyText- Customise your apps first screen'),
	'Customise your app’s first screen')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8875392637938147495.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/09_TapOnNext4'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/10_VerifyText- Customise your Quick Actions'),
	'Customise your Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2724088473257108578.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/11_TapOnGotIt'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/001_Dashboard/12_VerifyText- Quick Actions'),
	'Quick Actions')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5153155985891939382.png')
Mobile.takeScreenshot()
