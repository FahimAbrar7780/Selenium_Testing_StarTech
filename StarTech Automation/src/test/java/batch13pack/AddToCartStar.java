package batch13pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     
	     //goto the site
	     driver.get("https://www.startech.com.bd/");
	     //search for the product
	     driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div[2]/div[1]/i")).click();
	     driver.findElement(By.xpath("/html/body/header/div/div/div[2]/input")).click();
	     driver.findElement(By.xpath("/html/body/header/div/div/div[2]/input")).sendKeys("Asus");
	     driver.findElement(By.xpath("/html/body/header/div/div/div[2]/button")).click();
	     
	     //select the product
	     driver.findElement(By.linkText("Asus UT280 Wired Optical Mouse")).click();
        
	     //scroll window
	     JavascriptExecutor jse=(JavascriptExecutor) driver;
	     jse.executeScript("window.scrollBy(0,400)");
	     //add to cart
	     driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[2]/div/div[4]/label[2]")).click();
	     driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[2]/div/div[5]/button")).click();

	}

}
