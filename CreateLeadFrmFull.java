package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadFrmFull {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FISERV");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagannathan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajamani");
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(element);
		select.selectByVisibleText("Existing Customer");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jagannathan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Rajamani");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/02/86");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("02");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("600061");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("good");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("work");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600061");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1111111");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("165");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jagan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jagankr@abc.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.xyz.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Jagannathan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Jagannathan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abc");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("DEF");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600061");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("195");
		//Coding for currency
		WebElement element1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select1 = new Select(element1);
		select1.selectByVisibleText("GBP - British Pound");
		//Coding for currency
		WebElement element2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select2 = new Select(element2);
		select2.selectByIndex(2);
		//Coding for Ownership
		WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select3 = new Select(element3);
		select3.selectByValue("OWN_LLC_LLP");
		//Coding for State/Provin
				WebElement element4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select select4 = new Select(element4);
				select4.selectByValue("IN");
		//Coding for country
				WebElement element5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select select5 = new Select(element5);
				select5.selectByValue("USA");
		//Coding for country
				WebElement element6 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select select6 = new Select(element6);
				select6.selectByIndex(2);
				
		String firstName1 = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("First name of the lead =" + firstName1);
		
		
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		if (title1.contains("View Lead"))
		{
			System.out.println("Title matching");
		} else
		{
			System.out.println("title not matching");
		}
		//driver.close();
	}

}
