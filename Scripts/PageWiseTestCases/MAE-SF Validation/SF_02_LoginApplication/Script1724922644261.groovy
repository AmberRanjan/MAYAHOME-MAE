import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData


Mobile.startExistingApplication('com.maybank2u.salesforce.uatent')
GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'

AndroidDriver driver = MobileDriverFactory.getDriver()

//***************************************************************************************************************************

Mobile.comment('1.Login SF')

driver.activateApp('com.maybank2u.salesforce.uatent')
Mobile.tap(findTestObject('Object Repository/SF/ApplicationLogin/editBox_UserName'), GlobalVariable.Timeout)
Mobile.setText(findTestObject('Object Repository/SF/ApplicationLogin/editBox_UserName'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("SFUserName",1), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/SF/ApplicationLogin/editBox_Password'), GlobalVariable.Timeout)
Mobile.setText(findTestObject('Object Repository/SF/ApplicationLogin/editBox_Password'), findTestData(GlobalVariable.TestDataSheet_Name).getValue("SFPassword",1), GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/SF/ApplicationLogin/btn_KeypadEnter'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.doubleTap(findTestObject('Object Repository/SF/ApplicationLogin/btn_Login'), GlobalVariable.Timeout)