package modularizacao._1_Calculadora_Simples;

import java.util.Scanner;

public class _01_CalculadoraSimples {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            _02_CalculadoraSimples Calculo=new _02_CalculadoraSimples();
            System.out.println("Digite o primeiro número:");
            Calculo.primeiroNumero = sc.nextDouble();
            System.out.println("Digite o segundo número:");
            Calculo.segundoNumero = sc.nextDouble();
            System.out.println("Digite a operação desejada:");
            Calculo.operacao = sc.next();
            Calculo.calcular();
            System.out.println(("O resultado será:" + Calculo.calcular()));
        }
}

