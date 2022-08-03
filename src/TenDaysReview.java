import java.util.ArrayList;
import java.util.Arrays;

public class TenDaysReview {
    /* In this class file, I am going to go over everything I have learnt in the past 5 days. This includes
    Arrays, ArrayLists, Switch statements and Conditional Operators */

    public static void main(String[] args){
        //So here I am going to create an Array. These are static and once declared cannot change in value.
        String[] Characters = new String[5];
        //Now our Array is created, with it being able to hold 5 elements. I will now add some value to it.
        Characters[0] = "John";
        Characters[1] = "Derek";
        Characters[2] = "Jacob";
        Characters[3] = "Pablo";
        //Our Array now has 4 elements, with the 5th index being null. I will now printout the names and the length.
        System.out.println("The length of our 'Characters' Array is: "+Characters.length);
        //This printout will display "5" as our array's length. I will now call on our index to printout names.
        System.out.println("The Character stored in Index 0 is: "+Characters[0]);
        System.out.println("The Character stored in Index 3 is: "+Characters[3]);

        System.out.println("=====");
        /* Regular indexes are quite restrictive as we cannot add or remove more than the specified entity amount.
        We can instead use an ArrayList to combat these restrictions as an ArrayList proves to be much more versatile.
         */
        ArrayList<String> Locations = new ArrayList<String>();
        //Now I have declared a new, empty ArrayList, I should add some entries.
        Locations.add("Paris");
        Locations.add("New York");
        Locations.add("London");
        //These will add into our index in top to bottom order, however we can insert a new city in say, index 0:
        Locations.set(0, "Delhi");
        Locations.add(1, "Dublin");
        //Now Delhi will be in index 0, and Paris will be deleted.
        //Also, Dublin will be added into index 1, with subsequent locations moved to the right by one.
        System.out.println("The number of locations is: "+Locations.size());
        System.out.println(Locations.get(0));
        System.out.println(Locations.get(1));
        System.out.println(Locations.get(2));
        System.out.println(Locations.get(3));

        System.out.println("=====");

        //Now we have gone over Arrays and ArrayLists, I will now make use of Conditional Operators:
        if (Locations.size() > 1 && Locations.size() < 10){
            System.out.println("This is an example of conditional operators, specifically the AND (&&) command.");
        }
        //Other Conditional Operators are OR(||) and NOT(!)

        System.out.println("=====");

        /* Lastly, I will give an example of a Switch Statement. These are used in conditionals and control flow and
        are an alternative to chaining conditions. */

        String acts = "Act 2";
        switch(acts){
            case "Act 1":
                break;
            case "Act 2":
                System.out.println("We have found Act 2!");
                break;
            case "Act 3":
                break;
            case "Act 4":
                break;
            default:
                System.out.println("The act was not found!");
        }

    }
}
