package seleniumeasy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_modals {
	public static void  main(String args[]) {
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
      	//bootstrap alerts//
      	driver.findElement(By.linkText("Alerts & Modals")).click();
      	driver.findElement(By.linkText("Bootstrap Alerts")).click();
      	WebElement option=driver.findElement(By.id("autoclosable-btn-success"));
      	option.click();
      	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      	//bootstrap modals//
      	driver.findElement(By.linkText("Alerts & Modals")).click();
      	driver.findElement(By.linkText("Bootstrap Modals")).click();
      	WebElement modal1=driver.findElement(By.linkText("Launch modal"));
      	modal1.click();
      	//for alert//
      	//driver.switchTo().alert().dismiss();//
      	//for same window//
      	String decision="correct";
      	if (decision=="correct") {
      		driver.findElement(By.linkText("Save changes")).click();
      	}
      	else {
      		driver.findElement(By.linkText("Close")).click();
      	}
        //new window//
      	driver.findElement(By.linkText("Alerts & Modals")).click();
      	driver.findElement(By.linkText("Window Popup Modal")).click();
      	//single window popup//
      	String opt="facebook";
      	if (opt=="facebook") {
      		driver.findElement(By.linkText("Follow On Twitter")).click();
      		String parent=driver.getWindowHandle();
            Set<String>s=driver.getWindowHandles();
            Iterator<String> I1=s.iterator();
            while(I1.hasNext()) {
              	 String child_window=I1.next();
              	 if(!parent.equals(child_window)) {
              		 driver.switchTo().window(child_window);
              		 driver.close();
              	 }
            }
      	}       	 
      	else {
      		driver.findElement(By.linkText("Like us On Facebook")).click();
      		String parent_window=driver.getWindowHandle();
            Set<String>s1=driver.getWindowHandles();
            Iterator<String> I=s1.iterator();
            while(I.hasNext()) {
              	 String child=I.next();
              	 if(!parent_window.equals(child)) {
              		 driver.switchTo().window(child);
              	 }
            }
      	}
      	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      	//javascript alert message//
      	driver.findElement(By.linkText("Alerts & Modals")).click();
      	driver.findElement(By.linkText("Javascript Alerts")).click();
      	WebElement clickOption=driver.findElement(By.linkText("Click me!"));
      	clickOption.click();
	}
}

