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

WebUI.click(findTestObject('Recruitment/Recruitment_Menu'))

WebUI.delay(1)

WebUI.click(findTestObject('Recruitment/btnAdd_Recruitment'))

WebUI.setText(findTestObject('Recruitment/FullName_txt'), 'jumlah karakter yang diinput 40 karakter atau sudah melebihi max.lenght-nya yaitu 35 karakter')

WebUI.setText(findTestObject('Recruitment/MidleName_txt'), 'jumlah karakter yang diinput 40 karakter atau sudah melebihi max.lenght-nya yaitu 35 karakter')

WebUI.setText(findTestObject('Recruitment/LastName_txt'), 'jumlah karakter yang diinput 40 karakter atau sudah melebihi max.lenght-nya yaitu 35 karakter')

WebUI.delay(2)

WebUI.setText(findTestObject('Recruitment/comment_txtArea'), 'jumlah karakter yang diinput 40 karakter atau sudah melebihi max.lenght-nya yaitu 35 karakter')

not_run: WebUI.click(findTestObject('Recruitment/btnSave_Recruitment'))

