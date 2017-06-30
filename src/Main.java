import java.util.Scanner;

/**
 * Created by Mark on 6/29/2017.
 */
public class Main {

    //static int years = 32;(global variable)
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age in years: ");
        int userAge = scan.nextInt();
        //years = userAge;(global variable)
        //System.out.println(setAge(38));
        //for this one, I have hard coded 38 in the method call so no matter what I input in
        //the scanner it will give me the result for 38 years in days.


        System.out.println(setAge(userAge));
        //whats userAge relationship with setAge, why is it not int years???
        //We are hard coding the method call with userAge
        //setAge(userAge) is telling this to take the userinput and run it through my method
        //or telling me that I am taking the userinput and running it through my method

        //System.out.println(setAge2());


    }

    //parenthesis after setAge is in order for me to call this, you need to give me an integer inside the parentesis
    public static int setAge(int years) {

        //the word "years" has to be in the code for the method im running as an integer because
        //I declared "years" as a variable in the name of my method
        //**********************WHY???**********************

        //if I declare int years as a variable outside of the method, would it run???

        int ageDays = years * 365;


        /*so If I named this method Jeff, and I call Jeff and ask him for his age in days (return ageDays) I dont
        want anthing from him besides a number of days he's been alive. i DONT CARE ABOUT HIS EQUATION.
         */

        return ageDays;
        //when I call setAge, I am going to get the value for ageDays as a return
    }



    /*public static int setAge2(){
        //create some statement that calculates age in number of days
        int ageDays = 0;

        ageDays = years * 365;
        return ageDays;
    }
    */
    //this will print out 32 * 365 no matter the input from scanner because I have hard coded 32 as int years
    //WHY???***************************************************************WHY???*****************


    // write your code here
}

