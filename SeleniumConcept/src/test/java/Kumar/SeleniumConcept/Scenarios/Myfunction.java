package Kumar.SeleniumConcept.Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myfunction {

	public static void DropdownScript(WebDriver driver, String xpath, String value) {

		driver.findElement(By.xpath(xpath)).click();
		String xpath2 = xpath + "/option";

		List<WebElement> elementList = driver.findElements(By.xpath(xpath2));

		for (WebElement e : elementList) {

			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
}