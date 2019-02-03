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

Mobile.comment('The objective is to Register the user in the app.')

'The app is launched successfully and the splash screen is loaded successfully.\n'
WebUI.callTestCase(findTestCase('CAFU-LoginScreen/Cafu-LaunchApp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'The Register button is tapped in the login screen, which the screen is navigated to Register screen.\n'
Mobile.comment('Tapped on Register btn in Login screen')

Mobile.tap(findTestObject('Cafu-RegistrationScreen/RegScreen-RegBtn'), 0)

Mobile.comment('Time stamp to navigate the screen to Register screen')

WebUI.delay(5)

Mobile.comment('The values for Fname,Lname,MobNo,EmailId,Pass are entered')

'Entered text for First Name'
//Mobile.setText(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-Fname'), 'FnameTest', 0)

'Entered text for Lastname\n'
//Mobile.setText(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-Lname'), 'Lname', 0)

'Entered Mobile No'
Mobile.setText(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-MobNo'), '552603401', 0)

'Entered text for Email ID'
//Mobile.setText(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-EmailId'), 'test@gmail.com', 0)

//Mobile.hideKeyboard()

'Tapped on Password Text field, so the focus is on Password.'

//Mobile.tap(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-Pass'), 0)
'Entered value for Password'
//Mobile.setText(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-Pass'), 'abc@123456', 0)

Mobile.comment('Clicked on Continue Button')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Cafu-RegistrationScreen/RegScreen-CreateAcc-Referralcode'), 0)

Mobile.hideKeyboard()

'Tapped on CONTINUE button.'
Mobile.tap(findTestObject('Cafu-RegistrationScreen/Regscreen-CreateAcc-ContiBtn'), 0)

