import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class shot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARBANI\\eclipse-workspace1\\Green Tech\\Screen\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
		File dec= new File("C:\\Users\\SARBANI\\eclipse-workspace1\\Green Tech\\Screen\\screenshot.png");
		Files.copy(scr,dec);
	}

}
