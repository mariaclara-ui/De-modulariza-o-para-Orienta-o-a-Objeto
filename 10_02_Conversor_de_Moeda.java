package modularizacao._10_Conversor_de_Moeda;

public class _02_Conversor_de_Moeda {
    String moedaOrigem;
    String moedaDestino;
    double resultado=0;
    double valor=0;
    public void converorMoeda(){
        if (moedaOrigem.equals("BRL") && moedaDestino.equals("USD")) {
            resultado = valor / 5.0; // exemplo: 1 USD = 5 BRL
        } else if (moedaOrigem.equals("BRL") && moedaDestino.equals("EUR")) {
            resultado = valor / 6.0; // exemplo: 1 EUR = 6 BRL
        } else if (moedaOrigem.equals("USD") && moedaDestino.equals("BRL")) {
            resultado = valor * 5.0;
        } else if (moedaOrigem.equals("EUR") && moedaDestino.equals("BRL")) {
            resultado = valor * 6.0;
        } else if (moedaOrigem.equals(moedaDestino)) {
            resultado = valor; // mesma moeda, sem conversão
        } else {
            System.out.println("Conversão não suportada.");
            return;
        }
        System.out.println("Valor convertido: " + resultado + " " + moedaDestino);

    }
}



