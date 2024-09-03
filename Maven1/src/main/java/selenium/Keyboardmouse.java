package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardmouse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement doubleClick1=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleClick1).perform();
		WebElement rightClick1=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightClick1).perform();
		action.sendKeys(Keys.F5).perform();
		action.moveToElement(doubleClick1).perform();
		

	}

}
