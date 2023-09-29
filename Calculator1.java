/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator1;
import java.util.Scanner;
/**
 *
 * @author epste
 */
public class Calculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st no");
        Double num1 = scanner.nextDouble();
        System.out.println("2st no");
        Double num2 = scanner.nextDouble();
        Double sum = num1 + num2;
        Double power = Math.pow(num1,num2);
        Double squareRootNum1 = Math.sqrt(num1);
        System.out.println("Sum of the two numbers" + sum);
        System.out.println("Power of the number one" + power);
        System.out.println("Square Root of number one" + squareRootNum1);
        scanner.close();
    }
    
}

