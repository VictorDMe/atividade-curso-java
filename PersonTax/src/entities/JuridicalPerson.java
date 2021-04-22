package entities;

public class JuridicalPerson extends Person {
    Integer numberOfEmployees;

    public JuridicalPerson() {
        super();
    }

    public JuridicalPerson(String name, Double income, Integer numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double tax() {
        int tax = 16;
        if (getNumberOfEmployees() > 10) tax = 14;

        return getIncome() * tax / 100;
    }
}
