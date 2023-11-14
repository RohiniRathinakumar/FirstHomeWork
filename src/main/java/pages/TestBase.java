package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver119.exe");
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	public void takeScreenShot(WebDriver driver) 	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		/*
		 * SimpleDateFormat formatter=new SimpleDateFormat("MMDDYY_HHmmss"); Date
		 * date=new Date(); String label=formatter.format(date);
		 */
		try {
			FileUtils.copyFile(file,new File("./Screenshots/Image1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int generateRandomNumber(int boundryNumber) {
		Random rnd =new Random();
		int bound=rnd.nextInt(boundryNumber);
		return bound;
	}
	public void tearDown() 	{
		driver.close();
		driver.quit();
	}

}
