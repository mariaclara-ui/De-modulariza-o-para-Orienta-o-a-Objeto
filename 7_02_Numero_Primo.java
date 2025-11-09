package modularizacao._7_Numero_Primo;

public class _02_Numero_Primo {
    int numero=0;
    public void primo()
    {

        if (numero < 2) {
            System.out.println("O número nao e primo.");
        } else {
            int Numero;
            for (Numero = 2; Numero < numero; Numero++) {
                if (numero % Numero == 0) {
                    System.out.println(numero + " não é primo!");
                }
            }
            if (Numero == numero) {
                System.out.println(numero + " é primo!");
            }
        }
    }
}
