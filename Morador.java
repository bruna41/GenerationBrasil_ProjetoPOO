package POO_Projeto;

public class Morador extends Pessoa {
	
	//Atributos
	
	private  int cadastro;
	private  String ondeMora;
	
	//Construtores
	public Morador () {
		
	}
	public Morador (String nome, int cadastro) {
		setNome(nome);
		setCadastro(cadastro);
		
	}
	
	//M�todos
	
	public void entrar () {
		if (this.cadastro == 1) {
			System.out.println("Pode entrar senhor");
		}else {
			System.out.println("N�o pode entrar");
		}
		
	}
	
	
	
	public void status () {
		System.out.println("----------------------");
		System.out.println("� Morador");
		System.out.println("Nome: "+ this.nome);
		if(this.cadastro ==1)
		System.out.println("Cadastro: Sim");
		else 
			System.out.println("Cadastro: N�o");
	}
	
	//GETTERS E SETTERS
	
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public String getOndeMora() {
		return ondeMora;
	}
	public void setOndeMora(String ondeMora) {
		this.ondeMora = ondeMora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
}
