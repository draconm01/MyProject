package org.sample;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClassTest {

	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();	

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8180/jpetstore/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@Test
	public void myFirstTest() {

		driver.findElement(By.linkText("Enter the Store")).click();

		for(int i=0; i<5; i++) {			
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-SW-01")).click();
			driver.findElement(By.linkText("EST-1")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-SW-02")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-FW-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-FW-01")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$18,50'])[2]/following::a[1]")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-FW-02")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[1]/following::img[10]")).click();
			driver.findElement(By.linkText("FI-FW-02")).click();
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$5,29'])[1]/following::a[1]")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-BD-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-PO-02")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-DL-01")).click();
			driver.findElement(By.xpath("//html")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-RT-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-RT-02")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-RT-02")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-CW-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-CW-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.xpath("//*[@id='SidebarContent']/a[2]/img")).click();
			driver.findElement(By.linkText("K9-CW-01")).click();
			driver.findElement(By.linkText("Add to Cart")).click();
			driver.findElement(By.name("updateCartQuantities")).click();
			driver.findElement(By.linkText("Proceed to Checkout")).click();
			driver.findElement(By.name("username")).sendKeys("ACID");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("ACID");
			driver.findElement(By.name("signon")).click();
			driver.findElement(By.name("img_cart")).click();
			driver.findElement(By.linkText("Proceed to Checkout")).click();
			driver.findElement(By.name("newOrder")).click();
			driver.findElement(By.linkText("Confirm")).click();
			driver.findElement(By.linkText("Return to Main Menu")).click();
			driver.findElement(By.linkText("Sign Out")).click();
		}
	}


	@SuppressWarnings("unused")
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	@SuppressWarnings("unused")
	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@SuppressWarnings("unused")
	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
