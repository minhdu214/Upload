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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.forrester.com/bold')

WebUI.maximizeWindow()

WebUI.setViewPortSize(1233, 587)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Forrester Helps Organizations Grow Thr_dedbf3/form_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Forrester Helps Organizations Grow Thr_dedbf3/input_Search_q'), 'prediction 2023: Cybersecurity, Risk, and Privatecy')

WebUI.sendKeys(findTestObject('Object Repository/Page_Forrester Helps Organizations Grow Thr_dedbf3/input_Search_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_Search  Forrester/span_Accept cookies'))

not_run: WebUI.setText(findTestObject('Page_Search  Forrester/div_Log in_input__container input--large'), 'prediction 2023: Cybersecurity, Risk, and Privatecy')

not_run: WebUI.click(findTestObject('Object Repository/Page_Search  Forrester/mark_prediction 2023 Cybersecurity, Risk, a_e569ef'))

WebUI.click(findTestObject('Object Repository/Page_Search  Forrester/span_Reports'))

not_run: WebUI.scrollToElement(findTestObject('Page_Search  Forrester/a_Predictions 2023'), 0)

WebUI.click(findTestObject('Page_Search  Forrester/a_Predictions 2023'))

WebUI.delay(2)

WebUI.closeBrowser()

