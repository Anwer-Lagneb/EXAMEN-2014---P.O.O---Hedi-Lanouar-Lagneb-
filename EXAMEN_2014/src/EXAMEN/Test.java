package EXAMEN;

public class Test {
	public static void main(String[] args) {
		Personne P1 = new Personne(8,120,"Petit Ahmed");
		Personne P2 = new Personne(22,185,"Med Aziz");
		ConditionAge C1 = new ConditionAge(15) ;
		
		Attraction Att1 = new Attraction("Vehicules" , 25 , 0 ,C1 , 0);
		
		Att1.utilise(P1);
		Att1.utilise(P2);
		Att1.affiche();
		
		ParcAttraction Parc1 = new ParcAttraction("DA7DA7" , 20) ;
		Parc1.ajouteAttraction(Att1);
		Parc1.affiche();
		
	}

}
