package Kumar.SeleniumConcept.Scenarios;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handling_JavaScript {
	
	ChromeDriver driver;
	@Before
	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("file:///P:/Project%20Work/UiAutomationPlayground/index.html");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.id("email")).sendKeys("Kumar@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Kumar@123");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
	}
	
	@Test
	public void testHandlingJavaScriptAlert() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("file:///P:/Project%20Work/UiAutomationPlayground/index.html");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.id("email")).sendKeys("Kumar@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Kumar@123");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		driver.findElement(By.xpath("//*[text()='Handling Javascript Alert']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		
		//driver.findElement(By.xpath("//*[contains(text(),'Get Alert')]")).click();
		
		driver.switchTo().alert().dismiss();
		
		String expectedResult="You pressed Cancel!"; 
		
		String actualResult= driver.findElement(By.xpath("//*[@id='alert']")).getText();
		
		Assert.assertEquals(expectedResult, actualResult);
		
		}
	    @Test
	    public void javaScriptPromptBox() {
	   
	    driver.findElement(By.xpath("//*[text()='Handling Javascript Alert']")).click();
	    driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
	    
	    driver.switchTo().alert().sendKeys("Mr.kumar");
	    driver.switchTo().alert().accept();
			
		String expectedResult="Hello Mr.kumar! How are you today? "; 
			
		String actualResult= driver.findElement(By.xpath("//*[@id='prompt']")).getText();
			
		Assert.assertEquals(expectedResult, actualResult);
	    
		
	}
}