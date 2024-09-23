package Smartphone;

import aplicativos.musica.Player;
import aplicativos.musica.ReprodutorMusical;
import aplicativos.navegador.NavegadorDeInternet;
import aplicativos.telefone.AparelhoTelefonico;
import aplicativos.telefone.FunctionTelefone;
import aplicativos.navegador.FunctionNavegador;

public class SistemaOperacional{

	public static void main(String[] args) {
		
		ReprodutorMusical reprodutorMusical = new Player();
		NavegadorDeInternet functionNavegador = new FunctionNavegador();
		AparelhoTelefonico functionTelefone = new FunctionTelefone();
		
		System.out.println("Aplicativo Reprodutor de Música");
		reprodutorMusical.selecionarMusica();
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		
		System.out.println(" ");
		
		System.out.println("Aplicativo Navegador de Internet");
		functionNavegador.adicionarNovaAba();
		functionNavegador.exibirPagina();
		functionNavegador.recarregarPagina();
		
		System.out.println(" ");
		
		System.out.println("Aplicativo Navegador de Telefone");
		functionTelefone.ligar();
		functionTelefone.atender();
		functionTelefone.iniciarCorreioVoz();
}
		
}