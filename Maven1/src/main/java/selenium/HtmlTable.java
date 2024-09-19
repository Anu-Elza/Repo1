package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for (int i = 0; i < firstRow.size(); i++) {
			String text = firstRow.get(i).getText();
			System.out.println(text);
		}
		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]"));
		for (int i = 0; i < firstColumn.size(); i++) {
			String textColumn = firstColumn.get(i).getText();
			System.out.println(textColumn);
		}

	}

}
