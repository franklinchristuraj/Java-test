import com.sun.jdi.event.StepEvent;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);


        System.out.println("Hello world");
        System.out.println("Franklin");

        Car myCar = new Car(25.5,
                "1B2MX9",
                Color.BLUE,
                true);
        Car BabysCar = new Car(29,
                "A5HDG7",
                Color.RED,
                false);

        System.out.println("My Car's license plate:" + myCar.licensePlate);
<<<<<<< HEAD
        System.out.println("Baby Car's license plate: " + BabysCar.licensePlate);*/
=======
        System.out.println("Baby Car's license plate: " + BabysCar.licensePlate);

        String userInput = "entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+ userInput.contains("Enter".toLowerCase()));

>>>>>>> 0fe4d5bbd4d9bf941325532e31ce81814b708527
    }
}
