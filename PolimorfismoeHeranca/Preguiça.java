package PolimorfismoeHeranca;

public class Preguiça extends Animal {
	
	@Override
	public String emitirSom() {
 		
		return " Bocejando"; 
	}
 				
	public String sobeEmArvores() {
	
	return this.getNome() + " está subindo na árvore.";
			
	}
}
	
