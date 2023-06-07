import java.util.Scanner;
public class arithmeticoperators {
    public static void main(String[] args){
        System.out.println("Enter 2 numbers : ");
        Scanner scanvarname = new Scanner(System.in);
        int var1 = scanvarname.nextInt(), var2 = scanvarname.nextInt();
        System.out.println("Different Comparison operators are as follows : ");
        System.out.println("Addition(+) is : " + var1 + var2);
        System.out.println("Substraction(-) is :");
        System.out.println(var1 - var2);
        System.out.println("Multiplication(*) is : " + var1*var2);
        System.out.println("Division(/) Quotient is : " + var1/var2);
        System.out.println("Division(%) Remainder is : " + var1%var2);
        System.out.println("Increment(++) of var1 is : " + ++var1);
        System.out.println("Decrement(--) of var1 is : " + --var1);
    }
}
