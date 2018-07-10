package GenericFunctions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.pomForgotPassword;
import Utils.ManageAll;

public class genericFunctions {

	public WebDriver driver;

	public genericFunctions(String Driver_Type) {
		String os = System.getProperty("os.name");
		if (Driver_Type.equalsIgnoreCase("chrome")) {		
			if (os.toLowerCase().startsWith("linux")) {
				String exePath = ManageAll.chromeLocation;
				System.setProperty(ManageAll.chromeSetProperty, exePath);
				driver = new ChromeDriver();
			} else if (os.toLowerCase().startsWith("windows")) {

			} else {

			}

		} else if (Driver_Type.equalsIgnoreCase("firefox")) {
		}
	}

	
	public void explicitWait(By by) {
		WebDriverWait wait = new WebDriverWait(driver, ManageAll.ExplicitWaitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	
	public String getText(By by) {
		return driver.findElement(by).getText();
	}

	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void newtab() {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	
	public void moveToTheElement(String element) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(element))).build().perform();
	}

	
	public void click(By by) {
		driver.findElement(by).click();
	}

	public void click_JS(By by){
		WebElement element = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public String getWindowHandle() {
		return driver.getWindowHandle();
	}
	
	public String getCssValue_Name(By by){
		return driver.findElement(by).getCssValue("name");
	}
	
	public String getCurrentUrl(){
		return driver.getCurrentUrl();
	}
	
	
	public void SwitchWindows(String value) {
		driver.switchTo().window(value);
	}
	
	
	public String getOtpForMobileNumber(String path, int number) {
		String value = driver.findElement(By.xpath(path + (number + 1) + 
				pomForgotPassword.otpForMobilePart2)).getText();
		StringBuilder myNumbers = new StringBuilder();
		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(value.charAt(i))) {
				myNumbers.append(value.charAt(i));
			}
		}
		value = myNumbers.toString();
		return value;
	}
	
	
	
	public int getMobileNumber(By by, String mobile) {
		int count = 1;
		List<WebElement> mobileNumber = driver.findElements(by);
		for (WebElement value : mobileNumber) {
			if (mobile.equalsIgnoreCase(ManageAll.countryCode + value.getText())) {
				break;
			}
			else{
				count++;
			}
		}
		return count;
	}
	
	
	public int getCount(By by, String mobile) {
		int count = 1;
		String number = ManageAll.countryCode + mobile;
		List<WebElement> mobileNumber = driver.findElements(by);
		for (WebElement value : mobileNumber) {
			if (number.equalsIgnoreCase(value.getText())) {
				break;
			}
			else{
				count++;
			}
		}
		return count;
	}
	
	
	
	public void Sendkeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	
	public void Sendkeys(By by, long value) {
		System.out.println("long value : "+String.valueOf(value));
		driver.findElement(by).sendKeys(String.valueOf(value));
	}

	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(ManageAll.ImplicitWaitTime, TimeUnit.SECONDS);
	}

	
	public void clearCookies() {
		driver.manage().deleteAllCookies();
	}

	
	public void clear(By by) {
		driver.findElement(by).clear();
	}

	
	public void WindowMaximize() {
		driver.manage().window().maximize();
	}

	
	public String getPageSource() {
		return driver.getPageSource();
	}

	
	public void driverClose() {
		driver.close();
	}
	
	
	public void pageRefresh(){
		driver.navigate().refresh();
	}

	
	public void driverQuit() {
		driver.quit();
	}

	
	public boolean isSelected(By by) {
		if (driver.findElement(by).isSelected())
			return true;
		else
			return false;
	}

	
	public boolean isDisplayed(By by) {
		if (driver.findElement(by).isDisplayed())
			return true;
		else
			return false;
	}

	
	public boolean isEnabled(By by){
		if (driver.findElement(by).isEnabled())
			return true;
		else
			return false;
	}
	
	
	public String todayDateWithHour (){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		
		return dateFormat.format(date);
		}
}
