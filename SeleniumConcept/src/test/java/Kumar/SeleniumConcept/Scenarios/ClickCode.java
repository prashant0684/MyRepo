package Kumar.SeleniumConcept.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Clickcode{
	public static void ClickUsingJavaScript(WebDriver driver, String xpath) {
			
			WebElement element = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		     
	}
}



 