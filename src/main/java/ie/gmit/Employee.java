package ie.gmit;

public class Employee {
    private String name;
    private String employeeNum;


    public Employee(String name,String employeeNum){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Invalid name length");
        }
        else{
            this.name = name;
        }

        if (employeeNum.isEmpty()){
            throw new IllegalArgumentException("Employee Number should be 5 digits");
        }
        else{
            this.employeeNum = employeeNum;
        }
    }
}
