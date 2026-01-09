/**
 * BuildABear.java defines the BuildABear CLASS 
 * which is a template ofr BuildABear OBJECTS 
 */
public class BuildABear {
    // 3 SECTION SIN AN OBJECT-CLASS!
    // 1. INSTANCD VARIABLES (data/attributes/fields)
    private String type; // just declare, don't assign
    private String name; //"every BuildABear has a name..."
    private int fillLevel;
    private  double price;
    private boolean hasSpeaker;
    private String recording;
    // ENCAPSULATION: keep variables PRIVATE means 
    // they cannot be directly accessed outside of 
    // this Java CLASS (data is protected from users)
    
    // 2. CONSTRUCTORS (initaliz values)
    // DEFAULT CONSTRUCTOR does not take any arguments (no-arg)
    // what gets called when user says "= new BuildABear()"
    public BuildABear() {
        this.type = "bear"; // WE PICKED the initial values!
        this.name = "Teddy"; 
        this.fillLevel = 75;
        this.price = 150.00;
        this.hasSpeaker = false;
        this.recording = "";
    }
    // PARAMENTERIZE CONSTRUCTOR allows user to provide args
    // user PASSES initial values to the constructor call
    public BuildABear(String t, String n, int fl) {
        this.type = t; // USER picked the value for type!
        this.name = n;
        this.fillLevel = fl;
        this.price = 150.00;
        this.hasSpeaker = false;
        this.recording = "";
    }

    // 3. METHODS (behaviors/actions)

    // ACCESSORS ("getters") return the value of an istance var.
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public double getPrice() {
        return price;
    }

    // Write a toString() method so that we can print an object's STATE
    // including this method changes what happens when you print an object
    // otherwise, doing System.out.println(object) just shows a memory location 
    public String toString() {
        String state = "BuildABear[" + type + "," + name + "," + fillLevel + "," + price + "]";
        return state; 
    }

    // MUTATORS ("setters") are void, but accept an argument to change
    // the value of an object's instance variable to something new 


    // only need setters for variables you WANT the user to change 
    public void setName( String newName) {
        // assign the object's name to the new value 
        this.name = newName;
    }

    public void setFillLevel( int newFL) {
        this.fillLevel = newFL;
    }

} // end class