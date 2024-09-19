package selenium;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentsel4 {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.qabible.in/payrollapp/site/login");
	 driver.manage().window().maximize();
	 WebElement userName=driver.findElement(By.id("loginform-username"));
	 userName.sendKeys("carol");
	 WebElement password=driver.findElement(By.id("loginform-password"));
	 password.sendKeys("1q2w3e4r");
	 WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	 loginButton.click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Workers']")));
	 WebElement workers=driver.findElement(By.xpath("//a[text()='Workers']"));
	 workers.click();	
	 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait1.until(ExpectedConditions.textToBe(By.xpath("//button[text()='Search']"), "Search"));
	 String locator=null;
		List<WebElement> Num=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//td[1]"));
		for(int i=0;i<Num.size();i++)
		{
		if(Num.get(i).getText().equals("3"))
		{
		locator="//table[@class='table table-striped table-bordered']//tbody// tr[" + (i+1) + "]//td[8]//a[3]";
		break;
		}
		}
	 
	 WebElement deleteButton=driver.findElement(By.xpath(locator));
	 deleteButton.click();
	 wait.until(ExpectedConditions.alertIsPresent());
	 
	 
	}

}

