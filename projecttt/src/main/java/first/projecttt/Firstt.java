package first.projecttt;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 
public class Firstt {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         String baseUrl="http://www.google.com/";
         driver.get(baseUrl); 
         WebElement search = driver.findElement(By.name("q"));
         search.sendKeys("amazon.in");
         search.submit();
         String expectedTitle="amazon.in - Google Search";
         String actualTitle =driver.getTitle();
         System.out.println(actualTitle);
		 if(actualTitle.equals(expectedTitle)) {
			 driver.findElement(By.className("Krnil")).click();
			 Select dropItem=new Select(driver.findElement(By.id("searchDropdownBox")));
	         dropItem.selectByVisibleText("Toys & Games");
	         WebElement go=driver.findElement(By.id("twotabsearchtextbox"));
	         go.sendKeys("Soft toys for girls ");
	         go.submit();
	         driver.findElement(By.className("s-image")).click();
	         String parent=driver.getWindowHandle();
	         Set<String>s=driver.getWindowHandles();
	         Iterator<String> I1=s.iterator();
	         while(I1.hasNext()) {
	        	 String child_window=I1.next();
	        	 if(!parent.equals(child_window)) {
	        		 driver.switchTo().window(child_window);
	        		 WebElement cart=driver.findElement(By.id("add-to-cart-button"));
	                 cart.click();
		 }
        	 }
         }
         //driver.close();
    }



}

