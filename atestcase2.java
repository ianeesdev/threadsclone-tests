package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atestcase2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        WebElement message= driver.findElement(By.id("name-field"));
        message.sendKeys("byte");
        WebElement message_url= driver.findElement(By.id("slug-field"));
        message.sendKeys("http://byte/limited");
        WebElement submit_name = driver.findElement(By.className("cl-formButtonPrimary"));
    	submit_name.click();

    	String expected_title= "Threads";
        String actual_title=driver.getTitle();
        if(expected_title.equals(actual_title)) {
            System.out.println("Organization created Successfully.");
        }
        else {
            System.out.println("Failed.");


        }
    	
        
       
        
        
        

	}

}
