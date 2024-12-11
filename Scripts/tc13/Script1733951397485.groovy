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

Mobile.tap(findTestObject('Object Repository/tc13/android.widget.TextView - Browse'), 0)

Mobile.setText(findTestObject('Object Repository/tc13/android.widget.EditText - Search'), 'artificial', 0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Scott Summit Beautiful artificial limbs'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Briana Brownell How does artificial intelligence learn'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - The TED AI Show What really went down at OpenAI and the future of regulation w Helen Toner'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Dragana Rogulja How artificial light affects our health'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Anna Maria Coclite Artificial skin We made it  heres why'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - The TED AI Show Could your new best friend be an AI-powered NPC w Purnendu Mukherjee'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Emma Hart Self-assembling robots and the potential of artificial evolution'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Christoph Keplinger The artificial muscles that will power robots of the future'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Dan Finkel Can you solve the rogue AI riddle'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.TextView - Max Sills How to persuade a computer'), 
    0)

Mobile.tap(findTestObject('Object Repository/tc13/android.widget.TextView - Scott Summit Beautiful artificial limbs'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/tc13/android.widget.Button'), 0)

Mobile.closeApplication()

