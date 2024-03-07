package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swaglabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Initialization
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				
				driver.get("https://www.saucedemo.com/");
				driver.manage().window();
				Thread.sleep(1000);
				
				//login
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(1000);
				driver.findElement(By.id("login-button")).click();
		 
				//title match
				String ExpectedLink = "https://www.saucedemo.com/inventory.html";
				String ActualLink = driver.getCurrentUrl();
				
				//System.out.println(ActualTitle);
				if(ExpectedLink.equals(ActualLink))
				{
					System.out.println("Matched! Logged in into the right url");
				}
				else System.out.println("Didn't matched!Logged in into the wrong url");
	
				Thread.sleep(1000);
				//add to cart a product by clicking the add cart button
				driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
				
				Thread.sleep(1000);
				//clicking the add to cart icon
				driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
				
				Thread.sleep(1000);
				//checkout the add to cart item
				driver.findElement(By.xpath("//button[@id='checkout']")).click();
				
				Thread.sleep(1000);
				//input firstname, lastname & zipcode
				driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Md Aminul");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Islam");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1216");
				
				
				//clicking continue button
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				
				Thread.sleep(1000);
				//clicking the finish button to place the order
			    driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
			    
	
	}

}
