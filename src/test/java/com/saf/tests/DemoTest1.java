package com.saf.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.saf.driver.DriverManager;

public final class DemoTest1 extends BaseTest{
	
	private DemoTest1() {}
	
	@Test
	public void test1() {
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation Testing",Keys.ENTER);
		
	}

}
