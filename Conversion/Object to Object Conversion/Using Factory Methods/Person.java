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
    String name;
    int age;
    String employeeId;

    // Factory method for converting Person to Employee
    static Employee convertFromPerson(Person person, String employeeId) {
        Employee employee = new Employee();
        employee.name = person.name;
        employee.age = person.age;
        employee.employeeId = employeeId;
        return employee;
    }

    // Display method
    void displayInfo() {
        System.out.println("Employee: " + name + ", " + age + " years old, Employee ID: " + employeeId);
    }
}
