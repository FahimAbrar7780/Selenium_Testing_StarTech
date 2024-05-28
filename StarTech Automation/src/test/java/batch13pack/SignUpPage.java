package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     //goto the site
	     driver.get("https://www.startech.com.bd/");
	     
	     //goto the  account section
	     driver.findElement(By.linkText("Account")).click();
	     //goto sign up
	     driver.findElement(By.linkText("Create Your Account")).click();
	     //sending first name
	     driver.findElement(By.id("input-firstname")).sendKeys("Fahim");
	     //sending last name
	     driver.findElement(By.id("input-lastname")).sendKeys("Abrar");
	     //sending email
	     driver.findElement(By.id("input-email")).sendKeys("fahimabrarcse7780@gmail.com");
	     //sending phone number
	     driver.findElement(By.id("input-telephone")).sendKeys("01315320105");
	     //clicking sign-up button
	     driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/form/button")).click();

	}

}
