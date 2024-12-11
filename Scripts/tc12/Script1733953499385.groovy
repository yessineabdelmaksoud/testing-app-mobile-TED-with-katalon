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

Mobile.tap(findTestObject('home'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - Settings'), 0)

Mobile.tap(findTestObject('tc12/Switch'), 0)

Mobile.tap(findTestObject('tc12/Switch'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - Languages'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - Subtitle language'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - Arabic'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - App Language'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.TextView - System default'), 0)

Mobile.tap(findTestObject('Object Repository/tc12/android.widget.Button (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc12/arabictest'), 0)

Mobile.closeApplication()

