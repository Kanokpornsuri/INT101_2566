/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/*
          4.2.1 a private "number" field of type "int".
          4.2.1 a private "owner" field of type "Person".
          4.2.2 a private "balance" field of type "double".
          4.2.3 a public constructor that receives a "number" parameter and
                an "owner" parameter to set the "number" and "owner" fields.
          4.2.4 public getter methods for "owner" and "balance" fields. ( get use public+type(in private){return}
          4.2.5 a public "deposit" method that receives an "amount" 
                parameter of type "double"(deposit) and returns a "double".(amount)
                This method adds(+=) the "amount" to the "balance" to set //บวกamountในbalance หมายความว่า balance += amount
                the new value of the "balance" and returns this new value.
          4.2.6 a public "withdraw" method that receives an "amount"
                parameter of type "double"(withdraws) and returns a "double".(amount)
                This method substracts(-=) the "amount" to the "balance" to set
                the new value of the "balance" and returns this new value.
          4.2.7 a public "transfer" method that receives an "amount" 
                parameter of type "double">> public double transfer(double amount, ....){} and an "account" parameter of 
                type "BankAccount".(inวงเล็บ BankAccount account)  This method "withdraws" the "amount" 
                from the "balance" (withdraws(amount)) of this object and "deposits" 
                the "amount" to the "balance"(deposit(amount)) of the "account" (.account) object 
                (in the parameter). This methods returns nothing.
          4.2.8 @Override a public "toString" method that 
                returns a "String" of value "BankAccount(id,)" 
                where "id" is the "id" field.
 */
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;
    
    public BankAccount(int number, Person owner){
        this.number = number;
        this.owner = owner;
    }//ในmainหลักต้องใส่ BankAccount account1 = new BankAccount(1, person1);
    public Person getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public void transfer(double amount, BankAccount account){
        withdraw(amount);
        account.deposit(amount);
    }
    
    @Override
    public String toString(){
        return "BankAccount : " + "number = " + number + ", owner = "+owner +", balance = "+balance;
    }
}
