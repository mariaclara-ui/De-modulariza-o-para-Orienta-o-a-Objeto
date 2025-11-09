package modularizacao._2_Conversor_de_Temperatura;
import java.util.Scanner;

public class _01_Conversor_de_Temperatura {
    static void main(String[] args) {
        _02_Conversor_de_Temperatura temp=new _02_Conversor_de_Temperatura();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        temp.temperatura = sc.nextDouble();
        System.out.println("Qual a conversao desejada?");
        temp.resposta = sc.next();
    }
}
