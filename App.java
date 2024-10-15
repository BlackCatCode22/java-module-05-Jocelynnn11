package jocelyn.zoo.com;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    private static String calcAnimalBirthDate(int age, String theSeason){
        // Create a Date object to represent the current date
        Date today = new Date();


        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string

        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        System.out.println("Todays date in the format yyyy-MM-dd:" + strTodaysDate);

        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(String.valueOf(age));

        // Normalize the input season to lower case for case-insensitive comparison
        String season = theSeason.toLowerCase();

        switch (season) {
            case "spring":
                animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
                break;
            case "fall":
                animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
                break;
            case "winter":
                animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
                break;
            case "summer":
                animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
                break;
            default:
                animalBirthdate = Integer.toString(animalBirthYear) + "-01-01"; // Default case for anything else
                break;
        }

        return animalBirthdate;

    }
    public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n Welcome to my Zoo Program!\n");

        // This is the date stuff we did last week:
        // Create a Date object to represent the current date
        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output the result
        System.out.println("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        // Calculate birthdate for the following two hyenas
        // 1) 4 years old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 years old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdate for the animals and then create a method that returns a string
        // for the animal's birthdate.

        // input: "4 years old female hyena, born in spring"
        // processing: find the age and birth season
        //             and then use decision control structures to
        //             calculate the date.

        // parse the string
        String strStarting = "8 year old female hyena, unknown birth season, black and tan striped \n" +
                "color, 105 pounds, from Friguia Park, Tunisia";
        // split the string on ", "
        System.out.println();
        String[] arrayOfStrPartsOnComma = strStarting.split(", ");
        // output the array elements
        // this is a for : each loop - very handy when examining array elements.


        BufferedReader reader = null;



            try {
                reader = new BufferedReader( new FileReader("arrivingAnimals.txt"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

























        // calculate birthdate for the following two hyenas.
        // 1) 4 years old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 years old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia


        // Write Java code to calculate birthdate for the animals and then create a method that returns a string
        // for the animal's birthdate.

        // input: "4 years old female hyena, born in spring"
        // processing: find the age and birth season
        // and then use if statements decision control structures to
        // calculate the date.
        // parse the string

       // String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // split the string on ","
        System.out.println();
       // String[] arrayOfStrPartsOnComma = strStarting.split(", ");
        // output the array of elements
        // this loop is for: each loop-very handy when examining array elements.
        int elementNum =0;
        for (String thePart : arrayOfStrPartsOnComma) {
            System.out.println("Element " + elementNum +  " of arrayOfStrPartsOnComma is: " + thePart);
            elementNum++;


        }
        System.out.println();
        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        elementNum =0;
        for (String thePart : arrayOfStrPartsOnSpace) {
            System.out.println("Element " + elementNum +  " of arrayOfStrPartsOnSpace is: " + thePart);
            elementNum++;
        }
        System.out.println();


        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
        for (String thePart : arrayOfStrPartsOnSpace02) {
            System.out.println("Element " + elementNum +  " of arrayOfStrPartsOnSpace02 is: " + thePart);
            elementNum++;
        }
        System.out.println();

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);



        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-03-20";

        }
        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }

        if (animalBirthSeason.contains("winter")) {
            animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
        }


        System.out.println("\n animalBirthdate = " + animalBirthdate);


    // thi is a unit test - we are testing the Animal
        Animal myNewAnimal = new Animal("male",4,70,"Zig","Hy01","2020-3-21","brown spots","San Diego Zoo");

    // Prove it!
        System.out.println("\n this is the new animal!\n");
        System.out.println("\n ID is:" +myNewAnimal.getAnimalID() + "and...name is:" + myNewAnimal.getAnimalName() + "\n");
    }
}