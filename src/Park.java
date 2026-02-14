import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Park {
    private int vacancies = 1;
    private List<Car> cars;

    public Park(){
        cars = new ArrayList<>();
    }

    public void parkCar(Car car){
        cars.add(car);
    }

    public Car registerCar(String plate, String model, LocalDateTime hour){
        if (vacancies < 20){
            Car car = new Car(plate, model, hour);
            vacancies++;
            return car;
        } else {
            System.out.println("Desculpe, todas as vagas estão ocupadas!");
            return null;
        }
    }

    public List<Car> getCars(){
        return cars;
    }
}
