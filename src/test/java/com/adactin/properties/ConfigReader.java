package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties p;

	public ConfigReader() throws IOException {

		File f = new File("C:\\Users\\skal\\eclipse-workspace\\CucumberProject\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}


	public String  getUrl() {

		String url = p.getProperty("url");
		return url;
	}

	public String  getcvv() {

		String browser = p.getProperty("cvv");
		return browser;
	}

	public String  getCardNumber() {

		String CardNumber = p.getProperty("CardNumber");
		return CardNumber;
	}

	public String  getUserName() {

		String getUserName = p.getProperty("UserName");
		return getUserName;
	}

	public String  getPassword() {

		String getPassword = p.getProperty("Password");
		return getPassword;
	}
	
}
