package OrientacaoObjetos;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		ModeloProdutoEletronico produto1 = new ModeloProdutoEletronico (98564, "CELULAR", 1250.0, "AZUL", true);
		
		ModeloProdutoEletronico produto2 = new ModeloProdutoEletronico (87569,"COMPUTADOR",3900.0, "PRETO",false);
		
		produto1.status();
		
		System.out.println();
		
		produto2.status();
		
		System.out.println();
		
		
		
		
	}

}