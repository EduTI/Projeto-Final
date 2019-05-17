package br.com.eduardo.cadastro.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.eduardo.cadastro.dao.EtecDAO;
import br.com.eduardo.cadastro.model.Etec;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class EtecSB extends BaseSB{
	
	private EtecDAO EtecDAO;
	
	protected void postConstructImpl() {
		EtecDAO = getDAO(EtecDAO.class);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save (Etec etec) {
		EtecDAO.save(etec);
	}

}
