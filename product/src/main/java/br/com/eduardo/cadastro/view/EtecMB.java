package br.com.eduardo.cadastro.view;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.eduardo.cadastro.business.EtecSB;
import br.com.etechoracio.common.view.BaseMB;

public class EtecMB extends BaseMB {
	
	@Autowired
	private EtecSB etecSB;
	

}
