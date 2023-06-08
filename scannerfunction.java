import java.util.Scanner;
public class scannerfunction {
    public static void main(String[] args){
        Scanner scanvarname = new Scanner(System.in);
        System.out.println("Enter same line 2 times. One will return whole line & other will return only one word");
        String varname1 = scanvarname.nextLine();
        System.out.println(varname1);
        String varname2 = scanvarname.next();
        System.out.println(varname2);
    }
}
