package biblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.w3c.dom.ranges.Range;

public class Livro extends Biblioteca {
	// atributos
	private String codigo;
	private String titulo;
	private String autor;
	private String isbn;
	private int numPaginas;
	private double valorLivro;
	private String edicao;
	private String volume;
	private ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
	Biblioteca b = new Biblioteca();

	// construtor vazio
	public Livro() {

	}

	// construtor c/ argumentos
	public Livro(String codigo, String titulo, String autor, String isbn, int numPaginas, double valorLivro, String edicao,
			String volume, ArrayList<Livro> listaDeLivros) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.valorLivro = valorLivro;
		this.edicao = edicao;
		this.volume = volume;
		this.listaDeLivros = listaDeLivros;

	}

	// metodos da classe

	// inclusao de livro - ok
	public void incluiLivro() {
		try {

			Scanner input = new Scanner(System.in);
			Livro livro = new Livro();
			System.out.println("+-------------------------------------+");
			System.out.println("|              BIBLIOTECA             |");
			System.out.println("+-------------------------------------+");
			System.out.println("|          Inclusão de Livros         |");
			System.out.println("+-------------------------------------+");
			System.out.print("Código: ");
			livro.setCodigo(input.nextLine());
			System.out.println("+-------------------------------------+");
			
			System.out.print("Título: ");
			livro.setTitulo(input.nextLine());
			System.out.println("+-------------------------------------+");
			
			System.out.print("Autor: ");
			livro.setAutor(input.nextLine());
			System.out.println("+-------------------------------------+");
			
			System.out.print("ISBN: ");
			livro.setIsbn(input.next());
			System.out.println("+-------------------------------------+");
			System.out.print("Núm.Paginas: ");
			livro.setNumPaginas(input.nextInt());
			System.out.println("+-------------------------------------+");
			System.out.print("Valor(R$): ");
			livro.setValorLivro(input.nextDouble());
			System.out.println("+-------------------------------------+");
			System.out.print("Edição: ");
			livro.setEdicao(input.next());
			System.out.println("+-------------------------------------+");
			System.out.print("Volume: ");
			livro.setVolume(input.next());
			System.out.println("+-------------------------------------+");
			System.out.print("Seção: ");
			livro.setSecao(input.nextLine());
			System.out.println("+-------------------------------------+");
			listaDeLivros.add(livro);
			System.out.println("### LIVRO INSERIDO COM SUCESSO ###");

		} catch (InputMismatchException e) {
			
			System.out.println("### ERRO: DIGITE UM VALOR CORRETO. TENTE NOVAMENTE! ###");
		}

	}

	// pesquisa livro por isbn - ok
	public Livro buscaLivroIsbn(String isbn) {
		Scanner input = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|            Busca por ISBN           |");
		System.out.println("+-------------------------------------+");
		System.out.print("ISBN: ");
		isbn = input.next();
		for (int i = 0; i < listaDeLivros.size(); i++) {
			if (getListaDeLivros().get(i).getIsbn().equals(isbn)) {
				System.out.println("+-------------------------------------+");
				System.out.println("Codigo: " + listaDeLivros.get(i).getCodigo());
				System.out.println("+-------------------------------------+");
				System.out.println("Titulo: " + listaDeLivros.get(i).getTitulo());
				System.out.println("+-------------------------------------+");
				System.out.println("Autor: " + listaDeLivros.get(i).getAutor());
				System.out.println("+-------------------------------------+");
				System.out.println("ISBN: " + listaDeLivros.get(i).getIsbn());
				System.out.println("+-------------------------------------+");
				System.out.println("Núm.Paginas: " + listaDeLivros.get(i).getNumPaginas());
				System.out.println("+-------------------------------------+");
				System.out.println("Valor(R$): " + listaDeLivros.get(i).getValorLivro());
				System.out.println("+-------------------------------------+");
				System.out.println("Edição: " + listaDeLivros.get(i).getEdicao());
				System.out.println("+-------------------------------------+");
				System.out.println("Volume: " + listaDeLivros.get(i).getVolume());
				System.out.println("+-------------------------------------+");
				System.out.println("Seção: " + listaDeLivros.get(i).getSecao());
				System.out.println("+-------------------------------------+");
				return listaDeLivros.get(i);

			}

		}

		System.out.println("### ISBN NÃO LOCALIZADO! ###");
		return null;
	}

	// pesquisa livro por Titulo - ok
	public Livro buscaLivroTitulo(String titulo) {
		Scanner input = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|          Buscar por Título          |");
		System.out.println("+-------------------------------------+");
		System.out.print("Título: ");
		titulo = input.nextLine();
		for (int i = 0; i < listaDeLivros.size(); i++) {
			if (getListaDeLivros().get(i).getTitulo().equals(titulo)) {
				System.out.println("+-------------------------------------+");
				System.out.println("Codigo: " + listaDeLivros.get(i).getCodigo());
				System.out.println("+-------------------------------------+");
				System.out.println("Titulo: " + listaDeLivros.get(i).getTitulo());
				System.out.println("+-------------------------------------+");
				System.out.println("Autor: " + listaDeLivros.get(i).getAutor());
				System.out.println("+-------------------------------------+");
				System.out.println("ISBN: " + listaDeLivros.get(i).getIsbn());
				System.out.println("+-------------------------------------+");
				System.out.println("Núm.Paginas: " + listaDeLivros.get(i).getNumPaginas());
				System.out.println("+-------------------------------------+");
				System.out.println("Valor(R$): " + listaDeLivros.get(i).getValorLivro());
				System.out.println("+-------------------------------------+");
				System.out.println("Edição: " + listaDeLivros.get(i).getEdicao());
				System.out.println("+-------------------------------------+");
				System.out.println("Volume: " + listaDeLivros.get(i).getVolume());
				System.out.println("+-------------------------------------+");
				System.out.println("Seção: " + listaDeLivros.get(i).getSecao());
				System.out.println("+-------------------------------------+");
				return listaDeLivros.get(i);

			}

		}

		System.out.println("### TÍTULO NÃO LOCALIZADO! ###");
		return null;

	}

	// pesquisa por autor - ok
	public void buscaAutor(String autor) {
		if (listaDeLivros.size() > 0) {
			Scanner input = new Scanner(System.in);
			System.out.println("+-------------------------------------+");
			System.out.println("|              BIBLIOTECA             |");
			System.out.println("+-------------------------------------+");
			System.out.println("|            Busca por Autor          |");
			System.out.println("+-------------------------------------+");
			System.out.print("Autor: ");
			autor = input.nextLine();
			int cont = 1;

			for (int i = 0; i < listaDeLivros.size(); i++) {
				System.out.println("+-------------------------------------+");
				System.out.println("|              BIBLIOTECA             |");
				System.out.println("+-------------------------------------+");
				System.out.println("| ###         Livro: " + cont++ + "            ### |");
				System.out.println("+-------------------------------------+");
				if (getListaDeLivros().get(i).getAutor().equals(autor)) {
					System.out.println("+-------------------------------------+");
					System.out.println("Codigo: " + listaDeLivros.get(i).getCodigo());
					System.out.println("+-------------------------------------+");
					System.out.println("Titulo: " + listaDeLivros.get(i).getTitulo());
					System.out.println("+-------------------------------------+");
					System.out.println("Autor: " + listaDeLivros.get(i).getAutor());
					System.out.println("+-------------------------------------+");
					System.out.println("ISBN: " + listaDeLivros.get(i).getIsbn());
					System.out.println("+-------------------------------------+");
					System.out.println("Núm.Paginas: " + listaDeLivros.get(i).getNumPaginas());
					System.out.println("+-------------------------------------+");
					System.out.println("Valor(R$): " + listaDeLivros.get(i).getValorLivro());
					System.out.println("+-------------------------------------+");
					System.out.println("Edição: " + listaDeLivros.get(i).getEdicao());
					System.out.println("+-------------------------------------+");
					System.out.println("Volume: " + listaDeLivros.get(i).getVolume());
					System.out.println("+-------------------------------------+");
					System.out.println("Seção: " + listaDeLivros.get(i).getSecao());
					System.out.println("+-------------------------------------+");

				}
			}

		} else {
			System.out.println("### ERRO: VOCE NÃO TEM LIVROS CADASTRADOS. ###");
		}
	}

	// remove livro por titulo - ok
	public Livro removeLivroTitulo(String titulo) {
		Scanner input = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|       Remove livro por Título       |");
		System.out.println("+-------------------------------------+");
		System.out.print("Título: ");
		titulo = input.nextLine();
		for (int i = 0; i < listaDeLivros.size(); i++) {
			if (getListaDeLivros().get(i).getTitulo().equals(titulo)) {
				System.out.println("### LIVRO REMOVIDO COM SUCESSO! ###");
				return listaDeLivros.remove(i);

			}
		}
		System.out.println("### TÍTULO NÃO LOCALIZADO! ###");
		return null;

	}

	// remover livro por autor - ok
	public void removeLivroAutor(String autor) {
		Scanner input = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|       Remove livro por Autor        |");
		System.out.println("+-------------------------------------+");
		System.out.print("Autor: ");
		autor = input.nextLine();
		Iterator<Livro> itr = listaDeLivros.iterator();
		while (itr.hasNext()) {
			Livro livro = (Livro) itr.next();
			if (livro.getAutor().equals(autor)) {
				itr.remove();

			}

		}
		System.out.println("LIVROS REMOVIDOS COM SUCESSO.");
	}

	// atualizar livro titulo ou isbn - ok
	public void atualizaLivro(String tituloOuIsbn) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("+-------------------------------------+");
			System.out.println("|              BIBLIOTECA             |");
			System.out.println("+-------------------------------------+");
			System.out.println("|            Atualiza Livro           |");
			System.out.println("+-------------------------------------+");
			System.out.print("Titulo ou ISBN: ");
			tituloOuIsbn = input.nextLine();
			for (int i = 0; i < listaDeLivros.size(); i++) {
				if ((getListaDeLivros().get(i).getTitulo().equals(tituloOuIsbn))
						|| getListaDeLivros().get(i).getIsbn().equals(tituloOuIsbn)) {

					System.out.println("+-------------------------------------+");
					System.out.print("Codigo: ");
					listaDeLivros.get(i).setCodigo(input.nextLine());
					System.out.println("+-------------------------------------+");
					System.out.print("Titulo: ");
					listaDeLivros.get(i).setTitulo(input.nextLine());
					System.out.println("+-------------------------------------+");
					System.out.print("Autor: ");
					listaDeLivros.get(i).setAutor(input.nextLine());
					System.out.println("+-------------------------------------+");
					System.out.print("ISBN: ");
					listaDeLivros.get(i).setIsbn(input.nextLine());
					System.out.println("+-------------------------------------+");
					System.out.print("Núm.Paginas: ");
					listaDeLivros.get(i).setNumPaginas(input.nextInt());
					System.out.println("+-------------------------------------+");
					System.out.print("Valor(R$): ");
					listaDeLivros.get(i).setValorLivro(input.nextDouble());
					System.out.println("+-------------------------------------+");
					System.out.print("Edição: ");
					listaDeLivros.get(i).setEdicao(input.next());
					System.out.println("+-------------------------------------+");
					System.out.print("Volume: ");
					listaDeLivros.get(i).setVolume(input.next());
					System.out.println("+-------------------------------------+");
					System.out.print("Seção: ");
					listaDeLivros.get(i).setSecao(input.next());
					System.out.println("+-------------------------------------+");
					System.out.println("### LIVRO ATUALIZADO COM SUCESSO. ###");

				}
			}
			System.out.println("### ERRO: TITULO/ISBN NÃO LOCALIZADO. ###");

		} catch (InputMismatchException e) {
			System.out.println("### ERRO: DIGITE UM NÚMERO INTEIRO ###");
		}

	}

	// listagem de livros - ok
	public void listaLivros() {
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|          Listagem de Livros         |");
		System.out.println("+-------------------------------------+");
		if (getListaDeLivros().size() > 0) {
			for (Livro l : listaDeLivros) {
				System.out.println("+-------------------------------------+");
				System.out.println("Codigo: " + l.getCodigo());
				System.out.println("+-------------------------------------+");
				System.out.println("Titulo: " + l.getTitulo());
				System.out.println("+-------------------------------------+");
				System.out.println("Autor: " + l.getAutor());
				System.out.println("+-------------------------------------+");
				System.out.println("ISBN: " + l.getIsbn());
				System.out.println("+-------------------------------------+");
				System.out.println("Núm.Paginas: " + l.getNumPaginas());
				System.out.println("+-------------------------------------+");
				System.out.println("Valor(R$): " + l.getValorLivro());
				System.out.println("+-------------------------------------+");
				System.out.println("Edição: " + l.getEdicao());
				System.out.println("+-------------------------------------+");
				System.out.println("Volume: " + l.getVolume());
				System.out.println("+-------------------------------------+");
				System.out.println("Seção: " + l.getSecao());
				System.out.println("+-------------------------------------+");
				System.out.println("+#####################################+");
			}

		} else {
			System.out.println("### ERRO: VOCÊ NÃO TEM LIVROS CADASTRADOS. ###");
		}

	}

	public void leitura(String tituloOuIsbn) {
		Scanner input = new Scanner(System.in);
		int numPaginaAtual;
		int numPaginaLivro;
		int resultado;
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("|          Leitura de Livros          |");
		System.out.println("+-------------------------------------+");
		System.out.print("Título ou ISBN: ");
		tituloOuIsbn = input.nextLine();

		for (int i = 0; i < listaDeLivros.size(); i++) {
			if ((getListaDeLivros().get(i).getTitulo().equals(tituloOuIsbn))
					|| getListaDeLivros().get(i).getIsbn().equals(tituloOuIsbn)) {
				System.out.printf("O Livro %s, tem %d páginas", getListaDeLivros().get(i).getTitulo(),
						getListaDeLivros().get(i).getNumPaginas());
				System.out.println("\n+-------------------------------------+");

				System.out.print("Página da Leitura: ");
				numPaginaAtual = input.nextInt();
				numPaginaLivro = getListaDeLivros().get(i).getNumPaginas();
				System.out.println("+-------------------------------------+");
				resultado = numPaginaLivro - numPaginaAtual;

				if (resultado < 0) {
					System.out.println("### ERRO: VOCÊ INFORMOU A QTD PÁGINAS ERRADO. ###");
				} else {
					System.out.printf("Faltam %d páginas para o término do Livro %s ", resultado,
							getListaDeLivros().get(i).getTitulo() + "\n");
				}

			}
		}

	}

	// geters e seters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public double getValorLivro() {
		return valorLivro;
	}

	public void setValorLivro(double valorLivro) {
		this.valorLivro = valorLivro;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public ArrayList<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
		this.listaDeLivros = listaDeLivros;
	}

}
