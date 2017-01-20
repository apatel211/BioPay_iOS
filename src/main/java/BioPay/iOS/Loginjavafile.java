package BioPay.iOS;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.SessionNotFoundException;

public class Loginjavafile {
	private static WebElement element ;
	 Capabilities cp ;
    
	public Loginjavafile() {
		cp = Capabilities.createInstance();
	}

//	public WebDriver driver  ;
//	public Loginjavafile(){
//		this.driver = new Capabilities().getDriver();
//	}
//	
//	public WebDriver setUp() {
//		try {
//			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("app","/Users/ankitapatel/Library/Developer/Xcode/DerivedData/WebDriverAgent-dorcyffvehgznzgtsrgqdobxdlrz/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
//			capabilities.setCapability("appium-version", "1.6"); 
//	    	capabilities.setCapability("platformVersion", "10.2"); 
//	    	capabilities.setCapability("deviceName","iPhone 6");
//	    	capabilities.setCapability("platformName","iOS");
//	    	capabilities.setCapability("bundleId","com.facebook.IntegrationApp");
//			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//
//		} catch (Exception e) {
//			System.out.println("The error is : " + e);
//			e.printStackTrace();
//			return null;
//		}
//		System.out.println("driver in setup method : "+ driver);
//		return driver;
//	}

	public  WebElement skip() throws Exception, NoSuchElementException,SessionNotFoundException{
		try{    
	         cp.getDriver().switchTo().alert().accept();
	         Thread.sleep(1000);
    		   cp.getDriver().findElement(By.name("SKIP")).click();
		       Thread.sleep(1000);
		        System.out.println("SKIP is found.");
	        }
			catch (NoSuchElementException e){
		 		System.out.println("SKIP is Not found.");
		 		return null;
		 	}
		 		catch (Exception e){
	 	        System.out.println("The error is : " + e);
	    		throw(e);
	    	}
		return element;
	}
	
		public  WebElement login() throws Exception, NoSuchElementException{
			try{  

				 cp.getDriver().findElement(By.name("Log In")).click();	
			       Thread.sleep(5000);
			        System.out.println("LOGIN is found");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("LOGIN is Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		public  WebElement email() throws Exception, NoSuchElementException{
			try{    
	    			element = cp.getDriver().findElement(By.xpath
("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"));
	    			element.click();
			       Thread.sleep(5000);
			        System.out.println("Email id is found.");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("Email id Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		public  WebElement password() throws Exception, NoSuchElementException{
			try{    
	    			element = cp.getDriver().findElement(By.xpath
("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]"));
	    			element.click();
			       Thread.sleep(5000);
			        System.out.println("Password is found.");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("Password Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		public  WebElement button() throws Exception, NoSuchElementException{
			try{  

				 cp.getDriver().findElement(By.name("LOGIN")).click();	
			       Thread.sleep(5000);
			        System.out.println("button is found");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("button is Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		public  WebElement ProfieTab() throws Exception, NoSuchElementException{
			try{  

				 cp.getDriver().findElement(By.name("Profile")).click();	
			       Thread.sleep(5000);
			        System.out.println("Profile tab is found");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("Profile tab is Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		public  WebElement ScrollProfile() throws Exception, NoSuchElementException{
			try{  
//				  Dimension size = cp.getDriver().manage().window().getSize();
//				  System.out.println(size);   
//				  (cp.getDriver()).scrollTo("SAVE");
//       		  cp.getDriver().swipe(190, 409, 197,579,5);
//				  ("startX", 190); put("startY", 409); put("endX", 197); put("endY", 579); put("duration", 0.5); }});

				  JavascriptExecutor js = (JavascriptExecutor) cp.getDriver();
				  HashMap<String, String> scrollObject = new HashMap<String, String>();
				  scrollObject.put("direction", "down");
				  js.executeScript("mobile: scroll", scrollObject);
 
			       Thread.sleep(5000);
			       System.out.println("Scroll is happening");
		        }
				catch (NoSuchElementException e){
			 		System.out.println("Scroll is not happening");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		
		
		public  WebElement Logout() throws Exception, NoSuchElementException{
			try{  

				 cp.getDriver().findElement(By.name("LOGOUT")).click();	
			       Thread.sleep(5000);
			        System.out.println("LOGOUT button is found");

			        cp.getDriver().findElement(By.name("Yes, Log Me Out")).click();	
				       Thread.sleep(5000);
				        System.out.println("Yes, Log Me Out button is found");
			        
		        }
				catch (NoSuchElementException e){
			 		System.out.println("LOGOUT button is Not found.");
			 		return null;
			 	}
			 		catch (Exception e){
		 	        System.out.println("The error is : " + e);
		    		throw(e);
		    	}
			return element;
		}
		

		public void close() {
			cp.getDriver().quit();
		}

}

