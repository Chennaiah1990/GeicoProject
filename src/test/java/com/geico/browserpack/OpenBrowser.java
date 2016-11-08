package com.geico.browserpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.geico.reusablepack.ReUsableFunction;

public class OpenBrowser {
	public ReUsableFunction refunobject;
	@Parameters({"browser","url"})
	@BeforeTest
	public void openBrowser(String browser,String url)
	{
		if(browser.equals("FF"))
		{
			refunobject = PageFactory.initElements(new FirefoxDriver(), ReUsableFunction.class);
			
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Driver Server\\IEDriverServer.exe");
			refunobject = PageFactory.initElements(new InternetExplorerDriver(), ReUsableFunction.class);
			
		}
		else if(browser.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Driver Server\\chromedriver.exe");
			refunobject = PageFactory.initElements(new ChromeDriver(), ReUsableFunction.class);
			
		}
		refunobject.openURL(url);
	} 
  @AfterTest
  public void stop()
  {
	  refunobject.stopDriver();
  }
 /* @AfterSuite
  public void sendMail() throws Exception
	  {
	    //Zip.zipFolder("F:\\Selenium_Scripts_Feb15\\Hybrid\\test-output","F:\\Selenium_Scripts_Feb15\\Hybrid\\Results\\"+"Reports.zip");    
	    Zip.zipFolder(System.getProperty("user.dir")+"\\Reports",System.getProperty("user.dir")+"\\Results\\"+"Reports.zip");
	    String[] to={"qtt.selenium.sep@gmail.com"};
	    String[] cc={"qtt.selenium@gmail.com"};
	    String[] bcc={};

	    //This is for google
        SendMail.sendMailTo("qtt.selenium.sep@gmail.com",
	                         "selenium4567",
	                          "smtp.gmail.com",
	                          "465",
	                          "true",
	                          "true",
	                           true,
	                          "javax.net.ssl.SSLSocketFactory",
	                          "false",
	                          to,
	                          cc,
	                          bcc,
	                          "Automation Reports",
	                          "Please find the reports attached in the mail.\n\n Regards\nWebMaster",
	                          System.getProperty("user.dir")+ "\\Results"+"\\Reports.zip",
	                          "Reports.zip"); 
	 }
*/

}