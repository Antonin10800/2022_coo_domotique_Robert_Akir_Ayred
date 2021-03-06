

import java.util.ArrayList;

public class Telecommande {

    ArrayList<Appareils> list;


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
    list.get(i).eteindre();
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


public int getNombre(){
    return this.list.size();
}
    @Override
    public String toString() {
        return "Telecommande{" +
                "list=" + list +
                '}';
    }
}
