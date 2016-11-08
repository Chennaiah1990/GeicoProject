package GeicoGroup.Geico;

import org.testng.annotations.Test;

import com.geico.browserpack.OpenBrowser;

public class LoginSenario extends OpenBrowser {
	@Test
	public void loginsenariomethod(String username,String password)
	{
		refunobject.logIn("admin","test");
	}

}