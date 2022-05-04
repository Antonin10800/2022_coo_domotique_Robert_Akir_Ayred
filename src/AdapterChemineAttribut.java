public class AdapterChemineAttribut extends Cheminee implements Appareils {
    private Cheminee ch;
    public AdapterChemineAttribut(Cheminee CHE){
        this.ch=CHE;
    }

        public void allumer(){
            //mettre intensité a 100
            this.ch.intensite=100;
        }
        public void eteindre (){
            this.ch.intensite=0;
        }

        @Override
        public boolean isAllumer() {
            return(this.ch.intensite>0);
        }

        @Override
        public String toString() {
            return super.toString();
        }



    }



