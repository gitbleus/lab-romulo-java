package lab04;

import java.util.Scanner;

public class Repeticoes1 {
    // java lab04/Repeticoes1.java
    public static void main(String[] args) {
        /**
         * while: Executa um bloco de código enquanto uma condição específica for
         * verdadeira.
         */
        int i = 0;
        var sc= new Scanner(System.in);
        System.out.print("Digite um numero: ");
        var numero = sc.nextInt();
        while (i < 10) {
            System.out.println(numero + "x" + i + "=" + (numero*i));
            i += 1;
        }
    }
}
