package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newTab = driver.findElement(By.xpath("//button[text()='New Tab']"));
		newTab.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		for (String childWindow : allWindows) {
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement samplePage=driver.findElement(By.id("sampleHeading"));
				String text=samplePage.getText();
				System.out.println(text);

			}
		}
		driver.switchTo().window(parentWindow);
		

	}

}
