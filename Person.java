import javax.swing.*;

public class Person {
    private String name;
    private String address;
    private int age;

    // Constructors

    // Set defaults if no params given
    public Person() {
        name = "unknown";
        address = "unknown";
        age = 0;
    }

    // default address if not given
    public Person(String name, int age) {
        setName(name);
        address = "unknown";
        setAge(age);
    }

    // default age if not given
    public Person(String name, String address) {
        setName(name);
        setAddress(address);
        age = 0;
    }

    // default name and address if not given
    public Person(int age) {
        name = "unknown";
        address = "unknown";
        setAge(age);
    }

    // Prep details for output
    public String toString() {
        String output;

        output = "My name is "+name+" and live in "+address+". I am "+age+" years old.";
        return output;
    }

    // Output message defined above
    public void printDetails() {
        String message;

        message = toString();
        JOptionPane.showMessageDialog(null, message, "Details", JOptionPane.INFORMATION_MESSAGE);
    }

    // Get and Set

    // name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // address
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
