package com.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.BaseTest;
import com.pom.FacebookLoginPage;

@Listeners(com.generics.Utility.class)
public class TestFacebookLogin extends BaseTest{
  @Test
  public void login(){
	  FacebookLoginPage login= new FacebookLoginPage(driver);
	  login.loginMethod();
  }
  
}
