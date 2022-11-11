package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TestPage extends BasePage {
	
	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category_Data;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement Add_Button;
	@FindBy(how = How.XPATH, using = "//select[@name='category']")
	WebElement CreatedCategory;

	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement Month_Dropdown;

	public void inputCategoryData(String test1) {
		Add_Category_Data.sendKeys(test1 + generateRandomNo(99));
	}

	public void addCategoryButton() {
		Add_Button.click();
	}

	public void checkForDuplicates() {
		if (CreatedCategory.isDisplayed()) {
		 System.out.println("The Category you want ot add already exists:<duplicatedcategoryname>");
		}
	}

	public void checkMonthDropdown() {

		Select select = new Select(Month_Dropdown);
		List<WebElement> options = select.getOptions();
		ArrayList<String> months = new ArrayList<String>();
		for (WebElement web : options)
			months.add(web.getText());
		System.out.println("Current list of months: " + months);

	}

}
	
	


