package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class atestcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/sign-up?after_sign_up_url=http%3A%2F%2Flocalhost%3A3000%2F&after_sign_in_url=http%3A%2F%2Flocalhost%3A3000%2Fonboarding");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
        WebElement searchBox = driver.findElement(By.id("text_search"));
        searchBox.sendKeys("Anees");
        searchBox.sendKeys(Keys.RETURN);
        WebElement searchResult = driver.findElement(By.xpath("//div[@class='result-text']"));
        String actualResultText = searchResult.getText();
        String expectedPropertyName = "Anees";

        if (actualResultText.contains(expectedPropertyName)) {
            System.out.println("Search successful! Found property" );
        } else {
            System.out.println("Search failed! Property not found" );
            
        }




	}

}
