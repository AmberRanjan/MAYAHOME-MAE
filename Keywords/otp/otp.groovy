package otp

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class otp {
	@Keyword
	def enterOTP() {



		def otpText=Mobile.getText(findTestObject('004_Login/android.widget.TextView - Your OTP no. is 707585'), GlobalVariable.G_SmallTimeOut, FailureHandling.STOP_ON_FAILURE)
		println otpText
		def newOtp=otpText.toCharArray()
		for(def i=0;i<newOtp.length;i++) {



			if((newOtp[i])=='1') {



				Mobile.tap(findTestObject('Object Repository/OTP buttons/2 button',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='2') {



				Mobile.tap(findTestObject('Object Repository/OTP buttons/3 button',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='3') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}



			else if((newOtp[i])=='4') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='5') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='6') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='7') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='8') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='9') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
			else if((newOtp[i])=='0') {



				Mobile.tap(findTestObject('Object Repository/MBBB_CASA_STP_SG_MAE/OTP_Screen/android.widget.TextView -keypad',
						[('Verify') : newOtp[i]]),GlobalVariable.G_SmallTimeOut )
			}
		}
	}
}
