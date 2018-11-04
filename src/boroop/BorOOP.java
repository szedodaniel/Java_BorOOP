
package boroop;


public class BorOOP {

   
    public static void main(String[] args) {
        //Bor és Aszu objektumok
        
        borKiir(new Bor("vörös",1997));
        Bor lol = new Bor("fehér",1797);
        Aszu az = new Aszu(1897, "asd");
        borKiir(lol);
        borKiir(az);
    }
    public static void borKiir(Bor allomany){
        System.out.println(allomany.toString());
    }
    
}
