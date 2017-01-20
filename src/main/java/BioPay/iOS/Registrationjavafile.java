package BioPay.iOS;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Registrationjavafile {
		private Capabilities cp;
		private static WebElement element ;

		public Registrationjavafile() {
			cp = Capabilities.createInstance();;
		}

	public  WebElement Create_Account() throws Exception, NoSuchElementException{
			try{  
			      cp.getDriver().findElement(By.name("Create Account")).click();
			      Thread.sleep(5000);
			      System.out.println("Create Account is found");
			    }
			catch (NoSuchElementException e){
					System.out.println("Create Account is Not found.");	
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
			("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"));
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
		
		
	public  WebElement Confirm_email() throws Exception, NoSuchElementException{
			try{    
			    element = cp.getDriver().findElement(By.xpath
			("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]"));
			    element.click();
			    Thread.sleep(5000);
			    System.out.println("Confirm Email id is found.");
			    }
			catch (NoSuchElementException e){
			     System.out.println("Confirm Email id Not found.");
			     return null;
			}
			catch (Exception e){
			     System.out.println("The error is : " + e);
			     throw(e);
			    }
			return element;
			}
		
		
	public  WebElement Birthday() throws Exception, NoSuchElementException{
			try{    
			    element = cp.getDriver().findElement(By.xpath
			("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]"));
			    element.click();
			    Thread.sleep(5000);
			    System.out.println("Birthday is found.");
			     }
			catch (NoSuchElementException e){
				System.out.println("Birthday Not found.");
				return null;
			}
			catch (Exception e){
			     System.out.println("The error is : " + e);
			    throw(e);
			}
			return element;
			}
		
	public   WebElement password() throws Exception, NoSuchElementException{
			try{    
			    element = cp.getDriver().findElement(By.xpath
			("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]"));
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
		
	public  WebElement DONE_button() throws Exception, NoSuchElementException{
			try{  
				cp.getDriver().findElement(By.name("DONE")).click();
			    Thread.sleep(5000);
			    System.out.println("DONE button is found");
			    }
			catch (NoSuchElementException e){
				System.out.println("DONE button is Not found.");
				return null;
			}
			catch (Exception e){
			     System.out.println("The error is : " + e);
			    throw(e);
			    }
			return element;
			}
		
	public  WebElement CONTINUE_button() throws Exception, NoSuchElementException{
			try{  
				cp.getDriver().findElement(By.name("CONTINUE")).click();
			    Thread.sleep(5000);
			    System.out.println("CONTINUE button is found");
			   }
			catch (NoSuchElementException e){
				System.out.println("CONTINUE button is Not found.");
				return null;
			}
			catch (Exception e){
			     System.out.println("The error is : " + e);
			    throw(e);
			    }
			return element;
			}
		
	public  WebElement Select_Country() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.name("Singapore")).click();
		    Thread.sleep(5000);
		    System.out.println("Singapore is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("Singapore is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	
	public  WebElement Confirm_Country() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.name("CONFIRM COUNTRY")).click();
		    Thread.sleep(5000);
		    System.out.println("CONFIRM COUNTRY is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("SCONFIRM COUNTRY is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	
	public  WebElement Agree_And_Continue() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.name("AGREE AND CONTINUE")).click();
		    Thread.sleep(5000);
		    System.out.println("AGREE AND CONTINUE is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("AGREE AND CONTINUE is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	 
	public  WebElement SetPin() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")).click();
			Thread.sleep(5000);
			cp.getDriver().findElement(By.name("1")).click();
			cp.getDriver().findElement(By.name("1")).click();
			cp.getDriver().findElement(By.name("1")).click();
			cp.getDriver().findElement(By.name("1")).click();
		    Thread.sleep(5000);
		    System.out.println("First pin is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("First pin is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	
	public  WebElement ContinueSetPin() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.name("CONTINUE")).click();
		    Thread.sleep(5000);
		    System.out.println("CONTINUE set pin is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("CONTINUE set pin is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	
	public  WebElement SkipForNow_button() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.name("SKIP FOR NOW")).click();
		    Thread.sleep(5000);
		    System.out.println("SkipForNow button is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("SkipForNow button is Not found.");
			return null;
		}
		catch (Exception e){
		     System.out.println("The error is : " + e);
		    throw(e);
		    }
		return element;
		}
	
	public  WebElement SkipForNow_OK_alert_button() throws Exception, NoSuchElementException{
		try{  
			cp.getDriver().findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]")).click();
		    Thread.sleep(5000);
		    System.out.println("OK is found");
		   }
		catch (NoSuchElementException e){
			System.out.println("OK is Not found.");
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
