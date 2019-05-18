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
	
	@Column(name = "NOME_ETEC")
	private String Nome;
	
	@Column(name = "CEP_ETEC")
	private Long Cep;
	
	@Column(name = "LAT_CEP")
	private Long Lat;
	
	@Column(name = "LONG_CEP")
	private Long Long;
	
	@Column(name = "ENDERECO")
	private String Endereco;
	
	@Column(name = "BAIRRO")
	private String Bairro;
	
	@Column(name = "CIDADE")
	private String Cidade;
	
	@Column(name = "DATA_INCLUSAO")
	private Date Data;

	@PrePersist
	private void preencherDataIncl() {
		if(Data == null)
			Data = new Date();
			
	}
}
