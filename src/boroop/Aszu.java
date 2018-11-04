
package boroop;


public class Aszu extends Bor{
    
    private String puttony;

    public Aszu( int evjarat,String puttony) {
        super(evjarat);
        this.puttony = puttony;
        super.setFajta("Aszu");
        
    }

    public String getPuttony() {
        return puttony;
    }

    public void setPuttony(String puttony) {
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        String s = super.toString(); 
        
        
        return s + "puttony: "+this.puttony;
    }
    

   
    
    
    
}
