
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize

import com.applitools.eyes.selenium.Eyes

import java.lang.Object


def static "mfa.readMFA.GetMFAToken"(
    	String secret	) {
    (new mfa.readMFA()).GetMFAToken(
        	secret)
}

def static "com.kms.katalon.keyword.testlink.TestlinkKeywords.updateResults"(
    	String testcaseName	
     , 	String exception	
     , 	String results	) {
    (new com.kms.katalon.keyword.testlink.TestlinkKeywords()).updateResults(
        	testcaseName
         , 	exception
         , 	results)
}

def static "com.example.WebUICustomKeywords.isElementPresent"(
    	TestObject to	
     , 	int timeout	) {
    (new com.example.WebUICustomKeywords()).isElementPresent(
        	to
         , 	timeout)
}

def static "com.example.WebUICustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.example.WebUICustomKeywords.getHtmlTableColumns"(
    	WebElement row	
     , 	String tagName	) {
    (new com.example.WebUICustomKeywords()).getHtmlTableColumns(
        	row
         , 	tagName)
}

def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}

def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}

def static "com.devstored.browserstackConnect.IOS"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).IOS(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}

def static "com.devstored.browserstackConnect.ANDROID"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).ANDROID(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}
