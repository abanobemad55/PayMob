import java.awt.AWTException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Variables extends Functions{

	//
	static String URL = "https://frontend.nopcommerce.com/";
    static String DriverKey = "webdriver.gecko.driver";
	static String DriverPath = "C:\\Users\\Doaa\\Desktop\\New folder (2)\\ContactCars2\\Drivers\\geckodriver.exe";
	static String ComputerXpath = "//a[contains(text(),\'Computers\')]";
	static String DicktopCSS =".item-box:nth-child(1) img";
	static String First_itemCSS = ".item-box:nth-child(1) .product-box-add-to-cart-button";
	    
	
	
	static String   HardtypeCSS = "#product_attribute_input_3 li:nth-child(1) > label";
	static String   EmailIDOrderNowID = "add-to-cart-button-1";
	static String ElectronisXpath = "//a[contains(text(),'Electronics')]";
	static String	CameraCSS = ".item-box:nth-child(1) img";                             
	static String   OrderNowID2 = "add-to-cart-button-14";
	
	
    static String CartCSS = ".cart-label";
    static String termsofserviceID = "termsofservice";
    static String checkoutID = "checkout"; 
	  
	
    static String  EmailID = "Email";
    static String CheckoutCSS = ".checkout-as-guest-button";
    static String  FirstNameID =  "BillingNewAddress_FirstName";
    static String  LastNameID =  "BillingNewAddress_LastName";
    static String  EmailID2 =  "BillingNewAddress_Email";
    static String  CompanyID =  "BillingNewAddress_Company";
    static String  FirstName =  "Abanob";
    static String  LastName =  "Abdelmalek";
    static String  Email =  "abanob_emad_1994@hotmail.com";
    static String  Company =  "PayMob";  
    
	static String  CountryId = "BillingNewAddress_CountryId";
	static String  CountryIdID = "//option[. = 'Egypt']"	;	
	
    static String  CityID =  "BillingNewAddress_City";
    static String  Address1ID =  "BillingNewAddress_Address1";
    static String  Address2ID =  "BillingNewAddress_Address2";
    static String  ZipPostalCodID =  "BillingNewAddress_ZipPostalCode";
    static String  PhoneNumberID =  "BillingNewAddress_PhoneNumber";
    static String  FaxNumberID =  "BillingNewAddress_FaxNumber";  
    
    
    static String  City =  "Cairo";
    static String  Address1 =  "Test Address 1";
    static String  Address2 =  "Test Address 2";
    static String  ZipPostalCod =  "31111";
    static String  PhoneNumber =  "01220300950r";
    static String  FaxNumber =  "04033435554";  
    static String button = "#add-to-cart-button-1";
    
    static String  ConCSS =  ".new-address-next-step-button:nth-child(1)";  
    
                             
    static String CON1CSS = ".shipping-method-next-step-button";
    static String CON2CSS = ".payment-method-next-step-button";
    static String paymentmethod = "paymentmethod_1";
    static String CardNumber = "4111 1111 1111 1111";
    static String CardNumberID = "CardNumber";
    static String CardName = "Abanob Emad";
    static String CardnameID = "CardholderName";     
    static String CON3CSS = ".payment-info-next-step-button";
    static String CON4CSS = ".confirm-order-next-step-button";
    static String CON5CSS = ".order-completed-continue-button";

    
    
    
    static String   ExpireMonth = "ExpireMonth";
    static String   ExpireMonthID = "//option[. = '03']";
    static String  ExpireYear = "ExpireYear";
	  
    static String  ExpireYearID =  "//option[. = '2030']";
    static String  CardCode = "123";
    static String  CardCodeID = "CardCode";
	  
	  
	  
	 public static void StartBrowser() {
	    	System.setProperty(DriverKey,DriverPath);
	 	   driver = new FirefoxDriver();
	 	   driver.get(URL);
	    	
	    }
}