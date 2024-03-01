package task16;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoblazeTitleVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");            //navigation to chrome driver
		driver.manage().window().maximize();                 //Maximizing browser window
		String expectedTitle="STORE";                        //title of the page
		String actualTitle=driver.getTitle();                //getting the title of the page
		System.out.println(actualTitle);                     //printing the actual title
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))      //condition for verifying the title
		{
			System.out.println("Page landed on the correct website");
			System.out.println("The home page title is: " + actualTitle);
		 }
	    else
		 {
			 System.out.println("Page landed on the correct website");
		 }
		        driver.close();
	}

	
}
