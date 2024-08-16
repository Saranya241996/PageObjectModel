package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.driver.chrome", "/Users/admin/Downloads/chromedriver-mac-x64/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.quit();
		
		

	}

}
