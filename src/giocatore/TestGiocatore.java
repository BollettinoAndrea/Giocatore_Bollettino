package giocatore;

import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Giocatore g1 = new Giocatore();
        System.out.println("GIOCATORE 1:");
        System.out.println("nome: "); g1.setNome(in.next());
        System.out.println("è il capitano? (true/false): "); g1.setCapitano(in.nextBoolean());
        System.out.println("gol fatti: "); g1.setGol_fatti(in.nextInt());

        Giocatore g2 = new Giocatore();
        System.out.println("GIOCATORE 2:");
        System.out.println("nome: "); g2.setNome(in.next());
        System.out.println("è il capitano? (true/false): "); g2.setCapitano(in.nextBoolean());
        System.out.println("gol fatti: "); g2.setGol_fatti(in.nextInt());

        Giocatore g3 = new Giocatore();
        System.out.println("GIOCATORE 3:");
        System.out.println("nome: "); g3.setNome(in.next());
        System.out.println("è il capitano? (true/false): "); g3.setCapitano(in.nextBoolean());
        System.out.println("gol fatti: "); g3.setGol_fatti(in.nextInt());

        Giocatore maxGoal = g1;

        if (g2.getGol_fatti() > maxGoal.getGol_fatti()) {
            maxGoal = g2;
        }
        if (g3.getGol_fatti() > maxGoal.getGol_fatti()) {
            maxGoal = g3;
        }

        System.out.println("Giocatore con più goal:");
        System.out.println("Nome: " + maxGoal.getNome());
        System.out.println("Capitano: " + (maxGoal.isCapitano() ? "Sì" : "No"));
        System.out.println("Goal: " + maxGoal.getGol_fatti());

    }
}