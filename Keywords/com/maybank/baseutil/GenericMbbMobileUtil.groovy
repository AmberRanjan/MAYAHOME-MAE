package com.maybank.baseUtil
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil

import io.appium.java_client.MobileDriver
import io.appium.java_client.MobileElement
import internal.GlobalVariable as GlobalVariable

class GenericMbbMobileUtil {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 * 
	 */
	@Keyword
	def isElementPresent_Mobile(MobileTestObject to, int timeout) {
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			MobileElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}
	//*************************************************************************************************
	/**
	 * Checkif element present in timeout and enter value /text in that object
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */

	@Keyword
	def static enterValue( TestObject to, String value) {
		Mobile.verifyElementExist(to, GlobalVariable.timeOut)
		Mobile.sendKeys(to, value)
	}
	//*************************************************************************************************
	/**
	 * Select value from dropdown by passing value in search text
	 * @param Search picker, search text, result test object, search string 
	 * 
	 */

	@Keyword

	def selectValueFromSearch(MobileTestObject picker,MobileTestObject search,MobileTestObject searchText,String value){
		try {
			if (picker != null) {
				Mobile.tap(picker, GlobalVariable.timeOut)
				Mobile.sendKeys(search, value,GlobalVariable.timeOut)
				Mobile.tap(searchText, GlobalVariable.timeOut)
			}
			return true
		} catch (Exception e) {
		}
		return false
	}



	//*************************************************************************************************
	/**
	 * 
	 * @param to Katalon test object
	 * @param String value
	 * @return true if element present, otherwise false
	 * @description this function is used for selecting value from drop down
	 * 
	 */
	@Keyword
	def selectOptionFromDropdownByLabel(TestObject dropdown, String optionLabel) {
		Mobile.verifyElementExist(dropdown,GlobalVariable.timeOut)
		Mobile.selectListItemByLabel(dropdown, optionLabel,GlobalVariable.timeOut)
	}
	//*************************************************************************************************
	/**
	 * @param to Katalon test object
	 * @param index value in dropdown
	 * @return true if element present, otherwise false
	 * @description this function is used for selecting index value from drop down
	 * 
	 */
	@Keyword
	def selectValuefromDropdown(TestObject dropdown,int index){
		Mobile.verifyElementExist(dropdown,GlobalVariable.timeOut)
		Mobile.selectListItemByIndex(dropdown,index,GlobalVariable.timeOut)
	}
	//*************************************************************************************************
	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def MobileDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}

	//*************************************************************************************************

	/**
	 * Read text values
	 */
	@Keyword
	def getTextValue(TestObject textobject) {
		//Mobile.tap(textobject,0)
		String textvalue = Mobile.getText(textobject, 0)
		return textvalue
	}

	//*************************************************************************************************
}