package lab04;

import java.util.Scanner;

public class Repeticoes4 {
    // java lab04/Repeticoes4.java
    public static void main(String[] args) {
        /**
         * for: Fornece uma estrutura mais compacta para iterar sobre uma série de valores. É
         * útil quando o número de iterações é conhecido antecipadamente.
         */

        var sc = new Scanner(System.in);
        System.out.print("Digite um numero");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
