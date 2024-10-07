package giocatore;

public class Giocatore {
    private String nome;
    private boolean capitano;
    private int gol_fatti;

    public Giocatore (String name, boolean cap, int gol){
        nome = name;
        capitano = cap;
        gol_fatti = gol;
    }

    public Giocatore (){
        nome = null;
        capitano = false;
        gol_fatti = 0;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String name){
        nome = name;
    }

    public boolean isCapitano(){
        return capitano;
    }
    public void setCapitano(boolean cap){
        capitano = cap;
    }

    public int getGol_fatti(){
        return gol_fatti;
    }
    public void setGol_fatti(int gol){
        gol_fatti = gol;
    }

}
