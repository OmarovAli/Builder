public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;

    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setAddress(String address) {
        this.address = address;

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
