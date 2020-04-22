package com.tcs;

public class CompanyDetails {
	public static String commonDetails(String country, String sector) {
		return "Country : " + country + "         Sector : " + sector;
	}
	
	public String stockMarketPrice(String companyName) {
		if(companyName.equals("TCS"))
			return "1818.00";
		else if(companyName.equals("Infosys"))
			return "652.90";
		else if(companyName.equals("HCL Tech"))
			return "470.20";
		else
			return "Invalid Company Name...";
	}
}
