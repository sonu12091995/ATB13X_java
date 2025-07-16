package Collection_Framework_DSA.Map_collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Integr_String {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap();
        vehicles.put("MG Astor",1);
        vehicles.put("i10",2);
        vehicles.put("Honda ACTIVA",1);
        vehicles.put("BMW",2);
        vehicles.put("TESLA",5);
        vehicles.put("TESLA",10);// Overide the second key value
//        vehicles.put(234,"dasda");// Not allow Integer then string
        System.out.println("Total Vehicles : "+ vehicles.size());//5

        // Iterator over the Map

        for(String key : vehicles.keySet()){
            System.out.println(key + " -> "+vehicles.get(key));
        }

        // Iterator over the Map second way

        for (Map.Entry<String,Integer> item : vehicles.entrySet()){
            System.out.println(item.getKey() + item.getValue());
        }

        // Checking if key exists
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // Clearing the map
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());


    }
}
