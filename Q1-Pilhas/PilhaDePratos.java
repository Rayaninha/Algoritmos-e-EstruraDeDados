package u12parte2;
import java.util.Random;

public class PilhaDePratos {
    String pilha[];
    int jogadores = 1;
    int topo;

    PilhaDePratos(int tamanho) {
        pilha = new String[tamanho];
        topo = 0;
    }

    int tamanho() {
        return topo;
    }

    int jogadores(int jogadores) {
        return jogadores;
    }

    boolean cheia() {
        return pilha.length == topo;
    }

    boolean esborrando() {
        return pilha.length < topo;
    }

    boolean vazia() {
        return topo == 0;
    }

    String lavarPratos() {
        if (vazia()) {
            System.out.println("Pia Limpa! Você ganhou!");
        } else {
            for (int j = 0; j < jogadores; j++) {
                Random gerador = new Random();
                int pratos = gerador.nextInt(topo);
                System.out.println("O jogador lavou " + pratos + " pratos!");
                   for (int i = 0; i < pratos; i++) {
                topo--;
                   }
            }
        }
        return pilha[topo];
    }

    int chamarGarcon() {
        if (cheia()) {
            System.out.println("Pia cheia!!!");
        } else if (esborrando()) {
            System.out.println("Você perdeu!");
        } else {
            Random gerador = new Random();
            int pratos = gerador.nextInt(pilha.length);
            System.out.println("O garçon trouxe " + pratos + " pratos sujos!");
            for (int i = 0; i < pratos; i++) {
                    pilha[topo] = "prato";
                    topo++;
            }
        }
        return topo;
    }
}