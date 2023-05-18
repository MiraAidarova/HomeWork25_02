import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car,MachineData> carMachineDataMap = new HashMap<>();
        carMachineDataMap.put(new Car(11,111111),new MachineData("2020-year",
                "Mercedes-Benz",22200000,"Black"));

        for(Map.Entry<Car,MachineData> i: carMachineDataMap.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
    }
}