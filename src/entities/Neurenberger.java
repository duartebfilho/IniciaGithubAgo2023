package entities;

public class Neurenberger {
	private Integer conta;
	private String nome;
	
	public Neurenberger(Integer conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
