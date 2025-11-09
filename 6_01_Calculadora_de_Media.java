package modularizacao._6_Calculadora_de_Media;

import java.util.Scanner;

public class _01_Calculadora_de_Media {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _02_Calculadora_de_Media media = new _02_Calculadora_de_Media();

        System.out.print("Digite o número de notas dos alunos: ");
        media.valor = sc.nextInt();

        media.calcularMedia();

        sc.close();
    }
}