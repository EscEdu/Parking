import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Car {

    String plate;
    String model;
    LocalDateTime hour;


    public Car(String plate, String model, LocalDateTime hour){
        setPlate(plate);
        this.model = model;
        this.hour = LocalDateTime.now();
    }

    Scanner scanner = new Scanner(System.in);

    public LocalDateTime getEntering(){
        return hour;
    }

    public void setEntering(LocalDateTime entering) {
        this.hour = entering;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String result = "---------------\n" + "Placa do carro: " + this.plate + "\n" + "Modelo: " + this.model + "\n" + "Horário de entrada: " + this.hour.format(formatter) + "\n---------------";
        return result;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate){
        while (plate.length() != 7){
            System.out.println("Placa inválida, digite novamente: ");
            plate = scanner.nextLine();
        }
        this.plate = plate;
    }
}
