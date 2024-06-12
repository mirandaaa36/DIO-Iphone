package uml_IPhone;

public class Navegador implements Iphone{
	
	public void exibirPaginas (String url) {
		System.out.println("Acessando: " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta.");
	}
	
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
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
