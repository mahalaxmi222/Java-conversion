
public class ObjectToObjectConversionExample {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", 30);

        // Converting Person to Employee using the constructor
        Employee employee = new Employee(person, "E123");

        // Displaying information
        person.displayInfo();
        employee.displayInfo();
    }
}