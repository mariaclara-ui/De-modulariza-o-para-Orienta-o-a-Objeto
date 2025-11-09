package modularizacao._1_Calculadora_Simples;

public class _02_CalculadoraSimples {
    double primeiroNumero;
    double segundoNumero;
    String operacao;
    double resultado;

    public double calcular() {
        if (operacao.equals("+") || operacao.equalsIgnoreCase("soma")) {
            resultado = primeiroNumero + segundoNumero;
            System.out.println("O resultado será:" + resultado);
        } else if (operacao.equals("-") || operacao.equalsIgnoreCase("subitração")) {
            double resultado = primeiroNumero - segundoNumero;
            System.out.println("O resultado será:" + resultado);
        } else if (operacao.equals("*") || operacao.equalsIgnoreCase("multiplicação")) {
            double resultado = primeiroNumero * segundoNumero;
            System.out.println("O resultado será:" + resultado);
        } else if (operacao.equals("/") || operacao.equalsIgnoreCase("divisão")) {
            if (segundoNumero == 0) {
                System.out.println("ERRO! operação invalida.");
            } else {
                double resultado = primeiroNumero / segundoNumero;
                System.out.println("O resultado será:" + resultado);
            }
        }
        return resultado;
    }
}

