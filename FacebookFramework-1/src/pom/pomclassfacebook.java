package pom;

import java.io.IOException;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class pomclassfacebook extends Basepage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstnametextfield;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnametextfield;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobilenumbertextfield;
	
	@FindBy(xpath="//input[@aria-label='New password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement daydropdownlist;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthdropdownlist;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yeardropdownlist;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement radiobutton;
	
	public pomclassfacebook(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void fb() throws IOException
	{
		firstnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,0));
		lastnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,1));
		mobilenumbertextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 2));
		passwordtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,3));
//		daydropdownlist.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1,4));
//		monthdropdownlist.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 5));
//		yeardropdownlist.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 6));
	    selectbyvisibletext(daydropdownlist, "1");
	    selectbyvisibletext(monthdropdownlist, "Jul");
	    selectbyvisibletext(yeardropdownlist, "1998");
		radiobutton.click();
		
	}
}
