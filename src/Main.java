

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();


		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		/****** A COMPLETER ******/
		// TODO
		Hifi H1 = new Hifi();
		Cheminee CH1 = new Cheminee();
		AdapterChemineAttribut CH11 = new AdapterChemineAttribut(CH1);
		t.ajouterAppareil(H1);
		t.ajouterAppareil(CH11);

		TelecommandeGraphique tg=new TelecommandeGraphique(t);



	}

}