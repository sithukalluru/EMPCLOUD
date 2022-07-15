package com.emp.qa.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.emp.qa.base.TestBase;

/**
 * 
 * @author skalluru
 *
 */

public class Helpers extends TestBase {

	private static final long TimeOut = 0;
	/**
	 * Takes a ScreenShot
	 * 
	 * @param result
	 */
	public static WebDriver driver;
	
//	public static void takeScreenShot(ITestResult result) {
//		String strHTML="";
//		File source=null;
//		try {
//			if (isAlertPresent()) {
//				Alert alert=driver.switchTo().alert();
//				strHTML="<BR><B>________"+"Alert found,no screenshot taken<BR></B>"+alert.getText()+"</font><BR><BR><B>Screenshot for:"+result.getName()+"</B><BR><BR><>BR>";alert.accept();
//			}
//			else {
//				TakesScreenshot ts=(TakesScreenshot)driver;
//				source= ts.getScreenshotAs(OutputType.FILE);
//				strHTML="<BR><img border=\"2\"src=\"data:image/png;base64,"+encodeFileToBase64Binary(source)
//				+"\"><BR><BR><B>Screenshot for:"  +result.getName()+"</B><BR><BR><BR>";
//				
//		}
//			File directory=new File("./Screenshots");
//			if(!directory.exists()) {
//				directory.mkdir();
//				
//			}
//			createHTMLFile(strHTML);
//			FileWriter fWriter =null;
//			BufferedWriter writer=null;
//			
//			try {
//				fWriter=new FileWriter("Screeshots/Screenshots.html",new File("Screenshots/Screenshots.html").exists());
//				writer=new BufferedWriter(fWriter);
//				writer.write(strHTML);
//				writer.newLine();
//				writer.close();
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		public static void deleteHTMLFile() {
//			File file =new File("Screenshots/Screenshots.html");
//			if(file.exists()) {
			
					
					
		

			
			
			
		
	
	

	

	private static String encodeFileToBase64Binary(File source) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void createHTMLFile(String strHTML) {
		FileWriter fWriter = null;
		BufferedWriter writer = null;

		try {
			fWriter = new FileWriter("Screenshots/Screenshots.html", new File("Screenshots/Screenshots.html").exists());
			writer = new BufferedWriter(fWriter);
			writer.write(strHTML);
			writer.newLine(); // this is not actually needed for html files - can make your code more readable
								// though
			writer.close(); // make sure you close the writer object
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void deleteHTMLFile() {
		File file = new File("Screenshots/Screenshots.html");
		// Determine if the File exists
		if (file.exists()) {
			// Delete the file
			file.delete();
		}
	}

	/**
	 * This Method switches to a Alert if present any
	 * 
	 * @return
	 */
	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	

	public void waitFor(WebElement ele) {
		// waitForPageToLoad();
		// log("Waiting 60 seconds for element :" + ele + " to be visible");
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {

		}

	}

	public void waitFor(WebElement ele, int time) {
		waitForPageToLoad();
		try {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {
		}
	}

	public void waitForPageToLoad() {
		waitForpage();
		try {
			waitFor(ExpectedConditions.invisibilityOfAllElements(driver.findElements(By.cssSelector("#spinner"))));
		} catch (Exception e) {
		}
		waitForpage();
	}

	public void waitFor(ExpectedCondition<Boolean> invisibilityOfAllElements) throws InterruptedException {

		Thread.sleep(2000);
	}

	public void waitForpage() {
		try {

			Thread.sleep(5000);
		} catch (Exception e) {

		}
	}

	public void jsCLick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) TestBase.driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	public static void jsScrollintoview(WebElement Element) {
		JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	public void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

	public static boolean explicitlyWait(WebElement element) {

		try {

			new WebDriverWait(driver, TimeOut).until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (NoSuchElementException e)

		{
			return false;
		}
	}

	/**
	 * This Method can be used to send input as text to input fields on the EMP UI
	 * 
	 * @param element
	 * @param arg
	 * @return
	 */
	public boolean enterText(WebElement element, String arg) {

		try {

			element.sendKeys(arg);
			return true;
		} catch (NoSuchElementException e)

		{
			return false;
		}
	}

	public String getRandomString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

	public boolean containsAKeyword(String myString, String[] linkText) {
		for (String keyword : linkText) {
			if (myString.contains(keyword)) {
				return true;
			}
		}
		return false; 

	}

	public void Scrollintoview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
 public void uploadfile(String path) throws AWTException {
	
	 StringSelection ss = new StringSelection(path);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	  Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     
 }
 
 public void Robotclick(WebElement Element) throws AWTException, InterruptedException{
	 Robot robot = new Robot();  // Robot class throws AWT Exception	
     Thread.sleep(2000); // Thread.sleep throws InterruptedException	
     robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
     
     Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
     robot.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);	
     robot.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);	
     robot.keyPress(KeyEvent.VK_TAB);	
     Thread.sleep(2000);	
     robot.keyPress(KeyEvent.VK_ENTER);	
 // press enter key of keyboard to perform above selected action	
}	 
	 


 
 public boolean selectDropDownValue (WebElement element, String type, String value) {

		try {

			Select select=new Select(element);

			switch (type) 
			{
			case "index":
				select.selectByIndex(Integer.parseInt(value));
				break;
			case "value":
				select.selectByValue(value);
				break;
			case "visibletext":
				select.selectByVisibleText(value);
				break;
			
				

			default:
				System.out.println("please pass the correct selection criteria...");
				break;	
			}
			return true;
		}
		catch (NoSuchElementException e)
		{	
			return false;
		}
	}
 public static void SelectDateByJS(WebDriver driver2, WebElement element,String dateVal) {
	 JavascriptExecutor js=(JavascriptExecutor) TestBase.driver;
	 js.executeScript("arguments[0].SetAttribute('value','"+dateVal+"');", element);
 }
 
//	public  static void  getChromeOption() throws IOException {
//		
//		String downloadFilepath = System.getProperty("user.dir")+"/AutoDownloads/";
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default_content_settings.popups", 0);
//		chromePrefs.put("download.default_directory", downloadFilepath);
//		ChromeOptions options = new ChromeOptions();
//		//options.setExperimentalOption("prefs", chromePrefs);
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		WebDriver driver = new ChromeDriver(cap);
//
//	    File tokenFile = new File(downloadFilepath);
	   
		//FileWriter fw = new FileWriter(tokenFile.getAbsoluteFile());
		
		
		
//		File downloadsDir = new File(System.getProperty("user.dir") + File.separatorChar + "AutoDownloads");
//	    if (!downloadsDir.exists()) 
//	     {
//	        boolean ddCreated = downloadsDir.mkdir();
//	     }
//	    List<String> args = new ArrayList<>();
//	    args.add("user-data-dir="+downloadsDir.getAbsolutePath());
//		options.setExperimentalOption("user-data-dir",downloadsDir.getAbsolutePath());
		
		
	}
	



