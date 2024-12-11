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

Mobile.startExistingApplication('com.ted.android')

Mobile.tap(findTestObject('home'), 0)

Mobile.tap(findTestObject('tc7/vd1'), 0)

Mobile.tap(findTestObject('Object Repository/tc10/downloaddd'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('tc7/MyLibrary'), 0)

Mobile.tap(findTestObject('tc10/dddddddoawnload'), 0)

Mobile.verifyElementExist(findTestObject('tc10/download1'), 0)

Mobile.tap(findTestObject('tc7/deletecrochet'), 0)

Mobile.tap(findTestObject('tc7/removeeeeeeeeeeeeeee'), 0)

Mobile.closeApplication()

