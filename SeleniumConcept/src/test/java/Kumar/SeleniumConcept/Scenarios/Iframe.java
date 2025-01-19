package Kumar.SeleniumConcept.Scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	WebDriver driver;

	@Test
	public void testHandlingDropdown() throws InterruptedException {

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
	    
		// Go to Handling Iframe
		driver.findElement(By.xpath("//*[contains(text(),'Handling Iframe')]")).click();
		driver.findElement(By.xpath("//*[@id='customername']")).sendKeys("Kumar");
		WebElement Iframe =driver.findElement(By.xpath("//*[@id='frame']"));
		driver.switchTo().frame(Iframe);
		driver.findElement(By.xpath(" //*[@id='patientname']")).sendKeys("Deepak");
		
		/*driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='customername']")).clear();
		driver.findElement(By.xpath("//*[@id='customername']")).sendKeys("khushi");*/
		
		//Age
		WebElement Age =driver.findElement(By.xpath("//*[@id='frame']"));
	}
}








