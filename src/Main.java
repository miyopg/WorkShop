import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        WorkShop workShop = new WorkShop();

        Set<Client> clientList = new HashSet<>();
        //Klient pierwszy
        System.out.println("Klient pierwszy");
        Client client1 = new Client("Mariusz","Nowak");
        //Auta 1 klienta
        Car car1 = new Car("AUDI A4", "2.0 TDI","2005");
        Car car2 = new Car("Volvo XC60", "1.9 TDI","2010");
        client1.addCarToClient(car1);
        client1.addCarToClient(car2);
        //Usługi dla 1 klienta
        Service service1 = new Service(ServiceType.OIL_CHANGE,150);
        Service service2 = new Service(ServiceType.TIRE_CHANGE, 200);
        client1.addServiceToClient(service1);
        client1.addServiceToClient(service2);
        car1.addServiceToCar(service1);
        car1.addServiceToCar(service2);
        workShop.addClientToWorkshop(client1);
        workShop.addServiceToWorkshop(service1);
        workShop.addServiceToWorkshop(service2);
        // raport klient1
        client1.clientInfo();
        car1.printCarServicesInfo();
        System.out.println();
        System.out.println("Klient drugi");
        //Klient drugi
        Client client2 = new Client("Tomasz","Kot");
        Car car3 = new Car("VW Passat B6", "2.0 TDI","2007");
        Service service3 = new Service(ServiceType.REPLACEMENT_OF_FILTERS, 100);
        Service service4 = new Service(ServiceType.TIRE_CHANGE, 200);
        client2.addCarToClient(car3);
        client2.addServiceToClient(service3);
        client2.addServiceToClient(service4);
        car3.addServiceToCar(service3);
        car3.addServiceToCar(service4);
        workShop.addClientToWorkshop(client2);
        workShop.addServiceToWorkshop(service3);
        workShop.addServiceToWorkshop(service4);
        // raport klient2
        client2.clientInfo();
        car3.printCarServicesInfo();


        System.out.println();
        System.out.println();
        System.out.println("Raport usług");
        workShop.printServiceInfos(ServiceType.TIRE_CHANGE);
        workShop.printServiceInfos(ServiceType.REPLACEMENT_OF_FILTERS);
        workShop.printServiceInfos(ServiceType.OIL_CHANGE);


    }
}
