package app.src.main.java.bankaccount_covid19_zaliczenie_wykładu;

public class BankAccount
{
   double balance;      // Account balance
   String name;
   String ID;

   BankAccount(double balance, String name, String ID)
   {
      this.balance = balance;
      this.name = name;
      this.ID = ID;
   }
   // constructor for BankAccount class

   public BankAccount getBankAccount()
   {
      balance = 1500.0;
      name = "Dawid Pytliński";
      ID = "001";
      return this;
      
   }

   public void copyConstructor(BankAccount other)
   {
      this.balance = other.balance;
      this.name = other.name;
      this.ID = other.ID;
   }

   public boolean equals(Object o)
   {
      boolean status;
      if(this.getBankAccount() == ((BankAccount) o).getBankAccount())
      {
         status = true;
      }
      else
         status = false;
      
      return status;
   }
   public void deposit(double amount)
   {
      balance += amount;
   }



   public void withdraw(double amount)
   {
      if (amount < 0) 
      {
         System.out.println("Enter correct amount");
      }
      else if (balance - amount < 500)
      {
         System.out.println("The withdrawal is not allowed as this will result in a minimum balance of less than $ 500");
      }
      else
      {
         balance -= amount;
      } 
      
   }

   

   public void setBalance(double b)
   {
      balance = b;
   }
 

   public double getBalance()
   {
      return balance;
   }

  


	
}
