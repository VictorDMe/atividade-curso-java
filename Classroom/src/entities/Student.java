package entities;

public class Student {
    private String name;
    private int age;
    private char gender;
    private double height, weight;

    public Student(String name, int age, char gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return String.format("Nome: %s%nIdade: %d%nGênero: %c%nAltura: %.2f%nMassa: %.2f%n",
                name,
                age,
                gender,
                height,
                weight);
    }

}
