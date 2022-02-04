package app.core;



import io.appium.java_client.AppiumDriver;



public class DriverFactory {

	public static AppiumDriver driver;

	private DriverFactory() {
	}
	
	public AppiumDriver getDriver() {
		return driver;
	}

	
}