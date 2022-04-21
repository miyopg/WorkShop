import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Client {
    private String clientName;
    private String clientSurname;
    private Set<Car> clientCars;
    private Set<Service> clientService;

    public Client(String clientName, String clientSurname) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientCars = new HashSet<Car>();
        this.clientService = new HashSet<Service>();
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public Set<Car> getClientCars() {
        return clientCars;
    }

    public Set<Service> getServiceType() {
        return clientService;
    }
    public boolean addServiceToClient (Service service) {
        return clientService.add(service);
    }

    public boolean addCarToClient(Car car) {
        return clientCars.add(car);
    }

   public void printClientAllServises() {
        clientService.stream().map(Service::getServiceName);
    }





    public void clientInfo() {
        System.out.println("Client info: " + " " + clientName + " " + clientSurname);
        System.out.println(clientSurname + " cars:");
        clientCars.stream()
                .forEach(System.out::println);
        System.out.println(clientSurname + " services:");
        clientService.stream()
                .forEach(System.out::println);
        System.out.println("Client costs: ");
        double clientcosts = getServiceType().stream()
                        .map(service -> service.getServiceCost())
                        .reduce(0.0,(servivecost1, servicecost2)-> servivecost1 + servicecost2);
        System.out.println(clientcosts);

        }

        }











