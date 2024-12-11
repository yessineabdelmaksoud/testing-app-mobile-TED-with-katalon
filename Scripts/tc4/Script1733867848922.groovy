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

Mobile.tap(findTestObject('Object Repository/tc2/connection'), 0)

Mobile.tap(findTestObject('Object Repository/tc2/creataccount'), 0)

Mobile.setText(findTestObject('Object Repository/tc3/setmail'), 'yessineabdelmaksoud33@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/tc3/creatbuttons'), 0)

Mobile.setText(findTestObject('Object Repository/tc3/setname'), 'yessine', 0)

Mobile.setText(findTestObject('Object Repository/tc3/setlastname'), 'abdelmaksoud', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/tc3/setpassword'), 'bbqJkqxWn+3UUknnAKZ1Vg==', 0)

Mobile.tap(findTestObject('Object Repository/tc3/creatbuttons'), 0)

Mobile.tap(findTestObject('tc3/artanddesign'), 0)

Mobile.tap(findTestObject('Object Repository/tc3/saveinterst'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc3/android.widget.Button'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc3/android.widget.TextView - yessine abdelmaksoud'), 0)

Mobile.closeApplication()

