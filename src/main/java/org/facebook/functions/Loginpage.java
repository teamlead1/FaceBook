package org.facebook.functions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Base {

	public Loginpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtuser ; 
	@FindBy(id="pass")
	private WebElement txtpass ;
	@FindBy(xpath="//input[@value='Log In']")
	private  List<WebElement> btnlogin ;
	public WebElement getTxtuser() {
		return txtuser;
	
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public List<WebElement> getBtnlogin() {
		return btnlogin;
	}
	
}
