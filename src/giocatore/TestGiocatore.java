package giocatore;

import java.util.Scanner;

public class TestGiocatore {
    static Giocatore[] gt = new Giocatore[100];

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int indice = 0;
        int ind = 0;
        int gol_fatti;
        String nome;
        Boolean capitano;
        do {
            System.out.println("1 - Aggiungi un giocatore alla Squadra. ");
            System.out.println("2 - Visualizza i giocatori della Squadra. ");
            System.out.println("3 - Modifica i dati di un giocatore. ");
            System.out.println("4 - Svincola dalla Squadra. ");
            System.out.println("5 - Visualizzare i giocatori che hanno realizzato più di 5 goal. ");
            System.out.println("6 - visualizzare capitano della Squadra. ");
            System.out.println("7 - Assegna il capitano in modo casuale. ");
            System.out.println("8 - ESCI. ");
            System.out.println(" ");
            System.out.println("Inserisci comando: ");
            ind = t.nextInt();
            t.nextLine();

            switch (ind) {
                case 1:
                    System.out.println("Dammi il nome:");
                    nome = t.nextLine();
                    System.out.println("Dammi il numero di goal:");
                    gol_fatti = t.nextInt();
                    System.out.println("Dimmi se è capitano (true/false):");
                    capitano = t.nextBoolean();
                    Metodi.aggiuntaGiocatore(nome, gol_fatti, capitano, indice);
                    indice++;
                    break;
                case 2:
                    Metodi.visualizzaGiocatori();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    Metodi.visualizzaGiocatoriPiuGol();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

            }
        } while (ind != 8);
    }

}