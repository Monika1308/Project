package first.projecttt;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
public class Popup {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseUrl="http://demo.guru99.com/popup.php";
        driver.get(baseUrl);
        driver.findElement(By.linkText("Click Here")).click();
        String parent=driver.getWindowHandle();
        Set<String>s=driver.getWindowHandles();
        Iterator<String> I1=s.iterator();
        while(I1.hasNext()) {
          	 String child_window=I1.next();
          	 if(!parent.equals(child_window)) {
          		 driver.switchTo().window(child_window);
          		 WebElement mail=driver.findElement(By.name("emailid"));
          		 String email="abcdef62@gmail.com";
          		 if (email.length()<50) {
          			 mail.sendKeys(email);
          			 mail.submit();
          		 }
          		else {
          			 System.out.println("Length of the mail id out of range");
          		 }
          	 }
           }
       }
}

    
        	
            
           		 
        
        
        	
        
        