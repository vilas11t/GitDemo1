package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static Properties pr;

	public WebDriver browserSelect() throws IOException {

		pr = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Vilas\\MavenProject\\src\\main\\java\\resources\\data.properties");

		pr.load(fis);

		System.out.println(pr.getProperty("browser"));

		if (pr.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Java_Selenium_Course\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
