//UPIPayment.java
package com.eshwar.main;
public class UPIPayment
{
   public String makingPaymentUsingPhonePay(Long mobileNo,Double amount)
   {
	   System.out.println("UPIPayment Class  makingPaymentUsingPhonePay(---,---) method is executed...");
	   return amount+" Rupees Payment is Done Sucessfully From MobileNo "+mobileNo+" Using PhonePay";
   }
   
   public String makingPaymentUsingGooglePay(Long mobileNo,Double amount)
   {
	   System.out.println("UPIPayment Class  makingGooglePayUsingPhonePay(---,---) method is executed...");
	   return amount+" Rupees Payment is Done Sucessfully From MobileNo "+mobileNo+" Using GooglePay";
   }
   
   public String makingPaymentUsingPaytm(Long mobileNo,Double amount)
   {
	   System.out.println("UPIPayment Class  makingPaymentUsingPaytm(---,---) method is executed...");
	   return amount+" Rupees Payment is Done Sucessfully From MobileNo "+mobileNo+" Using Paytm";
   }
   
}
