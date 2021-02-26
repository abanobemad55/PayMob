import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Functions{

	protected static WebDriver driver;
	static ExtentReports extent;
	 

	 //this function to find elements with ID and send key
	public static void findwithID_SK(String x , String y) {		
		 driver.findElement(By.id(x)).sendKeys(y);
			
	}
	
	 
	 //this function to find elements with xpath and send key
	public static void FindwithXpath_SK(String x , String y) {		
		 driver.findElement(By.xpath(x)).sendKeys(y);
			
	}
	
	
	 //this function to find elements with ID and press
	public static void findwithID_Press(String x) {		
		 driver.findElement(By.id(x)).click();
			
	}

	
	 //this function to find elements with CSS and press
	public static void findwithCSS_Press(String x) {		
		 driver.findElement(By.cssSelector(x)).click();
			
	}
	
	
	
	 
	 //this function to find elements with xpath and press
	public static void FindwithXpath_Press(String x) {		
		 driver.findElement(By.xpath(x)).click();
			
	}
	

		
	
	//this function is used to wait element that located by Id
	public static void Wait_Id(int x , String y) {
		
	       WebDriverWait wait = new WebDriverWait(driver, x);
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(y)));;
		
		
	}
	
	//this function is used to wait element that located by Xpath
	public static void Wait_xpath(int x , String y) {
		
	       WebDriverWait wait = new WebDriverWait(driver, x);
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(y)));
		
		
	}
	
	//this function is used to wait element that located by CSS
	public static void Wait_CSS(int x , String y) {
		
	       WebDriverWait wait = new WebDriverWait(driver, x);
		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(y)));;
		
		
	}
	//this function to choose element from dropdown menu 
	public static void Dropdown_ID(String x , String y) {
		
		
		driver.findElement(By.id(x)).click();
	    {
	      WebElement dropdown = driver.findElement(By.id(x));
	      dropdown.findElement(By.xpath(y)).click();
	    }   
	   }

//this function is used to find frame
public static void FindFrame(int x) {
	
	driver.switchTo().frame(x);
	
}

//this function is user to sleep
public static void Sleep(int x) throws InterruptedException {
Thread. sleep(x);
}
}


