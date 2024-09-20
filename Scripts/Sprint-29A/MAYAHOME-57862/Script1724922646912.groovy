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

'Verify Text on the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/01_VerifyText - Quick Actions'), 
    'Quick Actions')

'Take screenshot of the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5312041597914950710.png')

Mobile.takeScreenshot()

'Swipe on the Quick actions section to get View All'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/02_SwipeQuickActionsSections'), 0)

'Take screenshot for the quick action section upon slide'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8744610650329306385.png')

Mobile.takeScreenshot()

'Tap on View All'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/03_TapOn - View All'), 0)

'Verify user is navigated inside View All screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/04_VerifyText - Apply'), 'Apply')

'Take screenshot once user is inside View All screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6251802572487061708.png')

Mobile.takeScreenshot()

'Tap on property'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/05_ToOn - Property'), 0)

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

'Scroll to property 2 tile from the list'
Mobile.scrollToText('property 2')

'Tap on property 2 tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/09_TapOn - property 2'), 0)

'Delay for 5 seconds'
Mobile.delay(5)

'Verify property name '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/10_VerifyText - property 2'), 'property 2')

'Take screenshot once user navigates inside selected property'
Mobile.takeScreenshot()

'Verify Property Name Header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/11_VerifyText_Property Name'), 
    'Property Name')

'Verify Property Name'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/12_VerifyText_property 2'), 'property 2')

'Verify Property Address title'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/13_VerifyText_Property Address'), 
    'Property Address')

'Verify Property Address'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/14_VerifyText_Unit 2, condo, B-10-03, 53000, Kuala Lumpur , WP Kuala Lumpur'), 
    'Unit 2, condo, B-10-03, 53000, Kuala Lumpur , WP Kuala Lumpur')

'Verify Property Value title'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/15_VerifyText_Estimated Property Value'), 
    'Estimated Property Value')

'Verify Maybank Islamic Financing'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/16_VerifyText_Maybank Islamic Financing'), 
    'Maybank Islamic Financing')

'Verify Maybank Islamic Financing account number'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/17_VerifyText_464016943643'), '464016943643')

'Verify Account Name header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/18_VerifyText_Account Name'), 'Account Name')

'Verify Account name'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/19_VerifyText_Maybank Islamic Financing'), 
    'Maybank Islamic Financing')

'Verify purchase price header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/20_VerifyText_Purchase Price'), 
    'Purchase Price')

'Verify Purchase Price'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/21_VerifyText_RM 500,000.00'), 
    'RM 500,000.00')

'Verify Outstanding balance header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/22_VerifyText_Outstanding Balance'), 
    'Outstanding Balance')

'Verify Outstanding balance '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/23_VerifyText_RM 100,000.00'), 
    'RM 100,000.00')

'Verify Profit Rate header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/24_VerifyText_Profit Rate'), 'Profit Rate')

'Verify profit rate'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/25_VerifyText_4.75'), '4.75%')

'Verify Monthly installment Text'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/26_VerifyText_Monthly Instalment'), 
    'Monthly Instalment')

'Verify Monthly installment'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/27_VerifyText_RM 50,000.00'), 'RM 50,000.00')

'Take screenshot for the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot728295555496503576.png')

Mobile.takeScreenshot()

'Tap on View More Details'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/28_TapOn_View More Details'), 0)

'Scroll down the screen'
Mobile.scrollToText('Additional information')

'Take screenshot after scrooling down the screen'
Mobile.takeScreenshot()

'Verify Text for Installment Due header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/29_VerifyText_Instalment Due'), 
    'Instalment Due')

'Verify Text for Payment Due Date header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/30_VerifyText_Payment Due Date'), 
    'Payment Due Date')

'Verify Text for Payment in Advance header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/31_VerifyText_Payment in Advance'), 
    'Payment in Advance')

'Verify Text for Payment Frequency header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/32_VerifyText_Payment Frequency'), 
    'Payment Frequency')

'Verify Text for Outstanding GPP header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/33_VerifyText_Outstanding GPP'), 
    'Outstanding GPP')

'Verify Text for Misc Charges header'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/34_VerifyText_Misc Charges'), 'Misc Charges')

'Get Installment Due Value'
def InsDue = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/35_GetText_InstallmentDue_RM 0.00'), 
    0)

'Get Payment Due Date Value'
def PayDue = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/36_GetTex_PaymentDueDatet_31 Oct 2023'), 
    0)

'Get Payment Advance details'
def PayAdv = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/37_GetText_PaymentInAdvance_RM 0.00'), 
    0)

'Get Payment frequency details'
def PayFre = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/38_GetText_PaymentFrequency_MONTHLY'), 
    0)

'Get Outstanding GPP details'
def OutGpp = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/39_GetText_OutstandingGPP_RM 100,000.00'), 
    0)

'Get Miscellaneous Charges Details'
def MisCha = Mobile.getText(findTestObject('Object Repository/MAE/Sprint-29A/MAYAHOME-57862/40_GetText_MiscCharge - RM 0.00'), 
    0)

