public class AccountTest {
    public static void AccountTest(String[] args) {
        Account customer1= new Account("Berkay",10000);
        System.out.println("Customer Name:"+customer1.getName()+"\n"+"Customer Balance:"+customer1.getBalance());
        customer1.deposit(500);
        customer1.setName("Osman");
        System.out.println("Customer Name:"+customer1.getName()+"\n"+"Customer Balance:"+customer1.getBalance());

    }
}