import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MainTest extends Variables{

 
@Test(priority = 1)
//this test case is to add first item in the cart
 public void Add_First_Item() throws  InterruptedException {
	// this function is used to start browser and open the website
	StartBrowser(); 
	// switch to frame 0
	FindFrame(0);
	// wait till find element by xpath to open computer section
	Wait_xpath(30,ComputerXpath);	
	//find element with xpath and press on it 
	FindwithXpath_Press(ComputerXpath);
	// wait till find element by CSS
	Wait_CSS(30,DicktopCSS); 
	//find element with CSS and press on it to open Dicktop section
	findwithCSS_Press(DicktopCSS); 
    //Scroll down by 300 pix
    JavascriptExecutor js = (JavascriptExecutor) driver;    
    driver.manage().window().maximize();
    js.executeScript("window.scrollBy(300,0)"); 
    // wait till find element by CSS
	Wait_CSS(30,First_itemCSS);  
	//find element with CSS and press on it to choose the first item
    findwithCSS_Press(First_itemCSS);
    //Scroll down by 600 pix
    driver.manage().window().maximize();
    js.executeScript("window.scrollBy(600,0)");
    // wait till find element by CSS 
    Wait_CSS(30,HardtypeCSS);
    //find element with CSS and press on it to choose the hard deck type
    findwithCSS_Press(HardtypeCSS);
    // wait till find element by CSS
    Wait_CSS(30,button);
    //find element with CSS and press on it to add item add first item to the cart
    findwithCSS_Press(button);  
    Sleep(3000);

}

@Test(priority = 2)
//this test case is to create new account with happy senario
public void Add_Second_Item() throws  InterruptedException {
	//go back
    JavascriptExecutor js = (JavascriptExecutor) driver; 
    driver.manage().window().maximize();
    driver.navigate().back();
    // wait till find element by Xpath 
	Wait_xpath(30,ElectronisXpath);	
	//find element with Xpath and press on it to open Electronis section
	FindwithXpath_Press(ElectronisXpath);
	// wait till find element by CSS 
	Wait_CSS(30,CameraCSS);
	//find element with CSS and press on it to open Camera section
    findwithCSS_Press(CameraCSS); 
    //Scroll down by 300 pix
    driver.manage().window().maximize();
    js.executeScript("window.scrollBy(300,0)");
    // wait till find element by CSS 
	Wait_CSS(30,First_itemCSS);
	//find element with CSS and press on it to choose the Second item
    findwithCSS_Press(First_itemCSS);
    //Sleep for 2 sec
    Sleep(2000);
    //Scroll down by 1000 pix
    driver.manage().window().maximize();
    js.executeScript("window.scrollBy(1000,0)");
    // wait till find element by ID
    Wait_Id(30,OrderNowID2);
    //find element with ID and press on it to add item add Second item to the cart
    findwithID_Press(OrderNowID2);
  //Sleep for 3 sec 
    Sleep(3000);
}

@Test(priority = 3)
//this test case is to create new account with happy senario
public void Open_cart() throws  InterruptedException {
	//Refresh the page
  JavascriptExecutor js = (JavascriptExecutor) driver; 
  driver.manage().window().maximize();
  driver.navigate().refresh();
  //switch to frame 0
  FindFrame(0);
//wait till find element by CSS
  Wait_CSS(30,CartCSS);
//find element with CSS and press on it to open the cart
  findwithCSS_Press(CartCSS); 
//Scroll down by 600 pix
  driver.manage().window().maximize();
  js.executeScript("window.scrollBy(600,0)");
  // wait till find element by ID
  Wait_Id(30,termsofserviceID);
//find element with ID and press on accept terms of service
  findwithID_Press(termsofserviceID);
//find element with ID and press checkout
  findwithID_Press(checkoutID);  


}


@Test(priority = 4)
//this test case is to create new account with happy senario
public void Checkout_as_guest() throws  InterruptedException {
	// wait till find element by ID
	Wait_Id(30,EmailID);
	//Scroll down by 400 pix
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	js.executeScript("window.scrollBy(400,0)");
	 // wait till find element by CSS 
	  Wait_CSS(30,CheckoutCSS);
	//find element with ID and press checkout 
	  findwithCSS_Press(CheckoutCSS);
	  // wait till find element by ID
	  Wait_Id(30,FirstNameID);
	//find element with ID and Send First name
	  findwithID_SK(FirstNameID,FirstName);
	//find element with ID and Send Last name
	  findwithID_SK(LastNameID,LastName);
	//find element with ID and Send Email 
	  findwithID_SK(EmailID2,Email);
	//find element with ID and Send company 
	  findwithID_SK(CompanyID,Company);
	//find element with ID and Send country
	  Dropdown_ID(CountryId,CountryIdID);
	//find element with ID and Send city
	  findwithID_SK(CityID,City);
	//find element with ID and Send Address1
	  findwithID_SK(Address1ID,Address1);
	//find element with ID and Send Address2
	  findwithID_SK(Address2ID,Address2);
	//find element with ID and Send Zip Postal Code
	  findwithID_SK(ZipPostalCodID,ZipPostalCod);
	//find element with ID and Send phone number
	  findwithID_SK(PhoneNumberID ,PhoneNumber);
	//find element with ID and Send fax number
	  findwithID_SK(FaxNumberID,FaxNumber);
	//find element with CSS and press continue
	  findwithCSS_Press(ConCSS);
	  
	  


}

@Test(priority = 5)
//this test case is to create new account with happy senario
public void Choose_payment_method() throws  InterruptedException {
	 // wait till find element by CSS
	Wait_CSS(30,CON1CSS);
	//find element with CSS and press continue
	findwithCSS_Press(CON1CSS); 
	 // wait till find element by CSS
	Wait_CSS(30,CON2CSS);
	//find element with CSS and choose payment method
	findwithID_Press(paymentmethod);
	//find element with CSS and press continue
	findwithCSS_Press(CON2CSS);
	 // wait till find element by ID
	Wait_Id(30,CardnameID);
	//find element with ID and Send Card Name
	findwithID_SK(CardnameID ,CardName);
	//find element with ID and Send Card Number
	findwithID_SK(CardNumberID,CardNumber);
	//find element with ID and Send Expire Month
	Dropdown_ID(ExpireMonth,ExpireMonthID);
	//find element with ID and Send Expire Year
	Dropdown_ID(ExpireYear,ExpireYearID);
	//find element with ID and Send Card Code
	findwithID_SK(CardCodeID,CardCode);
	//find element with CSS and press continue
	findwithCSS_Press(CON3CSS); 
	//Scroll down by 400 pix
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	js.executeScript("window.scrollBy(400,0)");	
	// wait till find element by CSS
	Wait_CSS(30,CON4CSS);
	//find element with CSS and press continue
	findwithCSS_Press(CON4CSS);
	// wait till find element by CSS
	Wait_CSS(30,CON5CSS);
	//find element with CSS and press continue
    findwithCSS_Press(CON5CSS); 
	
	
	
	
	
}
}
