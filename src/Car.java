import java.util.HashSet;
import java.util.Set;

public class Car {

    private String carName;
    private String carEngine;
    private String carYear;
    private Set<Service> serviceToCar;
    private Set<Client> clientSet;

    public Car(String carName, String carEngine, String carYear) {
        this.carName = carName;
        this.carEngine = carEngine;
        this.carYear = carYear;
        this.serviceToCar = new HashSet<>();
            }

    public String getCarName() {
        return carName;
    }

    public String getCarYear() {
        return carYear;
    }

    public String getCarEngine() {
        return carEngine;

    }

    public boolean addServiceToCar(Service service) {
        return serviceToCar.add(service);
    }

    public void carInfo () {

    }

    public void printCarServicesInfo() {
        System.out.println("Car Services for: " );
        System.out.println(carName + " " + carEngine + " " + carYear + " rok : ");
        serviceToCar.stream()
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return
                "Name: " + carName +
                ", Engine: " + carEngine +
                ", Year: " + carYear;
    }
}
