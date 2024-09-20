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


WebUI.callTestCase(findTestCase('Validation - Devdarshini/MAE_LoginApplication/MAE_Login_WithoutValidations'), [:], FailureHandling.STOP_ON_FAILURE)
//Mobile.startExistingApplication('com.maybank2u.life.uat')
Mobile.verifyElementExist(findTestObject('MAE/Validation/Chat/Chat_Tap'), GlobalVariable.Timeout)
Mobile.tap(findTestObject('MAE/Validation/Chat/Chat_Tap'), GlobalVariable.Timeout)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Chat/android.view.ViewGroup-Chat_Selection'),GlobalVariable.Timeout)
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Chat/android.view.ViewGroup-Chat_Selection'),GlobalVariable.Timeout)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Chat/android.widget.ImageView-ThreeDots_Chat'),GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Chat Documents']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View Application']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Call Representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Call Representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/Validation/Chat/android.widget.LinearLayout'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/Validation/Chat/android.widget.Button - CANCEL'), GlobalVariable.Timeout)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/Validation/Chat/android.widget.Button - CALL'), GlobalVariable.Timeout)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/MAE/Validation/Chat/android.widget.Button - CALL'), GlobalVariable.Timeout)



