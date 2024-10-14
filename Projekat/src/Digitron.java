import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.sampled.SourceDataLine;

public class Digitron {

    public static void main(String[] args) {

        
        
        
Scanner scanner1 = new Scanner(System.in);
System.out.println("Unesi prvi broj");
int operand1 = scanner1.nextInt();

Scanner scanner2 = new Scanner(System.in);
System.out.println("Unesi operaciju");
String operacija = scanner2.next();

Scanner scanner3 = new Scanner(System.in);
System.out.println("Unesi drugi broj");
int operand2 = scanner3.nextInt();

if(operacija.equals("+")) {
    System.out.println("Rezultat je: " + (operand1 + operand2));
} else if (operacija.equals("-")) {
    System.out.println("Rezultat je: " + (operand1 - operand2));
}else if (operacija.equals("*")) {
    System.out.println("Rezultat je: " + (operand1 * operand2));
} else if (operacija.equals("/")) {
    System.out.println("Rezultat je: " + (((double)operand1 / operand2)));
} else {
    System.out.println("Nije validan operator");
}

    }
    
}
