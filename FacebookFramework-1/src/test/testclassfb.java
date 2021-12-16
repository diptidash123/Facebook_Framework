package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.Basetest;
import pom.pomclassfacebook;

public class testclassfb extends Basetest
{
@Test
public void facebook() throws IOException
{
	pomclassfacebook pm=new pomclassfacebook(driver);
	pm.fb();
}
}
