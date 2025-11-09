package modularizacao._9_Classificador_de_Idade;

public class _02_Classificador_de_Idade {
    int idade=0;
    public void classificador(){
        if (idade<12){
            System.out.println("infantil");
        }
        else if (idade<18) {
            System.out.println("adolecente");
        }
        else if (idade<64) {
            System.out.println("idoso");
        }
        else {
            System.out.println("idoso");
        }
    }
}


