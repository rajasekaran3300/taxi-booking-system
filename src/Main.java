import service.Taxi;
import service.TaxiService;

import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PetrolTaxi taxi1 = new PetrolTaxi(
                "TN01AB1234", 4.5, "Swift", true, "9876543210", 4, 15.0, "PETROL",20.0,2
        );

        PetrolTaxi taxi2 = new PetrolTaxi(
                "TN02CD5678", 4.2, "Dzire", true, "9876543211", 4, 14.0, "PETROL",15.0,3
        );

        PetrolTaxi taxi3 = new PetrolTaxi(
                "TN03EF9012", 4.8, "Etios", false, "9876543212", 4, 13.0, "PETROL",10.0,4
        );

        PetrolTaxi taxi4 = new PetrolTaxi(
                "TN04GH3456", 4.1, "Innova", true, "9876543213", 6, 18.0,"PETROL", 25.0,4
        );

        PetrolTaxi taxi5 = new PetrolTaxi(
                "TN05IJ7890", 4.9, "Baleno", true, "9876543214", 4, 16.0, "PETROL",30.0,1
        );

        ArrayList<Taxi> taxis = new ArrayList<>();
        taxis.add(taxi1);
        taxis.add(taxi2);
        taxis.add(taxi3);
        taxis.add(taxi4);
        taxis.add(taxi5);

        for(Taxi taxi : taxis){
            System.out.println(taxi);
        }

        TaxiService taxiService = new TaxiService();
        taxiService.filterByPrice(taxis);
    }
}