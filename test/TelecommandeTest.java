import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelecommandeTest {
@Test
    public void Testtelecommande(){
        Telecommande T= new Telecommande();
        Lampe L1 = new Lampe("TV");
        Lampe L2 = new Lampe("Salon");
        T.ajouterAppareil(L1);
        assertEquals(T.list.size(),1,"element de la telecommande");
        T.ajouterAppareil(L2);
        assertEquals(T.list.size(),2,"element de la telecommande");
        Cheminee Ch1 = new Cheminee();
        AdapterChemineAttribut cd = new AdapterChemineAttribut(Ch1);
        T.ajouterAppareil(cd);
        assertEquals(T.list.size(),3,"element de la telecommande");


    }

}
