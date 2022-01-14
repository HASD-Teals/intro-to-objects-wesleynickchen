public class Dog {
    //#region Class Varialbes
    // Properties
    private String name;
    private String color;
    private String type;
    private int age;
    private boolean isHypoalergenic;

    // Fields
    protected int humanYears = 7;
    //#endregion

    //#region Constructors
    // Default constructor
    public Dog() {
        this.name = "";
        this.color = "";
        this.type = "";
        this.age = 0;
        this.isHypoalergenic = false;
    }

    // Override constructor
    public Dog(String name, String color, String type, int age, boolean isHypoalergenic) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
        this.isHypoalergenic = isHypoalergenic;
    }
    //#endregion

    //#region Accessors/Getters
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public boolean getIsHypoalergenic() {
        return isHypoalergenic;
    }
    //#endregion

    //#region Mutators/Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIsHypoalergenic(boolean isHypoalergenic) {
        this.isHypoalergenic = isHypoalergenic;
    }
    //#endregion

    //#region Methods
    public int getHumanAge() {
        return age * humanYears;
    }
    //#endregion
}
