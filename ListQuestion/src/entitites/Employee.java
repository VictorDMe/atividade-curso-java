package entitites;

public class Employee {
    private final Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void upSalary(Double percentage) {
        salary = salary * (percentage + 100) / 100;
    }

    public String toString() {
        return String.format("%d, %s, $ %.2f%n", getId(), getName(), getSalary());
    }
}
