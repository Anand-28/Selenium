package rohit;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class meesho {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AJAY SOMINATH DHAKNE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.chess.com/login");
		d.findElement(By.id("username")).sendKeys("dhadiwal.anand@gmail.com");

		
		
		d.findElement(By.id("password")).sendKeys("Anand@28");  
		d.findElement(By.xpath("//*[@id=\"login\"]")).click(); 
		d.findElement(By.xpath("//*[@class=\"play-quick-links-icon play-quick-links-play\"]")).click(); 
		d.findElement(By.xpath("//*[@class=\"ui_v5-button-component ui_v5-button-primary ui_v5-button-large ui_v5-button-full\"]")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://www.chess.com/home"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		

	}

}
