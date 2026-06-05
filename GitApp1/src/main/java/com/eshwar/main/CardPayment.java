package com.eshwar.main;
public class CardPayment
{
  public String doPaymentUsingCreditCard(Long cardNo,Double amount)
  {
	  return amount+" Ruppes Payment Done Sucessfully From the Card No : "+cardNo+" Using CreditCard";
  }
  
  public String doPaymentUsingDebitCard(Long cardNo,Double amount)
  {
	  return amount+" Ruppes Payment Done Sucessfully From the Card No : "+cardNo+" Using DebitCard";
  }
}
