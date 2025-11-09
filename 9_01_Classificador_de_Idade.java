package modularizacao._9_Classificador_de_Idade;
import java.util.Scanner;
public class _01_Classificador_de_Idade {
    static void main() {
        _02_Classificador_de_Idade classificar=new _02_Classificador_de_Idade();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        classificar.idade= sc.nextInt();
    }
}
