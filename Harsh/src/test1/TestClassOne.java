package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tinug\\Desktop\\Selenium\\chromedriver_win321\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.firmex.com/");
		
		System.out.println(d.getCurrentUrl()); 
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		d.findElement(By.cssSelector("a.button.login")).click();
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		d.findElement(By.xpath("//*[@id=\'login_user\']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		d.findElement(By.xpath("//*[@id='username_btn']")).click();
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		d.findElement(By.xpath("//*[@id=\'login_pw\']")).sendKeys("password");
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		d.findElement(By.cssSelector("input#login_btn.btn.btn-blue.rounded.w100")).click();
		Thread.sleep(2000);  //Wait added so that results can be viewed comfortably.
		
		//String expected_msg = new String ("Click here to reset your password");
		
		// The comment above is a different message to check what happens if both strings are not equal.
		
		String expected_msg = new String ("User credentials are invalid. Click here to reset your password");
		
		String actual_msg = new String (d.findElement(By.xpath("//*[@id=\'loginForm\']/div[4]/div[1]/p")).getText());
		
		System.out.println("Actual message is: " +actual_msg);
		
		
		if(expected_msg.equals(actual_msg))
		{
			System.out.println("Verification Successful");
		}
		else
		{
			System.out.println("Verification Failed");
		}
		
		Thread.sleep(5000);
		
		
				
		d.quit();
		
	}

}
