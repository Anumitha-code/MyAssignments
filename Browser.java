package weel1.day2;

public class Browser {

	
		// TODO Auto-generated method stub
		public void launchBrowser(String browserName)
		{
			System.out.println("BrowserName is"+  browserName);
		}
		 String loadUrl() {
	        return "Url loaded successfully";
	    }
		public static void main(String[] args) {
			// Create object of Browser
	        Browser browser = new Browser();
	        
	        browser.launchBrowser("chrome");
	        
	        String loadurlvalue=browser.loadUrl();
	        System.out.println(loadurlvalue);
	}

	
}
