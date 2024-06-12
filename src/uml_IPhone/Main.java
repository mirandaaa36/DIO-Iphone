package uml_IPhone;

public class Main {
	
	public static void main(String[] args) {
        Iphone ipod = new ReprodutorMusical();
        Iphone browser = new Navegador();
        Iphone cell = new AparelhoTelefonico();

        
        ipod.tocar();
        cell.atender();
        String url = "www.dio.com";
        browser.exibirPaginas(url);
        
	}


}
