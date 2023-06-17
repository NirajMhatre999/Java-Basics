/*You are given an array 'A' of length 'N'.
Find the sum of A[i] xor A[j] for all pairs of 'i, j'
satisfying A[i] % 3 ==  A[j] % 3' and 'O <=i < j < N.*/
import java.util.Scanner;
public class ArrayPairsXORSum {
    public static void main(String[] args){
        System.out.println("Enter the number of array elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int m = 0; m<n;m++){
            System.out.println(a[m]);
        }
        int temp = 0;
        System.out.println("Sorting Elements : ");
        for(int j=0;j<(n-1);j++){
            if(a[j]>a[j+1]){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        int var1, var2, xorvar, sum = 0;
        for(int k=0;k<(n-1);k++){
            int l = k+1;
            if((a[k]%3)==(a[l]%3)){
                var1 = a[k];
                var2 = a[l];
                xorvar = var1^var2;
                sum = sum + xorvar;
            }
        }
        System.out.println("Thus the answer is : " + sum);


    }
}
