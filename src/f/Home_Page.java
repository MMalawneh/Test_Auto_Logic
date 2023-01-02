package f;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_Page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		int expect = 6 ;
		
		List<WebElement> myButtons = driver.findElements(By.className("btn"));
		
		for (int i =0; i<myButtons.size();i++) {
			
			myButtons.get(i).click();
			
			
		}
		String actu = driver.findElement(By.className("shopping_cart_badge")).getText();
		int actual = Integer.parseInt(actu);
		Assert.assertEquals(actual, expect);
		//Assert.assertEquals(expect, expect);
		
		//driver.findElement(By.className("cart_quantity")).getText().
		
		//String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, "Swag Labs");
		
		
	}

}
