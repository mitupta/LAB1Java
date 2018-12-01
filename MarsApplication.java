public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttribiutes();

        System.out.println("Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.println("Zmniana temperatury na - 90");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttribiutes();

        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 1;
        opportunity.temperature = -25;
        opportunity.showAttribiutes();

        opportunity.checkStatus();



    }
}
