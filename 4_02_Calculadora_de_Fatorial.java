package modularizacao._4_Calculadora_de_Fatorial;

public class _02_Calculadora_de_Fatorial {
        int numero;
        long resultado;

        public long calculoFatorial(int numero) {
            if (numero < 0) {
                System.out.println("Não existe fatorial de número negativo!");
                return -1;
            }

            long fatorial = 1;
            int i = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }

            return fatorial;
        }

}
