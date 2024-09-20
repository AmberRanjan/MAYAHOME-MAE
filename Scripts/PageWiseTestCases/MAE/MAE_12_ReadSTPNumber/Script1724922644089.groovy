import org.openqa.selenium.Keys

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions

Mobile.startExistingApplication('com.maybank2u.life.uat')

//In-Progress

//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'
AndroidDriver driver = MobileDriverFactory.getDriver()

//Press Ctrl+A on the Edit element
//Mobile.tapAndHold(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), 10, 0)
//Mobile.sendKeys(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), Keys.chord(Keys.COMMAND, Keys.TAB))

//Mobile.sendKeys(findTestObject('Object Repository/MAE/ApplicationLogin/btn_LogInNow'), Keys.chord(Keys.COMMAND))
//Mobile.tapAndHoldAtPosition(10, 10, 10)

Actions actions = new Actions(driver)

actions.keyDown(Keys.CONTROL)
actions.clickAndHold(10)
Mobile.delay(15)
actions.keyUp(Keys.CONTROL)

