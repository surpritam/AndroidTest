package com.maven.test.Android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class MainTest {

	public static void main(String[] args) throws MalformedURLException {
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app", "//Users//pritamsur//Downloads//selendroid-test-app-0.17.0.apk");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", ".HomeScreenActivity");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);*/
		
		
		// iOS Safari
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("browserName", "Safari");
		
		AppiumDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		driver.get("http://www.google.com");
		
	}

}
