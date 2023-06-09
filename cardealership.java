import java.util.Scanner;
public class cardealership {
    public static void main(String[] args){
        System.out.println("Welcome to Arya Motors!");
        System.out.println("Enter 'Yes' if you wish to buy a car, else enter 'No' to proceed : ");
        Scanner scanvarname = new Scanner(System.in);
        String response1 = scanvarname.next();
        if(response1.equals("Yes")||response1.equals("yes")){
            System.out.println("Glad to know that you chose Arya Motors to buy car!");
            System.out.println("Please specify which car do you want from the following: ");
            System.out.println("Ambassador");
            System.out.println("Contessa");
            System.out.println("Impala");
            String resposne2 = scanvarname.next();
            if(resposne2.equals("Ambassador")||resposne2.equals("ambassador")){
                System.out.println("Do you want to confirm your booking?");
                System.out.println("Enter 'Yes' to confirm else enter 'No'");
                String response3 = scanvarname.next();
                if(response3.equals("Yes")||response3.equals("yes")){
                    System.out.println("Thank you for booking! Your car will be delivered after the paperwork is submitted.");
                }
                else if(response3.equals("No")||response3.equals("no")){
                    System.out.println("No Problem! Make sure to visit again!");
                }
                else{
                    System.out.println("Invalid Response");
                }
            }
            else if(resposne2.equals("Contessa")||resposne2.equals("contessa")){
                System.out.println("Currently contessa is not available but we can make an order.");
                System.out.println("Enter 'Yes' to place an order, else enter 'No'");
                String response3 = scanvarname.next();
                if(response3.equals("Yes")||response3.equals("yes")){
                    System.out.println("Thank you for placing an order! Your car will be delivered after the paperwork is submitted.");
                }
                else if(response3.equals("No")||response3.equals("no")){
                    System.out.println("No Problem! Make sure to visit again!");
                }
                else{
                    System.out.println("Invalid Response");
                }
            }
            else if(resposne2.equals("Impala")||resposne2.equals("impala")){
                System.out.println("Sorry! but we are out of stock for Impala");
            }
            else{
                System.out.println("Invalid Response!");
            }
        }
        else if(response1.equals("No")||response1.equals("no")){
            System.out.println("No Problem! Make sure to visit again!");
        }
        else{
            System.out.println("Invalid response!");
        }
    }
}
