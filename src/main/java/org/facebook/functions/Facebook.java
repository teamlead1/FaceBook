package org.facebook.functions;

public class Facebook extends Base{

	public static void main(String[] args) {
		driver();
		loadurl("https://www.facebook.com/");
		Loginpage p= new Loginpage();
		type(p.getTxtuser(),"snaveenece12@gmail.com");
		type(p.getTxtpass(),"9486492399");
		btnclick(p.getBtnlogin().get(0));
		quitBrowser();
		
		

	}

}
