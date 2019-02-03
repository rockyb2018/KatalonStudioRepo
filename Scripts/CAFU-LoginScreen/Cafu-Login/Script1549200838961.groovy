import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CAFU-LoginScreen/Cafu-LaunchApp'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Time stamp delayed to load the splash screen')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('This is the value to enter the mobile no to login')

Mobile.setText(findTestObject('Cafu-LoginScreen/LoginScreen-MobileNo'), '552603401', 0)

Mobile.comment('This is with a valid password to login to the app')

Mobile.setText(findTestObject('Cafu-LoginScreen/LoginScreen-Password'), 'Rockstar@123', 0)

Mobile.tap(findTestObject('Cafu-LoginScreen/LoginScreen-SigninBtn'), 0)

Mobile.comment('Successfully login to the app.')

