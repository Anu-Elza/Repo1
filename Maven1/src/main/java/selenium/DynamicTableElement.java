package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		String locator=null;
		List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]"));
		for(int i=0;i<firstColumn.size();i++)
		{
		if(firstColumn.get(i).getText().equals("Ashton Cox"))
		{
		locator="//table[@id='dtBasicExample']//tbody//tr[" +(i+1) +"]//td[4]";
		break;
		}
		}
    WebElement dynamicTable=driver.findElement(By.xpath(locator));
    String text=dynamicTable.getText();
    System.out.println(text);
    }

}
