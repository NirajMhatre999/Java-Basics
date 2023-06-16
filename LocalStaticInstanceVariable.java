import java.util.*;
public class LocalStaticInstanceVariable {
    static int varname2 = 20;/*Static Variable*/
    int varname1 = 10;/*Instance Variable*/

    void add() {
        int varname3 = 30, varname4;/*Local Variables*/
        varname4 = varname1 + varname2 + varname3;
        System.out.println(varname4);
    }

    void mul() {
        int varname5 = 40, varname6;/*Local Variables*/
        varname6 = varname1 * varname2 * varname5;
        System.out.println(varname6);
    }

    public static void main(String[] args) {
        LocalStaticInstanceVariable obj = new LocalStaticInstanceVariable();
        obj.add();
        obj.mul();
    }
}
