// Exercício: Crie um jogo que gere um número aleatório a cada execução. O jogador deve tentar adivinhar este número de acordo com a interação com o programa. O jogo deve indicar se o número inserido é maior ou menor que o gerado inicialmente. Ao adivinhar o número, o jogo deverá exibir a quantidade de tentativas inseridas.

import java.util.Scanner;
import java.util.Random;

public class Jogo{
    public static void main (String[] args){
        Random gerador = new Random();
        int acerto = gerador.nextInt(101);
        int tentativas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO AO JOGO DE TENTATIVA E ERRO! UM NUMERO DE 0 A 100 SERA GERADO E VOCE DEVE TENTAR ADIVINHAR. DIVIRTA-SE");
        System.out.println("=".repeat(50));

        while(true) {
            System.out.println("Qual sua tentativa?");
            int chute = sc.nextInt();
            if (chute > acerto){
                System.out.println("O numero chutado e maior que o gerado.\n");
            } else if (chute < acerto){
                System.out.println("O numero chutado e menor que o gerado.\n");
            } else if (chute == acerto){
                System.out.println("\nPARABENSS, VOCE ACERTOU!! O numero gerado e: " + acerto);
                System.out.println("O numero de tentativas ate o acerto foi de: " + tentativas);
                break;
            }
            tentativas += 1;
        }
    }
}