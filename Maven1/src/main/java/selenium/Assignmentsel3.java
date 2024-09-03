package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentsel3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropDown=driver.findElement(By.id("multi-select-field"));
		Select select=new Select(dropDown);
		select.selectByIndex(0);
		select.selectByVisibleText("Yellow");
		//List<WebElement> dropDown1=select.getAllSelectedOptions();
		//System.out.println(dropDown1);
		List<WebElement> dropDown1 = select.getAllSelectedOptions();
		for (WebElement option : dropDown1) {
		    System.out.println(option.getText());
		}

	}

}