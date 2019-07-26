package web_test.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */
public class App 
{
    WebDriver driver;
    
    @Test
    public void test() {
    	System.out.println("test is executing");
    	System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/plugins/chromedriver");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("headless");
    	driver = new ChromeDriver();
    	driver.get("http://18.191.120.24");
    }
}
