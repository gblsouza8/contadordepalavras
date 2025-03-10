package contadordepalavras;
import java.util.Scanner;
public class Main {
    @SuppressWarnings({"unused", "ConvertToTryWithResources"})
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque aqui o texto: ");
        String texto = input.nextLine();
        input.close();

        String[] palavras = texto.split(" ");
        int contador = 0;
        for (String palavra : palavras) {
            contador += 1;
        }
        System.out.println("Quantidade de palavras no texto: " + contador);

    }
}