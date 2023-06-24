package co.open_bootcamp;
public class MainImpl extends Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.poner_puerta();
        System.out.println(micoche.puerta);
    }

    static class coche{
        public int puerta = 0;

        public void poner_puerta(){
            this.puerta++;
        }
    }
}
