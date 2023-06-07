import java.util.Scanner;
public class comparisonoperators {
    public static void main(String[] args){
        System.out.println("Enter two numbers : ");
        Scanner scanvarname = new Scanner(System.in);
        int varname1 = scanvarname.nextInt(), varname2 = scanvarname.nextInt();
        System.out.println("Different Comparison operators are as follows : ");
        System.out.println("==");
        if(varname1 == varname2){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("Numbers are not equal");
        }
        System.out.println("!=");
        if(varname1!=varname2){
            System.out.println(varname1 + " is not equal to " + varname2);
        }
        else{
            System.out.println(varname1 + " is equal to " + varname2);
        }
        System.out.println(">");
        if(varname1>varname2){
            System.out.println(varname1 + " is greater than " + varname2);
        }
        else{
            System.out.println(varname1 + " is less than " + varname2);
        }
        System.out.println("<");
        if(varname1<varname2){
            System.out.println(varname1 + " is less than " + varname2);
        }
        else{
            System.out.println(varname1 + " is greater than " + varname2);
        }
        System.out.println(">=");
        if(varname1>=varname2){
            System.out.println(varname1 + " is greater than or equal to " + varname2);
        }
        else{
            System.out.println(varname1 + " is less than " + varname2);
        }
        System.out.println("<=");
        if(varname1<=varname2){
            System.out.println(varname1 + " is less than or equal to " + varname2);
        }
        else{
            System.out.println(varname1 + " is greater than " + varname2);
        }
    }
}
