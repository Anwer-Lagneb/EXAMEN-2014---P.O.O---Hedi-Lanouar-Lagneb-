package EXAMEN;

public class ParcAttraction {
	String nom ;
	Attraction lesAttraction [] ;
	int taille ;
	int nb_attraction ;
	
	ParcAttraction(String nom ,int taille){
		
		this.nom = nom ;
		this.taille = taille ;
		this.lesAttraction = new Attraction[taille] ;
		this.nb_attraction = 0 ;
		
	}
	void ajouteAttraction(Attraction a){
		if (this.nb_attraction == this.taille) {
			System.out.println("Erreur : Le Parc est Saturee !");
		}
		else {
			this.lesAttraction[this.nb_attraction] = a ;
			this.nb_attraction ++ ;
			System.out.println("L'Attraction est ajoutee!");
		}
		
	}
	double getrecette() {
		double s = 0;
		for (int i=0 ;i<this.nb_attraction ; i++) {
			s += lesAttraction[i].recette ;
		}
		return s ;
	}
	void affiche() {
		System.out.println("Nom du ParcAttraction : "+ this.nom);
		for(int i = 0;i<this.nb_attraction ; i++) {
			System.out.println("Nom du Parc N° " + i+1 +" : " + lesAttraction[i].nom);
			System.out.println("Sa condition d'Acces : Age >= " + lesAttraction[i].cond_age.Agemin );
			System.out.println("La Recette Total du Parc est : "+ this.getrecette() ) ;
			
		}
	}
	
	
	}
