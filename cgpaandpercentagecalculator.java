import java.util.Scanner;
public class cgpaandpercentagecalculator {
    public static void main(String[] args){
        System.out.println("Enter the total number of semesters you have : ");
        Scanner scanvarname = new Scanner(System.in);
        byte varname1 = scanvarname.nextByte();
        System.out.println("Enter the SGPA of each semester :");
        float[] varname2 = new float[varname1];
        float sum = 0, cgpa = 0, percent = 0;
        for(byte i=0; i<varname1; i++){
            varname2[i] = scanvarname.nextFloat();
            sum = sum + varname2[i];
        }
        System.out.println("The sum of all your SGPA is : " + sum);
        cgpa = sum/varname1;
        if(cgpa>0&&cgpa<10){
            System.out.println("Your CGPA is : " + cgpa);
        }
        else{
            System.out.println("Invalid Response!");
        }
        if(cgpa>7.4&&cgpa>0&&cgpa<10){
            percent = (cgpa*7.4f)+12.0f;
            System.out.println("Your percentage is : " + percent);
        }
        else if(cgpa>0&&cgpa<10&&cgpa<7.4){
            percent = (cgpa*7.1f)+12.0f;
            System.out.println("Your percentage is : " + percent);
        }
        else{
            System.out.println("Invalid response!");
        }
    }
}
