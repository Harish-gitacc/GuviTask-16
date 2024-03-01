package task16;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaHistory 
{

	public static void main(String[] args) 
      {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");  //Opening wikipedia in chrome browser
		driver.manage().window().maximize();       //Maximizing browser window
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");   //Searching for Artificial Intelligence
                driver.findElement(By.xpath("//button[@type='submit']")).click();    // Clicking the search button
                driver.findElement(By.xpath("//li[@id='ca-history']")).click();      // Clicking the view history
                String actualTitle= driver.getTitle();     //get the title from the page
                System.out.println("The title of this Web Page is : " + actualTitle);     // printing the page title
                driver.close();
	}

}
