class Serie {
	//Atributos clase Serie
	String titulo = "";
	int nTemporadas = 3;
	boolean entregado = false;
	String genero = "";
	String creador = "";
	
	//Constructor por defecto
	Serie() {
		
	}
	
	//Constructor con el titulo y el creador
	Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	//Constructor con todos los atributos excepto el atributo "entregado"
	Serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Sobreescribimos el método toString
	@Override
	public String toString() {
		return "Título: " + titulo +
				"\"Número de temporadas: " + nTemporadas +
				"\nGénero: " + genero +
				"\nCreador: " + creador;
	}
}

public class Main {

	public static void main(String[] args) {
		//Objeto serie1 con constructor por defecto
		Serie serie1 = new Serie();
		System.out.println("Serie 1");
		System.out.println("----------------------------------");
		System.out.println(serie1);
		
		System.out.println();
		
		//Objeto serie2 con constructor con todos los atributos
		Serie serie2 = new Serie("Star Wars", 5, "Acción", "George Lucas");
		System.out.println("Serie 2");
		System.out.println("----------------------------------");
		System.out.println(serie2);

	}

}
