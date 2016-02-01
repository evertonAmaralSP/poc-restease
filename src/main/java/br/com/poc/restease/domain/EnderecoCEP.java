package br.com.poc.restease.domain;

import java.io.Serializable;

/**
 * Endereco do cep.
 */
public class EnderecoCEP implements Serializable {
    private static final long serialVersionUID = 2721134907052237056L;

    public EnderecoCEP() {
        super();
    }

    private String bairro;
    private String logradouro;
    private String cep;
    private String uf;
    private String localidade;

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	@Override
	public String toString() {
		return "EnderecoCEP [bairro=" + bairro + ", logradouro=" + logradouro + ", cep=" + cep + ", uf=" + uf
				+ ", localidade=" + localidade + "]";
	}    
     
}
