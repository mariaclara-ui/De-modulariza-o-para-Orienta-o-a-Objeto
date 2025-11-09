package modularizacao._10_Conversor_de_Moeda;
import java.util.Scanner;
public class _01_Conversor_de_Moeda {
    static void main() {
        _02_Conversor_de_Moeda moeda=new _02_Conversor_de_Moeda();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o valor e as moedas no formato: valor moedaOrigem moedaDestino");
        System.out.println("Exemplo: 100 BRL USD");
        String entrada = sc.nextLine();
        String []partes = entrada.split("valor");
        moeda.valor = Double.parseDouble(partes[0]);
        moeda.moedaOrigem= partes[1].toUpperCase();
        moeda.moedaDestino= partes[2].toUpperCase();
    }
}
