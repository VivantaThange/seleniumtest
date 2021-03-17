package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndScroll {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.guru99.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor j=((JavascriptExecutor) d);
		j.executeScript("scroll(0.2000)");
		WebElement cource = d.findElement(By.xpath("//i[@class='fa fa-check-square-o']"));
		
		Select s=new Select (cource);
		s.selectByVisibleText("Testpad");
		
		//d.findElement(By.xpath(""))
		
	}

}

