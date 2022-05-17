package OrientacaoObjetos;

/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

public class ModeloPaciente {

	String nome;
	String cpf;
	boolean consultaConfirmada;
	int idade;
	
	public ModeloPaciente( String nome, String cpf, boolean consultaConfirmada , int idade) {
		this.nome= nome;
		
		this.cpf = cpf;
		this.consultaConfirmada = consultaConfirmada;
		this.idade = idade;
	}

	public void confirmaNaoconfirma () {
		if(this.consultaConfirmada) {
			consultaConfirmada = false;
			System.out.println("Consulta confirmada: "+this.consultaConfirmada );
		}
		else {
			consultaConfirmada = true;
			System.out.println("Consulta confirmada: "+this.consultaConfirmada);
		}
	}
	
	public void status() {
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Consulta Confirmada: "+this.consultaConfirmada);
		System.out.println("Idade: " + this.idade);
	}
}
	