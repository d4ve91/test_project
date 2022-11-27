public class BankAccountDriver {

    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount(1500.0, "Dawid Pytliński", "001");
        BankAccount b2 = new BankAccount(2500, "Dawid Pytliński", "002");

        b2.copyConstructor(b1);

        System.out.println(b1.equals(b2));


    }
    
}
