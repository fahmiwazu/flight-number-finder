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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.siacargo.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_E-Services'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_E-Services'))

WebUI.click(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_E-Services'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_Tracking'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_Tracking'))

WebUI.click(findTestObject('Object Repository/Page_Singapore Airlines Cargo  Internationa_be9777/a_Tracking'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/p_You can search for a maximum of 10 AWB numbers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/p_You can search for a maximum of 10 AWB numbers'), 
    'You can search for a maximum of 10 AWB numbers.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/input_Tracking_awbInput'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/input_Tracking_awbInput'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/a_E-Services'))

WebUI.click(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/a_E-Services'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/a_Flight Schedule'))

WebUI.click(findTestObject('Object Repository/Page_Tracking  Singapore Airlines Cargo  In_2e5191/a_Flight Schedule'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Flight Schedule_origin'), 
    'SIN')

WebUI.setText(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Origin_destination'), 
    'SYD')

WebUI.setText(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Destination_fromFlightDate'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/input_Destination_fromFlightDate'))

WebUI.click(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/div_20'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/button_SEARCH'))

WebUI.click(findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/button_SEARCH'))

boolean textFound = false

String FlightNumber = 'SQ0211'


// Loop to search text on multiple pages
while (!textFound) {
	// Check if text "SQ0211" is present on the current page
	if (WebUI.verifyTextPresent(FlightNumber, false, FailureHandling.OPTIONAL)) {
		WebUI.comment('Flight Number found on this page.')
		
		textFound = true
	} else {
		WebUI.comment('Flight Number not found, going to the next page...')
		TestObject nextPageButton = findTestObject('Object Repository/Page_Flight Schedule  Singapore Airlines Ca_b65577/svg')
		
		if (WebUI.verifyElementPresent(nextPageButton, 5, FailureHandling.OPTIONAL)) {
			WebUI.click(nextPageButton)
			WebUI.delay(3)  // Wait for the new page to load
		} else {
			WebUI.comment('No Next Page button found. Stopping the search.')
			break
		}
	}
}

WebUI.closeBrowser()

