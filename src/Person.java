import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person() {
    }



    public boolean hasAge(int age) {
        if (age == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress(String address) { /*...*/
        if (address == null ) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String happyBirthday(int age) {
        if (age == 0) {
            age++;
        }

        @Override
        public String toString() {
            return String.format(
                    "Person:\t\t%d\nName:\t\t%s\nSurname:\t%s\nage:\t%s\naddress"
                    , age, name, surname, address);
        }
    }
        @Override
        public int hashCode () {

        }

        public PersonBuilder newChildBuilder () {
           PersonBuilder child = new PersonBuilder()
                   .setSurname(name)
                   .setAddress(address);

            return child;
        }



    }
}
