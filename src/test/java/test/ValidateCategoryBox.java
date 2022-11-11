package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.TestPage;
import util.BrowserFactory;

public class ValidateCategoryBox {

	WebDriver driver;

	@Test
	public void ValidateCategoryCheckBox() throws InterruptedException {

		
		driver = BrowserFactory.init();
		TestPage testPage = PageFactory.initElements(driver, TestPage.class);
		

	testPage.inputCategoryData("Dimple");	
	testPage.addCategoryButton();
	testPage.checkForDuplicates();
	testPage.checkMonthDropdown();
}
}

