package helpers;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks{


	final Logger log = Logger.getLogger(this.getClass().getName());

	public static WebDriver driver;


	@Before
	public void openBrowser() throws MalformedURLException {

		log.info("Calling openBrowser in Hooks");

		String OS = System.getProperty("os.name").toLowerCase();
		SimplifyUtils utils = new SimplifyUtils();
		ReadConfig readConfig = new ReadConfig();

		log.info("OS is ===> " + OS);

		//
		if (ReadConfig.browser.equals("firefox"))
		{

			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setCapability("applicationCacheEnabled", "true");
			cap.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, ElementScrollBehavior.BOTTOM);

			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myprofile = profile.getProfile("selenium");

			//Currently using v0.19.1 geckodriver for mac
			log.info("Browser is" + ReadConfig.browser);

			if(OS.contains("mac"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/customLib/mac_geckodriver");
				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
				//				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/Documents/projectworkspace/logs/firefox.log");


				//https://stackoverflow.com/questions/34871550/check-for-firefox-profile-and-create-if-it-doesnt-exist-using-java
				/*				/changing firefox default options
			    FirefoxProfile firefoxProfile = new FirefoxProfile();

			    firefoxProfile.setPreference("browser.download.folderList",2); //dont take default download folder
			    firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);//dont show download box
			    firefoxProfile.setPreference("browser.download.dir","c:\\downloads");//provide download location
			    firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv"); //dont ask save as for provided types
				 */				
				//Code to use firefox profile

				/*				ProfilesIni profile = new ProfilesIni();
				FirefoxProfile myprofile = profile.getProfile("profileToolsQA");
				WebDriver driver = new FirefoxDriver(myprofile);
				 */
			}
			else if(OS.contains("linux")||OS.contains("ubuntu"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/customLib/linux_geckodriver");
			}

			else if(OS.contains("windows"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/customLib/win64_geckodriver.exe");
			}


			driver = new FirefoxDriver();

		}

		else if (ReadConfig.browser.equals("chrome"))
		{

			if(OS.contains("mac"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/customLib/mac_chromedriver");

				DesiredCapabilities cap = DesiredCapabilities.chrome();
				//				cap.setCapability("applicationCacheEnabled", "true");
				cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);

				ChromeOptions chromeOptions = new ChromeOptions();

				chromeOptions.addArguments("--kiosk");

				//				driver = new ChromeDriver(chromeOptions);
				driver = new ChromeDriver();

			}
			else if(OS.contains("linux")||OS.contains("ubuntu"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/customLib/linux64_chromedriver");

				DesiredCapabilities cap = DesiredCapabilities.chrome();
				//				cap.setCapability("applicationCacheEnabled", "true");
				cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);

				ChromeOptions chromeOptions = new ChromeOptions();

				chromeOptions.addArguments("--kiosk");

				//				driver = new ChromeDriver(chromeOptions);
				driver = new ChromeDriver();

			}

			else if(OS.contains("windows"))
			{
				System.setProperty("webdriver.chrome.driver","src/test/resources/customLib/win32_chromedriver.exe");

				ChromeOptions chromeOptions = new ChromeOptions();

				chromeOptions.addArguments("--start-maximized");

				driver = new ChromeDriver(chromeOptions);

//				driver.manage().deleteAllCookies();
			}

			driver.manage().window().maximize();

		}
		else if (ReadConfig.browser.equals("headless")){


			if(OS.contains("mac")&&readConfig.headLessBrowser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/customLib/mac_chromedriver");

				ChromeOptions chromeOptions = new ChromeOptions();

				chromeOptions.addArguments("--headless");

				driver = new ChromeDriver(chromeOptions);

			}

			else if(OS.contains("mac")&&readConfig.headLessBrowser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "src/test/resources/customLib/mac_geckodriver");
				//				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");

				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.addArguments("--headless");

				driver = new FirefoxDriver(firefoxOptions);
			}

			else if(OS.contains("linux")&&readConfig.headLessBrowser.equalsIgnoreCase("chrome")) 
			{
				log.info("In the Linux + Chrome Tab");
				System.setProperty("webdriver.chrome.driver", "src/test/resources/customLib/linux64_chromedriver");
				
				ChromeOptions chromeOptions = new ChromeOptions();

				chromeOptions.addArguments("--headless");

				driver = new ChromeDriver(chromeOptions);
			}

			else if(OS.contains("windows")&&readConfig.headLessBrowser.equalsIgnoreCase("firefox"))
			{
				File src = new File("src/test/resources/customLib/phantomjs.exe");

				System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
			}
			else if(OS.contains("linux")||OS.contains("ubuntu"))
			{
				File src = new File("src/test/resources/customLib/phantomjs_linux");

				System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
			}

		}

		driver.get(ReadConfig.baseURL);

		log.info("Testing on ===> " + ReadConfig.baseURL);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {

		/*		if(scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}*/
//		driver.quit();



	}
	
}