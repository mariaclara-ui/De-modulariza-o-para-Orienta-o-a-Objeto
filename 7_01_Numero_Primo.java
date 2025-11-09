package modularizacao._7_Numero_Primo;
import java.util.Scanner;
public class _01_Numero_Primo {
    static void main() {
        _02_Numero_Primo primo=new _02_Numero_Primo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número:");
        primo.numero= sc.nextInt();
    }
}
