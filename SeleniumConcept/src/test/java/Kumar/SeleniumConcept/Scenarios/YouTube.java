package Kumar.SeleniumConcept.Scenarios;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	 {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=//www.naukri.com/mnjuser/profile?id=&altresid");
		
	}
}
