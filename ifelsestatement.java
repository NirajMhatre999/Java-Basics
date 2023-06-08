import java.util.Scanner;
public class ifelsestatement {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers : ");
        Scanner scanvarname = new Scanner(System.in);
        int var1 = scanvarname.nextInt(), var2 = scanvarname.nextInt(), var3 = scanvarname.nextInt();
        if((var1>0&&var2>0)&&(var3>0)){
            if(var1>var2){
                if(var1>var3){
                    System.out.println("The greatest of 3 numbers is : " + var1);
                }
            } else if (var2>var1) {
                if(var2>var3){
                    System.out.println("The greatest of 3 numbers is : " + var2);
                }
            }
            else{
                System.out.println("The greatest of 3 numbers is : " + var3);
            }
        }
    }
}
