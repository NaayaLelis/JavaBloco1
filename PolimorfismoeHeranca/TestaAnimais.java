package PolimorfismoeHeranca;

public class TestaAnimais {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setIdade(8);
		cachorro.setNome("Jorge");
		System.out.println(cachorro.getNome()+ " possui " + cachorro.getIdade()+ " anos");
		System.out.println(cachorro.emitirSom());
		System.out.println(cachorro.correr()); 
		
		Preguiça preguica = new Preguiça();
		preguica.setIdade(25);
		preguica.setNome("Fofinho");
		System.out.println("\n" + preguica.getNome()+ " possui " + preguica.getIdade()+ " anos");
		System.out.println(preguica.emitirSom());
		System.out.println(preguica.sobeEmArvores()); 
		
		Cavalo cavalo = new Cavalo();
		cavalo.setIdade(14);
		cavalo.setNome("Ventania");
		System.out.println("\n" + cavalo.getNome()+ " possui " + cavalo.getIdade()+ " anos");
		System.out.println(cavalo.emitirSom());
		System.out.println(cavalo.correr()); 
		
	  }
	
	

	}
	
