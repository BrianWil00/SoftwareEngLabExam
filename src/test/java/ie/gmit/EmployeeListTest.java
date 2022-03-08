package ie.gmit;

import org.junit.jupiter.api.Test;

public class EmployeeListTest {

    @Test
    void testValidEmployeeList(){
        employees.add(new Employee("Brian", "12345"));
        new EmployeeList(employees);
    }

    @Test
    void testAddEmployee(){
        employees.addEmployee(new Employee("John Doe", "22222"));
    }

    @Test
    void testDeleteEmployee(){
        employees.deleteEmployee(new Employee("John Doe", "22222"));
    }
}
