package factory;

public class PersonFactory implements AbstractFactory<Person> {

    @Override
    public Person create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Student();
        }
        return null;
    }
}
