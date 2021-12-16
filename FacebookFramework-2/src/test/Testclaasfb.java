package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Pomfacebook;

public class Testclaasfb extends BaseTest
{
 @Test
 public void getdata() throws IOException
 {
	 Pomfacebook g=new Pomfacebook(driver);
	 g.details();
 }
}
