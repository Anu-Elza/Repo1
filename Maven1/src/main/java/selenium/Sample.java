package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");// Navigate to a url
		String currenturl=driver.getCurrentUrl();// get current url
		driver.navigate().to("https://ww.google.com/");
		System.out.println(currenturl);
		String title=driver.getTitle();//get title
		System.out.println(title);
		String htmlcode=driver.getPageSource();//get html code the page
		System.out.println(htmlcode);
		driver.manage().window().maximize();// maximizing the window
		driver.navigate().back();//clicking back button
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();//deleting cookies
		//driver.close();//closing the current window that is focused
		driver.quit();//closing all windows and kill driver instance
		
		
		}
}
