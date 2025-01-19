package Kumar.SeleniumConcept.Scenarios;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFileUpload {
	WebDriver driver;

	@Test
	public void checkFileupload() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriver driver = WebDriverManager.chromedriver().create();
		//ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);

		//WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

		WebElement uploadInput = driver.findElement(By.xpath("//*[@id='myFile']"));
		
		uploadInput.sendKeys("C:\\Users\\ASUS\\Downloads\\Selenium Notes-24-Dec-24.txt");
		//Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
