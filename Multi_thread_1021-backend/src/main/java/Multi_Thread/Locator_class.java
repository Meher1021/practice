package Multi_Thread;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_class extends Basic {
	
 public void locators(){
	 
	WebElement search = driver.findElement(By.xpath("//*[@id='input']"));
	search.sendKeys("ISKCON");
	driver.findElement(By.xpath("//*[@id='input']")).submit();
  driver.findElements(By.xpath("//div[@class = 'yuRUbf']")).stream().forEach(ele ->System.out.println(ele.getText()));
 }
	public void teardown() {
		driver.quit();
	}
	
	

}
