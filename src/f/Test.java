package f;

import java.io.File;
import java.io.IOException;

import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver","C:\\Edgedriver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
           Date currentDate = new Date();
		String newDate = currentDate.toString().replace(":", "_");
		
		TakesScreenshot src = ((TakesScreenshot)driver);
		
		File srcFile =src.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(".//Auto-Screenshots/"+newDate+".png");
		FileUtils.copyFile(srcFile, dest);
		
	}

}
