package com.saf.driver;

import java.util.Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.saf.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {
	}

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(PropertyUtils.getValue("url"));
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
