package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atestcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/sign-up?after_sign_up_url=http%3A%2F%2Flocalhost%3A3000%2F&after_sign_in_url=http%3A%2F%2Flocalhost%3A3000%2Fonboarding");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        WebElement usrname = driver.findElement(By.name("username"));
        usrname.sendKeys("oyyabdullah");
        
        WebElement usr_mail = driver.findElement(By.name("email"));
        usr_mail.sendKeys("abdullah212@gmail.com");
        
        WebElement pswd = driver.findElement(By.name("Passd"));
        pswd.sendKeys("abdullah123456");
        
        driver.findElement(By.name("continue")).click();
        String expected_title= "Threads-sigup";
        String actual_title=driver.getTitle();
        if(expected_title.equals(actual_title)) {
            System.out.println("Sign up Successfully.");
        }
        else {
            System.out.println("Sign up Failed");


        }

	}

}
