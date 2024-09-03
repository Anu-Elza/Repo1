package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentsel1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("passing message");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		showMessageButton.click();
		String text=showMessageButton.getText();
		System.out.println(text);
		String bgcolor=showMessageButton.getCssValue("background-color");
		System.out.println(bgcolor);
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("1");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("2");
		WebElement getTotalButton=driver.findElement(By.id("button-two"));
		getTotalButton.click();
		String text1=getTotalButton.getText();
		System.out.println(text1);
		String bgcolor1=getTotalButton.getCssValue("background-color");
		System.out.println(bgcolor1);
		
		
		

	}

}
