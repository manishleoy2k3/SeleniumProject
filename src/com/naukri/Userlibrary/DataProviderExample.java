package com.naukri.Userlibrary;


import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderExample {

	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
	// Number of columns should match the number of input parameters
	
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(Method m){
		
        if(m.getName().equalsIgnoreCase("loginfacebook")){
        	return new Object[][] {{ "manishleoy2k3@gmail.com", "leaseforcee1" }};}
        else if (m.getName().equalsIgnoreCase("loginSnapdeal")) {
        	return new Object[][] {{ "9971638342", "cyber@2015" }};
		} else{
			return new Object[][]{{"",""}};
            }
    }
}
