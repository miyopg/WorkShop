import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WorkShop {

    private Set<Client> workClients = new HashSet<>();
    private Set<Service> workService = new HashSet<>();
    private Set<Car> workCar = new HashSet<>();

    public WorkShop(Set<Client> workClients, Set<Service> workService, Set<Car> workCar) {
        this.workClients = new HashSet<>();
        this.workService = new HashSet<>();
        this.workCar = new HashSet<>();
    }

    public WorkShop() {

    }


    public Set<Client> getWorkClients() {
        return workClients;
    }

    public Set<Service> getWorkService() {
        return workService;
    }

    public Set<Car> getWorkCar() {
        return workCar;
    }

    public void addClientToWorkshop (Client client) {
        workClients.add(client);
    }

    public void addCarToWorkshop (Car car){
        workCar.add(car);
    }

    public void addServiceToWorkshop(Service service) {
        workService.add(service);
    }


    public String printClientInfos (Client client){
        String clientName = client.getClientName();
        String clientSurname = client.getClientSurname();



         System.out.println("Client info:");
        this.workClients.stream()
                .map(Client -> clientName + clientSurname )
                .toList();


        return workClients.toString();
    }

    public void printServiceInfos (ServiceType serviceType) {
        System.out.println("Services Infos " + serviceType.serviceInfo());
        int serviceCount = getWorkService().stream()
                .filter(service -> serviceType.equals(service.getServiceName()))
                .collect(Collectors.toList())
                        .size();
                        System.out.println("Servise done: " + serviceCount + " times");
        double serviceFullCost = getWorkService().stream()
                .filter(service -> serviceType.equals(service.getServiceName()))
                .map(service -> service.getServiceCost())
                .reduce(0.0,(servicecost1,servicecost2)-> servicecost1 + servicecost2);
                 System.out.println("Workshop earned " + serviceFullCost + " at this services.");




    }





   /* public void clientInfo() {

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

    }*/




}


