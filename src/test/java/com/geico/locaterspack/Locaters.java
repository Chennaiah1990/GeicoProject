package com.geico.locaterspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locaters {
	public WebDriver driver;
	public Locaters(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//label[contains(text(),Username)]/following::input") public WebElement username;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::input[@type='password']") public WebElement userpassword;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::div[@align='center']/descendant::input") public WebElement loginbutton;
	@FindBy(xpath="//form[@name='ShippingBean']/descendant::div[@align='center']/descendant::input/following-sibling::input") public WebElement forgotpasword;
	@FindBy(xpath="//a[contains(text(),'Log Out')]/self::a") public WebElement logoutbutton;
}
