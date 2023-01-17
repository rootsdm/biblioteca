package biblioteca;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Livro l = new Livro();
		int opcao;
		l.incluiBiblioteca();
		do {
			l.menuPrincipal();
			opcao = input.nextInt();

			switch (opcao) {
			
			// incluir livro
			case 1:
				l.incluiLivro();
				break;

			// Pesquisar Livro por ISBN
			case 2:
				l.buscaLivroIsbn(null);
				break;

			// Pesquisar Livro por Titulo
			case 3:
				l.buscaLivroTitulo(null);
				break;

			// Pesquisar Livro por Autor
			case 4:
				l.buscaAutor(null);
				break;
				
			// Remover Livro por Titulo
			case 5:
				l.removeLivroTitulo(null);
				break;
				
			// Remover Livro por Autor
			case 6:
				l.removeLivroAutor(null);
				break;
				
			// Listar Livros
			case 7:
				l.listaLivros();
				break;
				
			// Atualizar Livro por Titulo/ISBN
			case 8:
				l.atualizaLivro(null);
				break;
				
			// Metodo Leitura
			case 9:
				l.leitura(null);
				break;

			// sair
			case 0:
				System.out.println("SAINDO... ATÉ A PRÓXIMA...  ;) ");
				break;

			default:
				System.out.println("### ERRO: OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
				break;
			}

		} while (opcao != 0);

	}

}
