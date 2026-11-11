package EXAMEN;

public class ConditionAge implements ConditionAcces {
	int Agemin ;
	ConditionAge(int x){
		this.Agemin = x ;
	}
	public boolean accesPossible(Personne p) {
		if (p.age > this.Agemin) {
			return true ;
		}
		else {
			return false ;
		}
	}

}
