public class Main {

   public static void main(String []args) {
      // Create a new String -> SHORTCUT!
      String lerbron = "GOAT";
      // But String are actually OBJECTS 
      // The original was to create String:
      String steph = new String("GOAT");

      // All objects can be created using this pattern:
      // ClassName obiectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      // "BuildABear basicBear" is DECLARING a variable of type BuildABear
      // "new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(basicBear);

      // Create a new obiect with our won values
      // called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear pony = new BuildABear("pony", "Rainbow Dash", 90);

      // Printing the OBJECT calls the CLASS' toString() method 
      System.out.println(pony);

      // Test our methods below by CALLING them on an object instance
      // GETTERS are NON-VOID (we need to handle output data)
      System.out.println( pony.getType() );
      // or, store the return value in a varible 
      double price = pony.getPrice();
      System.out.println( price );

      // SETTERS are VOID (means no return value)
      // calling void methods: objectName.methodName()

      pony.setName("Rarity");
      pony.setFillLevel(50);
      // setters (mutators) changed values. let's see the effects:
      System.out.println(pony);







   } // end main() METHOD
} // end Main CLASS 
