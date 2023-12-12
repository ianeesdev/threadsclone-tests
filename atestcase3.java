package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atestcase3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/sign-in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        WebElement g_mail = driver.findElement(By.name("Email"));
        g_mail.sendKeys("Anees212@gmail.com");
        
        driver.findElement(By.name("next")).click();

        
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("qwerty123456");
        
        driver.findElement(By.name("sign")).click();
        String expected_title= "Threads";
        String actual_title=driver.getTitle();
        if(expected_title.equals(actual_title)) {
            System.out.println("Sign in Successfully.");
        }
        else {
            System.out.println("Sign in Failed");


        }


	}

}
