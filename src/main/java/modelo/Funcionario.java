package modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "funcionario")
public class Funcionario {

	@Column
	private String nome;
	@Column
	private String cpf;
	@Column
	private Date entrada;
	@Id
	private String codigo;
	
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Funcionario(String nome, String cpf, Date entrada,String codigo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.entrada = entrada;
		this.codigo = codigo;
	}
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getEntrada() {
		return entrada;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
