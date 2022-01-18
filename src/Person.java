// OBJECT PRACTICE:
// Create the person class with properties of your choice. Create the appropriate accessors and mutators.
// One of the properties on the Person class must be an array of Dogs called pet.
// Must have default constructor and parameterized override constructor.
// Once the Person class is complete, create a person object in SymClient with at least one dog object in the 
import java.util.ArrayList;


public class Person {
    private String name;
    private String race;
    private boolean isJailed;
    private int age;
    private ArrayList<Dog> dogs;
    private String job;

    public Person() {
        name = "";
        race = "white";
        isJailed = false;
        age = 0;
        dogs = new ArrayList<Dog>();
        job = "homeless";
    }

    public Person(String namec,String racec, boolean isJailedc, int agec, ArrayList<Dog> dogsc, String jobc){
        this.name = namec;
        this.race = racec;
        this.isJailed = isJailedc;
        this.age = agec;
        this.dogs = dogsc;
        this.job = jobc;
    }

    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }
    public boolean getJailed() {
        return isJailed;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<Dog> getDogs() {
        return dogs;
    }
    public String getJob() {
        return job;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setJailed(boolean isJailed) {
        this.isJailed = isJailed;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }
    public void setJob(String job) {
        this.job = job;
    }


    public void becomeCop(){
        this.job = "cop";
        this.isJailed = false;
    }

    public void printAge(){
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void arrest(Person criminal) {
        if(this.job.equals("cop")){
            criminal.isJailed = true;
            System.out.println(criminal.name + " has been arrested");
        }
        System.out.println(this.name + " cannot arrest, they arent a cop");
    }
}
