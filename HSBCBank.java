package InterfaceAndMultipleInheritance;

public class HSBCBank implements USBank, BrazilBank {
//Is-a relationship

//If a class is implementing any Interface, then its mandatory to define/override all methods of Interface.

public void credit() {           //USBank method implementation
System.out.println("hsbc--credit");
    }

public void debit() {          //USBank method implementation
System.out.println("hsbc--debit");
     }

public void transferMoney() {      //USBank method implementation
System.out.println("hsbc--transfer money");
    }

public void mutualFund() {    //BrazilBank method implementation
System.out.println("hsbc--mutual fund");
    }

//separate method of HSBCBank class
public void educationLoan() {
System.out.println("hsbc--education loan"); 
    }

public void carLoan() {
System.out.println("hsbc--car loan");
    }


}
