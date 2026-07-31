public class Main {

    public static void main(String[] args) {

        person person = new person();

        // Test 1: Empty first name and last name
        System.out.println("===== Test 1 =====");
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("First Name : " + person.getFirstName());
        System.out.println("Last Name  : " + person.getLastName());
        System.out.println("Age        : " + person.getAge());
        System.out.println("Full Name  : " + person.getFullName());
        System.out.println("Teen       : " + person.isTeen());

        // Test 2: First name only
        System.out.println("\n===== Test 2 =====");
        person.setFirstName("John");
        person.setLastName("");
        person.setAge(18);

        System.out.println("First Name : " + person.getFirstName());
        System.out.println("Last Name  : " + person.getLastName());
        System.out.println("Age        : " + person.getAge());
        System.out.println("Full Name  : " + person.getFullName());
        System.out.println("Teen       : " + person.isTeen());

        // Test 3: Full name
        System.out.println("\n===== Test 3 =====");
        person.setLastName("Smith");

        System.out.println("First Name : " + person.getFirstName());
        System.out.println("Last Name  : " + person.getLastName());
        System.out.println("Age        : " + person.getAge());
        System.out.println("Full Name  : " + person.getFullName());
        System.out.println("Teen       : " + person.isTeen());

        // Test 4: Invalid age
        System.out.println("\n===== Test 4 =====");
        person.setAge(-5);

        System.out.println("Age after setting -5: " + person.getAge());

        person.setAge(150);

        System.out.println("Age after setting 150: " + person.getAge());

        // Test 5: Teen check
        System.out.println("\n===== Test 5 =====");

        for (int i = 10; i <= 20; i++) {
            person.setAge(i);
            System.out.println("Age: " + i + " -> Teen: " + person.isTeen());
        }
    }
}