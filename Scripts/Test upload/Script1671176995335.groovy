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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.ConsoleCommandBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Files

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/howto/howto_html_file_upload_button.asp')

//WebUI.uploadFile(findTestObject('Page_How To Create a File Upload Button/input_Next_myFile'), '10.png')


def filePath = RunConfiguration.getProjectDir() + '/10.png'

def newFilePath = new File(filePath).getCanonicalPath()

println newFilePath

def isExisted = new File(newFilePath).exists()
println "> isExisted: " + isExisted

def fileContent = Files.readAllBytes(new File(newFilePath).toPath())
println "> File size: " + fileContent.length;

def parentFolder = new File(newFilePath).parentFile.getCanonicalPath()
def folder = ConsoleCommandBuilder.create("dir \"${parentFolder}\"").redirectError().execSync()
println String.join("\r\n", folder)

def folder1 = ConsoleCommandBuilder.create("dir \"C:\\Users\\Administrator\\.katalon\"").redirectError().execSync()
println String.join("\r\n", folder1)

newFilePath = "C:\\Users\\Administrator\\.katalon\\application.properties"

WebUI.uploadFile(findTestObject('Object Repository/Page_How To Create a File Upload Button/input_Next_myFile'), newFilePath)