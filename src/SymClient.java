public class SymClient {
    public static void main(String[] args) throws Exception {
        // Create a dog object with the default constructor
        Dog myFirstDog = new Dog();
        // Create a dog object with the paramaterized constructor
        Dog mySecondDog = new Dog("Fido", "Brown", "Labrador", 4, false);

        // Testing our dog objects
        System.out.println(myFirstDog.getName());
        System.out.println(mySecondDog.getName());

        // Calling the setName mutator/setter on the a dog object
        myFirstDog.setName("Rufus");

        // More tests
        System.out.println(myFirstDog.getName());
        System.out.println("Age: " + mySecondDog.getAge());
        System.out.println("Age in human years: " + mySecondDog.getHumanAge());
    }
}
