package aplicativos.musica;

public class Player implements ReprodutorMusical{
	
	public void selecionarMusica() {
		
		System.out.println("Selecione a música desejada");
	}



  public void tocar(){
	  System.out.println("Tocando música selecionada");
	  
  }
  
  public void pausar() {
	  System.out.println("Pausar música selecionada");
  }
  
  }