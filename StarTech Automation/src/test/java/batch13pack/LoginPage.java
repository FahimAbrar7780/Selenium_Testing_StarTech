package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     
	     //goto the site
	     driver.get("https://www.startech.com.bd/");
	     //goto login section
	     driver.findElement(By.linkText("Account")).click();
	     //sending user name
	     driver.findElement(By.id("input-username")).sendKeys("01315320105");
	     //sending password
	     driver.findElement(By.id("input-password")).sendKeys("abrar");
	     //clicking login
	     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/form/button")).click();
	}

}
