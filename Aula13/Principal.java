package Aula13;

public class Principal {
    public static void main(String[] args) {
        /*
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        */
        Cachorro c = new Cachorro();

        c.reagir("Vai apanhar");
        c.reagir(11,59f);
        c.reagir(false);
        c.reagir(3,12);
    }
}
