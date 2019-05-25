package br.com.eduardo.cadastro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ETEC")
public class Etec extends BaseORM {
	@GeneratedValue
	@Id
	@Column(name = "ID_ETEC")
	private Long id;
	
	@Column(name = "COD_ETEC")
	private Integer codigo;
	
	@Column(name = "NOME_ETEC")
	private String nome;
	
	@Column(name = "CEP_ETEC")
	private String cep;
	
	@Column(name = "LAT_CEP")
	private double lat;
	
	@Column(name = "LONG_CEP")
	private double longi;
	
	@Column(name = "ENDERECO_ETEC")
	private String endereco;
	
	@Column(name = "BAIRRO_ETEC")
	private String bairro;
	
	@Column(name = "CIDADE_ETEC")
	private String cidade;
	
	@Column(name = "DATA_INCLUSAO")
	private Date data;

	@PrePersist
	private void preencherDataIncl() {
		if(data == null)
			data = new Date();
			
	}
}
