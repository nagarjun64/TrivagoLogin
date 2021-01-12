package helpers;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverPropertyInfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
//import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import actions.LogInAction;
import pageobjects.UIMenu;

public class SimplifyUtils {

	//	public static String browserName = null;

	WebDriver driver;

	public SimplifyUtils(){
		driver = Hooks.driver;
	}

	/*public void mouserhoverbywebelement(WebElement we)
	{

		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(we).build().perform();
		}
		catch(Exception e)
		{
			Assert.fail("Exception in method mouserhoverbywebelement",e);
		}
	}
	 */
	public void closeAcknowledmentMessages(){

		UIMenu menu = new UIMenu(driver);

		if(menu.acknowledmentMessage.size()>0)
		{
			for (int i = 0; i< menu.acknowledmentMessage.size();i++ )
			{
				menu.acknowledmentMessage.get(i).click();
			}		
		}
	}

	public static void clearTextField(WebElement element) {

		element.clear();

	}

	public static void clickWebelement(WebElement element) {

		try {

			boolean elementIsClickable = element.isEnabled();

			while (elementIsClickable) {

				element.click();

			}

		} catch (Exception e) {

			System.out.println("Element is not enabled");

			e.printStackTrace();

		}

	}

	public void clickMultipleElements(WebElement someElement, WebElement someOtherElement) {

		Actions builder = new Actions(driver);

		builder.keyDown(Keys.CONTROL).click(someElement).click(someOtherElement).keyUp(Keys.CONTROL).build().perform();

	}

	public static void checkbox_Checking(WebElement checkbox) {

		boolean checkstatus;

		checkstatus = checkbox.isSelected();

		if (checkstatus == true) {

			System.out.println("Checkbox is already checked");

		} else {

			checkbox.click();

			System.out.println("Checked the checkbox");
		}
	}

	public static void checkboxList_Checking( WebElement element) {

		List<WebElement> allOptions = element.findElements(By.id("relationshipS"));

		for (WebElement option : allOptions) 
		{
			option.click();

		}
	}

	public static void checkbox_Unchecking(WebElement checkbox) {

		boolean checkstatus;

		checkstatus = checkbox.isSelected();

		if (checkstatus == true) {

			checkbox.click();

			System.out.println("Checkbox is unchecked");

		} else {

			System.out.println("Checkbox is already unchecked");

		}
	}

	public String profileNameGen() {

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

		//get current date time with Date()

		Date date = new Date();

		String dateAndTime = "Auto" + dateFormat.format(date);

		return dateAndTime;

	} 

	public String dateGenerator() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		//get current date time with Date()

		Date date = new Date();

		//		System.out.println(dateFormat.format(date));

		String dateAndTime = dateFormat.format(date);

		return dateAndTime;

	}

	public void selectElementByValue(WebElement element, String value) {

		Select selectitem = new Select(element);

		selectitem.selectByValue(value);
	}

	public  void scrolltoElementByLocator(WebElement ScrolltoThisElement) {

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ScrolltoThisElement);

	}

	/*public static String getBrowserName() {

		browserName = System.getProperty(browserName);

		if (browserName == null)

			browserName = ;

		return browserName;

	}*/

	public void switchToNewWindow() {

		Set s = driver.getWindowHandles();

		Iterator itr = s.iterator();

		String w1 = (String) itr.next();

		String w2 = (String) itr.next();

		driver.switchTo().window(w2);

	}

	public void switchToWindow() {

		Set s = driver.getWindowHandles();

		Iterator itr = s.iterator();

		String w1 = (String) itr.next();

		String w2 = (String) itr.next();

		driver.switchTo().window(w2);

	}

	public void switchToWindow(String windowHandle) {

		Set s = driver.getWindowHandles();

		Iterator itr = s.iterator();

		driver.switchTo().window(windowHandle);

	}

	public void switchToOldWindow() {

		Set s = driver.getWindowHandles();

		Iterator itr = s.iterator();

		String w1 = (String) itr.next();

		String w2 = (String) itr.next();

		driver.switchTo().window(w1);

	}

	public void switchToParentWindow() {

		driver.switchTo().defaultContent();

	}

	public void waitForElementToBeClickable(WebElement element, int timeToWaitInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);// time in seconds

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void waitForElementToBeClickable(List<WebElement> element, int timeToWaitInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);

		wait.until(ExpectedConditions.elementToBeClickable((By) element));

	}

	public boolean isClickable(WebElement el) 
	{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(el));
			//			return true;
			return el.isDisplayed()&& el.isEnabled();
		}
		catch (Exception e){
			return false;
		}
	}

	public void waitTillElementFound(WebElement ElementTobeFound,int timeToWaitInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSeconds);

		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));

	}

	public void fluentWait(){

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});

	}

	public static void pressKeyDown(WebElement element) {

		element.sendKeys(Keys.DOWN);

	}

	public void pressKeyEnter(WebElement element) {

		element.sendKeys(Keys.ENTER);

	}

	public static void pressKeyUp(WebElement element) {

		element.sendKeys(Keys.UP);

	}

	public static void moveToTab(WebElement element) {

		element.sendKeys(Keys.chord(Keys.ALT, Keys.TAB));

	}

	public void waitTillPageLoad(int i) {

		driver.manage().timeouts().pageLoadTimeout(i, TimeUnit.SECONDS);

	}

	public static void keyboardEvents(WebElement webelement, Keys key, String alphabet) {

		webelement.sendKeys(Keys.chord(key, alphabet));

	}

	public void navigateForward() {

		driver.navigate().forward();

	}

	public void navigateBack() {

		driver.navigate().back();

	}

	public void pageRefresh() {

		driver.navigate().refresh();

	}

	public void implicitlyWaitFor(int t) {

		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);

	}

	public void scrolltoElementUsingCoordinates(WebElement ScrolltoThisElement) {

		Coordinates coordinate = (Coordinates) ((Locatable) ScrolltoThisElement).getCoordinates();
		//NOT SURE IF THIS WORKS

		coordinate.onPage();

		coordinate.inViewPort();
	}

	public  void radiobutton_Select(WebElement Radio) {

		boolean checkstatus;

		checkstatus = Radio.isSelected();

		if (checkstatus == true) {

			System.out.println("RadioButton is already checked");

		} else {

			Radio.click();

			System.out.println("Selected the Radiobutton");

		}

	}

	public  int getCounOfAllValuesInDropDwown(WebElement element) {

		Select oselect = new Select(element);

		List <WebElement> elementCount = oselect.getOptions();

		int iSize = elementCount.size();

		return iSize;

	}

	public  void selectElementByVisibleText(WebElement element, String Name) {



		Select selectitem = new Select(element);

		selectitem.selectByVisibleText(Name);
	}

	public void scrollInToView(WebElement element){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void scrollToElement(WebElement requiredElement){

		WebElement element = requiredElement;
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();

	}

	public void scrollInToEndOfPage(){

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public void scrollInDiv(WebElement element){

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("document.getElementById(element).scrollDown += 100");

	}

	public void scroll(int horizonatal, int vertical){
		((JavascriptExecutor) driver).executeScript("scroll( 0,50)");
	}

	public void pause(int timeInMilliSeconds){

		try {
			Thread.sleep(timeInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	} 

	public void turnOnIosSwitch(WebElement elementToCheck, WebElement elementToClick){

		if(elementToCheck.isDisplayed()) //pass the element when switch is Off
		{
			elementToClick.click();
		}

	}

	public void turnOffIosSwitch(WebElement elementToCheck, WebElement elementToClick){

		if(elementToCheck.isDisplayed()) //pass the element when switch is ON
		{
			elementToClick.click();
		}

	}

	public void verifyURLStatus(String URL) {

		int invalidLinksCount = 0;

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		try {
			HttpResponse response = client.execute(request);
			// verifying response code and The HttpStatus should be 200 if not,
			// increment invalid link count
			////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
			if (response.getStatusLine().getStatusCode() != 200)
				invalidLinksCount++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void zoomIn(int n){

		((JavascriptExecutor)driver).executeScript("document.body.style.zoom=%;");

	}

	public void zoomOut(){

		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='50%';");
	}

	public void resetZoom(){
		//To set browser to default zoom level 100%
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%';");
	}

	public void ClearBrowserCache() throws InterruptedException
	{
		driver.manage().deleteAllCookies();//delete all cookies
		Thread.sleep(5000); //wait 7 seconds to clear cookies.
	}

	public void selectDate(String monthyear, String Selectday) throws InterruptedException
	{		
		List<WebElement> elements = driver.findElements(By.xpath("//button[@data-qa='calendar-checkin']"));

		for (int i=0; i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			//Selecting the month
			if(elements.get(i).getText().equals(monthyear))
			{
				//Selecting the date				
				List<WebElement> days = driver.findElements(By.xpath("//div[@class='rsdc-months']/span[2]/span"));

				for (WebElement d:days)
				{
					System.out.println(d.getText());
					if(d.getText().equals(Selectday))
					{
						d.click();
						Thread.sleep(10000);
						return;
					}
				}								

			}			

		}
		driver.findElement(By.xpath("//div[@class='rsdc-wrapper rsdc-dual-month']/div[2]/div[1]")).click();

		//		selectDate(monthyear,Selectday);	

	}

	public void selectStartDate(String ExpectedMonth, String ExpectedDay)
	{	

		SimplifyUtils utils = new SimplifyUtils();

		//current month text
		//		String CurrentMonth = driver.findElement(By.xpath("(//*[@class='cal-month']//*[@id='cal-heading-month'])[1]")).getText();
		String CurrentMonth = driver.findElement(By.xpath("//*[@id='cal-heading-month']")).getText();
		utils.scrollInToView(driver.findElement(By.xpath("//*[@id='cal-heading-month']")));	
		utils.pause(500);

		if(ExpectedMonth.equalsIgnoreCase(CurrentMonth)) {

			System.out.println("Month is same");
		}
		else
		{

			for (int i = 0; i < 12; i++) {

				//clicking on next button
				int elementcount = driver.findElements(By.xpath("//div[@class='df_container_calendar']//button[@type='button']")).size();

				System.out.println(elementcount);
				if(elementcount==1) 
				{

					driver.findElement(By.xpath("//div[@class='df_container_calendar']//button[@type='button']")).click();
					utils.pause(500);
				}
				else if(elementcount>1)
				{
					driver.findElement(By.xpath("//div[@class='df_container_calendar']//button[@type='button'][2]")).click();
					utils.pause(500);
				}

				utils.pause(1000);

				CurrentMonth = driver.findElement(By.xpath("//*[@id='cal-heading-month']")).getText();;
				utils.pause(500);

				if(CurrentMonth.equalsIgnoreCase(ExpectedMonth)) 
				{
					System.out.println("Month is Selected");
					break;

				}

			}
		}

		List<WebElement> DatePicker = driver.findElements(By.xpath("//*[@class='cal-month'][1]//*[@class='cal-day-wrap']//*[contains(@class,'cal-is-selectable')]"));

		for(WebElement element: DatePicker) {

			String calDate = element.getAttribute("datetime");
			utils.pause(500);

			if (calDate.equals(ExpectedDay)) {

				element.click();
				break;

			}


		}

	}

	public void selectEndDate(String ExpectedMonth, String ExpectedDay)
	{	

		SimplifyUtils utils = new SimplifyUtils();

		//current month text
		//		String CurrentMonth = driver.findElement(By.xpath("(//*[@class='cal-month']//*[@id='cal-heading-month'])[1]")).getText();
		String CurrentMonth = driver.findElement(By.xpath("//*[@id='cal-heading-month']")).getText();
		utils.pause(500);

		if(ExpectedMonth.equalsIgnoreCase(CurrentMonth)) {

			System.out.println("Month is same");
		}
		else
		{

			for (int i = 0; i < 12; i++) {

				//clicking on next button
				int elementcount = driver.findElements(By.xpath("//div[@class='df_container_calendar']//button[@type='button']")).size();

				System.out.println(elementcount);
				if(elementcount==1) 
				{

					driver.findElement(By.xpath("//div[@class='df_container_calendar']//button[@type='button']")).click();
					utils.pause(500);
				}
				else if(elementcount>1)
				{
					driver.findElement(By.xpath("//div[@class='df_container_calendar']//button[@type='button'][2]")).click();
					utils.pause(500);
				}

				utils.pause(1000);

				CurrentMonth = driver.findElement(By.xpath("//*[@id='cal-heading-month']")).getText();;
				utils.pause(500);

				if(CurrentMonth.equalsIgnoreCase(ExpectedMonth)) 
				{
					System.out.println("Month is Selected");
					break;

				}

			}
		}

		List<WebElement> DatePicker = driver.findElements(By.xpath("//*[@class='cal-month'][1]//*[@class='cal-day-wrap']//*[contains(@class,'cal-is-selectable')]"));

		for(WebElement element: DatePicker) {

			String calDate = element.getAttribute("datetime");
			utils.pause(500);

			if (calDate.equals(ExpectedDay)) {

				element.click();
				break;

			}


		}

	}

	public File cookie() {

		File file = new File("Cookie.data");							
		try	{	// Delete if any old file exists
			file.delete();		
			file.createNewFile();			
			FileWriter fileWriter = new FileWriter(file);							
			BufferedWriter bufferwrite = new BufferedWriter(fileWriter);									
			for(Cookie cook : driver.manage().getCookies()){	
				String writeup = cook.getName()+";"+cook.getValue()+";"+cook.getDomain()+";"+cook.getPath()+""
						+ ";"+cook.getExpiry()+";"+cook.isSecure();
				bufferwrite.write(writeup);	
				System.out.println(writeup); 
				bufferwrite.newLine();			
			}		
			bufferwrite.flush();
			bufferwrite.close();
			fileWriter.close();			
		}catch(Exception exp)
		{		
			exp.printStackTrace();			
		}
		
		return file;

	}

}
