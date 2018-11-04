
package boroop;


public class Bor {
    private String fajta; //A bor fajtája
    private int evjarat; // A bor évjárata

    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }
    public Bor(int evjarat) {
        this.evjarat = evjarat;
    }

    public String getFajta() {
        return fajta;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    @Override
    public String toString() {
        return "Bor fajta:" + fajta + ", evjárat:" + evjarat ;
    }
    
    
}
