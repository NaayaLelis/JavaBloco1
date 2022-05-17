package OrientacaoObjetos;

public class ObjetoPaciente {

	public static void main(String[] args) {
		ModeloPaciente paciente = new ModeloPaciente ("Luis Guilherme Pereira","89654725435", true , 28);
		ModeloPaciente paciente2 = new ModeloPaciente(" Naya Lelis Pereira" ,"89874154687", false , 28);
		
		System.out.println();
		
		paciente.status();
		
		
		System.out.println();
		
		paciente2.status();
		
		
		
	}

}