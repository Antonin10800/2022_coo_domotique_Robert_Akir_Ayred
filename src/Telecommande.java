import src.Appareils;

import java.util.ArrayList;

public class Telecommande {

    ArrayList<Apprareils> list;


    /*
    Constructeur
     */
    public Telecommande() {
        list = new ArrayList<>();

    }

    /*
      Méthodes
    */

public void allumerApprareil(int indice){
    list.get(indice).allumer();
}
public void eteindreApprareil(int i){
    list.get(indice).eteindre();
}
    public void activerTout() {
        int taille = list.size();
        for (int i = 0; i < taille; i++) {
            list.get(i).allumer();
        }

    }

    public void ajouterAppareil(Appareils l) {
        if (l != null) {
            list.add(l);
        }
    }



    @Override
    public String toString() {
        return "Telecommande{" +
                "list=" + list +
                '}';
    }
}
