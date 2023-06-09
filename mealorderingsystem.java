import java.util.Scanner;
public class mealorderingsystem {
    public static void main(String[] args){
        System.out.println("Welcome to the Meal Ordering Service!");
        System.out.println("Before you proceed, please create a password");
        System.out.println("Password : ");
        Scanner scanvarname = new Scanner(System.in);
        String passvarname = scanvarname.next();
        System.out.println("Your password is : "+ passvarname);
        System.out.println();
        System.out.println("Please re-enter your password to login & proceed :");
        String credentialvarname = scanvarname.next();
        while(!credentialvarname.equals(passvarname)){
            System.out.println("Incorrect Password!");
            System.out.println("Please try again!");
            System.out.println("Please re-enter your password to login & proceed :");
            credentialvarname = scanvarname.next();
        }
        System.out.println("Login Successful!");
        System.out.println();
        System.out.println("Are you hungry?");
        System.out.println("If so type 'Yes', else type 'No'.");
        String responsevar = scanvarname.next();
        while(!responsevar.toLowerCase().equals("yes")&&!responsevar.toLowerCase().equals("y")&&!responsevar.toLowerCase().equals("no")&&!responsevar.toLowerCase().equals("n")){
            System.out.println("Sorry sir invalid response");
            System.out.println("Please answer in 'Yes' or 'No'");
            responsevar = scanvarname.next();
        }
        if(responsevar.equals("Yes")||responsevar.equals("yes")||responsevar.equals("YES")||responsevar.equals("Y")||responsevar.equals("y")){
            System.out.println();
            System.out.println("Choose what you want to eat from the menu below : ");
            System.out.println("|====================|");
            System.out.println("|        MENU        |");
            System.out.println("| ------------------ |");
            System.out.println("|      Vadapaav      |");
            System.out.println("|     Misal paav     |");
            System.out.println("|        Dosa        |");
            System.out.println("|        Idli        |");
            System.out.println("|====================|");
            System.out.println();
            System.out.println("Please type your order here : ");
            String ordervar = scanvarname.nextLine();
            while(!ordervar.toLowerCase().equals("vadapaav")&&!ordervar.toLowerCase().equals("vada paav")&&!ordervar.toLowerCase().equals("vadapav")&&!ordervar.toLowerCase().equals("vada pav")&&!ordervar.toLowerCase().equals("misal paav")&&!ordervar.toLowerCase().equals("misal pav")&&!ordervar.toLowerCase().equals("misalpaav")&&!ordervar.toLowerCase().equals("misalpav")&&!ordervar.toLowerCase().equals("dosa")&&!ordervar.toLowerCase().equals("dosai")&&!ordervar.toLowerCase().equals("idli")){
                System.out.println("Sorry sir we don't have " + ordervar);
                System.out.println("Please select your order from the menu");
                System.out.println("Please type your order here : ");
                ordervar = scanvarname.nextLine();
            }
            System.out.println();
            if(ordervar.equals("Vadapaav")||ordervar.equals("vadapaav")||ordervar.equals("Vada paav")||ordervar.equals("vada paav")||ordervar.equals("Vadapav")||ordervar.equals("vadapaav")||ordervar.equals("vadapav")||ordervar.equals("Vada pav")||ordervar.equals("vada pav")){
                System.out.println("Item successfully added to the order list");
            }
            else if(ordervar.toLowerCase().equals("misal paav")||ordervar.toLowerCase().equals("misal pav")||ordervar.toLowerCase().equals("misalpaav")||ordervar.toLowerCase().equals("misalpav")){
                System.out.println("Item successfully added to the order list");
            }
            else if(ordervar.toLowerCase().equals("dosa")||ordervar.toLowerCase().equals("dosai")){
                System.out.println("Item successfully added to the order list");
            }
            else if(ordervar.toLowerCase().equals("idli")){
                System.out.println("Item successfully added to the order list");
            }
            else{
                System.out.println("Invalid Response");
            }
            System.out.println();
            System.out.println("Would you like to have a beverage?");
            System.out.println("Enter 'Yes' to add a beverage to your order else enter 'No'.");
            String ordervar2 = scanvarname.next();
            while(!ordervar2.toLowerCase().equals("yes")&&!ordervar2.toLowerCase().equals("y")&&!ordervar2.toLowerCase().equals("no")&&!ordervar2.toLowerCase().equals("n")){
                System.out.println("Sorry sir invalid response");
                System.out.println("Please answer in 'Yes' or 'No'");
                ordervar2 = scanvarname.next();
            }
            System.out.println();
            if(ordervar2.toLowerCase().equals("yes")||ordervar2.toLowerCase().equals("y")){
                System.out.println("Would you like 'Coke' or 'Juice' ?");
                System.out.println("Enter 'Coke' or 'Juice' : ");
                String beverageorder = scanvarname.next();
                while (!beverageorder.toLowerCase().equals("coke")&&!beverageorder.toLowerCase().equals("juice")){
                    System.out.println("Sorry sir invalid response");
                    System.out.println("Please answer in 'Coke' or 'Juice'");
                    beverageorder = scanvarname.next();
                }
                if(beverageorder.toLowerCase().equals("coke")){
                    System.out.println("Coke added to the order list successfully!");
                    System.out.println("Your order is "+ ordervar + " and " + beverageorder);
                }
                else if(beverageorder.toLowerCase().equals("juice")){
                    System.out.println("Juice added to the order list successfully!");
                    System.out.println("Your order is "+ ordervar + " and " + beverageorder);
                }
                else{
                    System.out.println("Invalid Response!");
                }
            }
            else if(ordervar2.toLowerCase().equals("no")){
                System.out.println("Your order is " + ordervar + " with no beverage.");
            }
            System.out.println();
            System.out.println("To confirm your order please enter your password : ");
            String cred1 = scanvarname.next();
            while(!cred1.equals(passvarname)){
                System.out.println("Incorrect Password!");
                System.out.println("Please try again!");
                System.out.println("Please re-enter your password to confirm order :");
                cred1 = scanvarname.next();
            }
            System.out.println();
            System.out.println("Your order has been successfully placed.");
        }
        else{
            System.out.println("No worries. Have a good day!");
        }
    }
}
