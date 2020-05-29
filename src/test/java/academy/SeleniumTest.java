package academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void sele() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\UX017292\\chrome\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("https://www.google.com");
 driver.findElement(By.className("a4bIc")).click();
 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("W3schools");
 driver.findElement(By.className("gNO89b")).click();
 System.out.println(driver.getTitle());
}
	@Test
	public void sele1() {
 System.out.println("sele1 testcase 2");
}
}
