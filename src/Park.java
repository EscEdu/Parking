import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.Duration;

public class Park {
    private int carCount = 0;
    protected List<Car> cars;

    Scanner scanner = new Scanner(System.in);
    private double bill;
    LocalDateTime exit;

    public Park() {
        cars = new ArrayList<>();
    }

    public void parkCar(Car car) {
        cars.add(car);
    }

    public Car registerCar(String plate, String model, LocalDateTime hour) {
        if (carCount <= 20) {
            Car car = new Car(plate, model, hour);
            carCount++;
            return car;
        } else {
            System.out.println("Desculpe, todas as vagas estão ocupadas!");
            return null;
        }
    }

    public List<Car> getCars() {
        return cars;
    }


    public void value() {
        System.out.println("Digite a placa do veículo: ");
        String search = scanner.nextLine();
        boolean found = false;
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPlate().equals(search)) {
                LocalDateTime enter = cars.get(i).getEntering();
                exit = LocalDateTime.now();
                Duration between = Duration.between(enter, exit);
                bill = ((between.toHours() + 1) * 5);
                System.out.println("Valor à ser pago: R$" + bill);
                cars.remove(i);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Veículo não localizado em nosso sistema.");
    }
}
