package com.eshwar.upilite;

public class UPILiteTest 
{
	public String makingPaymentUsingPhonePayLite(Long mobileNo,Double amount)
	   {
		   System.out.println("UPILiteTest Class  makingPaymentUsingPhonePayLite(---,---) method is executed...");
		   return amount+" Rupees Payment is Done Sucessfully From MobileNo "+mobileNo+" Using PhonePayLite";
	   }
	
	public String makingPaymentUsingGooglePayLite(Long mobileNo,Double amount)
	   {
		   System.out.println("UPILiteTest Class  makingPaymentUsingGooglePayLite(---,---) method is executed...");
		   return amount+" Rupees Payment is Done Sucessfully From MobileNo "+mobileNo+" Using GooglePayLite";
	   }
	   
}
