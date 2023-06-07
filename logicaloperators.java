import java.util.Scanner;
public class logicaloperators {
    public static void main(String[] args){
        System.out.println("Logical operators are as follows :");
        Scanner scanvarname = new Scanner(System.in);
        int varname1 = scanvarname.nextInt(), varname2 = scanvarname.nextInt();
        System.out.println("&& Operator : ");
        if((varname1>1)&&(varname2<15)){
            System.out.println("Condition Satisfied : Number within range");
        }
        else{
            System.out.println("Condition Unsatisfied : Number out of bounds");
        }
        System.out.println("|| Operator : ");
        if((varname1==0)||(varname2>2)){
            System.out.println("Condition Satisfied : Number within range");
        }
        else{
            System.out.println("Condition Unsatisfied : Number out of bounds");
        }
        System.out.println("! Operator : ");
        if(!((varname1>1)&&(varname2<15))){
            System.out.println("Condition Satisfied : Number within range");
        }
        else{
            System.out.println("Condition Unsatisfied : Number out of bounds");
        }
    }
}
/*
&& 	    Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10
|| 	    Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4
!	    Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
 */