package AshishGroupId1.AshishArtifactId1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\askumar\\eclipse-workspace\\AshishArtifactId1\\lib\\chromedriver.exe"); 
    	WebDriver wd =new ChromeDriver();
    	String baseUrl = "https://www.google.com";
    	wd.get(baseUrl);
    	System.out.println("Hello theer");
    }
}
