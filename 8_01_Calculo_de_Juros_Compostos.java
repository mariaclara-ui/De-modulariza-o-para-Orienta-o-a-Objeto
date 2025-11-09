package modularizacao._8_Calculo_de_Juros_Compostos;
import java.util.Scanner;
public class _01_Calculo_de_Juros_Compostos {
    static void main() {
        Scanner sc=new Scanner(System.in);
        _02_Calculo_de_Juros_Compostos juros=new _02_Calculo_de_Juros_Compostos();
        System.out.println("Digite o valor do investimento:");
        juros.valor= sc.nextDouble();
        System.out.println("Digite a taxa de juros mensal:");
        juros.taxa= sc.nextDouble();
        System.out.println("Digite o numero de meses de investimento:");
        juros.meses= sc.nextInt();
    }
}
