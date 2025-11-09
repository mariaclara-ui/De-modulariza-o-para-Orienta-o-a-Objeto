package modularizacao._3_Contador_de_Palavras;

import java.util.Scanner;

public class _01_Contador_de_Palavras {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        _02_Contador_de_Palavras contador=new _02_Contador_de_Palavras();
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");
    }
}