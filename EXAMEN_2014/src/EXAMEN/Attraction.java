package EXAMEN;

public class Attraction {
	String nom ;
	double cout ;
	int nbr_pers = 0 ;
	ConditionAge cond_age ;
	double recette = 0 ;
	Attraction (String ch ,double x , int y,ConditionAge cond ,double rec ){
	this.nom = ch ;
	this.cout = x;
	this.nbr_pers = y ;
	this.cond_age = cond ;
	this.recette = rec ;
	}
	public void affiche() {
		System.out.println("Nom Attraction : " + this.nom);
		System.out.println("Cout3 : " + this.cout);
		System.out.println("Nombre des personnes : "+this.nbr_pers);
		System.out.println("Recette Total : " + this.recette);
		System.out.println("Condition Age : " + this.cond_age.Agemin);
	}
	public void utilise (Personne p) {
		if (this.cond_age.accesPossible(p) == true) {
			this.recette += this.cout ;
			this.nbr_pers += 1 ;
			System.out.println("Accees Autorise pour : " + p.nom);
		}
		else {
			System.out.println("Accees Impossible pour : " + p.nom);
		}
	}
	
}
