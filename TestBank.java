package InterfaceAndMultipleInheritance;

public class TestBank {

	public static void main(String[] args) {

 System.out.println(USBank.min_bal);  
 // USBank.min_bal = 200; //not allowed as final var can't be changed
		
//static polymorphism
	
	HSBCBank hs = new HSBCBank();
    hs.credit();        //method overriding
	hs.debit();         //method overriding
	hs.transferMoney(); //method overriding
	hs.carLoan();
	hs.educationLoan();
	hs.mutualFund();  //method overriding

//dynamic polymorphism
//child class object can be referred by parent Interface reference variable.
	
	USBank us = new HSBCBank();
	us.credit();       //only overridden methods will be called
	us.debit();
	us.transferMoney();
	
	 BrazilBank br = new HSBCBank();
	 br.mutualFund();
	}

}
