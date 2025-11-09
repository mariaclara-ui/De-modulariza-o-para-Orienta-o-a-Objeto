package modularizacao._2_Conversor_de_Temperatura;

public class _02_Conversor_de_Temperatura {
    double temperatura;
    String resposta;

    public double calculo() {
        double conversa=0;
        if (resposta.equalsIgnoreCase("Fahrenheit")) {
            conversa = (temperatura * 9 / 5) + 32;
            System.out.printf("%.2f°C equivalem a %.2f°F%n", temperatura, conversa);
        }
        else if (resposta.equalsIgnoreCase("Celsius")) {
            conversa = (temperatura - 32) * 5 / 9;
            System.out.printf("%.2f°F equivalem a %.2f°C%n", temperatura, conversa);
        }
        return conversa;
    }
}