package seleniumeasy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
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
      	driver.findElement(By.className("dropdown-toggle")).click();
      	driver.findElement(By.linkText("Simple Form Demo")).click();
      	WebElement txt=driver.findElement(By.id("user-message"));
      	txt.sendKeys("Hello world");
      	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(("//button[@onclick='showInput();']"))).click();
        WebElement a=driver.findElement(By.id("sum1"));
        a.sendKeys("1500");
        WebElement b=driver.findElement(By.id("sum2"));
        b.sendKeys("2000");
        driver.findElement(By.xpath(("//button[@onclick='return total()']"))).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Checkbox Demo")).click();
        //checkbox//
        WebElement clickk=driver.findElement(By.id("isAgeSelected"));
        clickk.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if (clickk.isSelected()) {
        	System.out.println("Checkbox is toggled");
        }
        else {
        	System.out.println("Checkbox is not toggled");
        }
        //multi check box//
        String requirement="select all";
        WebElement ab=driver.findElement(By.xpath(("//input[@value='Check All']")));
    	ab.click();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
        if (requirement=="Deselect all") {
        	driver.findElement(By.xpath("//input[@value='Uncheck All']")).click();
        }
        else {
        	driver.findElement(By.className("cb1-element")).click();
        }
        driver.findElement(By.className("dropdown-toggle")).click();
        //radio button//
        WebElement button=driver.findElement(By.linkText("Radio Buttons Demo"));
        button.click();
        String gender="female";
        if(gender=="male") {
        	WebElement radio_male = driver.findElement(By.xpath("//input[@value='Male']"));
        	radio_male.click();
        }
        else {
        	WebElement radio_male = driver.findElement(By.xpath("//input[@value='Female']"));
        	radio_male.click();
        }
        driver.findElement(By.name("gender")).click();
        WebElement age1=driver.findElement(By.xpath("//input[@value='15 - 50']"));
        age1.click();
        driver.findElement(By.id("buttoncheck")).click();
        WebElement select=driver.findElement(By.xpath("//button[@onclick='getValues();']"));
        select.click();
        //dropdown//
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Select Dropdown List")).click();
        Select dropItem=new Select(driver.findElement(By.id("select-demo")));
        dropItem.selectByVisibleText("Sunday");
        System.out.println("It is sunday today");
        //multi drop down//
        Select multi=new Select(driver.findElement(By.id("multi-select")));
        multi.selectByVisibleText("Florida");
        multi.selectByVisibleText("New York");
        WebElement opton=driver.findElement(By.id("printMe"));
        opton.click();
        WebElement selectAll=driver.findElement(By.id("printAll"));
        selectAll.click();
        //ajax form submit//
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Ajax Form Submit")).click();
        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("abcd");
        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("Hello world");
        //Input Form Submit//
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.linkText("Input Form Submit")).click();
        WebElement name1=driver.findElement(By.name("first_name"));
        name1.sendKeys("abcdef");
        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("cdefgh");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("abc@gmail.com");
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("(013)9576388");
        WebElement address=driver.findElement(By.name("address"));
        String add="D.no:12344, SBN Road";
        if (add.length()>10) {
        	address.sendKeys(add);
        }
        else
        {
        	System.out.println("Address should have atleast 10 characters");
        }
        WebElement city=driver.findElement(By.name("city"));
        city.sendKeys("Vizag");
        Select selectState =new Select(driver.findElement(By.name("state")));  
        selectState.selectByVisibleText("Florida");
        WebElement pin=driver.findElement(By.name("zip"));
        pin.sendKeys("32751");
        WebElement domain=driver.findElement(By.name("website"));
        domain.sendKeys("chrome");
        String hosting="Yes";
        if (hosting=="Yes") {
        	WebElement status=driver.findElement(By.name("hosting"));
        	status.click();
        }
        else {
        	WebElement status=driver.findElement(By.name("hosting1"));
        	status.click();
        	
        }
        WebElement comment1=driver.findElement(By.name("comment"));
        comment1.sendKeys("All the details are entered");
        WebElement submitt = driver.findElement(By.xpath("//div[@class='col-md-4']"));
        submitt.submit();
        
        
        
        
        
      
      	
      	

      	
        
	}
}
      	
      	
        
       	
        