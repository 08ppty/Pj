package com.ninjaDemo.qa.TestPages;




 

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import com.ninjaDemo.qa.Base.TestBase;
 
import com.ninjaDemo.qa.pages.MediCareHome;

 
public class RegisterMediCare extends TestBase {

	MediCareHome hp;

	@BeforeClass
	public void OpenApp() throws MalformedURLException {

		openBrowser("Chrome");
		hp = new MediCareHome(driver);
	}

	@Test(priority = '1')
	public void RegisterToMediCareAccountWithName() throws InterruptedException,MalformedURLException {

		 
		hp.RegisterToMediCareAccountWithName();
		Thread.sleep(100);
		hp.RegisterToMediCareAccountWithEmail();
		Thread.sleep(100);
		hp.RegisterToMediCareAccountWithPassword();
		Thread.sleep(500);
		hp.RegisterToMediCareAccountWithRegister();
		Thread.sleep(900);
		hp.AddToCart();
		Thread.sleep(800);

	}

	 

	@AfterClass
	public void CloseApp() {

		 
	}

}
