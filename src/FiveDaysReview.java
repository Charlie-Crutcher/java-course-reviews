public class FiveDaysReview {
    /* In this class file, I am going to go over everything I have learnt on the previous 5 days of Java.
    I plan to include everything I have learnt and will add comments along the way!*/

    /*Here I am creating my own types known as enums. This will save us memory and be easy to reference when
    writing our method*/
    enum Genre {
        SHOOTER,
        SPORTS,
        RACING
    }


    //Instance Fields are declared here:
    String gameName;
    Genre gameGenre;
    double gameCost;


    /* Here I am creating a Constructor for this class(MyClass).
    - The Constructor MUST have the same name as our Class file.
    - We can use this to give initial value to our Instance Fields. */
    public FiveDaysReview(String name, Genre genre, double cost) {

    /*Here I am giving value to the Instance Fields using the
    Constructor's parentheses*/
        gameName = name;
        gameGenre = genre;
        gameCost = cost;
    }


    //I am going to create a Method that references our video games.
    public void checkGame(){

        //IF our game equals to "Call of Duty" - this will run:
        if(gameName.equals("Call of Duty")){
            System.out.println("This game is: "+gameName+", it is a "+gameGenre+" game, and it costs: "+gameCost);
        }

        //IF our game equals to "Fifa 2022" - this will run:
        else if(gameName.equals("Fifa 2022")){
            System.out.println("This game is: "+gameName+", it is a "+gameGenre+" game, and it costs: "+gameCost);
        }

        //If the previous two are FALSE - this will run:
        else{
            System.out.println("No video game found! Try again.");
        }
    }

    /*Here I will create a toString() method that returns a more legible
    response when we print our object*/
    public String toString(){
        return "This is an example of printing an Object";
    }


    //This is the main() method for the Java file.
    public static void main(String[] args) {

    /*I will declare a new variable with a REFERENCE DATA TYPE. This
    means our variable will be a "MyClass" variable type.*/
        FiveDaysReview callOfDuty = new FiveDaysReview("Call of Duty",Genre.SHOOTER, 39.99);
        FiveDaysReview fifaFootball = new FiveDaysReview("Fifa 2022",Genre.SPORTS, 129.99);

        //Here I am calling
        fifaFootball.checkGame();
        callOfDuty.checkGame();

        //Hee I am calling my toString() method by printing our callOfDuty object
        System.out.println(callOfDuty);

    }
}
