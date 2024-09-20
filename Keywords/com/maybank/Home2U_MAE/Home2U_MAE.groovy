package com.maybank.Home2U_MAE
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

public class Home2U_MAE {

	/**
	 * Set Mobile Keypad value
	 */

	@Keyword
	def  enterMobileKeypadValue(def a){
		def ref = ""
		String max = a.length()-1
		int maxInt = Integer.valueOf(max)
		for(int i=0; i<= maxInt; i++){
			ref = a.substring(i, i+1 )
			switch (ref) {
				case "0":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 0') , 5);
					break;
				case "1":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 1') , 5);
					break;
				case "2":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 2') , 5);
					break;
				case "3":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 3') , 5);
					break;
				case "4":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 4') , 5);
					break;
				case "5":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 5') , 5);
					break;
				case "6":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 6') , 5);
					break;
				case "7":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 7') , 5);
					break;
				case "8":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 8') , 5);
					break;
				case "9":
					Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/MobileKeypadNumber/keypad_TextView - 9') , 5);
					break;

				default:
					break;
			}
		}
	}


	//*************************************************************************************************
	/**
	 * Select value from dropdown from Embedded List
	 */
	@Keyword
	def selectValueFromEmbeddedDropdown(TestObject dropdown ,String dropdownValue) {
		Mobile.tap(dropdown,2)
		Mobile.delay(1)
		Mobile.scrollToText(dropdownValue)
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/PersonalDetails/embedded_DropDownValue', [('text') : dropdownValue]), 5)
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_Done'), 0)
	}

	//*************************************************************************************************

	/**
	 * Set slider value
	 */

	@Keyword
	def  setSliderValue_ForYear (def noOfYears){

		//height = Mobile.getAttribute(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/tenure_35Years'), 'y', 0)
		int width = Mobile.getDeviceWidth()
		int maxsliderval = width - (width * 10/100)
		println(maxsliderval)
		int sliderlenghth = width - (width * 10/100)  - (width * 8/100)
		println(sliderlenghth)

		int year

		switch (noOfYears) {
			case "5":
				year = (sliderlenghth /6) *0 + (width * 11/100)
				break;
			case "10":
				year = (sliderlenghth /6) *1 + (width * 12/100)
				break;
			case "15":
				year = (sliderlenghth /6) *2 + (width * 11/100)
				break;
			case "20":
				year = (sliderlenghth /6) *3 + (width * 10/100)
				break;
			case "25":
				year = (sliderlenghth /6) *4 + (width * 10/100)
				break;
			case "30":
				year = (sliderlenghth /6) *5 + (width * 10/100)
				break;
			case "35":
				year = (sliderlenghth /6) *6 + (width * 10/100)
				break;
			default:
				break;
		}
		Mobile.swipe(maxsliderval,970,year,970)
	}
}
