import java.util.Scanner;
public class operatorexample {
    public static void main(String[] args){
        System.out.println("Enter 4 numbers : ");
        Scanner scanvarname = new Scanner(System.in);
        float var1 = scanvarname.nextFloat(), var2 = scanvarname.nextFloat(), var3 = scanvarname.nextFloat(), var4 = scanvarname.nextFloat();
        System.out.println("Checking the condition now : ");
        Boolean var5 = var1>var2&&var3<=100||var4==4.2;
        System.out.println(var5);
    }
}
