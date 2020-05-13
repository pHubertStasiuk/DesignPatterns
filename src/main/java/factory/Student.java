package factory;

public class Student implements Person {

    @Override
    public String getPerson() {
        return "Student";
    }

    @Override
    public String makeSound() {
        return "Hey!";
    }
}
