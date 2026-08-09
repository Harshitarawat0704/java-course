public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Harshita");

        bank.addCustomer("Harshita", "sunny", 50.05);
        bank.addCustomer("Harshita", "naitik", 175.34);
        bank.addCustomer("Harshita", "sourabh", 220.12);

        bank.addCustomerTransaction("Harshita", "sunny", 44.22);
        bank.addCustomerTransaction("Harshita", "naitik", 12.44);
        bank.addCustomerTransaction("Harshita", "nagesh", 1.65);

        bank.listCustomers("Harshita", false);
    }
}
