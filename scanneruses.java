import java.util.Scanner;
public class scanneruses {
    public static void main(String[] args){
        System.out.println("Different datatypes scanned by scanner are as follows:");
        Scanner scanvarname = new Scanner(System.in);
        System.out.println("For char datatype:");
        char varname1 = scanvarname.next().charAt(0);
        System.out.println(varname1);
        System.out.println("For Byte datatype");
        Byte varname2 = scanvarname.nextByte();
        System.out.println(varname2);
        System.out.println("For Short datatype");
        Short varname3 = scanvarname.nextShort();
        System.out.println(varname3);
        System.out.println("For Int datatype");
        int varname4 = scanvarname.nextInt();
        System.out.println(varname4);
        System.out.println("For Long datatype");
        long varname5 = scanvarname.nextLong();
        System.out.println(varname5);
        System.out.println("For Float datatype");
        float varname6 = scanvarname.nextFloat();
        System.out.println(varname6);
        System.out.println("For Double datatype");
        double varname7 = scanvarname.nextDouble();
        System.out.println(varname7);
        System.out.println("For Boolean datatype");
        boolean varname8 = scanvarname.nextBoolean();
        System.out.println(varname8);
    }
}
