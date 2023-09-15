package test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.CommonBrowser;
import constants.Test1_WebInfo;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khoi tao ( bat chrome)
//		WebDriver driver = new ChromeDriver();
//		// Mở full màn hình
//		driver.manage().window().maximize();
//		driver.get(Test1_WebInfo.bepAntoanUrl);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.close();
//		
//		WebDriver ffdriver = new FirefoxDriver();
//		// Mở full màn hình
//		ffdriver.manage().window().maximize();
//		ffdriver.get(Test1_WebInfo.bepAntoanUrl);
//		ffdriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		ffdriver.close();
		
		CommonBrowser cb = new CommonBrowser();
		WebDriver driver  = cb.initChromeDriver(Test1_WebInfo.bepAntoanUrl);
		cb.quitDriver(driver);
		WebDriver ffdriver  = cb.initFirefoxDriver(Test1_WebInfo.bepAntoanUrl);
		cb.quitDriver(ffdriver);
		

	}

}
