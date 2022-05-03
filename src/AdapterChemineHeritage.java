public class AdapterChemineHeritage extends Cheminee implements Appareils {
    public AdapterChemineHeritage(){}

    public void allumer(){
        //mettre intensité a 100
        this.changerIntensite(100);
    }
    public void eteindre (){
        this.changerIntensite(0);
    }

    @Override
    public boolean isAllumer() {
return(this.intensite>0);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    ;

}
