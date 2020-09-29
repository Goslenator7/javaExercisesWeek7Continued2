public class DemoPerson {
    public static void main(String[] args) {
        Person myPerson = new Person();
        myPerson.printDetails();

        Person person2 = new Person("Jeff", 45);
        person2.printDetails();

        Person person3 = new Person("Mark", "Edinburgh");
        person3.printDetails();

        Person person4 = new Person(20);
        person4.printDetails();
    }
}
