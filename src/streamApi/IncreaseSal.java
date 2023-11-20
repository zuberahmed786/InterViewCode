package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseSal {

    public static void main(String[] args) {
        Employee e1 = new Employee("Zuber",19800);
        Employee e2 = new Employee("Ahmed",34800);
        Employee e3 = new Employee("khan",29800);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);


       List<Employee> employees = employeeList.stream().map(e->{
           if (e.getName().equals("Zuber")){

               e.setSalary(e.getSalary()*2);

           }
           return e;

       }).peek(e->System.out.println(e))
               .collect(Collectors.toList());

        System.out.println("Increased Salary "+employees);
        employees.forEach(System.out::println);
    }




}
