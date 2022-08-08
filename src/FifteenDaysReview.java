import java.util.ArrayList;

public class FifteenDaysReview {
    /* In this class file, I am going to go over everything I have learnt in the past 5 days of CodeAcademy.
    This includes Loops, String Methods and Access, Encapsulation and Scope.*/

    /*Here I am going to declare some instance variables and call on them in our main() method. I have declared this
    variable a "Private" variable, meaning no other class has access, unless they call upon an Accessor method.*/
    static int footballNum;
    private String goals;

    public static void main(String[] args){

        //I am creating an ArrayList, I will use a for loop in order to traverse our indices.
        ArrayList<String> footballPlayers = new ArrayList<String>();
        footballPlayers.add("Messi");
        footballPlayers.add("Ronaldo");
        footballPlayers.add("Salah");
        footballPlayers.add("Pogba");

        /*I am going to create a for loop, which will run as long as the statement is TRUE. Inside the parentheses,
        we first add our counter variable, I have called mine "i", then we add our boolean statement (Separated by a
        semicolon), which I have declared if our counter is SMALLER than the size of our ArrayList, then loop. And
        finally we add our increment operator (i++), which will add 1 to our counter each time it loops.*/
        for(int i = 0;i < footballPlayers.size(); i++){
            System.out.println("Footballer "+footballNum+" is: "+ footballPlayers.get(i));
            footballNum++;
        }
        //This is a very basic loop, but I go more in depth with the for loop system in my reading-list repository.

        System.out.println("");

        /*Now I am going to use some String Methods. These are inbuilt methods into Java that allow us to modify
        our String objects. I will make use of the main commands below.*/

        String messi = "Messi";
        String lionel = "Lionel ";

        //First, length. This will find the length of our String, including spaces and punctuation.
        System.out.println("Length String Method.");
        System.out.println(messi.length());
        System.out.println("");

        //Secondly, concat. This will concentrate one string to the end of another, like so:
        System.out.println("Concat String Method.");
        System.out.println(lionel.concat(messi));
        System.out.println("");

        //Next up, equals. This will check if two strings are the same, this includes caps.
        System.out.println("Equals String Method");
        System.out.println(messi.equals(lionel));
        System.out.println("");

        /* Next, indexOf. This will find the indices of our specified characters, or substrings.
        Here we will see what index "i" is at on Messi. Remember indices always start at 0, not 1. */
        System.out.println("IndexOf String Method");
        System.out.println(messi.indexOf("i"));
        System.out.println("");

        // charAt prints the character of a specified index, say we want to print index number 1:
        System.out.println("CharAt String Method");
        System.out.println(messi.charAt(1));
        System.out.println("");

        // substring will print a specified point of a string, such as "ess" from Messi. This can be useful for long strings.
        System.out.println("Substring String Method");
        System.out.println(messi.substring(1,4));
        System.out.println("");

        //Lastly, we have toUpperCase and toLowerCase, this can be useful for consistency within data.
        System.out.println("toUpperCase and toLowerCase String Method");
        System.out.println(messi.toUpperCase());
        System.out.println(messi.toLowerCase());

        /* As I am still currently learning the functionality of the 'this' keyword, and where to put it into practice,
        I will include this specific keyword in the Twenty Day Review of the course.*/

    }
}
