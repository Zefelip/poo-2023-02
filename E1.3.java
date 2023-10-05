//Def de uma classe simples chamada "TestaLivro"
public class TestaLivro {
	// Atributos (variáveis da instância) da classe
	private String titulo;
	private String autor;
	private int ano;
	private String editora;

	public TestaLivro(String titulo, String autor, int ano, String editora) {

		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String novoTitulo) {
		titulo = novoTitulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int novoAno) {
		ano = novoAno;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String novoEditora) {
		editora = novoEditora;
	}

	// Método toString para exibir o estado da instância

	public String toString() {
		return titulo + "\n" + autor + "\n" + editora + "," + ano;
	}

    public class TestaLivro2 {

		public static void main(String[] args) {
			TestaLivro livro1 = new TestaLivro("The Da Vince Code", "Dan Brown", 2003, "Doubleday");
			TestaLivro livro2 = new TestaLivro(
					"A psicologia financeira: lições atemporais sobre fortuna, ganância e felicidade", "Morgan Housel",
					2021, "Harper Collins");
			TestaLivro livro3 = new TestaLivro("O homem mais rico da Babilônia", "George S Clason", 2017,
					"Harper Collins");

			// Exibindo o estado de cada instancia
			System.out.println("Livro 1:\n" + livro1);
			System.out.println("Livro 1:\n" + livro2);
			System.out.println("Livro 1:\n" + livro3);
		}

	}
}