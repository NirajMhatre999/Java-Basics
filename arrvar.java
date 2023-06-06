import java.util.Scanner;
public class arrvar {
    public static void main(String[] args){
        float[] arrname = new float[3];
        arrname[0] = 1.2f;
        arrname[1] = 3.2f;
        arrname[2] = 4.5f;
        if(arrname[0]<arrname[2]){
            float b = arrname[0] + arrname[1];
            System.out.println(b);
        }
        else if(arrname[0]>=2){
            System.out.println("The value is :" + arrname[1]+arrname[2]);
        }
    }
}
