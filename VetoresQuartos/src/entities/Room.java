package entities;

public class Room {

    private String name;
    private String email;
    private final int number;

    public Room(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return String.format("%d: %s, %s%n", number, name, email);
    }
}
