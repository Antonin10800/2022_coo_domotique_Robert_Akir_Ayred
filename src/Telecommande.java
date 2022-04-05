import java.util.ArrayList;

public class Telecommande {

    ArrayList<Lampe> list;
/*
Constructeur
 */
    public Telecommande(){
        list = new ArrayList<>();
    }
/*
  Méthodes
*/


    public void activerTout(){
        int taille = list.size();
        for(int i =0; i<taille; i++){
            activerLampe(i);
        }

    }
    public void ajouterLampe(Lampe l){
        if(l != null){
            list.add(l);
        }
    }
    public void activerLampe(int indiceLampe){

        Lampe lampe2 = new Lampe("test");
        try {
            list.get(indiceLampe).allumer();
        }catch (IndexOutOfBoundsException e2){

        }


    }
    public void desactiverLampe(int indiceLampe){
        Lampe lampe = new Lampe("test");
        try {
            list.get(indiceLampe).eteindre();
        }catch (IndexOutOfBoundsException e){

        }



    }
    @Override
    public String toString() {
        return "Telecommande{" +
                "list=" + list +
                '}';
    }
}
