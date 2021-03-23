package seleniumeasy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliders {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl="http://www.google.com/";
        driver.get(baseUrl);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("selenium easy demo");
        search.submit();
        driver.findElement(By.className("l")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Pop up opens");
      	driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
      	System.out.println("closed");
      	driver.findElement(By.linkText("Progress Bars & Sliders")).click();
        driver.findElement(By.linkText("JQuery Download Progress bars")).click();
        WebElement button=driver.findElement(By.id("downloadButton"));
        button.click();
        System.out.println("Successfully downloaded");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement close=driver.findElement(By.className("ui-dialog-buttonset"));
        close.click();
      	System.out.println("Pop up message closed");
      	//sliders//
      	driver.findElement(By.linkText("Progress Bars & Sliders")).click();
        driver.findElement(By.linkText("Bootstrap Progress bar")).click();
      	WebElement dwnld=driver.findElement(By.id("cricle-btn"));
      	dwnld.click();
      	System.out.println("Bootstrap progress is completed");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      	
      	//drag and drop//
      	driver.findElement(By.linkText("Others")).click();
      	driver.findElement(By.linkText("Drag and Drop")).click();
      	WebElement From=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
        WebElement To=driver.findElement(By.xpath("//div[@id='mydropzone']"));	
        Actions act=new Actions(driver);					
        //to drag and drop//
        act.dragAndDrop(From, To).build().perform();
      	
        //dynamic data loading//
        driver.findElement(By.linkText("Others")).click();
      	driver.findElement(By.linkText("Dynamic Data Loading")).click();
      	WebElement user=driver.findElement(By.id("save"));
      	user.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      	driver.findElement(By.xpath("//button[text()='Get New User']")).click();
      	
      	}


}
