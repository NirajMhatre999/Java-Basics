public class CharPattern {
    public static void main(String[] args){
        int rows = 5;
        char currentChar = 'A';

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int k = 1; k <= i; k++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }

            System.out.println();
        }
    }
}
