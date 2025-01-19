package Kumar.SeleniumConcept.Scenarios;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElements {

	@Test
	public void checkFileupload() {

		boolean isCountryPresent = false;
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "//drivers//chromedriver.exe");
		// driver = new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);

		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> countryList = driver.findElements(By.xpath("//*[@id='customers']//tr//td[3]"));
		for(WebElement item : countryList) {
         if(item.getText().equals("Austria")) {
			isCountryPresent = true;
			break;
		}

		Assert.assertTrue(isCountryPresent);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		}}}

