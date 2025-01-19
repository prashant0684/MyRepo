package Kumar.SeleniumConcept.Scenarios;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRecordCreation {

	WebDriver driver;

	@Test
	public void handlingRecordCreation() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.navigate().to("file:///C:/Users/ASUS/Downloads/UiAutomationPlayground/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);

		// Do login
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Kiyad");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
		Thread.sleep(2000);

		// Go to Handling Record Creation
		driver.findElement(By.xpath("//*[text()='Handling Record Creation']")).click();

		// Add Prescription Page
		driver.findElement(By.xpath("//*[@id='patientname']")).sendKeys("Mr.Kumar");

		// Prescription No.

		String PrescriptionNumber1 = driver.findElement(By.xpath("//*[@id='presnumber']")).getText();

		// Age
		driver.findElement(By.xpath("//*[@id='age']")).sendKeys("26");

		// Locating and Clicking Radio Button By using I
		driver.findElement(By.xpath("//*[@id='male']")).click();

		// Select Allergy
		driver.findElement(By.xpath("//*[@id='medicine1']")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//*[@name='medicine1']/option"));

		for (WebElement e : elementList) {

			if (e.getText().equals("Paracetamol")) {
				e.click();

			}
			
		}
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();

			// Medication details
			String PrescriptionNumber2 = driver.findElement(By.xpath("//*[@id='presnumber']")).getText();
			assertEquals("prescription message is not correct", PrescriptionNumber1, PrescriptionNumber2);

			// Select Medication
			Myfunction.DropdownScript(driver, "//*[@id='medication']", "Cetirizine");

			// Start Date
			driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("01/11/2025");

			// Duration (Days)
			driver.findElement(By.xpath("//*[@id='duration']")).sendKeys("7");

			// Doctor Notes
			driver.findElement(By.xpath("//*[@id='notes']")).sendKeys("Hello Mr.Kumar");

			// Submit
			driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();

			// Prescription Page Added successfully
			String actualMsg = driver
					.findElement(By.xpath(
							"//*[contains(text(),'Prescription for patient Kiyansh Sahu is added successfully')]"))
					.getText();
			String expectedMsg = "Prescription for patient Kiyansh Sahu is added successfully";

			Assert.assertEquals(expectedMsg, actualMsg);

		}

	}

