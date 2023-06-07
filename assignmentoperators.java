import java.util.Scanner;
public class assignmentoperators {
    public static void main(String[] args){
        System.out.println("Enter two numbers : ");
        Scanner scanvarname = new Scanner(System.in);
        int varname3;
        System.out.println("Different Assignment operators are as follows : ");
        System.out.println("=");
        varname3 = 5;
        System.out.println(varname3);
        System.out.println("+=");
        varname3+=10;
        System.out.println(varname3);
        System.out.println("-=");
        varname3-=5;
        System.out.println(varname3);
        System.out.println("*=");
        varname3*=10;
        System.out.println(varname3);
        System.out.println("/=");
        varname3/=5;
        System.out.println(varname3);
        System.out.println("%=");
        varname3%=5;
        System.out.println(varname3);
        System.out.println("&=");
        varname3 = 10;
        varname3&=2;
        System.out.println(varname3);
        System.out.println("|=");
        varname3|=4;
        System.out.println(varname3);
        System.out.println("^=");
        varname3 = 10;
        varname3^=2;
        System.out.println(varname3);
        System.out.println(">>=");
        varname3>>=3;
        System.out.println(varname3);
        System.out.println("<<=");
        varname3<<=2;
        System.out.println(varname3);
    }
}
/*
=	    x = 5	    x = 5
+=	    x += 3	    x = x + 3
-=	    x -= 3	    x = x - 3
*=	    x *= 3	    x = x * 3
/=	    x /= 3	    x = x / 3
%=	    x %= 3	    x = x % 3
&=	    x &= 3	    x = x & 3
|=	    x |= 3	    x = x | 3
^=	    x ^= 3	    x = x ^ 3
>>=	    x >>= 3	    x = x >> 3
<<=	    x <<= 3	    x = x << 3
*/