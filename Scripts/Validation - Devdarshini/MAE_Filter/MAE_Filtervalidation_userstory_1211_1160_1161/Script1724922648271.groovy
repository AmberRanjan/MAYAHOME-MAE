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

//USERSTORY-1211 , USERSTORY-1160 , USERSTORY-1161

WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_Chat_No_ChatHistory'), [:], FailureHandling.STOP_ON_FAILURE)
//Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Filter/Filter_Location/android.view.ViewGroup-Filter_Icon'),GlobalVariable.Timeout)
 Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Varify_Location'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Varify_All States'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/Location_dropdown'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Kuala Lumpur']), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Selangor']), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Penang']),  GlobalVariable.Timeout)

Mobile.scrollToText('Johor')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Johor']),
	GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Kedah']),
	GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Kelantan']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Negeri Sembilan')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Melaka']),
	GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Negeri Sembilan']),
	GlobalVariable.Timeout)
Mobile.scrollToText('Sabah')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Perak']),
	GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Perlis']),
	GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Sabah']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Terengganu')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Sarawak']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Location Dropdown Values', [('City') : 'Terengganu']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Kuala Lumpur')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Verify_Done'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/Select_States'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Verify_Done'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_Location/State_Done'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_Location/Verify_Cancel'), GlobalVariable.Timeout)

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_All Areas'), 'All Areas')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllArea_Dropdown'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllArea_Dropdown'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_Search'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Ampang']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Ampang Hilir']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bandar Menjalara']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bandar Tasik Selatan']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bandar Tenggara']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bandar Tun Razak']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bangsar']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Bangsar South']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_AllAreas/AllAreas Dropdown values', [('Areas') : 'Batu']),
	GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Select Areas'), GlobalVariable.Timeout)

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Verify_Area Confirm'), 'Confirm')

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_AllAreas/Area_Confirm'), GlobalVariable.Timeout)

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_Price Range'), 'Price Range')

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_Min Price'), 'Min Price')

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_Any'), 'Any')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_MinPriceDropdown1'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Verify_MinPriceDropdown1'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 200,000']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 300,000']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 400,000')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 400,000']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 500,000']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 600,000']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 700,000']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 900,000')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 800,000']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 1 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 900,000']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 1 million']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 2 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 2 million']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 4 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 3 million']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 4 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 4 million']),
	GlobalVariable.Timeout)

Mobile.scrollToText('RM 5 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Dropdown Values', [('Min Price') : 'RM 5 million']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Any')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice Tap'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/MinPrice_Done'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_Max Price'),
	GlobalVariable.Timeout)

Mobile.verifyElementText(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_MaxPrice_Any'),
	'Any')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_MaxPrice_dropdown1'),
	GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Verify_MaxPrice_dropdown1'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 200,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 300,000']), GlobalVariable.Timeout)

Mobile.scrollToText('RM 400,000')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 400,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 500,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 600,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 700,000']), GlobalVariable.Timeout)

Mobile.scrollToText('RM 900,000')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 800,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 900,000']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 1 million']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 2 million']), GlobalVariable.Timeout)

Mobile.scrollToText('3 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 3 million']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 4 million']), GlobalVariable.Timeout)

Mobile.scrollToText('5 million')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Dropdown Values',
		[('Max Price') : 'RM 5 million']), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Select'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Max PriceRange/Max Price Done'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/Verify_Size Range'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/Verify SizeRange_Min Range'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/Verify SizeRange_MinRangeAny'),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_dropdown'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_dropdown'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '750 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('1500 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '1000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '1200 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '1500 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('2000 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '2000 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('4000 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '2500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '3000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '4000 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('10000 sqft.')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '5000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '7500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange_DropDown values',
		[('Size Range Min Range') : '10000 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('Any')

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange_MinRange Done'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/Verify SizeRange_Max Range'),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/Verify_SizeRange_MaxRange_Any'),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange_DropDown'),
	GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange_DropDown'),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '750 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('1500 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '1000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '1200 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '1500 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('4000 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '2000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '2500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '3000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '4000 sqft.']), GlobalVariable.Timeout)

Mobile.scrollToText('10000 sqft.')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '5000 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '7500 sqft.']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_Max PriceRange_DropDown values',
		[('Size Range Max Range') : '10000 sqft.']), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxPrice Select'),
	GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Filter_PriceRange/Filter_SizeRange/SizeRange Max PriceRange/SizeRange_MaxRange Done'),
	GlobalVariable.Timeout)

Mobile.scrollToText('Preferred Developer')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_Preferred Developer'),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_All Developers'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_All Developers'), GlobalVariable.Timeout)


Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Verify_Select Developer'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/All Developers dropdown Values',
		[('All Developers') : 'a']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/All Developers dropdown Values',
		[('All Developers') : 'AADD']), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/All Developers dropdown Values',
		[('All Developers') : 'ABC Sdn Bhd - Taman XYZ']), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Select Preferred Developer'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred Devaloper_Confirm'),
	GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Preferred Developer/Preferred Devaloper_Confirm'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Rooms  Carparks'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedrooms'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedrooms_Any'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Rooms and Carparks/android.widget.ImageView-BedRoom Plus'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bedroom_Less'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms_Any'), GlobalVariable.Timeout)


Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Bathrooms_Less'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Carparks'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Rooms and Carparks/Verify_Carparks_Any'), GlobalVariable.Timeout)


Mobile.tap(findTestObject('Object Repository/MAE/Validation/Filter/Rooms and Carparks/android.widget.ImageView-CarPark Plus'), GlobalVariable.Timeout)


Mobile.scrollToText('Property Type')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_Property Type'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Apartment']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Compact']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Condominium']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Ownership')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_Show all property types'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('MAE/Validation/Filter/Property Type/Verify_Show all property types'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Detached / Bungalow']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Factory']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Flat']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Office Lot']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Office Suites']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Others (Non-Building)']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Service Apartment')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Semi-detached']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Service Apartment']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Shop Lot']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Shophouse/Office')

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Shophouse/Office']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'SOFO  - Small Office Virtual Office']),
	GlobalVariable.Timeout)

Mobile.scrollToText('Warehouse')

Mobile.takeScreenshot()

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'SOHO - Small Office Home Office']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'SOVO - Small Office Virtual Office']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Terrace / Link']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Townhouse']),
	GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Property Type Values', [('Property Type') : 'Warehouse']),
	GlobalVariable.Timeout)
Mobile.scrollToText('Ownership')
Mobile.takeScreenshot()
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_Ownership'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_Freehold'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_Leasehold'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_FreeHold checkbox'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Property Type/Verify_leasehold_Checkbox'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Property Type/Verify_FreeHold checkbox'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Apply and Clear/Verify_Apply Filters'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('MAE/Validation/Filter/Apply and Clear/Verify_Clear Filters'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Filter/Apply and Clear/Apply filter'), GlobalVariable.Timeout)
Mobile.takeScreenshot()
Mobile.tap(findTestObject('MAE/Validation/Filter/Property Type/Backbutton'),  GlobalVariable.Timeout)