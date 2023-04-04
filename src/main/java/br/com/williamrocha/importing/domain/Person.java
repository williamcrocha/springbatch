package br.com.williamrocha.importing.domain;

public class Person {

	private Integer id;
	
	private String name;
	
	private String cpf;

	public Person() {
		super();
	}

	public Person(Integer id, String name, String cpf) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cpf=" + cpf + "]";
	}

}
