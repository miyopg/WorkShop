import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Service {

    private ServiceType serviceName;
    private BigDecimal serviceCost;
    private Set<Car> carSet;
    private Set<Client> clientSet;


    public Service(ServiceType serviceName, double serviceCost) {
        this.serviceName = serviceName;
        this.serviceCost = BigDecimal.valueOf(serviceCost);
    }



   /* public Service(ServiceType serviceName, double cost) {

    }*/

    public ServiceType getServiceName() {
        return serviceName;
    }

    public double getServiceCost() {
        return serviceCost.doubleValue();
    }

    public void printServices() {
        System.out.println(serviceName.serviceInfo());

    }

    public void addClientToServis(Client client) {
        clientSet.add(client);
    }
    public void addCarToServis(Car clientCar) {
        carSet.add(clientCar);
    }

    @Override
    public String toString() {
        return
                "ServiceName: " + serviceName +
                ", ServiceCost: " + serviceCost;
    }
}
