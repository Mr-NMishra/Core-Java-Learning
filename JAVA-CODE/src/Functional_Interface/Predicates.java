package Functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Predicates {

    /*
    Create employees using functional interfaces and retrieve only those employees whose salary was in even number;
     */
    public static void main(String[] args) {
        //we use BiFuction to create an objects
        // first we implement the abstract method
        BiFunction<String, Integer,Employee> biFunction=(name,salary)->{
            return new Employee(name,salary);
        };

        //list to store employees
        ArrayList<Employee> employeeList= new ArrayList<>();
        int i=5;

        //creating employees from increment
        while(i<10){
            employeeList.add(
                    biFunction.apply("name_"+i,123*i)

            );
            i++;
        }

        //returning only those employees whose salary is even
        List<Employee> evenSalaryEmployee=employeeList.stream().filter(e->{
            return e.salary % 2 == 0;
        }).toList();

        System.out.println("Even salary employees"+evenSalaryEmployee);

    }


}

class Employee{
    int salary;
    String name;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

