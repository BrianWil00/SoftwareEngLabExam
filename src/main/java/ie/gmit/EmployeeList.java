package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    public EmployeeList(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee){
        employees.delete(employee);
    }
    public void getListSize(){

    }



}
