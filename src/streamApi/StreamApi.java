package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Zuber",100000);
        Employee employee2 = new Employee("Ahmad",200000);
        Employee employee3 = new Employee("Khan",300000);
        Employee employee4 = new Employee("name",600000);
        Employee employee5 = new Employee("None",8800000);
        List<Employee> ls = new ArrayList();
        ls.add(employee1);
        ls.add(employee2);
        ls.add(employee3);
        ls.add(employee4);
        ls.add(employee5);

        System.out.println(" cecec   "+find2ndhighestSal(ls));




    }

    public static double find2ndhighestSal(List<Employee> employees)
    {
        Double doubleList = employees.stream().map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .distinct().skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("There is no second-highest salary."));
        return doubleList;
    }
}
