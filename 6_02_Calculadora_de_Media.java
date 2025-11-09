package modularizacao._6_Calculadora_de_Media;
import java.util.Scanner;
public class _02_Calculadora_de_Media {
    int valor;
    double resultado;


    void calcularMedia() {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.println("Digite as " + valor + " notas:");

        for (int i = 0; i < valor; i++) {
            double nota = sc.nextDouble();
            soma += nota;
        }

        resultado = soma / valor;
        System.out.println("A média do aluno é: " + resultado);
    }
}