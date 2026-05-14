import java.time.LocalDateTime;
import java.util.Scanner;

public class Car {

    String plate;
    String model;
    LocalDateTime hour;

    public Car(String plate, String model, LocalDateTime hour){
        this.plate = plate;
        this.model = model;
        this.hour = LocalDateTime.now();
    }

    public LocalDateTime getEntering(){
        return hour;
    }

    public void setEntering(LocalDateTime entering) {
        this.hour = entering;
    }

    public String toString(){
        String result = "Placa do carro: " + this.plate + "\n" + "Modelo: " + this.model + "\n" + "Horas: " + this.hour;
        return result;
    }

}
