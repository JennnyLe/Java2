/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;
import java.util.Scanner;
/*
 * @author jennyle
 */
public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform: ");
        String operationString = in.next().toUpperCase();
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(operationString);

        double result = r.calculate(m, n, operation);
        System.out.println("result: " + result);
    }
}