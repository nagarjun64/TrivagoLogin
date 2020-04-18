package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ReadConfig {

	public static String baseURL;
	public static String loginOwnerEmail;
	public static String loginOwnerPassword;
	public static String loginAdminEmail;
	public static String loginAdminPassword;
	public static String browser;
	public static String headLessBrowser;
	public static String twitterAccount;
	public static String fbPage;
	public static String fbAccount;
	public static String fbAccountPassword;
	public static String twitterAccountPassword;
	public static String secondTwitterAccount;
	public static String secondTwitterAccountPassword;
	public static String ytUserName;
	public static String ytUserPassword;
	public static String lkdCompUserName;
	public static String lkdCompUserPassword;
	public static String tumblrLogin;
	public static String tumblrPassword;
	public static String instagramBusinessLogin;
	public static String instagramBusinessPwd;
	public static String dbConnectionDtls;
	public static String dbName;
	public static String dbDriver;
	public static String dbuserName;
	public static String dbPassword;
	public static List<String> requiredProfiles;
	public static String imageToUpload;
	public static String twtVideoPath;
	public static String twitterIdentifier;
	public static String fbPageIdentifier;
	public static String invalidLoginErrorText; 

	static 
	{
		readConfigurationFromProperties();
	}

	public static void readConfigurationFromProperties() {

		try 
		{
			Properties prop = new Properties();
			prop.load(new FileInputStream("src/test/resources/customLib/config.properties"));

			baseURL = prop.getProperty("baseURL");
			browser = prop.getProperty("browser");
			headLessBrowser = prop.getProperty("headLessBrowser");

			if (baseURL.equalsIgnoreCase("https://dev.simplify360.com/")) {

				loginOwnerEmail = prop.getProperty("localLoginOwnerEmail");
				loginOwnerPassword = prop.getProperty("localLoginOwnerPassword");
				loginAdminEmail = prop.getProperty("localLoginAdminEmail");
				loginAdminPassword = prop.getProperty("localLoginAdminPassword");

			}else if (baseURL.equalsIgnoreCase("https://suite.simplify360.com/") ) {

				loginOwnerEmail = prop.getProperty("suiteLoginOwnerEmail");
				loginOwnerPassword = prop.getProperty("suiteLoginOwnerPassword");
				loginAdminEmail = prop.getProperty("suiteLoginAdminEmail");
				loginAdminPassword = prop.getProperty("suiteLoginAdminPassword");

			}
			else if (baseURL.equalsIgnoreCase("https://suitex.simplify360.com/") ) {
				
				loginOwnerEmail = prop.getProperty("suiteLoginOwnerEmail");
				loginOwnerPassword = prop.getProperty("suiteLoginOwnerPassword");
				loginAdminEmail = prop.getProperty("suiteLoginAdminEmail");
				loginAdminPassword = prop.getProperty("suiteLoginAdminPassword");

			}

			else if (baseURL.equalsIgnoreCase("https://backup.simplify360.com/") ) {

				loginOwnerEmail = prop.getProperty("suiteLoginOwnerEmail");
				loginOwnerPassword = prop.getProperty("suiteLoginOwnerPassword");
				loginAdminEmail = prop.getProperty("suiteLoginAdminEmail");
				loginAdminPassword = prop.getProperty("suiteLoginAdminPassword");

			}
			twitterAccount = prop.getProperty("twitterAccount");
			twitterAccountPassword = prop.getProperty("twitterAccountPassword");
			fbPage = prop.getProperty("fbPage");
			fbAccount = prop.getProperty("fbAccount");
			fbAccountPassword = prop.getProperty("fbAccountPassword");
			secondTwitterAccount = prop.getProperty("secondTwitterAccount");
			secondTwitterAccountPassword = prop.getProperty("secondTwitterAccountPassword");
			ytUserName = prop.getProperty("ytUserName");
			ytUserPassword = prop.getProperty("ytUserPassword");
			tumblrLogin = prop.getProperty("tumblrLogin");
			tumblrPassword = prop.getProperty("tumblrPassword");
			lkdCompUserName = prop.getProperty("lkdCompUserName");
			lkdCompUserPassword = prop.getProperty("lkdCompUserPassword");
			dbName = prop.getProperty("baseURL");
			dbDriver = prop.getProperty("dbdriver");
			dbuserName = prop.getProperty("dbuserName");
			dbPassword = prop.getProperty("dbPassword");
			requiredProfiles=Arrays.asList(prop.getProperty("requiredProfiles").split(","));
			imageToUpload = prop.getProperty("imageToUpload");
			twtVideoPath = prop.getProperty("twtVideoPath");
			twitterIdentifier = prop.getProperty("twitterIdentifier");
			fbPageIdentifier = prop.getProperty("fbPageIdentifier");
			invalidLoginErrorText = prop.getProperty("invalidLoginErrorText");
			instagramBusinessLogin=prop.getProperty("instagramBusinessLogin");
			instagramBusinessPwd=prop.getProperty("instagramBusinessPwd");
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();

		} catch (IOException e) 
		{
			e.printStackTrace();

		}
	}

}
