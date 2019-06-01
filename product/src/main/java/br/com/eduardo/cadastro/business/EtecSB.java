package br.com.eduardo.cadastro.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.eduardo.cadastro.dao.EtecDAO;
import br.com.eduardo.cadastro.model.Etec;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class EtecSB extends BaseSB{
	
	private EtecDAO etecDAO;
	
	@Override
	protected void postConstructImpl() {
		etecDAO = getDAO(EtecDAO.class);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save (Etec etec) throws Exception {
		Etec e = etecDAO.findByCodigoOrNome(etec.getCodigo(), etec.getNome());
		
		if( e == null) {
		etecDAO.save(etec);
		}
		else {
			throw new Exception("Código ou Nome já existente");
		}
			
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Etec> findAll(){
		return etecDAO.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void remove(Etec etec) {
		etecDAO.delete(etec);

	}

	
}
