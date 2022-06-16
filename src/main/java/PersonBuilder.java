import java.util.OptionalInt;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect age");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || surname == null) {
            throw new IllegalStateException("You must enter a name and a surname!");
//        } else if (age == -1) {
//            return new Person(name, surname, address);
//        } else if (address.equals(null)) {
//            return new Person(name, surname, age);
//        } else if (age == -1 && address.equals(null)) {
//            return new Person(name, surname);
        } else {
            return new Person(name, surname, age, address);
        }
    }
}