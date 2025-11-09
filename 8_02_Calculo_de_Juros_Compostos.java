package modularizacao._8_Calculo_de_Juros_Compostos;

public class _02_Calculo_de_Juros_Compostos {
    double valor=0;
    double taxa=0;
    int meses=0;
    public void calculo(){
        if (valor <= 0) {
            System.out.println("Valor inicial inválido! O investimento deve ser maior que zero.");
        } else if (taxa < 0) {
            System.out.println("Taxa de juros inválida! Deve ser maior ou igual a zero.");
        } else if (meses <= 0) {
            System.out.println("Número de meses inválido! Deve ser maior que zero.");
        } else {
            double valor1Final= valor;
            int contador= 0;
        }
        while (valor < meses){
            valor = valor + (valor * taxa / 100);
            valor++;
        }
        System.out.println("O valor final do investimento após %d meses é: R$ %.2f%n");
    }
}


