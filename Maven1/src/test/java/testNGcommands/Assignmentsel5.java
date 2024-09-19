package testNGcommands;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Assignmentsel5 {
	WebDriver driver;

	@Test(enabled=false,priority = 1)
	public void verifyTextOfSearchButton() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		WebElement workers = driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();
		WebElement searchLabel = driver.findElement(By.xpath("//button[text()='Search']"));
		// Assertion
		String actualResult = searchLabel.getText();
		String expectedResult = "Search";

		SoftAssert sample = new SoftAssert();
		sample.assertEquals(actualResult, expectedResult);// soft assertion
		sample.assertAll();
	}

	@Test(priority = 2,retryAnalyzer=testNGcommands.RetryAnalyser.class)
	public void verifyFontSizeOfSearchButton() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		WebElement workers = driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();
		WebElement searchLabel = driver.findElement(By.xpath("//button[text()='Search']"));
		// Assertion
		String actualResult = searchLabel.getCssValue("font-size");
		String expectedResult = "14px";

		SoftAssert sample = new SoftAssert();
		sample.assertEquals(actualResult, expectedResult);// soft assertion
		sample.assertAll();
	}

	@Test(priority = 3)
	public void verifyTitleFromDropdown() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		WebElement workers = driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();
		WebElement createWorker = driver.findElement(By.xpath("//a[text()='Create Worker']"));
		createWorker.click();
		WebElement dropDown = driver.findElement(By.id("worker-title"));
		Select select = new Select(dropDown);
		select.selectByValue("Mr");
		WebElement dropDown1 = select.getFirstSelectedOption();

		// Assertion
		String actualResult = dropDown1.getText();
		String expectedResult = "Mr";

		SoftAssert sample = new SoftAssert();
		sample.assertEquals(actualResult, expectedResult);// soft assertion
		sample.assertAll();

	}

	@Test(priority = 4)
	public void verifyCheckboxFromClientMenu() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		WebElement clients = driver.findElement(By.xpath("//a[text()='Clients']"));
		clients.click();
		WebElement createClient = driver.findElement(By.xpath("//a[text()='Create Client']"));
		createClient.click();
		WebElement requirePocheckBox = driver.findElement(By.xpath("//input[@id='client-require_po']"));
		requirePocheckBox.click();

		// Assertion
		Boolean actualResult = requirePocheckBox.isSelected();
		Boolean expectedResult = true;

		SoftAssert sample = new SoftAssert();
		sample.assertEquals(actualResult, expectedResult);// soft assertion
		sample.assertAll();

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String d) {
		if(d.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(d.equals("edge"))
		{
			driver = new EdgeDriver();	
		}
		else if(d.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
