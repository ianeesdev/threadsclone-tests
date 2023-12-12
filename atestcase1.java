package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class atestcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
		        driver.get("http://localhost:3000/create-thread");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		        WebElement message= driver.findElement(By.id(":r8:-form-item"));
		        message.sendKeys("new application has been deployed successfully");
	        	WebElement post_thread = driver.findElement(By.id("submit"));
	        	post_thread.click();
	        	

	        	String expected_title= "Threads";
	            String actual_title=driver.getTitle();
	            if(expected_title.equals(actual_title)) {
	                System.out.println("Threads posted Successfully.");
                }
	            else {
	                System.out.println("Failed.");


	            }


	}

}
