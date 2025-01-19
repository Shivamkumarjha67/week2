public class PersonCopy {
    public static void main(String[] args) {
        // Person1 object created
        Person person1 = new Person("Shivam", 22, 159);
        // Displaying his details
        System.out.println("Person1 details is: ");
        person1.displayPersonDetails();

        System.out.println("Person2 details is: ");
        Person person2 = new Person(person1);
        person2.displayPersonDetails();
    }
}

class Person {
    // Attributes of the person class
    private String name;
    private int age;
    private int height;

    // Default constructor
    Person() {}

    // Parameterized constructor
    Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.height = person.height;
    }

    // Displaying the person details
    public void displayPersonDetails() {
        System.out.println("Person name is " + name + " and his age is " + age  + ". his height is " + height);
    }
}
