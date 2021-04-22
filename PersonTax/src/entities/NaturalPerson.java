package entities;

public class NaturalPerson extends Person {
    Double healthSpending = 0.0;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double income, Double healthSpending) {
        super(name, income);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double tax() {
        Integer tax = 25;
        if (getIncome() < 20000.00) tax = 15;

        return tax * getIncome() / 100 - 50 * getHealthSpending() / 100;
    }
}
