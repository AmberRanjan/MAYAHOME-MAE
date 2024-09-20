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

Mobile.scrollToText('464016943033')

'Take screenshot once user is scrolled to the desired property'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7184494696537549321.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/01_TapOn - 464016943033'), 0)

'Verify "Property Name" text '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/02_VerifyText - Property Name'),'Property Name')

'Take screenshot once user navigates inside loan'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5072184399407943205.png')
Mobile.takeScreenshot()

'Scroll to Tenants section'
Mobile.scrollToText('Tenants')

'Verify text stating Edit Tenants'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/19_VerifyText- Edit Tenants'),
	'Edit Tenants')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7775893924839724387.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/20_TapOn - Edit Tenants'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/21_VerifyText - Tenant(s)'),
	'Tenant(s)')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4096104430634157135.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/22_TapOnAddTenants'), 0)

'Verify once user is navigated to Step 1 of adding tenant screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/05_VerifyText - Step 1 of 2'),'Step 1 of 2')

'Take screenshot once user navigated to Step 1 of the tenant screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1436298220013934551.png')
Mobile.takeScreenshot()

'Tap on the back icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/12_TapOnBackIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/21_VerifyText - Tenant(s)'),
	'Tenant(s)')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4096104430634157135.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/02_TapOn - Teju'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/03_VerifyText- Tenant Details'),
	'Tenant Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4768670553081435241.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/04_TapOnEdit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/05_VerifyText - Step 1 of 2'),
	'Step 1 of 2')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6492368307791752262.png')
Mobile.takeScreenshot()

Mobile.clearText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/06_ClearText - Pls pay regularly'),
	0)

Mobile.setText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/07_SetText - e.g. renting master bedroom, rent includes utility bills, excludes management fee'),
	'Pay Regularly', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7059904511856348842.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/08_TapOnContinue'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/09_VerifyText - Step 2 of 2'),
	'Step 2 of 2')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2339228509349873033.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/10_TapOnContinue'), 0)

Mobile.delay(5)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5792484284051385791.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantEdit/11_TapOnBack'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/21_VerifyText - Tenant(s)'),
	'Tenant(s)')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4096104430634157135.png')
Mobile.takeScreenshot()
