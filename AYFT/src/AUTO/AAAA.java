package AUTO;
import org.openqa.selenium.chrome.ChromeDriver;


public class AAAA {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","..//AYFT/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
