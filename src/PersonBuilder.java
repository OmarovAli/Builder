public class PersonBuilder {
    private  String name;
    private  String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        return setName(name);
    }

    public PersonBuilder setSurname(String surname) {
        return setSurname(surname);
    }

    public PersonBuilder setAge(int age) {
        return setAge(age);
    }

    public PersonBuilder setAddress(String address) {

        return setAddress(address);
    }

    public Person build() {
        Person person = new Person(name, surname, age, address);
        if (person.isValid()) {
            return person;
        } else {
            throw new IllegalStateException("Person is invalid");
        }
    }
}