import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//Mobile.startExistingApplication('com.maybank2u.life.uat')
//GlobalVariable.TestDataSheet_Name = 'MAE_E2E_01_BAU_SoftFail'
//GlobalVariable.RowNumber = 1

AndroidDriver driver = MobileDriverFactory.getDriver()

//*********************************************************************************************************************************
Mobile.comment('16-Page_Result screen/Congratulations')


//*********************************************
//MAE_E2E_01_BAU_SoftFail or MAE_E2E_03_BAU_HardFail
if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail') {
	
	String PropertyName = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_PropertyName_ResultScreen'),GlobalVariable.Timeout)
	Mobile.verifyMatch(PropertyName, findTestData(GlobalVariable.TestDataSheet_Name).getValue('Property', GlobalVariable.RowNumber), true)
	
    label_Name = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_Name'))
    Mobile.verifyMatch(label_Name, (('Dear' + ' ') + findTestData(GlobalVariable.TestDataSheet_Name).getValue('Name', GlobalVariable.RowNumber)) + ',', true)
	
	Mobile.takeScreenshot()
}

//*********************************************
//not MAE_E2E_03_BAU_HardFail
if ((GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_01_BAU_SoftFail') && (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') ) {
    String label_Congrats = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_Congratulations'))

    Mobile.verifyMatch(label_Congrats, 'Congratulations, you\'re eligible for this financing!', true)
	
	Mobile.takeScreenshot()
}

//*********************************************
//not MAE_E2E_03_BAU_HardFail
if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
    String label_Additionalfinancing = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_AdditionalFinancing'))

    Mobile.verifyMatch(label_Additionalfinancing, 'Additional financing of up to 10% for other mortgage related expenses.', true)
	
	Mobile.takeScreenshot()
}

//*********************************************
//not MAE_E2E_03_BAU_HardFail
if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
    String label_ViewOfferConditions = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_ViewOfferConditions'))

    Mobile.verifyMatch(label_ViewOfferConditions, 'View offer conditions', true)

    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'View offer conditions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Offer Conditions']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)

	Mobile.takeScreenshot()
	
    Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_DialogClose'), GlobalVariable.Timeout)
}

//*********************************************
//MAE_E2E_01_BAU_SoftFail
if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail' || GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail')  {
    String label_WeCanOffer = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_WeCanOffer'))

    Mobile.verifyMatch(label_WeCanOffer, 'Here’s what we can offer:', true)
	
	Mobile.takeScreenshot()
}

//*********************************************
//not MAE_E2E_03_BAU_HardFail
if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
    String label_PropertyFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_PropertyFinancingAmount'))

    Mobile.verifyMatch(label_PropertyFinancingAmount, 'Property financing amount', true)
	
	Mobile.takeScreenshot()
}

//*********************************************
//MAE_E2E_01_BAU_SoftFail
Mobile.delay(2)

if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail') {
    String label_DesiredFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_DesiredFinancingAmount_BAUSoftFail'))

    Mobile.verifyMatch(label_DesiredFinancingAmount, 'Based on the details you provided, your desired financing amount is out of your affordability range. Consider increasing the financing period to match your desired amount.', 
        true)

if (Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_DesiredFinancingAmount_BAUSoftFail'), GlobalVariable.Timeout)) {
    Mobile.comment('Eligibility Soft Fail')
    println('Eligibility Soft Fail')
}
	
	Mobile.takeScreenshot()
}

if  (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') {
    //String label_DesiredFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_DesiredFinancingAmount_STPSoftFail'))
	String label_DesiredFinancingAmount = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_DesiredFinancingAmount_BAUSoftFail'))
	
	
    //Mobile.verifyMatch(label_DesiredFinancingAmount, 'Based on the details you\'ve provided, we regret to inform you that your desired financing amount is out of your affordability range You may request for assistance to reapply for the financing. Our sales representative will get in touch with you to gather more details to help you get through the process.', true)
	Mobile.verifyMatch(label_DesiredFinancingAmount, 'Based on the details you provided, your desired financing amount is out of your affordability range. Consider increasing the financing period to match your desired amount.', true)

if (Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_DesiredFinancingAmount_BAUSoftFail'), GlobalVariable.Timeout)) {
   Mobile.comment('Eligibility Soft Fail')
   println('Eligibility Soft Fail')
}
	
	Mobile.takeScreenshot()
}

//**************************************************************************

if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_02_BAU_Pass')||(GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass')||(GlobalVariable.TestDataSheet_Name == 'MAE_E2E_06_BAU_Pass_NonListed')) {	
    MobileBuiltInKeywords.scrollToText('Add promo')
}

if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail') {
    MobileBuiltInKeywords.scrollToText('View Other Properties')
}

//*********************************************
//MAE_E2E_01_BAU_SoftFail
if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_03_BAU_HardFail')) {
    String label_ViewOtherProperties = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_ViewOtherProperties'))

    Mobile.verifyMatch(label_ViewOtherProperties, 'View Other Properties', true)
	
	Mobile.takeScreenshot()
}

//*********************************************

//MAE_E2E_02_BAU_Pass and MAE_E2E_01_BAU_SoftFail
if (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_03_BAU_HardFail') {
	
	MobileBuiltInKeywords.scrollToText('View offer conditions')
	
	Mobile.takeScreenshot()
	
	FinancingAmount_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_FinancingAmount_ResultPage'), GlobalVariable.Timeout)
	
	MobileBuiltInKeywords.scrollToText('Property price')
	
    label_PropertyPrice = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_PropertyPrice'))

    Mobile.verifyMatch(label_PropertyPrice, 'Property price', true)

    String label_EffectiveProfitRate = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_EffectiveProfitRate'))

    Mobile.verifyMatch(label_EffectiveProfitRate, 'Effective profit rate', true)

    label_Downpayment = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_Downpayment'))

    Mobile.verifyMatch(label_Downpayment, 'Downpayment', true)

	if  (GlobalVariable.TestDataSheet_Name != 'MAE_E2E_04_STP_SoftFail') {
		
	    String label_RecommendedFinancingPeriod = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_RecommendedFinancingPeriod'))
	
	    Mobile.verifyMatch(label_RecommendedFinancingPeriod, 'Recommended financing period', true)
		
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : findTestData(GlobalVariable.TestDataSheet_Name).getValue("FinancingPeriod",GlobalVariable.RowNumber)]),30, FailureHandling.CONTINUE_ON_FAILURE)
		
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_FinancingPeriod'), GlobalVariable.Timeout)
		
		//CustomKeywords.'com.maybank.Home2U_MAE.Home2U_MAE.setSliderValue_ForYear'(30)
		
		Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Confirm']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		
		//Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : '30 years']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
	if  (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail') {
		
		// Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Recommended financing period']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	}
	
    //Financing Ammount Start
    PropertPrice_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_PropertyPrice_ResultPage'), GlobalVariable.Timeout)

    String[] PropertPrice_ResultPage = PropertPrice_ResultPage.split(' ')

    Mobile.verifyMatch(PropertPrice_ResultPage[1], findTestData(GlobalVariable.TestDataSheet_Name).getValue('PropertyPrice', GlobalVariable.RowNumber), true)

    PropertPrice_ResultPage_Final = (PropertPrice_ResultPage[1]).replace(',', '')

    println(PropertPrice_ResultPage_Final)

    CalulatedDownpayment_ResultPage = Mobile.getText(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/txt_Downpayment_ResultPage'),GlobalVariable.Timeout)

    String[] CalulatedDownpayment_ResultPage = CalulatedDownpayment_ResultPage.split(' ')

    CalulatedDownpayment_ResultPage_Final = (CalulatedDownpayment_ResultPage[1]).replace(',', '')

    println(CalulatedDownpayment_ResultPage_Final)

    float CalculatedFinancingAmount = Float.parseFloat(PropertPrice_ResultPage_Final) - Float.parseFloat(CalulatedDownpayment_ResultPage_Final)

    println(CalculatedFinancingAmount)

    String[] FinancingAmount_ResultPage = FinancingAmount_ResultPage.split(' ')

    FinancingAmount_ResultPage_Final = (FinancingAmount_ResultPage[1]).replace(',', '')

    Mobile.verifyEqual(FinancingAmount_ResultPage_Final, CalculatedFinancingAmount) //Financing Ammount End
}


//*********************************************
//MAE_E2E_01_BAU_SoftFail and MAE_E2E_03_BAU_HardFail
if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_01_BAU_SoftFail') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_03_BAU_HardFail')) {
    MobileBuiltInKeywords.scrollToText('Add a joint applicant')

    String label_AddJjointApplicant = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_AddJjointApplicant'))

    Mobile.verifyMatch(label_AddJjointApplicant, 'Add a joint applicant', true)

    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Making a joint application might improve your financing offer']), 
        30, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.takeScreenshot()
}

//*********************************************
//BAU_Pass
if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_02_BAU_Pass') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_06_BAU_Pass_NonListed')) {
    Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Not satisfied with our offer?']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.takeScreenshot()
}

if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_06_BAU_Pass_NonListed') {
String label_NotSatisfiledmsg = CustomKeywords.'com.maybank.baseUtil.GenericMbbMobileUtil.getTextValue'(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Result/label_NotSatisfiedMsg'))

	Mobile.verifyMatch(label_NotSatisfiledmsg, 'If you’d like to apply for your desired financing amount, please request for assistance. Our Sales Representative will be in touch with you.', true)
}
//**********************************************************************************

//Common
MobileBuiltInKeywords.scrollToText('Chat with a Maybank sales representative')

Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Chat with a Maybank sales representative']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.delay(2)

if ((GlobalVariable.TestDataSheet_Name == 'MAE_E2E_02_BAU_Pass') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_05_STP_Pass') || (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_04_STP_SoftFail')  ) {
	MobileBuiltInKeywords.scrollToText('Send us your questions and we will be in touch')
Mobile.delay(2)
Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Send us your questions and we will be in touch']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

if (GlobalVariable.TestDataSheet_Name == 'MAE_E2E_03_BAU_HardFail') {
	Mobile.verifyElementExist(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/txt_StaticVerification', [('variable') : 'Get in touch with us for further assistance']),GlobalVariable.Timeout, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.delay(2)
MobileBuiltInKeywords.scrollToText('Chat with a Maybank sales representative')
//********************************************************************************************************************************
if  ((GlobalVariable.TestCase_Name != 'MAE_E2E_01_BAU_SoftFail_JA') && (GlobalVariable.TestCase_Name != 'MAE_E2E_03_BAU_HardFail_JA') && (GlobalVariable.TestCase_Name != 'MAE_E2E_04_STP_SoftFail_JA') && (GlobalVariable.TestCase_Name != 'MAE_E2E_05_STP_Pass_JA') && (GlobalVariable.TestCase_Name != 'MAE_E2E_06_BAU_Pass_NonListed_JA') ){
Mobile.tap(findTestObject('Object Repository/MAE/PropertyCheckEligibility/Common/btn_ProceedwithApplication'), GlobalVariable.Timeout)

Mobile.takeScreenshot()

}
Mobile.delay(2)
