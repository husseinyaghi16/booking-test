import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regsetr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivir\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\www.booking.com");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("husseinyaghi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"new_password\"]")).sendKeys("Psdkpflp251216");
driver.findElement(By.xpath("//*[@id=\"confirmed_password\"]")).sendKeys("Psdkpflp251216");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button")).click();

	}

}
