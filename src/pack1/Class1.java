package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
//Comment messahe
driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
String s = driver.getCurrentUrl();
System.out.println(s);
String s1 = driver.getTitle();
System.out.println(s1);
	}

}
