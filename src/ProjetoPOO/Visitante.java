package ProjetoPOO;

public class Visitante extends Pessoa {

	// ATRUIBUTOS
	private int convite;
	private int horario;
	private String apto;

	// CONSTRUTORES
	public Visitante() {

	}

	public Visitante(String nome, int horario, int convite) {
		setNome(nome);
		setHorario(horario);
		setConvite(convite);
	}

	@Override
	public void entrar() {
		if (this.convite == 1 && this.horario < 22 && this.horario > 6) {
			System.out.println("Pode entrar senhor(a)");
		} else {
			System.out.println("Voc� n�o est� autorizado para entrar!");
		}

	}

	@Override
	public void status() {
		System.out.println("----------------------");
		System.out.println("� Visitante");
		System.out.println("Nome: " + getNome());
		if (this.convite == 1)
			System.out.println("Convite: Sim");
		else
			System.out.println("Convite: N�o");
		if (this.horario > 6 && this.horario < 22) {
			System.out.println(this.horario + "h - hor�rio permitido para visitas");
		} else {
			System.out.println(this.horario + "h - hor�rio n�o permitido para visitas");
		}

	}

	// M�TODO PARA INSERIR MORADORES DENTRO DA LISTA
	public void listar() {
		System.out.println("Nome: " + getNome());
		if (this.convite == 1)
			System.out.println("Convite: Sim\n");
		else
			System.out.println("Convite: N�o\n");

	}

	// GETTERS E SETTERS

	public int getConvite() {
		return convite;
	}

	public void setConvite(int convite) {
		this.convite = convite;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

}
