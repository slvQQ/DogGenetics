import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.00");


    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        System.out.println("What is your dog's name?");
        String askDog = input.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + askDog + "'s prestigious background right here.");

        System.out.println(askDog + " is:");

        String [] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        Random num = new Random();

        int [] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {

            intArray[i] = num.nextInt(100);

        }
            for (int i = 0; i < breeds.length; i++) {

                System.out.println(intArray[i]+ "%" + " " + breeds[i]);

            }

        System.out.println("Wow, that is a CUTE dog");

    }
}
