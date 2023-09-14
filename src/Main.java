import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int intOperandA = 7;
        int intOperandB = 3;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 5.5;
        double doubleOperandB = 4.5;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModul;

        //operations
        System.out.println("intSum = " + (intOperandA + intOperandB));
        System.out.println("intDifference = " + (intOperandA - intOperandB));
        System.out.println("intProduct = " + (intOperandA * intOperandB));
        System.out.println("intQuotient = " + (intOperandA / intOperandB));
        System.out.println("intModulo = " + (intOperandA % intOperandB));

        System.out.println("doubleSum = " + (doubleOperandA + doubleOperandB));
        System.out.println("doubleDifference = " + (doubleOperandA - doubleOperandB));
        System.out.println("doubleProduct = " + (doubleOperandA * doubleOperandB));
        System.out.println("doubleQuotient = " + (doubleOperandA / doubleOperandB));
        System.out.println("doubleModulo = " + (doubleOperandA % doubleOperandB));
    }
}