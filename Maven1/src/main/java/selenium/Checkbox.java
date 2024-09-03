package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();	
		Boolean checkBox1=checkBox.isSelected();
		System.out.println(checkBox1);
		}

}
