import java.util.ArrayList;

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
        System.out.println();
        ArrayList<Dog> myFirstHumansDogs = new ArrayList<Dog>();

        System.out.println("this is a story about racism to spread awareness: \n");
        Person mySecondPerson = new Person("Tyrone", "black", false, 19, null, "Store clerk");

        Person myThridPerson = new Person("Kevin Stevens", "white", false, 34, null, "unemployed");
        myThridPerson.becomeCop();

        racism(mySecondPerson, myThridPerson);

        waitOutPrison(mySecondPerson, 12);

        murder(mySecondPerson, myThridPerson, true);

        waitOutPrison(mySecondPerson, 50);

        
        mySecondPerson.printAge();

        for (Dog dog : myFirstHumansDogs) {
            System.out.println(dog);
        }
    }

    public static void murder(Person crim, Person victim, boolean caught){
        System.out.println(victim.getName() + " has died");
        victim = null;
        if(caught){
            System.out.println(crim.getName() + " was found guilty");
            crim.setJailed(true);
        }
    }

    public static void racism(Person criminalised, Person corruptCop){
        if(!(criminalised.getRace() == corruptCop.getRace()) && corruptCop.getJob() == "cop"){
            criminalised.setJailed(true);
            System.out.println("racism has occured, " + criminalised.getName() + " is in jail!");
        }
    }

    public static void waitOutPrison(Person crim, int sentance) {
        System.out.println(crim.getName() + " has waited out prison");
        crim.setJailed(false);
        crim.setAge(crim.getAge() + sentance);
    }


}
