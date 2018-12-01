public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;


    public void checkTemperature(){
        if (temperature < -80){
            status = "powrót do domu";
            speed = 5;
        }
    }

    void showAttribiutes(){
        System.out.println("status: " + status);
        System.out.println("prędkość: " + speed);
        System.out.println("temperatura: " + temperature);
        System.out.println("____________________________");
    }

    public void checkStatus() {
        System.out.println("Odczyt statusu: " + status);
    }
}
