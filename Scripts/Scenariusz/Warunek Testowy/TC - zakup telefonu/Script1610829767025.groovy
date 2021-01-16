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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Page_STORE (1)/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 
		findTestData('Logowanie_demoblaze').getValue('username', 5))
	
	WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 
		findTestData('Logowanie_demoblaze').getValue('password', 5))

WebUI.click(findTestObject('Page_STORE (1)/button_Log in'))

WebUI.click(findTestObject('Page_STORE (1)/a_Phones'))

WebUI.click(findTestObject('Page_STORE (1)/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Page_STORE (1)/a_Add to cart'))

WebUI.click(findTestObject('Page_STORE (1)/a_Cart'))

WebUI.click(findTestObject('Page_STORE (1)/button_Place Order'))

WebUI.setText(findTestObject('Page_STORE (1)/input_Name_name'),
	 findTestData('Zakup_demoblaze').getValue('DATA', 1))

WebUI.setText(findTestObject('Page_STORE (1)/input_Country_country'), 
	findTestData('Zakup_demoblaze').getValue('DATA', 2))

WebUI.setText(findTestObject('Page_STORE (1)/input_City_city'), 
	findTestData('Zakup_demoblaze').getValue('DATA', 3))

WebUI.click(findTestObject('Page_STORE (1)/form_Total 720                          Nam_4dc231'))

WebUI.setText(findTestObject('Page_STORE (1)/input_Credit card_card'), 
	findTestData('Zakup_demoblaze').getValue('DATA', 4))

WebUI.setText(findTestObject('Page_STORE (1)/input_Month_month'), 
	findTestData('Zakup_demoblaze').getValue('DATA', 5))

WebUI.setText(findTestObject('Page_STORE (1)/input_Year_year'), 
	findTestData('Zakup_demoblaze').getValue('DATA', 6))

WebUI.click(findTestObject('Page_STORE (1)/button_Purchase'))

WebUI.click(findTestObject('Page_STORE (1)/button_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

