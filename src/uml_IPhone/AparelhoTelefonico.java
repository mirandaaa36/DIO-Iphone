package uml_IPhone;

public class AparelhoTelefonico implements Iphone{
	
	public void ligar (String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	public void atender() {
		System.out.println("Chamada atendida.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
	}
	
	
	// Dummy - ReprodutorMusical
	
	public void tocar() {
        // NA
	}
		
	public void pausar() {
			// NA
	}
	
	public void selecionarMusica(String musica) {
		// NA
	}
	
	// Dummy - Navegador
	
	public void exibirPaginas(String url) {
		// NA
	}
	
	public void adicionarNovaAba() {
		// NA
	}
	
	public void atualizarPagina() {
		// NA
	}
 

}

