package com.saf.tests;

import java.util.List;
import java.util.Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.saf.driver.DriverManager;

public final class HomepageTests extends BaseTest{
	
	private HomepageTests() {}
	
	/*
	 * Validate whether the title is containing Google Search or google search
	 * validate whether the title is not null and the length of title is greater than 15 and less than 100
	 * Check for the links in the pages --> Testing mini bytes - Youtube
	 * number of links displayed is exactly 10 or 15
	 */
	
	@Test
	public void test3() {
		
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube",Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(title) , "Title is null");
		Assert.assertTrue(title.toLowerCase().contains("google search"));
		Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"google search"));   // [a-zA-Z0-9]
		Assert.assertTrue(title.length()>15);
		Assert.assertTrue(title.length()<100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		Assert.assertEquals(elements.size(),10);
		
		boolean isElementPresent = false;
		for (WebElement element : elements) {
			if(element.getText().equalsIgnoreCase("Testing mini bytes - Youtube")) {
				isElementPresent = true ;
				break;
			}
		}		
		Assert.assertTrue(isElementPresent , "Testing mini bytes is not found...");
		

		
		
	}
	
	

}
