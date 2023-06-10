import java.util.ArrayList;
public class listandoperations {
    public static void main(String[] args){
        ArrayList fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Custardapple");
        fruits.add("Durian");
        System.out.println("The current list is : ");
        System.out.println(fruits);
        int intlenvar = fruits.size();
        System.out.println("The list has a size of " + intlenvar + " elements.");
        System.out.println();
        System.out.println("Performing 'ADD' Operation");
        fruits.add(3, "Tamarind");
        System.out.println(fruits);
        System.out.println();
        System.out.println("Performing 'MODIFY' Operation");
        fruits.set(3,"Datura");
        System.out.println(fruits);
        System.out.println();
        System.out.println("Performing 'DELETE/REMOVE' Operation");
        fruits.remove(4);
        System.out.println(fruits);
        System.out.println();
        System.out.println("Performing 'CLEAR' Operation");
        fruits.clear();
        System.out.println(fruits);
        boolean boolvar = fruits.isEmpty();
        System.out.println(boolvar);
    }
}
