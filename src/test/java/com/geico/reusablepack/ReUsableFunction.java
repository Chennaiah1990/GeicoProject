package com.geico.reusablepack;

import org.openqa.selenium.WebDriver;

import com.geico.locaterspack.Locaters;

public class ReUsableFunction extends Locaters {

	public ReUsableFunction(WebDriver driver) {
		super(driver);
	}
	public void logIn(String usrname,String usrpassword)
	{
		//enter the username
		username.sendKeys(usrname);
		//enter passwoard
		userpassword.sendKeys(usrpassword);
		//click the log in button
		loginbutton.click();
	}
	public void stopDriver() {
		driver.close();
		// TODO Auto-generated method stub
		
	}
	public void openURL(String url) {
		// TODO Auto-generated method stub
		driver.get("http://183.82.118.175:8080/geico-v02/");
	}

}
