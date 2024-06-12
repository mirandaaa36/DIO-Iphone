package uml_IPhone;

public class ReprodutorMusical implements Iphone{
	
	public void tocar() {
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		System.out.println("Música pausada");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println(musica + " selecionada.");
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
	
	// Dummy - AparelhoTelefonico
	
	public void ligar(String numero) {
		// NA
	}
	
	public void atender() {
		// NA
	}
	
	public void iniciarCorreioVoz() {
		// NA
	}
	
}

