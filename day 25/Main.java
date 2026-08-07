public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("9999999999");

        Contact Harshita= Contact.createContact("Harshita", "31415926");
        Contact chhavi = Contact.createContact("chhavi", "16180339");
        Contact sakshi= Contact.createContact("sakshi", "11235813");

        phone.addNewContact(Harshita);
        phone.addNewContact(chhavi);
        phone.addNewContact(sakshi);

        phone.printContacts();
    }
}
