import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Parking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Park vaga = new Park();
        while (true){
            System.out.println("Olá! O que deseja fazer?");
            System.out.println("1 - Entrada de carro \n2 - Saída de carro \n3 - Listar carro \n0 - sair ");
            String answer = scanner.nextLine();
            if (answer.equals("1")){
                System.out.println("Digite o modelo do carro: ");
                String model = scanner.nextLine();
                System.out.println("Digite a placa do carro: ");
                String plate = scanner.nextLine();
                LocalDateTime hour = LocalDateTime.now();
                Car car = vaga.registerCar(plate, model, hour);
                vaga.parkCar(car);
            } else if (answer.equals("2")) {
                vaga.value(hour);
            } else if (answer.equals("3")){
                List<Car> carList = vaga.getCars();
                for(Car car : carList){
                    System.out.println(car);
                }
            } else if (answer.equals("0")){
                break;
            }
        }

    }
}
