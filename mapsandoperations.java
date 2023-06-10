import java.util.Map;
import java.util.HashMap;
public class mapsandoperations {
    public static void main(String[] args){
        Map mapname = new HashMap();
        mapname.put("Ferrari",4);
        mapname.put("Lamborghini",1);
        mapname.put("Keonigsegg",3);
        mapname.put("Mosler",2);
        mapname.put("Rolls Royce",5);
        System.out.println(mapname);
        int intsizevar = mapname.size();
        System.out.println("The size of hashmap is " + intsizevar);
        System.out.println();
        System.out.println("Performing the 'PUT' operation");
        mapname.put("Rimac",6);
        System.out.println(mapname);
        System.out.println();
        System.out.println("Performing the 'GET' operation");
        System.out.println(mapname.get("Mosler"));
        System.out.println();
        System.out.println("Performing the 'DELETE/REMOVE' operation");
        mapname.remove("Rolls Royce");
        System.out.println(mapname);
        System.out.println();
        System.out.println("Performing the 'CLEAR' operation");
        mapname.clear();
        System.out.println(mapname);
        boolean boolvarname = mapname.isEmpty();
        System.out.println(boolvarname);
    }
}
