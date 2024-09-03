package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all=driver.findElement(By.id("searchDropdownBox"));
		String toolTipValue=all.getAttribute("title");
		System.out.println(toolTipValue);
	}

}