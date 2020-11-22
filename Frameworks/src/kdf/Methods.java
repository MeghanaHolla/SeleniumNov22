package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
	}
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	public void implementImplicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void navigateToApplication(String url) {
		driver.get(url);
	}
	
	public void enterValueInTextBox(String locValue,String data) {
		driver.findElement(By.id(locValue)).sendKeys(data);
	}
	
	public void clickAButton(String loc, String locValue) {
		if(loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
		else if(loc.equals("xPath")) {
			driver.findElement(By.xpath(locValue)).click();
		}
	}
	
	public String getErrMsg(String loc, String locValue) {
		String errMsgText = null;
		if(loc.equals("cssSelector")) {
			errMsgText = driver.findElement(By.cssSelector(locValue)).getText();
		}
		else if(loc.equals("id")) {
			errMsgText = driver.findElement(By.id(locValue)).getText();
		}
		return errMsgText;
	}
	
	public void closeApplication() {
		driver.close();
	}
	
}
