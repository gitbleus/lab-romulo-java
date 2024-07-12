package lab01;
import java.util.Scanner;

public class Basico1 {
    // Executando no terminal:
    // java lab01/Basico1.java
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println(nome + sobrenome);
    }
}