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
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/08_VerifyText - Property Listing'),'Property Listing')

'Scroll to Loan One tile from the list'
Mobile.scrollToText('464016943643')

'Tap on the loan tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/01_TapOnTile - 464016943643'), 0)

Mobile.delay(4)

'Take screenshot once the user is navigated inside the loan'
Mobile.takeScreenshot()

'Verify "Property Name" text '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/02_VerifyText - Property Name'),'Property Name')

'Take screenshot once user navigates inside loan'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5072184399407943205.png')
Mobile.takeScreenshot()

'Scroll to Tenants section'
Mobile.scrollToText('Tenants')

'Verify text stating Add Tenants'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/02_VerifyText- Add Tenants'),'Add Tenants')

'Tap on Add Tenants link'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/04_UserTapOn - Add Tenants'), 0)

'Verify once user is navigated to Step 1 of adding tenant screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/05_VerifyText - Step 1 of 2'),'Step 1 of 2')

'Take screenshot once user navigated to Step 1 of the tenant screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1436298220013934551.png')
Mobile.takeScreenshot()

'Verify text present on the step one of the Tenant details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/06_VerifyText- Tenant Details'),'Tenant Details')

'Verify text for the mobile number field'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/08_VerifyText - Mobile Number'),'Mobile Number')

'Tap on the "i" icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/09_TapOn_i_Icon'), 0)

'Verify text present on the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/10_VerifyText_PopUp - Mobile number'),'Mobile number')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6857302996704308000.png')
Mobile.takeScreenshot()

'Tap on the close icon present in the pop up'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/11_TapOnCloseIcon'), 0)

'Tap on the back icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/12_TapOnBackIcon'), 0)

'Verify user navigated back to loan details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/13_VerifyText- 464016943643'),'464016943643')

'Take screenshot when user navigated back to loan detail screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1616650319742096164.png')
Mobile.takeScreenshot()

'User tap on back button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/14_TapOnBack'), 0)

/*
'Scroll to loanless tile'
Mobile.scrollToText('loanless')

'Take screnshot once user scrolls screen to the loanless tile'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3406673962586312332.png')
Mobile.takeScreenshot()

'Tap on loanless tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/15_TapOn- loanless'), 0)

'Verify text stating Property Name'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/16_VerifyText- Property Name'),'Property Name')

'Verify text stating Additional Information'
Mobile.verifyElementNotExist(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/18_VerifyElementNotExist - Additional information'),0)

'Take screenshot once user navigated inside loanless tile'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot620853890874711671.png')
Mobile.takeScreenshot()

'User taps on back button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/17_TapOnBackIcon'), 0)

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

'Scroll to Loan One tile from the list'
Mobile.scrollToText('Loan One')

'Tap on the loan tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/01_TapOn - Loan One'), 0)

Mobile.delay(4)

'Take screenshot once the user is navigated inside the loan'
Mobile.takeScreenshot()

'Verify "Property Name" text '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57432/02_VerifyText - Property Name'),'Property Name')

'Take screenshot once user navigates inside loan'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5072184399407943205.png')
Mobile.takeScreenshot()

'Scroll to Tenants section'
Mobile.scrollToText('Tenants')

Mobile.delay(4)

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

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
'Tap on the back icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/12_TapOnBackIcon'), 0)

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/20_TapOn - Edit Tenants'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/21_VerifyText - Tenant(s)'),
	'Tenant(s)')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4096104430634157135.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/23_TapOn- Ancey'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/24_VerifyText - Tenant Details'),
	'Tenant Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1067453185605425566.png')

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/25_TapOnEditDetails'), 0)

'Verify once user is navigated to Step 1 of adding tenant screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/05_VerifyText - Step 1 of 2'),'Step 1 of 2')

'Take screenshot once user navigated to Step 1 of the tenant screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1436298220013934551.png')
Mobile.takeScreenshot()

'Tap on the back icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/12_TapOnBackIcon'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/24_VerifyText - Tenant Details'),
	'Tenant Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4096104430634157135.png')
Mobile.takeScreenshot()

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
'Tap on the back button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-TenantFeature/26_TapOnBack_fromOneTenant'), 0)


*/





























