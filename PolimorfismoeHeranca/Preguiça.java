package PolimorfismoeHeranca;

public class Pregui�a extends Animal {
	
	@Override
	public String emitirSom() {
 		
		return " Bocejando"; 
	}
 				
	public String sobeEmArvores() {
	
	return this.getNome() + " est� subindo na �rvore.";
			
	}
}
	
