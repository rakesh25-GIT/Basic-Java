package InterfaceAndMultipleInheritance;

public interface USBank {

   int min_bal = 100;             //By default static and final in nature      
	
   public void credit();
   
   public void debit();
   
   public void transferMoney();

 //only method declaration
 //no method body--only method prototype
 //in Interface, we can declare the variables, vars are by default static in nature.
 // Variable value will not be changed
 //no static method methods in Interface.
 // no main() method in Interface
 // we can't create the object of Interface
 //Interface is abstract(can't be instantiate) in nature

}
