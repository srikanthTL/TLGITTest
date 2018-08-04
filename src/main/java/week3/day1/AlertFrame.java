package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf\\Selenium\\Software\\Drivers\\chromedriver.exe");
        
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame("iframeResult");
        
        driver.findElementByXPath("/html/body/button").click();
        
        Alert myAlert = driver.switchTo().alert();
        
        System.out.println(myAlert.getText());
        
        myAlert.sendKeys("srikanth");
        
        myAlert.accept();
        
        String textEle = driver.findElementById("demo").getText();
        
        System.out.println(textEle);
        
        driver.switchTo().defaultContent();
        
        driver.findElementByXPath("//a[@id='tryhome']").click();
        
        Set<String> AllWindowHandle = driver.getWindowHandles();
        
        List<String> listOfAllWindowHandle = new ArrayList<String>();
        listOfAllWindowHandle.addAll(AllWindowHandle);
        
        
        driver.switchTo().window(listOfAllWindowHandle.get(1));
        
        System.out.println((driver.getCurrentUrl()));
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(listOfAllWindowHandle.get(0));
        
        System.out.println((driver.getCurrentUrl()));
        System.out.println(driver.getTitle());
        
        
        driver.quit();
        
        

	}

}
