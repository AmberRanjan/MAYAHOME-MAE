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

'Tap on Add Property'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/01_TapOnAddProperty'), 0)

//---------------------------------------STEP 1----------------------------------------------------------------------------------------------------------------------------
'Verify user is on Step 1'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/02_VerifyText - Step 1 of 2'), 
    'Step 1 of 2')

'Take screenshot once user is on Step 1'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4653206489038972252.png')

Mobile.takeScreenshot()

'Verify text for "What do you want to call this property?"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/03_VerifyText - What do you want to call this property'), 
    'What do you want to call this property?')

'Set the Property name as NewLoan1'
Mobile.setText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/04_SetText_NewLoan1'), 'NewLoan1', 0)

'Verify the question asking "What is the intended use of this property?"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/05_VerifyText - What is the intended use of this property'), 
    'What is the intended use of this property?')

'Verify option "Investment"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/06_VerifyText- Investment'), 'Investment')

'Select the radio button stating "Investment"'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/07_TapOnInvestment'), 0)

'Verify the text asking for address'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/08_VerifyText - Address'), 'Address:')

'Set the address'
Mobile.setText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/09_SetText - e.g. Unit 1, Condo ABC,Jalan Happy 123'), 
    'Unit 1, Condo ABC, Jalan Happy 123', 0)

'Verify the Additional Address Details'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/10_VerifyText- Additional Address Details (Optional)'), 
    'Additional Address Details (Optional)')

'Set the additional address'
Mobile.setText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/11_SetText - e.g. B-10-03, Wisma ABC'), 'B-10-03, Wisma ABC', 
    0)

'Verify the text for the postcode'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/12_VerifyText- Postcode'), 'Postcode')

'Set the postcode'
Mobile.setText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/13_SetPostcode'), '53000', 0)

'Take screenshot post entering the postcode'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3569353967718160133.png')

Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.scrollToText('State')

'Verify the City/Town field'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/14_VerifyText - CityTown'), 'City/Town')

'Take screenshot once the screen is scrolled down'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot656447936997390825.png')

Mobile.takeScreenshot()

'Set the City/Town value '
Mobile.setText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/15_Set Text - e.g. Petaling Jaya'), 'Petaling Jaya', 
    0)

'Verify text for State'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/16_VerifyText- State'), 'State')

'Tap on State dropdown'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/17_TapOnDropdown'), 0)

'Take screenshot once the state dropdown appears'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1611732854761017128.png')

Mobile.takeScreenshot()

'Tap on Done'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/18_TapOn - Done'), 0)

'Take screenshot once the state is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4991714393578707316.png')

Mobile.takeScreenshot()

'Tap on continue button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/19_TapOnContinue'), 0)

//---------------------------------------STEP 2----------------------------------------------------------------------------------------------------------------------------
'Verify if user navigated to Step 2 successfully'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/20_VerifyText - Step 2 of 2'), 
    'Step 2 of 2')

'Take screenshot once user is navigated to Step 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6838269840039389518.png')

Mobile.takeScreenshot()

'Verify text asking "What is your purchase price?"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/21_VerifyText - What is your purchase price'), 
    'What is your purchase price?')

'Tap on "i" icon present next to the question'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/22_TapOn_i'), 0)

'Verify pop up title text'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/23_VerifyText - Purchase Price'), 
    'Purchase Price')

'Verify text present in the pop up body'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/24_VerifyText- The price you bought the property for. We recommend entering an accurate purchase price. You can edit the price later if needed'), 
    'The price you bought the property for. We recommend entering an accurate purchase price. You can edit the price later if needed.')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3037456680499611415.png')

Mobile.takeScreenshot()

'Tap on the close icon'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/25_TapOnClose'), 0)

/*
def otpArr = 500000

for (def i = 0; i < otpArr; i++) {
	if ((otpArr[i]) == '1') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/1 button'), 0)
	} else if ((otpArr[i]) == '2') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button'), 0)
	} else if ((otpArr[i]) == '3') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button'), 0)
	} else if ((otpArr[i]) == '4') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/4 button'), 0)
	} else if ((otpArr[i]) == '5') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/5 button'), 0)
	} else if ((otpArr[i]) == '6') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/6 button'), 0)
	} else if ((otpArr[i]) == '7') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/7 button'), 0)
	} else if ((otpArr[i]) == '8') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/8 button'), 0)
	} else if ((otpArr[i]) == '9') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/9 button'), 0)
	} else if ((otpArr[i]) == '0') {
		Mobile.tap(findTestObject('Object Repository/OTP buttons/0 button'), 0)
	}
}
*/
'Tap on the number 5 from the keypad'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/26_TapOn- 5'), 0)

'Enter zero 7 times to make the value RM 500,000.00'
for (int i = 0; i < 7; i++) {
    //Tap on Number 7 times
    Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/27_TapOn - 0'), 0)
}

'Tap on the check icon present in the keypad to set the amount successfully'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/30_TapOnCheck'), 0)

'Verify the title stating "Have you fully paid off your financing?"'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/28_VerifyText - Have you fully paid off your financing'), 
    'Have you fully paid off your financing?')

'Tap on Yes radio button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/29_TapOnYes'), 0)

'Take screenshot once the Yes Radio button is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3936693676796860526.png')

Mobile.takeScreenshot()

'Tap on Continue button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/31_TapOnContinue'), 0)

'Take screenshot upon tapping continue button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6979515746855096337.png')

Mobile.takeScreenshot()

Mobile.delay(3)
//---------------------------------------Property List----------------------------------------------------------------------------------------------------------------------------

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/50_VerifyText - Property Listing'),
	'Property Listing')

'Verify the Property name '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/51_VerifyText - NewLoan1'), 'NewLoan1')

'Take screenshot once the user is navigated to the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2855444986751618278.png')
Mobile.takeScreenshot()

'Tap on property tile'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/52_TapOnPropertyTile'), 0)

/*
'Verify the Property name '
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/32_VerifyText - NewLoan1'), 'NewLoan1')

Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/33_VerifyText- Estimated Property Value'), 
    'Estimated Property Value')

'Take screenshot once the user is navigated to the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3339256759452377873.png')

Mobile.takeScreenshot()
*/
//-------------------------------------Edit Property -----------------------------------------------------------------------------------------------------------------------------------
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

'User tap on the No radio button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/36_TapOn_NO'), 0)

'Take screenshot once user tap on No'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3531984626527946702.png')

'Tap on continue Continue button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/31_TapOnContinue'), 0)

'Take screenshot once user tap on continue button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6979515746855096337.png')

Mobile.takeScreenshot()

//---------------------------------------------Additional Information-----------------------------------------------------------------------------------------
'Verify Text once user is on Additional Information screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/37_VerifyText - Additional information required'), 
    'Additional information required')

'Take screenshot once the user is on Additional Information screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6863776385500649564.png')

Mobile.takeScreenshot()

'Verify the first question'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/38_VerifyText - Which bank is providing the loanfinancing'), 
    'Which bank is providing the loan/financing?')

'Tap on the dropdown to get the list of banks'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/39_TapOnBankDropdown'), 0)

'Scroll the list to RHB bank'
Mobile.scrollToText('RHB Bank')

'Tap on RHB bank to select the option'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/40_Select - RHB BANK'), 0)

'Take screenshot once the RHB bank is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1466028137723801699.png')

Mobile.takeScreenshot()

'Tap on Done to confirm the bank selection'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/41_TapOnDone'), 0)

'Take screenshot once the bank has been selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3977916962359497938.png')

Mobile.takeScreenshot()

'Verify second question asking for the loan finance amount'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/42_VerifyText - What is your loanfinancing amount'), 
    'What is your loan/financing amount?')

'Tap on the amount field'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/43_TapOn - RM'), 0)

'Tap on the number 4 from the keypad'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/44_TapOn- 4'), 0)

'Tap on the number 5 from the keypad'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/26_TapOn- 5'), 0)

'Enter zero 6 times to make the value RM 450,000.00'
for (int i = 0; i < 6; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/27_TapOn - 0'), 0)
}

'Tap on the check icon present in the keypad to set the amount successfully'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/30_TapOnCheck'), 0)

'Take screenshot once the amount has been selected'
Mobile.takeScreenshot()

'Verify third question asking for the interest rate'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/45_VerifyText - What is the interestprofit rate per annum'), 
    'What is the interest/profit rate per annum?')

'Tap on the field to enter the value'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/46_TapOnInterest - 0.0'), 0)

for (int i = 0; i < 2; i++) {
    //Tap on Number 3 two times
    Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/47_TapOn - 3'), 0)
}

Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/27_TapOn - 0'), 0)

'Tap on the check icon present in the keypad to set the amount successfully'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/30_TapOnCheck'), 0)

'Take screenshot once the amount is set successfully'
Mobile.takeScreenshot()

'Tap on monthly installment field'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/48_TapOn - RM'), 0)

'Tap on the number 5 from the keypad'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/26_TapOn- 5'), 0)

'Enter zero 5 times to make the value RM 5,000.00'
for (int i = 0; i < 5; i++) {
    //Tap on Number 6 times
    Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/27_TapOn - 0'), 0)
}

'Tap on the check icon present in the keypad to set the amount successfully'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/30_TapOnCheck'), 0)

'Take screenshot once the monthly installment field is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2438306271680329692.png')

Mobile.takeScreenshot()

'Tap on the continue button'
Mobile.tap(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55212/49_TapOnContinue'), 0)

'Take screenshot once the user is navigated to another screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2438306271680329692.png')

Mobile.takeScreenshot()

'Verify user is on property details screen'
Mobile.verifyElementText(findTestObject('Object Repository/MAE/Sprint-28A/MAYAHOME-55991/01_VerifyText - Property Name'),
	'Property Name')

'Take screenshot for the property details screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8679086711577206120.png')

Mobile.takeScreenshot()