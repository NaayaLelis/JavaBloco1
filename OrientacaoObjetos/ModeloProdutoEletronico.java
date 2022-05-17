package OrientacaoObjetos;

/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console. */

public class ModeloProdutoEletronico {

	int codigo;
	String tipo;
	double valor;
	String cor;
	boolean funcionando;
	
	public ModeloProdutoEletronico(int codigo, String tipo, double valor, String cor, boolean funcionando) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.valor = valor;
		this.cor = cor;
		this.funcionando = funcionando;
		
	}

	public void funcionaNaoFunciona() {
		if(this.funcionando) {
			funcionando = false;
			System.out.println("Funcionando: "+this.funcionando);
		}
		else {
			funcionando = true;
			System.out.println("Funcionando: "+this.funcionando);
		}
	}
	
	public void status() {
		System.out.println("C�digo: "+this.codigo);
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Valor: "+this.valor);
		System.out.println("Cor: "+this.cor);
		System.out.println("Funcionando: "+this.funcionando);
		
		
	}
	
	
}