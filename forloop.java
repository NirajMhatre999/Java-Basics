import java.util.Scanner;
public class forloop {
    public static void main(String[] args){
        Scanner scanvarname = new Scanner(System.in);
        for(byte i=0; i<=15; i++){
            System.out.println(i+1);
        }
        System.out.println("Enter the numbers in array : ");
        byte[] arrname = new byte[10];
        for(byte j=0; j<10; j++){
            arrname[j] = scanvarname.nextByte();
        }
        System.out.println("The entered array is : ");
        for(byte k=0; k<10; k++){
            System.out.println(arrname[k]);
        }
    }
}
