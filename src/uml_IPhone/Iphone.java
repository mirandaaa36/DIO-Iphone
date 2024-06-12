package uml_IPhone;

public interface Iphone {
	
	// Reprodutor musical
	public void tocar();
	public void pausar();
	public void selecionarMusica(String musica);
	
	// Aparelho telefônico
	public void ligar(String numero);
	public void atender();
	public void iniciarCorreioVoz();
	
	// Navegador
	public void exibirPaginas(String url);
	public void adicionarNovaAba();
	public void atualizarPagina();
	
}

class Iphone12 {
	
	public static void main(String[] args) {
		
		// Cria uma instância do Iphone
		ReprodutorMusical ipod = new ReprodutorMusical();
		Navegador browser = new Navegador();
		AparelhoTelefonico cell = new AparelhoTelefonico();
		
		browser.adicionarNovaAba();
		ipod.tocar();
		cell.atender();
		
		
	}
}