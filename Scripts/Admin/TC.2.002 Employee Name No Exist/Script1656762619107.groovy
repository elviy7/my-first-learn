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

WebUI.callTestCase(findTestCase('Login/Login Sukses'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Admin Menu'))

WebUI.click(findTestObject('Admin/btnAdd_User'))

not_run: WebUI.selectOptionByValue(findTestObject('Admin/UserRole_Add'), 'ESS', false)

not_run: WebUI.setText(findTestObject('Admin/EmployeeName'), 'Elvi')

not_run: WebUI.setText(findTestObject('Admin/Username_Add'), 'elviy7')

not_run: WebUI.selectOptionByValue(findTestObject('Admin/Status'), 'Enabled', false)

not_run: WebUI.setEncryptedText(findTestObject('Admin/Password_Add'), '6N6Uo2JFhG8=')

not_run: WebUI.setEncryptedText(findTestObject('Admin/ConfirmPassword_Add'), '6N6Uo2JFhG8=')

not_run: WebUI.click(findTestObject('Admin/BtnSaveUser'))

