package giocatore;

import java.util.Random;
import java.util.Scanner;

public class TestGiocatore {
    static Giocatore[] gt = new Giocatore[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indice = 0;
        int ind = 0;
        int gol_fatti;
        String nome;
        Boolean capitano;

        Metodi.aggiuntaGiocatore("Victor Valdes", 0, false, indice++);
        Metodi.aggiuntaGiocatore("Eric Abidal", 3, false, indice++);
        Metodi.aggiuntaGiocatore("Carlos Puyol", 21, true, indice++);
        Metodi.aggiuntaGiocatore("Gerard Pique", 59, false, indice++);
        Metodi.aggiuntaGiocatore("Dani Alves", 48, false, indice++);
        Metodi.aggiuntaGiocatore("Xavi Hernandez", 85, false, indice++);
        Metodi.aggiuntaGiocatore("Sergio Busquets", 19, false, indice++);
        Metodi.aggiuntaGiocatore("Andre Iniesta", 57, false, indice++);
        Metodi.aggiuntaGiocatore("Lionel Messi", 873, false, indice++);
        Metodi.aggiuntaGiocatore("David Villa", 371, false, indice++);
        Metodi.aggiuntaGiocatore("Pedro Rodriguez", 172, false, indice++);

        do {
            System.out.println("1 - Aggiungi un giocatore alla Squadra. ");
            System.out.println("2 - Visualizza i giocatori della Squadra. ");
            System.out.println("3 - Modifica i dati di un giocatore. ");
            System.out.println("4 - Svincola dalla Squadra. ");
            System.out.println("5 - Visualizza i giocatori che hanno realizzato più di 5 goal. ");
            System.out.println("6 - Visualizza capitano della Squadra. ");
            System.out.println("7 - Assegna il capitano in modo casuale. ");
            System.out.println("8 - ESCI. ");
            System.out.println(" ");
            System.out.println("Inserisci comando: ");
            ind = in.nextInt();
            in.nextLine();

            switch (ind) {
                case 1:
                    System.out.println("Dammi il nome:");
                    nome = in.nextLine();
                    System.out.println("Dammi il numero di goal:");
                    gol_fatti = in.nextInt();
                    System.out.println("Dimmi se è capitano (true/false):");
                    capitano = in.nextBoolean();
                    Metodi.aggiuntaGiocatore(nome, gol_fatti, capitano, indice);
                    indice++;
                    break;
                case 2:
                    Metodi.visualizzaGiocatori();
                    break;
                case 3:
                    System.out.println("Inserisci l'indice del giocatore da modificare:");
                    int indModifica = in.nextInt();
                    Metodi.modificaGiocatore(indModifica);
                    break;
                case 4:
                    System.out.println("Inserisci l'indice del giocatore da svincolare:");
                    int indSvincola = in.nextInt();
                    Metodi.svincolaGiocatore(indSvincola);
                    break;
                case 5:
                    Metodi.visualizzaGiocatoriPiuGol();
                    break;
                case 6:
                    Metodi.visualizzaCapitano();
                    break;
                case 7:
                    Metodi.assegnaCapitanoCasuale();
                    break;
                case 8:
                    System.out.println("Uscita");
                    break;

            }
        } while (ind != 8);
    }

}