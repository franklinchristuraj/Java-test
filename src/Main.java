import com.sun.jdi.event.StepEvent;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
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
        System.out.println("Baby Car's license plate: " + BabysCar.licensePlate);

        String userInput = "entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: "+ userInput.contains("Enter".toLowerCase()));

    }
}
