class Person {
    String name;
    int age;

    // Constructor for Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void displayInfo() {
        System.out.println("Person: " + name + ", " + age + " years old");
    }
}

class Employee {
    String name; // Adding name and age fields in Employee class
    int age;
    String employeeId;

    // Constructor for converting Person to Employee
    Employee(Person person, String employeeId) {
        this.name = person.name;
        this.age = person.age;
        this.employeeId = employeeId;
    }

    // Display method
    void displayInfo() {
        System.out.println("Employee: " + name + ", " + age + " years old, Employee ID: " + employeeId);
    }
}

