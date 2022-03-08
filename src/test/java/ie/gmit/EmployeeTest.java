package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    void testValidEmployee(){
        new Employee("Brian" , "12345");
    }

    @Test
    void testNewEmployeeWithEmptyNameThrowException(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> {new Employee("", "12345");});
        assertEquals("Invalid name length", e.getMessage());
    }

    @Test
    void testNewEmployeeWithEmptyNumThrowException(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> {new Employee("Brian", "");});
        assertEquals("Employee Number should be 5 digits", e.getMessage());
    }
}
