package giocatore;

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

    public static void visualizzaGiocatoriPiuGol() {
        for (Giocatore g : gt) {
            if (g != null && g.getGol_fatti() > 5) {
                System.out.println("Nome: " + g.getNome() + ", Gol: " + g.getGol_fatti());
            }
        }
    }


}
