package PolimorfismoeHeranca;

public class Cavalo extends Animal implements AnimalQueCorre {
	
	@Override
	public String emitirSom() {
 		return "Relinchar";
	}

	@Override
	public String correr(){
	return "O cavalo está correndo";
}

}



