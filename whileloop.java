import java.util.Scanner;
public class whileloop {
    public static void main(String[] args){
        System.out.println("Welcome to the Quiz : ");
        System.out.println("The creator of this program is an ______?");
        Scanner scanvarname = new Scanner(System.in);
        String varname1 = scanvarname.next();
        while(!(varname1.equals("maniac")||varname1.equals("Maniac"))){
            System.out.println("Wrong Answer. Please try again!");
            System.out.println("The creator of this program is an ______?");
            varname1 = scanvarname.next();
        }
        System.out.println("Correct Answer!");
        System.out.println("Moving towards next question");
        System.out.println("Creator's birthday is celebrated on _th of May?");
        String varname2 = scanvarname.next();
        while(!(varname2.equals("8")||varname2.equals("08"))){
            System.out.println("Wrong Answer. Please try again!");
            System.out.println("The creator of this program is an ______?");
            varname2 = scanvarname.next();
        }
        System.out.println("Correct Answer!");
    }
}
