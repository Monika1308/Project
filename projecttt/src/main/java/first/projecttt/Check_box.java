package first.projecttt;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Check_box {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl="http://book.theautomatedtester.co.uk/\r\n";
        driver.get(baseUrl);
        driver.findElement(By.linkText("Chapter1")).click();
      	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualTitle=driver.getTitle();
        String expectedTitle="Selenium: Beginners Guide";
        if (actualTitle.equals(expectedTitle)) {
        	System.out.println("Launched the correct page");
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	Select dropItem=new Select(driver.findElement(By.id("selecttype")));
        	dropItem.selectByVisibleText("Selenium RC");
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	WebElement verify=driver.findElement(By.id("verifybutton"));
        	verify.click();
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	WebElement load=driver.findElement(By.id("secondajaxbutton"));
        	load.click();
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	WebElement option=driver.findElement(By.name("selected(1234)"));
        	option.click();
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	if (option.isSelected()) {
        		System.out.println("Checkbox is Toggled On");
        		
        	}
        	else {
        		System.out.println("Checkbox is now Toggled Off");
        	
        	}
        	String req=""; 
        	if (req=="window") {
        		WebElement clickLink=driver.findElement(By.id("multiplewindow"));
        		clickLink.click();
        	}
        	else {
        		WebElement clickLink=driver.findElement(By.id("loadajax"));
        		clickLink.click();
        	}
          	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	String result="Back to Home";
        	if (result=="Back to Home") {
        		WebElement navigation=driver.findElement(By.linkText("Home Page"));
        		navigation.click();
        		System.out.println("Redirected to the Home page");
              	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	}
        	else {
        		System.out.println("Stays in the same page");
              	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	}
        	
        	
        }

        
	}
	
}
