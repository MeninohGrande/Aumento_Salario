package listas;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double Salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
	
		this.id = id;
		this.nome = nome;
		Salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return Salario;
	}
	
	public void aumento (double valor) {
		this.Salario += this.Salario * (valor / 100);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", Salario=" + Salario + "]";
	}
	
	
	
}
