package modularizacao._3_Contador_de_Palavras;

public class _02_Contador_de_Palavras {
    public void contarPalavras(String frase) {
        int contador = 0;
        int letras = 0;

        String[] palavras = frase.trim().split("\\s+");
        while (letras < palavras.length) {

            for (char letra : palavras[letras].toCharArray()) {

            }
            contador++;
            letras++;
        }

        System.out.println("A quantidade de palavras será: " + contador);
    }
}


