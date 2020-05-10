package wh10_1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        checkPreconditions(firstName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkPreconditions(String firstName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException("Imie nie moze byc puste i musi skladac sie z wiekszej liczby znakow niz 2");
        }
        if (age < 1) {
            throw new IncorrectAgeException("wiek nie moze byc mniejszy niz 1");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "wh10_1.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
