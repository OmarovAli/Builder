import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;


    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public boolean hasAge(int age) {
        if (age == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress(String address) { /*...*/
        if (address == null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday(int age) {
        if (age == 0) {
            age++;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [Имя=").append(name).append(", Фамилия=").append(surname).append(", возраст=").append(age).append(", место жительств=").append(address);
        return builder.toString();
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = prime * result + (name != null ? name.hashCode() : 0);
        result = prime * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
        return child;
    }

    public boolean isValid() {
        return (name != null && !name.trim().isEmpty()) && (surname != null && !surname.trim().isEmpty())
                && (age != 0 && age > 0) && (address != null && !address.trim().isEmpty());
    }

}

