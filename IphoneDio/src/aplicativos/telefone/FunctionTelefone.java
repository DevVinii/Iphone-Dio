package aplicativos.telefone;

public class FunctionTelefone implements AparelhoTelefonico{
	
	public void ligar() {
		System.out.println("Fazendo ligação");
	}
	
	public void atender(){
		System.out.println("Atendendo ligação");
	}
	
	public void iniciarCorreioVoz(){
		System.out.println("Iniciando correio de voz");
	}

}
