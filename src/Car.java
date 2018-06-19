import java.awt.*;

public class Car {
        //Data types
        // int --> Integer 1,2,3...
        // double --> decimal 3.50, 9.02, etc..
        // String --> Hello world, A1A2
        // Color --> Import from awt library
        // Boolean --> True or False

        double averageMilesPerGallon;
        String licensePlate;
        Color paintColor;
        Boolean areTailLightsWorking;

        public Car(double inputaverageMPG,
                   String inputlicensePlate,
                   Color inputpaintColor,
                   Boolean inputareTailLightsWorking) {

            this.averageMilesPerGallon = inputaverageMPG;
            this.licensePlate = inputlicensePlate;
            this.paintColor = inputpaintColor;
            this.areTailLightsWorking = inputareTailLightsWorking;
        }



    }
