package u12parte2;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaDePratos p = new PilhaDePratos(5);
        System.out.println("Pratos: " + p.tamanho());

        System.out.print("Quantidade de jogadores: ");
        p.jogadores = scanner.nextInt();

        String entrada = "";
        while (entrada.compareTo("sair") != 0) {
            System.out.println("Start: ");
            entrada = scanner.nextLine();
            p.chamarGarcon();
            p.lavarPratos();
            System.out.println("Pratos restantes: " + p.tamanho());
            }
        scanner.close();
    }
}