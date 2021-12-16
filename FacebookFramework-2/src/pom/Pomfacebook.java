package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Autoconstant;
import generics.Basepage;
import generics.Excellibrary;

public class Pomfacebook extends Basepage implements Autoconstant
{
  @FindBy(xpath="(//input[@type='text'])[1]")
  private WebElement firstnametextfield;
  
  @FindBy(xpath="(//input[@type='text'])[2]")
  private WebElement surnametextfield;
  
  @FindBy(xpath="(//input[@type='text'])[3]")
  private WebElement mobilenotextfield;
  
  @FindBy(xpath="(//input[@type='password'])[2]")
  private WebElement passwordtextfield;
  
  @FindBy(xpath="//select[@id='day']")
  private WebElement daydropdownlist;
  
  @FindBy(xpath="//select[@id='month']")
  private WebElement monthdropdownlist;
  
  @FindBy(xpath="//select[@id='year']")
  private WebElement yeardropdownlist;
  
  @FindBy(xpath="(//input[@type='radio'])[2]")
  private WebElement maleradiobutton;

  
 public Pomfacebook(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

 public void details() throws IOException
 {
	 firstnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 0));
	 surnametextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 1));
	 mobilenotextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 2));
	 passwordtextfield.sendKeys(Excellibrary.fetchdata(excelpath, sheetname, 1, 3));
	 selectbyvisibletext(daydropdownlist, "1");
	 selectbyvisibletext(monthdropdownlist, "Jul");
	 selectbyvisibletext(yeardropdownlist, "2020");
	 maleradiobutton.click();
 }
}
 