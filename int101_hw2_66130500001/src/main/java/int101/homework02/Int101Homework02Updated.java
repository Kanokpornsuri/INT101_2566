package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {
    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }

 

    static void work01Utilitor() {
        //1.2
        System.out.println("value is "+ Utilitor.testString("Cat"));
        System.out.println("value is "+ Utilitor.testString("Dog"));

//        System.out.println("value is "+ Utilitor.testString(null));
//        System.out.println("value is "+ Utilitor.testString(""));
        //1.3
        System.out.println("value is "+Utilitor.testPositive(3.5));
        System.out.println("value is "+Utilitor.testPositive(1000));

//        System.out.println("value is "+Utilitor.testPositive(-3.5));
        //1.4
        System.out.println("isbn10 is "+Utilitor.computeIsbn10(1001010101));
        System.out.println("isbn10 is "+Utilitor.computeIsbn10(1020231032));
    }

    static void work02Person() {
        //2.6,2.7
        Person p = new Person("Kanokporn","Suriwan");
        Person o = new Person("Jantarat","Sanglao");
        System.out.println(p);
        System.out.println(o);
        //2.8
        System.out.println("p id is "+p.getId());
        System.out.println("p firstname is "+p.getFirstname());
        System.out.println("p lastname is "+p.getLastname());
        //2.9
        p.setFirstname("Tarn");
        p.setLastname("Kanok");
        System.out.println("p firstname is "+p.getFirstname());
        System.out.println("p lastname is "+p.getLastname());
        //3.0
        System.out.println(p.equals(o));
        System.out.println(o.equals(o));
    }

 

    static void work03Account() {
        Person owner1 = new Person("Kanokporn", "Suriwan");
        Person owner2 = new Person("Jantarat", "Sanglao");
        Account account1 = new Account(owner1);
        Account account2 = new Account(owner2);
        System.out.println("Account1 28000 baht");
        account1.deposit(28000);
        System.out.println(account1);

        System.out.println("Account2 35000 baht");
        account2.deposit(35000);
        System.out.println(account2);

        System.out.println("Account1 withdraws 2500 baht");
        account1.withdraw(2500);
        System.out.println(account1);

        System.out.println("Account2 withdraws 500 baht");
        account2.withdraw(500);
        System.out.println(account2);

        System.out.println("Account1 transfer to account2 250 Baht");
        account1.transfer(250, account2);

        System.out.println(account1);
        System.out.println(account2);
    }
}