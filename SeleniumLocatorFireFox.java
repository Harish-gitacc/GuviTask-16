package task16;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocatorFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();       //maximizing FireFox browser
		driver.get("https://www.google.com/?gws_rd=ssl");    //navigating to google drive
		System.out.println(driver.getCurrentUrl());       //Printing the current url of the page
		driver.navigate().refresh();   //  navigating the web page
		driver.close();
		
	}

}
