package Java8Learning;

import java.util.*;


public class filterEmployee {

    protected static List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 60, 6666.66),
            new Employee("赵六", 16, 7777.77),
            new Employee("田七", 18, 3333.33)
    );

    public static List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> myPredicate) {
        List<Employee> employees = new ArrayList<>();
        for (Employee e : list) {
            if (myPredicate.filter(e)) {
                employees.add(e);
            }
        }
        return employees;
    }



    public static void main(String[] args) {
        System.out.println("根据年龄筛选");
        List<Employee> list = filterEmployee(employees,new FilterEmployeeByAge());
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println("根据工资筛选");
        List<Employee> list2 = filterEmployee(employees,new FilterEmployeeBySalary());
        for (Employee e : list2) {
            System.out.println(e);
        }
    }
}

