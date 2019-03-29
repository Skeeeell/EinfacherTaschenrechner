/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package einfacher.taschenrechner;

/**
 *
 * @author richard
 */
import java.util.Scanner;

public class EinfacherTaschenrechner {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        float ergebnis = calculate();

        if (ergebnis == 'q') {
            System.out.print("");
        } else {

            System.out.println("Ergebnis: "  + ergebnis);
        }
    }

    static float calculate() {
        char optr;
        float opr1, opr2, ergebnis = 0;

        Scanner terminalScanner = new Scanner(System.in);

        System.out.print("Bitte Eingabe Operator(+, -, *, /,q): ");
        optr = terminalScanner.next().charAt(0);     
        if (optr == 'q') {
            return 'q';
        } else {

            System.out.print("Bitte Eingabe Operand1: ");
            opr1 = terminalScanner.nextFloat();

            System.out.print("Bitte Eingabe Operand2: ");
            opr2 = terminalScanner.nextFloat();

            switch (optr) {

                case 'q':
                    ergebnis = optr;
                    break;
                case '+':
                    ergebnis = opr1 + opr2;
                    break;

                case '-':
                    ergebnis = opr1 - opr2;
                    break;

                case '*':
                    ergebnis = opr1 * opr2;
                    break;

                case '/':
                    if (opr2 == 0) {
                        System.out.print("Bitte geben Sie für 0 einen statischen Wert an");

                    } else {
                        ergebnis = opr1 / opr2;
                    }
                    break;

            }
            
            return ergebnis;
        }
    }

}
