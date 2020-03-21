package modelo;

public class Cliente {

	private String nome;
	private String cpf_cnpj;
	private int codigo;
	
	public Cliente(String nome, String cpf_cnpj, int codigo) {
		super();
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
