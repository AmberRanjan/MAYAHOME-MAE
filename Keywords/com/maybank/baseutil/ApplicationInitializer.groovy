package com.maybank.baseUtil

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable




public class ApplicationInitializer {

	def genericMobUtil = new GenericMbbMobileUtil();

	/**
	 * Launch MAE application
	 * @return
	 */
	@Keyword
	def startMAEApplication() {

		println('Installing App')
		String appPath1 = RunConfiguration.getProjectDir() + GlobalVariable.AppPathMAE
		Mobile.startApplication(appPath1, true)
	}

	/**
	 * Launch MAE application
	 * @return
	 */
	@Keyword
	def startSFApplication() {

		println('Installing App')
		String appPath1 = RunConfiguration.getProjectDir() + GlobalVariable.AppPathSF
		Mobile.startApplication(appPath1, true)
	}

	/**
	 * Launch already installed MAE application from device
	 * @return
	 */
	@Keyword
	def startExistingMAEApplication(){
		Mobile.startExistingApplication(GlobalVariable.PackageName, true)
	}

	/**
	 * login in digital wealth app using passed credenrtial
	 * @param usr is PFnumber 
	 * @param pwd is password
	 * @return
	 */

	@Keyword
	def login(String usr, String pwd) {

		genericMobUtil.enterValue(findTestObject('DigitalWealth/LoginPage/PFNumber1'), usr)

		genericMobUtil.enterValue(findTestObject('DigitalWealth/LoginPage/Password'), pwd)

		Mobile.verifyElementAttributeValue(findTestObject('DigitalWealth/LoginPage/LoginButton'), 'enabled', 'true', 10)

		Mobile.tap(findTestObject('DigitalWealth/LoginPage/LoginButton'), 0)
	}

	/**
	 * login in digital wealth app using passed credential
	 * @param usr is PFnumber
	 * @param pwd is password
	 * @param Login button object, User id object , password object
	 * @return
	 */

	@Keyword
	def login(TestObject userId, TestObject passwordId,TestObject loginId,String usr, String pwd) {

		genericMobUtil.enterValue(userId, usr)

		genericMobUtil.enterValue(passwordId, pwd)

		Mobile.verifyElementAttributeValue(loginId, 'enabled', 'true', 10)

		Mobile.tap(loginId, 0)
	}
}
