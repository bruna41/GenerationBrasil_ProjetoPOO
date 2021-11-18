package ProjetoPOO;

public class Funcionario extends Pessoa {
	//Atributos
	
	private String nome;
	private int cargo;
	private double salario;
	private int cracha;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setCracha(int cracha) {
		this.cracha = cracha;
	}
	
	public void entrar () {
		if (this.cracha== 1) {
			System.out.println("Pode entrar. Bom Trabalho!");
		}else {
			System.out.println("Voc� n�o est� autorizado para entrar! Voc� precisa do cracha");
		}	
	}
	
	public void Cargo(int cargo){
		//1-Porteiro
		//2-Seguran�a
		//3-Faxineiro
		if(cargo==1) 
			System.out.println("Cargo: Porteiro");
		else if(cargo==2)
			System.out.println("Cargo: Seguran�a");
		else if(cargo==3)
			System.out.println("Cargo: Faxineiro");
		else
			System.out.println("Cargo Inv�lido!");
			
	}
	public void status () {
		System.out.println("----------------------");
		System.out.println("� Funcion�rio");
		System.out.println("Nome: "+ this.nome);
		if(this.cracha ==1)
		System.out.println("Crach�: Sim");
		else 
			System.out.println("Crach�: N�o");
		
		if(cargo==1) {
			this.salario=1500.00;
			System.out.println("Cargo: Porteiro \nSal�rio: "+this.salario);
		}else if(cargo==2) {
			this.salario=1600.00;
			System.out.println("Cargo: Seguran�a \nSal�rio: "+this.salario);
		}if(cargo==3) {
			this.salario=1800.00;
			System.out.println("Cargo: Faxineiro \nSal�rio: "+this.salario);
		}else
			System.out.println("Cargo Inv�lido!Sem sal�rio");
			
	}
}
