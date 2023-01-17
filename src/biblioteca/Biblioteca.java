package biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
	// atributos
	private String nome;
	private String local;
	private int capacidade;
	private String secao;

	// construtor vazio
	public Biblioteca() {

	}

	// construtor c/argumentos
	public Biblioteca(String nome, String local, int capacidade, String secao) {
		this.nome = nome;
		this.local = local;
		this.capacidade = capacidade;
		this.secao = secao;
	}

	// metodos da classe
	public void menuPrincipal() {
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.println("| " + "      Biblioteca   " + getNome().toUpperCase() + "        |");
		System.out.println("+-------------------------------------+");
		System.out.println("| 1 - Cadastrar Livro                 |");
		System.out.println("| 2 - Busca Livro por ISBN            |");
		System.out.println("| 3 - Busca Livro por Titulo          |");
		System.out.println("| 4 - Busca Livro por Autor           |");
		System.out.println("| 5 - Remover Livro por Titulo        |");
		System.out.println("| 6 - Remover Livro por Autor         |");
		System.out.println("| 7 - Listar Livros                   |");
		System.out.println("| 8 - Atualizar Livro por Titulo/ISBN |");
		System.out.println("| 9 - Metodo Leitura                  |");
		System.out.println("| 0 - Sair                            |");
		System.out.println("+-------------------------------------+");
		System.out.print("Digite uma opção: ");

	}

	public void incluiBiblioteca() {
		Scanner input = new Scanner(System.in);
		System.out.println("+-------------------------------------+");
		System.out.println("|              BIBLIOTECA             |");
		System.out.println("+-------------------------------------+");
		System.out.print("Nome da Biblioteca: ");
		setNome(input.nextLine());
		System.out.println("+-------------------------------------+");
		System.out.print("Local: ");
		setLocal(input.nextLine());
		System.out.println("+-------------------------------------+");
		System.out.print("Capacidade: ");
		setCapacidade(input.nextInt());
		System.out.println("+-------------------------------------+");
		System.out.println("### BIBLIOTECA CADASTRADA COM SUCESSO. ###");

	}

	// geters e seters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

}
