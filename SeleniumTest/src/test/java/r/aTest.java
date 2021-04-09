package r;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class aTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void before() {
		
		System.out.println("before starting the test");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}

	
	@Test
	public void test(){
		
		System.out.println("Starting the test");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("code academy");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).click();
	}
	
	@AfterTest
	public void after() {
		
		System.out.println("After completing the test");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
}
