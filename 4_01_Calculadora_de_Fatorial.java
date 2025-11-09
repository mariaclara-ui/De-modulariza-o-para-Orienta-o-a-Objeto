package modularizacao._4_Calculadora_de_Fatorial;

import java.util.Scanner;

public class _01_Calculadora_de_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _02_Calculadora_de_Fatorial calculo = new _02_Calculadora_de_Fatorial();

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        calculo.numero = sc.nextInt();

        calculo.resultado = calculo.calculoFatorial(calculo.numero);

        if (calculo.resultado != -1) {
            System.out.println("O fatorial de " + calculo.numero + " é: " + calculo.resultado);
        }

        sc.close();
    }
}