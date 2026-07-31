public class person {

    private String firstName;
    private String lastName;
    private int age;

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Setter for age
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Returns true if age is between 13 and 19
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Returns the person's full name
    public String getFullName() {

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }

        if (firstName.isEmpty()) {
            return lastName;
        }

        if (lastName.isEmpty()) {
            return firstName;
        }

        return firstName + " " + lastName;
    }
}