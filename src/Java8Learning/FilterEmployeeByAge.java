package Java8Learning;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean filter(Employee e) {
        return e.getAge()>=30;
    }
}

class FilterEmployeeBySalary implements MyPredicate<Employee> {

    @Override
    public boolean filter(Employee e) {
        return e.getSalary()>=5000;
    }
}


