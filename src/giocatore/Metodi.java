package giocatore;

import java.util.Random;
import java.util.Scanner;

public class Metodi {
    static Giocatore[] gt = new Giocatore[100];

    public static void aggiuntaGiocatore(String name, int gol, Boolean cap, int indice) {
        gt[indice] = new Giocatore();
        gt[indice].setNome(name);
        gt[indice].setGol_fatti(gol);
        gt[indice].setCapitano(cap);
    }

    public static void visualizzaGiocatori() {
        for (Giocatore g : gt) {
            if (g != null) {
                System.out.println("Nome: " + g.getNome() + ", Gol: " + g.getGol_fatti() + ", Capitano: " + g.isCapitano());
            }
        }
    }

    public static void modificaGiocatore(int indice) {
        Scanner in = new Scanner(System.in);
        if (gt[indice] != null) {
            System.out.println("Modifica nome:");
            String nuovoNome = in.nextLine();
            System.out.println("Modifica gol:");
            int nuoviGol_fatti = in.nextInt();
            System.out.println("Modifica stato capitano (true/false):");
            boolean nuovoCapitano = in.nextBoolean();

            gt[indice].setNome(nuovoNome);
            gt[indice].setGol_fatti(nuoviGol_fatti);
            gt[indice].setCapitano(nuovoCapitano);

        } else {
            System.out.println("Giocatore non trovato.");
        }
    }

    public static void svincolaGiocatore(int indice) {
        if (gt[indice] != null) {
            gt[indice] = null;
            System.out.println("Giocatore svincolato.");
        } else {
            System.out.println("Giocatore non trovato.");
        }
    }

    public static void visualizzaGiocatoriPiuGol() {
        for (Giocatore g : gt) {
            if (g != null && g.getGol_fatti() > 5) {
                System.out.println("Nome: " + g.getNome() + ", Gol: " + g.getGol_fatti());
            }
        }
    }

    public static void visualizzaCapitano() {
        for (Giocatore g : gt) {
            if (g != null && g.isCapitano()) {
                System.out.println("Il capitano è: " + g.getNome());
                return;
            }
        }
        System.out.println("Nessun capitano assegnato.");
    }

    public static void assegnaCapitanoCasuale() {
        Random random = new Random();
        int capitanoAssegnato = -1;
        while (capitanoAssegnato == -1) {
            int indice = random.nextInt(gt.length);
            if (gt[indice] != null) {
                gt[indice].setCapitano(true);
                capitanoAssegnato = indice;
                System.out.println("Il nuovo capitano è: " + gt[indice].getNome());
            }
        }
    }

}
