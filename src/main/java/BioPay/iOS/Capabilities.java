package BioPay.iOS;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capabilities {
	private static Capabilities instance = null;
	private WebDriver driver;

	private Capabilities(){
		this.driver = setUp();
	}
	
	public static Capabilities createInstance() {
		if(instance == null){
			instance = new Capabilities();
		}
		return instance;
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public WebDriver setUp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app","/Users/ankitapatel/Library/Developer/Xcode/DerivedData/SixCapital_BioPay-ftpazrdibnvgoqebwjywrzygauqo/Build/Products/Debug-iphonesimulator/SixCapital_BioPay.app");
			capabilities.setCapability("appium-version", "1.6"); 
	    	capabilities.setCapability("platformVersion", "10.2"); 
	    	capabilities.setCapability("deviceName","iPhone 6");
	    	capabilities.setCapability("platformName","iOS");
	    	capabilities.setCapability("bundleId","com.mobiquityinc.biopaydev");
	    	capabilities.setCapability("autoAcceptAlerts",true);
	         capabilities.setCapability("fullReset", true);
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		} catch (Exception e) {
			System.out.println("The error is : " + e);
			e.printStackTrace();
			return null;
		}
		System.out.println("driver in setup method : "+ driver);
		return driver;
	}

}
