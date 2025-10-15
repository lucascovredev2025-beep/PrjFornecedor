package com.lucascovre.prjCadFornecedor.entitis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TdFornecedor")
public class Fornecedor {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String razaoSocial;
	
	private String nomeFantasia;
	
	private String cnpj;
	
	private String endereco;
	
	private String fone;
	
	private String email;
	
	private String inscricaoEstadual;
	
	public Fornecedor () {
		
	}
	
	public Fornecedor (Long id, String razaoSocial, String nomeFantasia, String cnpj, String endereco, String fone, String email, String inscricaoEstadual) {
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fone = fone;
		this.email = email;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public Long getID() {
		return id;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	 public String getFone() {
		 return fone;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public String getInscricaoEstadual() {
		 return inscricaoEstadual;
	 }
	 
	 public void setId(Long id) {
		 this.id = id;
	 }
	 
	 public void setRazaoSocial(String razaoSocial) {
		 this.razaoSocial = razaoSocial;
	 }
	 
	 public void setNomeFantasia(String nomeFantasia) {
		 this.nomeFantasia = nomeFantasia;
	 }
	 
	 public void setCnpj(String cnpj) {
		 this.cnpj = cnpj;
	 }
	 
	 public void setEndereço(String endereco) {
		 this.endereco = endereco;
	 }
	 
	 public void setFone(String fone) {
		 this.fone = fone;
	 }
	 
	 public void setEmail(String email) {
		 this.email = email;
	 }
	
	 public void serInscriçaoEstadual(String inscricaoEstadual) {
		 this.inscricaoEstadual = inscricaoEstadual;
	 }
}
