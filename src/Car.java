import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
        String result = "Placa do carro: " + this.plate + "\n" + "Modelo: " + this.model + "\n" + "Horário de entrada: " + this.hour.format(formatter);
        return result;
    }

    public String getPlate() {
        return plate;
    }
}
